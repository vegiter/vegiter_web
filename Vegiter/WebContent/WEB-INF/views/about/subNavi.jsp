<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.sub-nav-div{
		position: fixed;
		margin-top: 61px;
	}
	#sub-navi{
		display: inline-block;
	}
	.navi-title{
		width: 120px;
		height: 40px;
		border: 2px solid white;
		background: #41A693;
		text-align: center;
		color: white;
	}
	.navi-title:hover{
		background:rgb(45, 115, 102);
	}
	#li-about, #li-notice, #li-qn{
		border-bottom: none;
	}
	#li-qn, #li-notice:hover{
		cursor:pointer;
	}
	#li-about{
		background:rgb(45, 115, 102);
	}
</style>
</head>
<body>
	<div class="sub-nav-div">
		<ul id="sub-navi">
			<li class="navi-title" id="li-about">Vegiter소개</li>
			<li class="navi-title" id="li-notice" onclick="location.href='<%=request.getContextPath()%>/notice'">공지사항</li>
			<li class="navi-title" id="li-qn" onclick="location.href='<%=request.getContextPath()%>/faq'">문의사항</li>
		</ul>
	</div>
</body>
</html>