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
<div id="map" style="margin-left : 150px; margin-right: 200px; margin-top :100px;width:1600px;height:700px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6dff5015989a59ffc86e086a9b96831c&libraries=services"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.442788, 126.903517), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption);


var geocoder = new kakao.maps.services.Geocoder();

var iwContent = '<div style="padding:5px;">Hello World! <br><a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">큰지도보기</a> <a href="https://map.kakao.com/link/to/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">길찾기</a></div>';

var callback = function(result, status) {
   

       if (status === kakao.maps.services.Status.OK) {
           var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
           // 결과값으로 받은 위치를 마커로 표시합니다
           console.log(coords);
           var marker = new kakao.maps.Marker({
               map: map,
               position: coords
               
           });
           
           var infowindow = new kakao.maps.InfoWindow({
               position : coords, 
               content : iwContent,
               removable : true
           });
           kakao.maps.event.addListener(marker, 'click', function() {
              // 마커에 마우스오버 이벤트가 발생하면 인포윈도우를 마커위에 표시합니다
                infowindow.open(map, marker);
            });
            
      }
}


var positions = [
	   positions = {
	         title :'감로당',
	         position : geocoder.addressSearch('서울 종로구 화동 87-1', callback)
	   },
	   positions = {
	         title :'뉴스타트',
	         position : geocoder.addressSearch('서울특별시 강남구 대치동 897-13', callback)
	   },
	   positions = {
	         title :'다경',
	         position : geocoder.addressSearch('서울 강남구 대치동 922-21', callback)
	   },
	   positions = {
	         title :'사랑분식',
	         position : geocoder.addressSearch('서울 강남구개포동 1230-5', callback)
	   }
	   
	];


</script>
   	<%@ include file="../common/footer.jsp"%>
</body>
</html>