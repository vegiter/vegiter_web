<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="login.model.vo.Member"%>
<%
	Member loginUser = (Member) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegiter</title>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<style>
html, body, div, span, img, header, nav, ul, li {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
	text-decoration: none;
	border-style: none;
	color: #000000;
	list-style: none;
}

body {
	line-height: 1;
	font-family: 'Open Sans', sans-serif;
}

.gnb {
	width: 100%;
	height: 62px;
	border-bottom: 1px solid lightgray;
	min-width: 800px;
	position: fixed;
	top: 0;
	background-color: #fff;
	text-align: center;
	z-index: 100;
}

.gnb-nav ul {
	width: 80%;
	max-width: 1600px;
	min-width: 800px;
	margin: auto;
	display: flex;
	flex-direction: row;
	text-align: center;
}

#logo {
	width: 130px;
	right: 0;
	top: 0;
	bottom: 0;
	margin: 5px auto;
}

.gnb-nav-list {
	left: 0;
	width: 90px;
	cursor: pointer;
	margin: auto;
	text-align: center;
	line-height: 51px;
}

.gnb-nav-list:nth-child(1) {
	margin-right: 200px;
}

.gnb-nav-list:nth-child(1):hover {
	border: none;
	margin-right: 200px;
}

.gnb-nav-list:hover {
	font-weight: bold;
	border-bottom: 3px solid #41A693;
}
</style>
</head>
<body>
	<header class="gnb">
		<nav class="gnb-nav">
			<ul>
				<li id="logo-li"
					onclick="location.href='<%=request.getContextPath()%>'"><img
					id="logo" onclick="location.href='<%=request.getContextPath()%>'"
					src="<%=request.getContextPath()%>/images/common/logo.png"
					style="cursor: pointer;"></li>
				<li class="gnb-nav-list"></li>
				<li class="gnb-nav-list"></li>
				<li class="gnb-nav-list" onclick="aboutPage();">About</li>
				<li class="gnb-nav-list">식당검색</li>
				<li class="gnb-nav-list">레시피</li>
				<li class="gnb-nav-list"
					onclick="location.href='<%=request.getContextPath()%>/vegiTalk'">VegiTalk</li>
				<%
					if (loginUser == null) {
				%>
				<li class="gnb-nav-list"
					onclick="location.href='<%=request.getContextPath()%>/login.me'">Login</li>
				<%
					} else {
				%>
				<li class="gnb-nav-list"
					onclick="location.href='<%=request.getContextPath()%>/myPage'">My
					Info</li>
				<%
					}
				%>
				<li class="gnb-nav-list"
					onclick="location.href='<%=request.getContextPath()%>/logout'">로그아웃</li>
			</ul>
		</nav>
	</header>
	<script>
		function mainPage() {
			location.href = '<%=request.getContextPath()%>';
		}
		
		function aboutPage(){
			location.href = '<%=request.getContextPath()%>/aboutPage.me';
		}
	</script>
</body>
</html>