<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{border: 1px solid green;}
	#sub-navi{
		margin-top: 100px;
		display: inline-block;
	}
	.navi-title{
		width: 150px;
		height: 40px;
		border: 2px solid #41A693;
		text-align: center;
	}
	.navi-title:hover{
		
	}
	#li-about, #li-notice{
		border-bottom: none;
	}
</style>
</head>
<body>
	<ul id="sub-navi">
		<li class="navi-title" id="li-about">Vegiter소개</li>
		<li class="navi-title" id="li-notice">공지사항</li>
		<li class="navi-title">문의사항</li>
	</ul>
</body>
</html>