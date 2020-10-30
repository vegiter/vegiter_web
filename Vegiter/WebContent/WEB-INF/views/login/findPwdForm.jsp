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
	
	.text {
		display: inline-block;
		font-family: 'Noto Sans KR', sans-serif;
		font-size: 18px;
		margin-top: 0%;
		margin-left: 25%;
	}
	
	.input {
		width: 30%;
	}
	
	#password {
		margin-left: 45px;
	}
	
	#password2 {
		margin-left: 30px;
	}
	
	#changeBtn {
		margin-top: 50px;
	}
	
	.error{
		height: 20px;
		width: 400px;
		margin: auto;
		margin-top: 2px;
		font-size: 12px;
		text-align: center;
	}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>

	<div id="zeroArea"></div>

	<div id="findArea">

		<div class="titleArea">
			<p class="title">비밀번호 변경</p>
		</div>
	
		<br>
		<form action="<%= request.getContextPath() %>/changePwd.me" method="post" id="findPwdForm" name="findPwdForm" onsubmit="return changePwd();">
				<span id="member"><p class="pTitle">비밀번호 변경</p>
				<h6 class="text-center">비밀번호(6자리이상 영문, 숫자, 특수문자 1개 이상)</h6>
					<br>
					<div class="input-info">
					<p class="text">새 비밀번호 :</p>
					<input type="password" class="input" id="password" name="password">
					</div>
					<div class="error"></div>
					
					<div class="input-info">
					<p class="text">비밀번호 확인 :</p>
					<input type="password" class="input" id="password2" name="password2"><br>
					</div>
					<div class="error"></div>
					<input type="hidden" class="hiddenId" name ="hiddenId" value="<%= member.getMemId() %>">
					<div class="text-center">
						<input type="submit" class="btn btn-secondary findBtn" id="changeBtn"
							value="비밀번호 변경" >
					</div> </span>
		</form>
		
	</div>

	<script>
				var regExp1 = /[a-zA-Z]/; //문자
				var regExp2 = /[0-9]/;	//숫자
				var regExp3 = /\S/; //공백여부
				var regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자
				var regExp5 = /[가-힣]/g; //한글
				 
				var pwdCheck = false;
				var pwd2Check = false;

				$("#password").on('change paste keyup', function(){
					var pwdCheck = false;
				});
				$("#password2").on('change paste keyup', function(){
					var pwd2Check = false;
				});

				
				$('#password2').change(function(){
					var inputPwd2 = $('#password2').val();
					var inputPwd = $('#password').val();
					if(inputPwd == inputPwd2){
						if(inputPwd2 == ""){
							$('.error').eq(1).text('');
							pwd2Check = false;
						}else{
							$('.error').eq(1).text('비밀번호가 일치합니다.').css('color','green');
							pwd2Check = true;
						}
					}else{
						$('.error').eq(1).text('비밀번호가 일치하지 않습니다.').css('color','red');
						pwd2Check = false;
					}
				});
				
				$('#password').change(function(){
					var inputPwd = $('#password').val();
					if(inputPwd.length ==  0){
						$('.error').eq(1).text('비밀번호를 입력해주세요').css('color','red');
						pwdCheck = false;
					}else if(!regExp1.test(inputPwd) || !regExp2.test(inputPwd) || !regExp3.test(inputPwd) || !regExp4.test(inputPwd) || inputPwd.length < 6 ){
						$('.error').eq(1).text('비밀번호는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
						pwdCheck = false;
					}else{
						$('.error').eq(1).text('사용가능한 비밀번호입니다.').css('color','green');
						pwdCheck = true;
					}
				});
				
				$('#password2').change(function(){
					var inputPwd2 = $('#password2').val();
					var inputPwd = $('#password').val();
					if(inputPwd == inputPwd2){
						if(inputPwd2 == ""){
							$('.error').eq(1).text('');
							pwd2Check = false;
						}else{
							if(regExp1.test(inputPwd) && regExp2.test(inputPwd) && regExp3.test(inputPwd) && regExp4.test(inputPwd) && inputPwd.length > 5 ){
							$('.error').eq(1).text('비밀번호가 일치합니다.').css('color','green');
							pwd2Check = true;
							} else {
								$('.error').eq(1).text('비밀번호는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
								pwd2Check = false;
							}
						}
					}else{
						$('.error').eq(1).text('비밀번호가 일치하지 않습니다.').css('color','red');
						pwd2Check = false;
					}
				});
				
				function changePwd(){
					if(!pwdCheck){
						alert('비밀번호를 입력해주세요');
						$('#password').focus();
						return false;
					} else if (!pwd2Check){
						alert('비밀번호가 일치하지 않습니다.');
						$('#password2').focus();
						return false;
					} else{
						alert('비밀번호가 변경되었습니다.');
						return true;
					}
				}

			</script>
	
</body>
</html>