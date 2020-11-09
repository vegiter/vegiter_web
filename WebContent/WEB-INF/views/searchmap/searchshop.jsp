
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>다음 지도 API</title>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
<div id="map" style="width:100%;height:2000px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6dff5015989a59ffc86e086a9b96831c&libraries=services"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 10 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption);

var geocoder = new kakao.maps.services.Geocoder();

var iwContent = '<div style="padding:5px;">Hello World! <br><a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">큰지도보기</a> <a href="https://map.kakao.com/link/to/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">길찾기</a></div>';

var callback = function(result, status) {
	

	    if (status === kakao.maps.services.Status.OK) {
	
	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
	
	        // 결과값으로 받은 위치를 마커로 표시합니다
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

var positions = [];

<%
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "VEGITER", pw = "VEGITER";

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection(url, user, pw);

			String sql = "SELECT * FROM sample";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String Name = rs.getString("SHOP_NAME");
				double Address = rs.getDouble("SHOP_ADDRESS");
				for(int i = 0; i <   ){ %>
					positions = {
							title : <%=Name%>,
							latlng : geocoder.addressSearch(<%=Address%>, callback)
							};
	<%}%>


</script>
<%@ include file="../common/footer.jsp" %>
</body>
</html>