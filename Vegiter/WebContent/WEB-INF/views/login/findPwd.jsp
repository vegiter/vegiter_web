<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
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
<<<<<<< HEAD
#section-header {
	width: 70%;
	height: 100%;
	margin: auto;
	margin-top: 100px;
}

.find-header {
	width: 50%;
	display: inline-block;
	height: 50px;
	background: rgb(45, 115, 102);
	font-size: 18px;
	color: white;
}

#find-pwd {
	float: right;
	margin-left: -10px;
}

#find-id {
	background: rgb(65, 166, 147);
}

#find-id a {
	text-decoration: none;
	color: white;
}

#find-id h4, #find-pwd h4 {
	margin-left: 40px;
	margin-top: 12px;
	font-weight: normal;
	height: 100%;
}

#find-id h4:hover {
	font-weight: bolder;
}

#find-id:hover {
	background: rgb(53, 154, 135);
}

#content {
	background: rgb(242, 242, 242);
	width: 70%;
	min-height: 400px;
	margin: auto;
	clear: both;
	border: 1px solid rgb(242, 242, 242);
}

#common {
	margin-right: 30px;
}

#input-boxes {
	width: 430px;
	margin: auto;
}

.input-box {
	display: inline-block;
	width: 430px;
	height: 230px;
	margin: auto;
}
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

.text {
	display: inline-block;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 18px;
	margin-top: 5%;
	margin-left: 23%;
}

.input {
	width: 40%;
}

#idInput {
	margin-left: 45px;
}

#emailInput {
	margin-left: 45px;
	
}

#div-btn-id {
	width: 430px;
	height: 40px;
	margin: auto;
	margin-top: 30px;
	margin-bottom: 30px;
#numInput {
	margin-left: 30px;
	margin-bottom: 50px;
}

#btn0{
	height: 35px;
	text-align: center;
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
			<form action="<%= request.getContextPath() %>/findPwdForm.me" method="post" id="findPwdForm" name="findPwdForm" onsubmit="return findPwd();">
				<span id="member"><p class="pTitle">비밀번호 찾기</p>
					<p class="text">아이디 :</p>
					<input type="text" class="input" id="idInput" name="idInput"><br>
					<p class="text">이메일 :</p>
					<input type="email" class="input" id="emailInput" name="emailInput">
					<p class="text">전화번호 :</p>
					<input type="text" class="input" id="numInput" name="numInput"><br>
					
					<div class="text-center">
						<input type="submit" class="btn btn-secondary findBtn" id="btn1"
							value="비밀번호 찾기" >
<!-- 							onclick="findId();" -->
					</div> </span>
		</form>
		
		
	</div>

	<script>
		function findPwd(){
			var id = $('#idInput').val();
			var email = $('#emailInput').val();
			var num = $('#numInput').val();
			
			if(id.length < 5 || email.length < 4 || num.length < 7){
				alert('다시 입력해주세요');
				return false;
			} else {
				return true;
			}
		}
	</script>
	
</body>
</html>