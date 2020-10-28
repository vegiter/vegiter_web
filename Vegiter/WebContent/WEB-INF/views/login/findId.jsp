<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

#member {
	display: inline-block;
	width: 49.5%;
	height: 700px;
	margin-top: 30px;
}

#owner {
	display: inline-block;
	width: 49.5%;
	height: 700px;
	margin-top: 30px;
}

.pTitle {
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 32px;
	text-align: center;
}

.text {
	display: inline-block;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 18px;
	margin-top: 10%;
	margin-left: 20%;
}

.input {
	width: 40%;
}

#nameInput {
	margin-left: 40px;
}

#emailInput {
	margin-left: 25px;
	margin-bottom: 150px;
}

#ownerName {
	margin-left: 60px;
}

#ownerNum {
	margin-left: 25px;
	margin-bottom: 150px;
}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>

	<div id="zeroArea"></div>

	<div id="findArea">

		<div class="titleArea">
			<p class="title">아이디 찾기</p>
		</div>

		<form action="<%= request.getContextPath() %>/findMemberId.me"
			method="post" id="findMemberId" name="findMemberId"
			onsubmit="return findId();">
			<div id="g">
				<span id="member"><p class="pTitle">일반 회원 아이디 찾기</p>
					<p class="text">이름 :</p>
					<input type="text" class="input" id="nameInput" name="nameInput"><br>
					<p class="text">이메일 :</p>
					<input type="email" class="input" id="emailInput" name="emailInput"><br>
					<div class="text-center">
						<input type="submit" class="btn btn-success findBtn" id="btn1"
							value="일반 회원 아이디 찾기" onclick="findId();">
					</div> </span>
		</form>

		<span id="owner"><p class="pTitle">사업자 회원 아이디 찾기</p>
			<p class="text">사업주 :</p>
			<input type="text" class="input" id="ownerName"><br>
			<p class="text">사업자 번호 :</p>
			<input type="text" class="input" id="ownerNum"><br>
			<div class="text-center">
				<input type="submit" class="btn btn-success findBtn"
					value="사업자 회원 아이디 찾기" id="btn2">
			</div> </span>
	</div>

	</div>

	<%@ include file="../common/footer.jsp"%>

	<script>
		function findId(){ 
			var name = $('#nameInput').val();
			var email = $('#emailInput').val();
			
			console.log(name);
			console.log(email);
			
			if(name.length < 1 || email.length < 1){
				alert('다시 입력해주세요');
				return false;
			} else {
				return true;
			}
		}
	</script>
</body>
</html>