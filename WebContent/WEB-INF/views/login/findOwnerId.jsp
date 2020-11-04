<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="login.model.vo.Owner"%>
<%
	Owner owner = (Owner)request.getAttribute("owner");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
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
<!-- 폰트   -->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@900&display=swap"
	rel="stylesheet">
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
	width: 90%;
	height: 800px;
	margin: 50px auto;
}

.titleArea {
	width: 100%;
	height: 80px;
	background: #41A693;
}

.title {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 34px;
	color: white;
	text-align: center;
	transform: translate(0%, 20%);
}

#pText {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 20px;
	text-align: center;
}

#resultText {
	border: 1px solid lightgray;
	width: 80%;
	align-content: center;
	text-align: center;
}

.result {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 28px;
	height: 80px;
	width: 80%;
	text-align: center;
	line-height: 80px;
	margin: auto;
	resize: none;		
}

.btn {
	width: 25%;
	
}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>

	<div id="zeroArea"></div>

	<div id="findArea">

		<div class="titleArea">
			<p class="title">아이디 찾기 결과</p>
		</div>

		<br>
		<br>
		<br>
		<p id="pText">회원님의 아이디 조회 결과 입니다</p>
		<div class="result"><input class="form-control result" type="text" placeholder="Readonly input here..." readonly value="<%= owner.getMemId() %>"></div>
		<br><br>
		<div class="text-center"><input type="submit" class="btn btn-secondary findBtn" id="btn1" value="로그인" onclick="loginPage();"></div>
		<br><br>
		<div class="text-center"><input type="submit" class="btn btn-secondary findBtn" id="btn1" value="홈으로" onclick="homePage();"></div>
	</div>
	
	<script>
		function loginPage(){
			location.href = '<%= request.getContextPath() %>/login.me';
		}
		
		function homePage(){
			location.href = '<%= request.getContextPath() %>';
		}
	</script>

	<%@ include file="../common/footer.jsp"%>

</body>
</html>