<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GNB</title>
<style>
	html, body, div, span, img, header, nav{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	body{line-height: 1;}
	ol, ul {list-style: none;}
	.gnb{width: 100%; height:62px; border-bottom: 1px solid lightgray; min-width: 800px; position: fixed; top: 0; text-align:center; background-color: #fff;}
	.gnb nav{margin: 0 auto;}
	.gnb ul{margin: 0; max-width: 1000px; display: inline-block; min-width: 800px;}
	#logo {width: 130px;}
	.gnb-nav{display: inline-block; width: 90px; line-height:60px; cursor: pointer;}
	.gnb-nav.logo{border: none; margin-right: 200px;}
	nav li:hover {font-weight: bold; border-bottom: 3px solid rgb(45, 115, 102);}
</style>
</head>
<body>
	<header class="gnb">
		<nav>
			<ul>
				<li class="gnb-nav logo" onclick="location.href='<%= request.getContextPath() %>'"><img id="logo" onclick="location.href='<%= request.getContextPath() %>'" src="<%= request.getContextPath() %>/images/common/logo.png" style="cursor: pointer;"></li>
				<li class="gnb-nav">About</li>
				<li class="gnb-nav">식당검색</li>
				<li class="gnb-nav">레시피</li>
				<li class="gnb-nav" onclick="location.href='<%= request.getContextPath() %>/vegiTalk'">VegiTalk</li>
				<li class="gnb-nav">My Info</li>
			</ul>
		</nav>
	</header>
</body>
</html>