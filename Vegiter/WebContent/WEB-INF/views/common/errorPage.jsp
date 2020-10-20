<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%
	String msg = (String)request.getAttribute("msg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= msg %></title>
<style type="text/css">
	.wrap{ width: 100%; height: 100%; margin: 200px auto; text-align: center; }
	h1{ color: #41A693; font-weight: bold; font-size: 60px; line-height: 1; }
	h2{ font-weight: none; }
	button{ background-color: #F0F3F5; border: 0; outline: none; color: #333B3F; padding: 10px 15px; margin: 5px; }
	button:hover{ background-color: #41A693; color: #fff; }
</style>
</head>
<body>
	<div class="wrap">
		<h1 align="center">Oops!</h1>
		<h2><%= msg %></h2>
		<div align="center">
			<button onclick="history.back();">이전 페이지</button>
			<button onclick="location.href='<%= request.getContextPath() %>'">홈으로 돌아가기</button>
		</div>
	</div>
</body>
</html>