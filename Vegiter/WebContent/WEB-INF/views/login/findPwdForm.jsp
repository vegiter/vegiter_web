<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="login.model.vo.Member"%>
<%
	Member member = (Member)request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
<!-- jquery -->
<script src="js/jquery-3.5.1.min.js"></script>
<!-- 부트스트랩 -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap"
	rel="stylesheet">
<style>
	#zeroArea {
		display: block;
		height: 70px;
	}
	
	#findArea {
		border: 1px solid lightgray;
		background: white;
		width: 60%;
		height: 600px;
		margin: 50px auto;
	}
	
	.titleArea {
		width: 100%;
		height: 60px;
		background: #41A693;
	}
	
	.title {
		font-family: 'Noto Sans KR', sans-serif;
		font-size: 28px;
		color: white;
		text-align: center;
		transform: translate(0%, 20%);
	}
	
	.pTitle {
		font-family: 'Noto Sans KR', sans-serif;
		font-size: 24px;
		text-align: center;
	}
	
	.changeArea{
		text-align: center;
		margin: auto;
	}
	
	#newPwd{
		margin: 2%;
		margin-left: 45px;
	}
	
	#newPwd2{
		margin: 2%;
		margin-left: 15px;
	}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>

	<div id="zeroArea"></div>

	<div id="findArea">

		<div class="titleArea">
			<p class="title">비밀번호 찾기</p>
		</div>
		
		<br><br>
		<form action="<%= request.getContextPath() %>/updatePwd.me" method="post" id="updatePwdForm" name="updatePwdForm" onsubmit="return send();">
			<p class="pTitle">비밀번호 찾기</p><br>
			
			<%= member.getMemPwd() %>
			
			
		</form>
		
	</div>

	<script>
		
	</script>
	
</body>
</html>