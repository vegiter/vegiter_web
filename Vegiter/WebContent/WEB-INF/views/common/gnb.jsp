<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="login.model.vo.Member" %>
<%
	Member loginUser  = (Member)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegiter</title>
<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-3.5.1.min.js"></script>
<style>

header {
	width: 100%;
	background: rgba(255, 255, 255, 0.8);
	border-bottom: 1px solid lightgray;
	min-width: 800px;
	position: fixed;
	top: 0;
	
}

nav {
	display: inline-block;
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
		<a href="#"><img id="logo" src="<%= request.getContextPath() %>/images/common/logo.png"></a>
		<nav>
			<div class="wrap">
				<ul>
					<li><a href="#">About</a></li>
					<li><a href="#">식당검색</a></li>
					<li><a href="#">레시피</a></li>
					<li><a href="#">Vegi talk</a></li>
					<li><a 
					<%if(loginUser == null){ %>
					href="<%= request.getContextPath() %>/login.me"
					<%}else{ %>
					href="<%=request.getContextPath() %>/myPage"
					<%} %>
					>My Info</a></li>
				</ul>
			</div>
		</nav>
	</header>
</body>
</html>