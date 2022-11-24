###

<div align="center">
<img align="center" src="https://user-images.githubusercontent.com/26956570/194744631-f38e6131-0969-48db-b447-b5bc7381fd4b.png" width="400" />  
</div>
<div align="left">
    <h1 align="left">
      <font align="left" size="6" color="#ffffff"> 👛장보장</font>
    </h1>
  </div>

### 목차

1. [**웹 서비스 소개**](#1)    
2 [**기술 스택**](#2)     
3 [**주요 기능**](#3)      
4 [**프로젝트 구성도**](#4)     
5 [**데모 영상**](#5)     
6 [**개발 팀 소개**](#6)       
1. [**개발 기간 및 일정**](#8)
1. [**실행 방법**](#9)
<hr />

<div id="1"></div>

## 👛 웹 서비스 소개

### **웹RTC를 이용한 전통시장 라이브 상점**    

> 집에서도 편하게 **온라인으로** 물건을 **직접 골라** 살 수 있어요.    

<br />

<div id="2"></div>

## 🛠 기술 스택

<table align="center">
  <tr>
    <td align="center" width="165"><strong>Front-end 기술 스택</strong></td>
    <td>
      <div>
        <img src="https://img.shields.io/badge/Vue.js-3178C6?&logo=vue.js&logoColor=white"/>
        <img src="https://img.shields.io/badge/Axios-5A29E4?style=&logo=Axios&logoColor=white"/>
        <img src="https://img.shields.io/badge/WebRTC-5A29E4?style=&logo=WebRTC&logoColor=white"/>
      </div>
    </td>
  </tr>
  <tr>
    <td align="center" width="165"><strong>Back-end 기술 스택</strong></td>
    <td>
        <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=  &logo=springboot&logoColor=white"/>
        <img src="https://img.shields.io/badge/MySQL-4479A1?style=  &logo=mysql&logoColor=white"/>
        <img src="https://img.shields.io/badge/JPA-212121?style=  &logo=jpa&logoColor=white"/>
        <img src="https://img.shields.io/badge/JWT-000000?style=  &logo=JSONWebTokens&logoColor=white"/>
    </td>
  </tr>
  <tr>
    <td align="center" width="165"><strong>Server 기술 스택</strong></td>
    <td>
        <img src="https://img.shields.io/badge/NGINX-009639?style=  &logo=nginx&logoColor=white"/>
        <img src="https://img.shields.io/badge/Docker-2496ED?style=  &logo=docker&logoColor=white"/>
        <img src="https://img.shields.io/badge/Jenkins-D24939?style=  &logo=jenkins&logoColor=white"/>
        <img src="https://img.shields.io/badge/AmazonAWS-232F3E?style=  &logo=amazonaws&logoColor=white"/>
        <img src="https://img.shields.io/badge/AmazonS3-569A31?style=  &logo=amazons3&logoColor=white"/>
    </div>
  </tr>
  <tr>
    <td align="center"><strong>배포</strong></td>
 <strong>현재는 중단</strong>
  </tr>
  <tr>
    <td align="center"><strong>노션</strong></td>
    <td>
      <a href="#">
        👉 노션 바로가기
      </a>
    </td>
  </tr>
<table>
  <br />
  
<div id="3"></div>
## 💡 주요 기능

<table align="center">
<thead>
  <tr>
    <td align="center"><strong>화면</strong></th>
    <td align="center"><strong>기능</strong></th>
  </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194465980-a1127570-06b8-4042-91e9-adc5733e0cd9.gif" width=250/>
      </td>
      <td>
        <b>NFT 스티커 발급</b>
        <div>QR 인식을 통해 여행지의 NFT 스티커를 발급받을 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194466160-4a36a599-1a15-4630-baac-14bcb312eb02.gif" width=250/>
      </td>
      <td>
        <b>여행 등록</b>
        <div>여행지와 여행일정을 등록하면 여행 티켓이 생성됩니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194466826-e0768287-9dce-4aba-b2c1-0763a7d4e1de.gif" width=250/>
      </td>
      <td>
        <b>다이어리 작성</b>
        <div>여행지에서 하루의 다이어리를 작성하고 오늘의 사진을 등록할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194466958-d6c59c1a-dabb-4b1e-8052-9000cb91429a.gif" width=250/>
      </td>
      <td>
        <b>다이어리 꾸미기 및 프레임 공유</b>
        <div>발급받은 NFT 스티커로 다이어리를 꾸미고 스티커 프레임을 공유할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194467059-c898de01-70a8-472e-b91e-a7e0fd730b17.gif" width=250/>
      </td>
      <td>
        <b>스티커 발급 가능 지역 조회</b>
        <div>GPS 기반의 내 주변 또는 원하는 지역의 스티커 발급 장소를 확인할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194467193-df1892f4-57f4-4b29-b1fb-79d665689ef3.gif" width=250/>
      </td>
      <td>
        <b>공유 프레임 조회</b>
        <div>공유된 스티커 프레임을 지역 별로 조회하고 원하는 프레임을 저장할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194467193-df1892f4-57f4-4b29-b1fb-79d665689ef3.gif" width=250/>
      </td>
      <td>
        <b>NFT 스티커 조회</b>
        <div>공유된 프레임의 스티커를 클릭하면 NFT 마켓에서 해당 스티커를 조회합니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="https://user-images.githubusercontent.com/82889580/194467952-d019d262-52a9-4ac6-bf37-2d7e64467133.gif" width=250/>
      </td>
      <td>
        <b>NFT 마켓</b>
        <div>NFT 스티커를 마켓에서 거래할 수 있습니다.</div>
      </td>
    </tr>
  </tbody>
<table>

<br />
<div id="4"></div>
## 📂 프로젝트 구성도

|                                               <div align="center">아키텍쳐(Archtecture)</div>                                                |
| :------------------------------------------------------------------------------------------------------------------------------------------: |
|        <img src="https://user-images.githubusercontent.com/82889580/194323651-c3382c53-f449-472c-8597-4d8dc31f82f2.png" width="700"/>        |
|                                                           **개체-관계 모델 (ERD)**                                                           |
| <img src="https://user-images.githubusercontent.com/82889580/194323639-91f83f03-b36b-49ee-8865-4a7c0c77b895.png" width="600" height="500" /> |


<br />
<div id="5"></div>
## 🎥 데모 영상

<table align="center">
<thead>
  <tr>
    <td align="center"><strong>UCC 영상</strong></th>
    <td align="center"><strong>시연 영상</strong></th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td>
      <a href="https://youtu.be/KNcOnopfsGk" target="_blank">
        <img src="https://user-images.githubusercontent.com/82889580/194323588-0e855199-2221-4231-b67b-c68f97e27166.png" width=400 height=240/>
      </a>
    </td>
    <td>
      <a href="https://youtu.be/F9abdKcMTTo" target="_blank">
        <img src="https://user-images.githubusercontent.com/82889580/194366060-ba8cde4b-0fed-4c29-b171-797ca7ca2441.png" width=400 height=240/>
      </a>
    </td>
  </tr>
  </tbody>
<table>

<br />
<div id="6"></div>
## 👨‍👩‍👧‍👦 개발 팀 소개

<table>
  <tr>
    <td align="center" width="150px">
      <a href="https://github.com/PJSliable" target="_blank">
        <img src="https://github.com/PJSliable.png" alt="박종선 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/yyhjin" target="_blank">
        <img src="https://github.com/yyhjin.png" alt="윤혜진 프로필" />
      </a>
    </td>
        <td align="center" width="150px">
      <a href="https://github.com/hseol" target="_blank">
        <img src="https://github.com/hseol.png" alt="허설 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/KMLEEhub" target="_blank">
        <img src="https://github.com/KMLEEhub.png" alt="이경무 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/hh2728" target="_blank">
        <img src="https://github.com/hh2728.png" alt="한재승 프로필" />
      </a>
    </td>
  </tr>
  <tr>
    <td align="center">
      <a href="https://github.com/PJSliable" target="_blank">
        박종선<br />(Back-end &<br /> 팀장)
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/yyhjin" target="_blank">
        윤혜진<br />(Back-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/hseol">
        허설<br />(Back-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/KMLEEhub" target="_blank">
        이경무<br />(Front-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/hh2728" target="_blank">
        한재승<br />(Front-end)
      </a>
    </td>



  </tr>
</table>

<br />
<div id="7"></div>



|  이름  |          역할          | <div align="center">개발 내용</div>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| :----: | :--------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 박종선 |  Back-end<br />팀장   |                                                                                                               |
| 윤혜진 |       Back-end        |  |
|  허설  | Back-end | **Back-end**<br />- DB 설계<br /> - Store 관련 API 작성<br /> - Item 관련 API 작성<br/> **CI/CD**<br /> - AWS 배포 환경 구축                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 이경무 | Front-end | **Front-end**<br />                                                                                                                                                                                               |
| 한재승 | Front-end | **Front-end**<br />                                                                                                                                                                                                                                                            |
                                                                                                                                                                                                                   |

<br />
<div id="8"></div>

## 📅 개발 기간

22.07.05. ~ 22.08.19

<br />
<div id="9"></div>

## 💻 실행 방법

### Client 실행

1. **원격 저장소 복제**

```bash
$ git clone https://lab.ssafy.com/s07-webmobile1-sub2/S07P12A602
```

2. **프로젝트 폴더로 이동**

```bash
$ cd frontend
```

3. **필요한 node_modules 설치**

```bash
$ npm install
```

4. **개발 서버 실행**

```bash
$ npm run serve
```

### Server 실행


<br />

## 🦊 git convention

| Emoji | Code                          | 기능     | Description              |
| ----- | ----------------------------- | -------- | ------------------------ |
| ✨    | `:sparkles:`                  | Feat     | 새 기능                  |
| ♻️    | `:recycle:`                   | Refactor | 코드 리팩토링            |
| 🔧    | `:wrench:`                    | Chore    | 리소스 수정/삭제         |
| 🐛    | `:bug:`                       | Fix      | 버그 수정                |
| 📝    | `:memo:`                      | Docs     | 문서 추가/수정           |
| 💄    | `:lipstick:`                  | Style    | UI/스타일 파일 추가/수정 |
| 🎉    | `:tada:`                      | Init     | 프로젝트 시작 / Init     |
| 🔀    | `:twisted_rightwards_arrows:` | Merge    | 브랜치 합병              |
| 👷    | `:construction_worker: `      |          | CI 빌드 시스템 추가/수정 |
| 🚀    | `:rocket:`                    | Deploy   | 배포                     |   
