package com.jangbo.api.controller;

import com.jangbo.api.request.ChangePasswordReq;
import com.jangbo.api.request.CustomerRegisterReq;
import com.jangbo.api.request.RequestLoginUser;
import com.jangbo.api.request.SellerRegisterReq;
import com.jangbo.api.response.Response;
import com.jangbo.api.service.Auth.AuthService;
import com.jangbo.api.service.Auth.CookieUtil;
import com.jangbo.api.service.Auth.JwtUtil;
import com.jangbo.api.service.Auth.RedisUtil;
import com.jangbo.db.entity.Customer;
import com.jangbo.db.entity.Seller;
import com.jangbo.db.repository.CustomerRepository;
import com.jangbo.db.repository.SellerRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Api(value = "권한api", tags={"권한"})
@Slf4j
@RestController
@RequiredArgsConstructor
public class AuthController {

    //    AuthenticationManager authenticationManager;
    private final CookieUtil cookieUtil;
    private final AuthService authService;
    private final JwtUtil jwtUtil;
    private final RedisUtil redisUtil;

    private final SellerRepository sellerRepository;
    private final CustomerRepository customerRepository;


    @ApiOperation(value = "회원가입 - 판매자", notes="판매자로 가입한다.",httpMethod = "POST")
    @PostMapping("/seller/signup")
    public Response signUpSeller(@RequestBody @Valid SellerRegisterReq sellerRegisterReq) {
        try {
            authService.signUpSeller(sellerRegisterReq);
            return new Response("success", "판매자 회원가입을 성공적으로 완료했습니다.", null);
        } catch (Exception e) {
            return new Response("error", "판매자 회원가입에 실패하였습니다.", null);
        }
    }

    @ApiOperation(value = "회원가입 - 소비자", notes="소비자로 가입한다.",httpMethod = "POST")
    @PostMapping("/customer/signup")
    public Response signUpCustomer(@RequestBody @Valid CustomerRegisterReq customerRegisterReq) {
        try {
            authService.signUpCustomer(customerRegisterReq);
            return new Response("success", "소비자 회원가입을 성공적으로 완료했습니다.", null);
        } catch (Exception e) {
            return new Response("error", "소비자 회원가입에 실패하였습니다.", null);
        }
    }

    @ApiOperation(value = "로그인 - 소비자", notes="소비자가 로그인한다.",httpMethod = "POST")
    @PostMapping("/customer/login")
    public Response loginCustomer(@RequestBody RequestLoginUser user,
                          HttpServletRequest req,
                          HttpServletResponse res) {
        try {
            final Customer customer = authService.loginCustomer(user.getUsername(), user.getPassword());
            final String token = jwtUtil.generateToken(customer);
            final String refreshJwt = jwtUtil.generateRefreshToken(customer);
            Cookie accessToken = cookieUtil.createCookie(JwtUtil.ACCESS_TOKEN_NAME, token);
            Cookie refreshToken = cookieUtil.createCookie(JwtUtil.REFRESH_TOKEN_NAME, refreshJwt);
            redisUtil.setDataExpire(refreshJwt, customer.getCustomerId(), JwtUtil.REFRESH_TOKEN_VALIDATION_SECOND);
            res.addCookie(accessToken);
            res.addCookie(refreshToken);
            return new Response("success", "로그인에 성공했습니다.", token);
        } catch (Exception e) {
            return new Response("error", "로그인에 실패했습니다.", e.getMessage());
        }
    }


    @ApiOperation(value = "로그인 - 판매자", notes="판매자가 로그인한다.",httpMethod = "POST")
    @PostMapping("/seller/login")
    public Response loginSeller(@RequestBody RequestLoginUser user,
                          HttpServletRequest req,
                          HttpServletResponse res) {
        try {
            final Seller seller = authService.loginSeller(user.getUsername(), user.getPassword());
            final String token = jwtUtil.generateToken(seller);
            final String refreshJwt = jwtUtil.generateRefreshToken(seller);
            Cookie accessToken = cookieUtil.createCookie(JwtUtil.ACCESS_TOKEN_NAME, token);
            Cookie refreshToken = cookieUtil.createCookie(JwtUtil.REFRESH_TOKEN_NAME, refreshJwt);
            redisUtil.setDataExpire(refreshJwt, seller.getSellerId(), JwtUtil.REFRESH_TOKEN_VALIDATION_SECOND);
            res.addCookie(accessToken);
            res.addCookie(refreshToken);
            return new Response("success", "로그인에 성공했습니다.", token);
        } catch (Exception e) {
            return new Response("error", "로그인에 실패했습니다.", e.getMessage());
        }
    }

    @ApiOperation(value = "비밀번호 변경 - 판매자", notes="판매자가 비밀번호를 변경한다.",httpMethod = "PUT")
    @PutMapping("/seller/change_pwd/{seller_no}")
    public Response changeSellerPassword(
            @PathVariable("seller_no") Integer sellerNo,
            @RequestBody ChangePasswordReq changePasswordReq
    ) {
        try{
            Seller seller = sellerRepository.findOne(sellerNo);
            authService.changeSellerPassword(seller, changePasswordReq.getPassword(), changePasswordReq.getPasswordUpdate());
            return new Response("success","성공적으로 사용자의 비밀번호를 변경했습니다.",null);
        }catch(Exception e){
            return new Response("error","사용자의 비밀번호를 변경할 수 없었습니다.",null);
        }
    }


    @ApiOperation(value = "비밀번호 변경 - 소비자", notes="소비자가 비밀번호를 변경한다.",httpMethod = "PUT")
    @PutMapping("/customer/change_pwd/{customer_no}")
    public Response changeCustomerPassword(
            @PathVariable("customer_no") Integer customerNo,
            @RequestBody ChangePasswordReq changePasswordReq
    ) {
        try{
            Customer customer = customerRepository.findOne(customerNo);
            authService.changeCustomerPassword(customer, changePasswordReq.getPassword(), changePasswordReq.getPasswordUpdate());
            return new Response("success","성공적으로 사용자의 비밀번호를 변경했습니다.",null);
        }catch(Exception e){
            return new Response("error","사용자의 비밀번호를 변경할 수 없었습니다.",null);
        }
    }

}