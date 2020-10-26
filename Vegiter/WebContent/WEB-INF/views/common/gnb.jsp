<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

header {
	display: block;
	width: 100%;
	background: rgba(255, 255, 255, 0.8);
	border-bottom: 1px solid lightgray;
	min-width: 800px;
	position: fixed;
	top: 0;
	
}

nav {
	float: right;
	padding: 0;
	height: 40px;
	margin-right: 10%;
}

div, ul, li {
	padding: 0;
	margin: 0;
}

#logo {
	width: 150px;
	margin-left: 5%
}

nav li {
	float: left;
	padding: 0;
	line-height: 40px; /*굵기*/
}

.header nav .wrap>ul {
	display: inline-block;
	position: relative;
}

.wrap>ul>li {
	width: 100px;
	height: 63px;
}

.wrap>ul>li>a {
	display: block;
	width: 100%;
	text-decoration: none;
	color: black;
	text-align: center;
	margin-top: 10px;
}

ol, ul {
	list-style: none;
}

nav li:hover {
	font-weight: bolder;
	border-bottom: 3px solid rgb(45, 115, 102);
}
</style>
</head>
<body>
	<header class="header">
		<a onclick="mainPage();"><img id="logo" src="<%= request.getContextPath() %>/images/common/logo.png"></a>
		<nav>
			<div class="wrap">
				<ul>
					<li><a onclick="aboutPage();">About</a></li>
					<li><a href="#">식당검색</a></li>
					<li><a href="#">레시피</a></li>
					<li><a href="#">Vegi talk</a></li>
					<li><a href="#">My Info</a></li>
				</ul>
			</div>
		</nav>
	</header>
	
	<script>
		function mainPage(){
			location.href = '<%= request.getContextPath() %>';
		}
	
		function aboutPage(){
			location.href = '<%= request.getContextPath() %>/aboutPage.me';
		}
	</script>
</body>
</html>