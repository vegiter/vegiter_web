<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>다음 지도 API</title>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>
<div id="map" style="width:1600px;height:700px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6dff5015989a59ffc86e086a9b96831c&libraries=services"></script>
<div id="map" style="width:100%;height:350px;"></div>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(37.56328,126.9846803), // 지도의 중심좌표
        level: 7//지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
 
// 마커를 표시할 위치와 title 객체 배열입니다 
var positions = [
    {
        title: ' 감로당', 
        latlng: new kakao.maps.LatLng(37.5805437,126.9819587),
    },
    {
        title: ' 뉴스타트', 
        latlng: new kakao.maps.LatLng(37.5030439,127.0506865),
    },
    {
        title: ' 다경', 
        latlng: new kakao.maps.LatLng(37.4979419,127.0530488),
    },
    {
        title: ' 닥터로빈',
        latlng: new kakao.maps.LatLng(37.5613469,126.9470584),
    },
        {
        title: ' 들풀', 
        latlng: new kakao.maps.LatLng(37.5825341,127.0006196),
    },
    {
        title: ' 러빙헛 신촌점', 
        latlng: new kakao.maps.LatLng(37.5586332,126.9366769),
    },
    {
        title: ' 러빙헛 아차산점', 
        latlng: new kakao.maps.LatLng(37.5522444,127.0900617),
    },
    {
        title: ' 러빙헛 서울 양재점',
        latlng: new kakao.maps.LatLng(37.476797,127.044104),
    },
        {
        title: ' 러빙헛 SM', 
        latlng: new kakao.maps.LatLng(37.477333,127.045213),
    },
    {
        title: '만리장성', 
        latlng: new kakao.maps.LatLng(37.5743716,126.9826498),
    },
    {
        title: ' 바루', 
        latlng: new kakao.maps.LatLng(37.5738835,126.9831643),
    },
    {
        title: ' 사랑분식',
        latlng: new kakao.maps.LatLng(37.4771504,127.0480392),
    },
        {
        title: ' 산골채식건강식당', 
        latlng: new kakao.maps.LatLng(37.6123689,127.076816),
    },
    {
        title: ' 산에나물', 
        latlng: new kakao.maps.LatLng(37.582922,126.9814983),
    },
    {
        title: ' 산채', 
        latlng: new kakao.maps.LatLng(37.4791098,126.9511541),
    },
    {
        title: ' 산촌',
        latlng: new kakao.maps.LatLng(37.5737329,126.9860544),
    },
        {
        title: ' 새생명건강동호회', 
        latlng: new kakao.maps.LatLng(37.5729503,126.9793579),
    },
    {
        title: ' 시천주', 
        latlng: new kakao.maps.LatLng(37.5752362,126.9840007),
    },
    {
        title: ' 신동양', 
        latlng: new kakao.maps.LatLng(37.5175402,126.9345308),
    },
    {
        title: ' 쌀집고양이',
        latlng: new kakao.maps.LatLng(37.5493383,126.9212981),
    },
        {
        title: ' 아승지', 
        latlng: new kakao.maps.LatLng(37.507806,126.9111939),
    },
    {
        title: ' 오세계향', 
        latlng: new kakao.maps.LatLng(37.5746333,126.9852542),
    },
    {
        title: ' 온마을', 
        latlng: new kakao.maps.LatLng(37.5866372,126.9815224),
    },
    {
        title: ' 자금성',
        latlng: new kakao.maps.LatLng(37.56328,126.9846803),
    },
        {
        title: ' 적수방', 
        latlng: new kakao.maps.LatLng(37.559687,127.004863),
    },
    {
        title: ' 정미소', 
        latlng: new kakao.maps.LatLng(37.5472926,126.9133947),
    },
    {
        title: ' 진리루', 
        latlng: new kakao.maps.LatLng(37.5890486,127.060414),
    },
    {
        title: ' 청미래(목동점)',
        latlng: new kakao.maps.LatLng(37.5169508,126.8665644),
    },
        {
        title: ' 청미래(잠실점)', 
        latlng: new kakao.maps.LatLng(37.5070374,127.0924588),
    },
    {
        title: ' 채근담', 
        latlng: new kakao.maps.LatLng(37.5033219,127.0649628),
    },
    {
        title: ' 채선당', 
        latlng: new kakao.maps.LatLng(37.5659688,127.053121),
    }
];
    var iwContent = [{content : '<div style="padding:5px; height:110px;text-align:center;"> 감로당<br> 서울 종로구 화동 87-1<br> 02-3210-3397<br><a href="https://map.kakao.com/link/to/감로당,37.5805437,126.9819587" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  뉴스타트<br> 서울특별시 강남구 대치동 897-13 남곡빌딩 2층<br> 02-565-4324<br><a href="https://map.kakao.com/link/to/뉴스타트,37.5030439,127.0506865" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  다경<br> 서울 강남구 대치동 922-21 2층<br> 02-508-5901<br><a href="https://map.kakao.com/link/to/다경,37.4979419,127.0530488" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  닥터로빈<br>  이화여대 지하캠퍼스 ecc 의 아트하우스 모모(영화극장) 옆<br>  02-363-3101<br><ahref="https://map.kakao.com/link/to/닥터로빈,37.5613469,126.9470584" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  들풀<br> 서울특별시 종로구 명륜동4가 71-1<br> 02-745-9383<br><a href="https://map.kakao.com/link/to/들풀,37.5825341,127.0006196" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  러빙헛 신촌점<br> 서울시 서대문구 창천동 33-10호 1층<br> 02-333-8087~8<br><a href="https://map.kakao.com/link/to/러빙헛 신촌점,37.5586332,126.9366769" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  러빙헛 아차산점<br> 서울 광진구 구의2동 53-10번지<br> 02-453-2112<br><a href="https://map.kakao.com/link/to/러빙헛 아차산점,37.5522444,127.0900617" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  러빙헛 서울 양재점<br> 서울 서초구 양재동 275-4 트윈타워빌딩 101호<br> 070-8614-7953<br><a href="https://map.kakao.com/link/to/러빙헛 서울 양재점,37.476797,127.044104" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  러빙헛 SM<br> 서울 강남구 포이동 229-10 삼호물산 앞<br> 02-576-9637<br><a href="https://map.kakao.com/link/to/러빙헛,37.477333,127.045213" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  만리장성<br> 조계사 건너편 정류장 앞<br> 02-738-3636<br><a href="https://map.kakao.com/link/to/만리장성,37.5743716,126.9826498" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  바루<br> 서울 조계사 맞은편 템플스테이통합정보센터 건물 5층<br> 02-2031-2081<br><a href="https://map.kakao.com/link/to/바루,37.5738835,126.9831643" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  사랑분식<br> 서울 강남구 개포동 1230-5<br> 02-577-4012<br><a href="https://map.kakao.com/link/to/사랑분식,37.4771504,127.0480392" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  산골채식건강식당<br> 서울특별시 중랑구 묵2동 238-12<br> 02-978-9006<br><a href="https://map.kakao.com/link/to/산골채식건강식당,37.6123689,127.076816" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  산에나물<br> 서울특별시 종로구 팔판동 35-1 백월빌딩 2층<br> 02-732-2542<br><a href="https://map.kakao.com/link/to/산에나물,37.582922,126.9814983" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  산채<br> 서울시 관악구 봉천4동 865-1<br> 02-888-1643 <br><a href="https://map.kakao.com/link/to/산채,37.4791098,126.9511541" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  산촌<br> 서울특별시 종로구 관훈동 14<br> 02-735-0312 <br><a href="https://map.kakao.com/link/to/산촌,37.5737329,126.9860544" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  새생명건강동호회<br> 서울특별시 종로구<br> 02-210-2151<br><a href="https://map.kakao.com/link/to/새생명건강동호회,37.5729503,126.9793579" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  시천주<br> 서울특별시 종로구 관훈동 118-27<br> 02-732-0276<br><a href="https://map.kakao.com/link/to/시천주,37.5752362,126.9840007" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  신동양<br> 서울특별시 영등포구 여의도동<br> 02-782-1754<br><a href="https://map.kakao.com/link/to/신동양,37.5175402,126.9345308" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  쌀집고양이<br> 서울 마포구 서교동 408-17 4층<br> 02-325-5888<br><a href="https://map.kakao.com/link/to/쌀집고양이,37.5493383,126.9212981" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  아승지<br> 서울 영등포구 신길동 223-17<br> 02-836-8442<br><a href="https://map.kakao.com/link/to/아승지,37.507806,126.9111939" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  오세계향<br> 서울특별시 종로구 관훈동 59 <br> 02-735-7171<br><a href="https://map.kakao.com/link/to/오세계향,37.5746333,126.9852542" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  온마을<br> 서울특별시 종로구 삼청동 123<br> 02-738-4231<br><a href="https://map.kakao.com/link/to/온마을,37.5866372,126.9815224" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  자금성<br> 서울시 중구 명동2가 51-8 명동 랜드로바 맞은편 (명동파출소 뒷쪽 골목)<br> 02-318-1133~4<br><a href="https://map.kakao.com/link/to/자금성,37.56328,126.9846803" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  적수방<br> 서울특별시 중구 장충동2가 188-6 불광산사 (지하)<br> 02-2276-0993<br><a href="https://map.kakao.com/link/to/적수방,37.559687,127.004863" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  정미소<br> 서울시 마포구 합정동 371-5 DMI빌딩 1층<br> 02-337-3276<br><a href="https://map.kakao.com/link/to/정미소,37.5472926,126.9133947" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  진리루<br> 서울특별시 동대문구 휘경2동 255-19<br> 02-2215-6636<br><a href="https://map.kakao.com/link/to/진리루,37.5890486,127.060414" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  청미래(목동점)<br> 서울특별시 구로구 고척동 38-8 (양천구청 근처)<br> 02-2681-0567<br><a href="https://map.kakao.com/link/to/청미래(목동점),37.5169508,126.8665644" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  청미래(잠실점)<br> 서울특별시 송파구 삼전동 22-2 레이크타워 B1(신천역 근처)<br> 02-422-0567<br><a href="https://map.kakao.com/link/to/청미래(잠실점),37.5070374,127.0924588" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  채근담<br> 서울 강남구 대치동 983 일동빌딩 별관<br> 02 555-9173<br><a href="https://map.kakao.com/link/to/채근담,37.5033219,127.0649628" style="color:blue" target="_blank">길찾기</a></div>'},

{content : '<div style="padding:5px;height:110px;text-align:center;">  채선당<br> 서울 성동구 용답동 69-4<br> 02-2244-4747<br><a href="https://map.kakao.com/link/to/채선당,37.5659688,127.053121" style="color:blue" target="_blank">길찾기</a></div>'}
];

var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
var iwRemoveable = true;   
for (var i = 0; i < positions.length; i ++) {
    
    // 마커 이미지의 이미지 크기 입니다
    var imageSize = new kakao.maps.Size(24, 35); 
    
    // 마커 이미지를 생성합니다    
    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
    
    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        map: map, // 마커를 표시할 지도
        position: positions[i].latlng, // 마커를 표시할 위치
      clickable: true
    });
// 인포윈도우를 생성합니다
   var infowindow = new kakao.maps.InfoWindow({
    content : iwContent[i].content,
    removable : iwRemoveable
});
    
    kakao.maps.event.addListener(marker, 'click', makeOverListener(map, marker, infowindow));

}
function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };

}
</script>
   	<%@ include file="../common/footer.jsp"%>
</body>
</html>