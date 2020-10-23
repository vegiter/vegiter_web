<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegitor 로그인</title>
<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-3.5.1.min.js"></script>
<style>
	body{
		background: rgb(242, 242, 242);
	}
	header{
		height: 150px;
	}
	#login{
		background: white;
		width: 400px;
		margin: auto;
		margin-top: 150px;
		padding: 50px;
		padding-top: 70px;
		padding-bottom: 70px;
	}
	div.login-header{
		width: 200px;
		margin: auto;
		margin-bottom: 20px;
	}
	div.login-header img{
		width: 100%;
		height: auto;
	}
	section{
		display: block;
	}
	#btn{
		width: 304px;
		height: 200px;
		margin: auto;
		border: 1px solid black;
	}
	#login-div{
		width: 304px;
		margin: auto;
	}
	#login-btn{
		background: rgb(45,115,102);
		width: 100%;
		height: 45px;
		font-size: 23px;
		color: white;
		border: none;
	}
	.memberBtn{
		background: lightgray;
		color: white;
		font-size: 20px;
		width: 152px;
		height: 40px;
		border: none;
		cursor: pointer;
	}
	#business{
		margin-left: -6px;
	}
	
	input.input-info{
		height: 30px;
		width: 80%;
		margin: 25px;
		margin-left: 22px;
		border: 1px solid lightgray;
	}
	input#userId{
		margin-top: 30px;
	}
	#userPwd{
		margin-top: 0;
	}
	div#login-error{
		height: 35px;
		width: 75%;
		margin: auto;
		padding-top: 8px;
	}
	div#other-div{
		width : 240px;
		margin: auto;
		margin-top: 30px;
	}
	span a{
		text-decoration: none;
	}
	span.other a{
		color: gray;
		border-right: 2px solid gray;
		padding-right: 4px;
		font-size:13px;
	}
	span#enroll a{
		border: none;
	}
	.selectedBtn{
		background: rgb(45,115,102);
		cursor: default;
	}
</style>
</head>
<body>
		<section id="login">
		<div class="login-header" id="login-header">
			<a href="index.jsp">
				<img src="<%= request.getContextPath() %>/images/common/logo.png">
			</a>
		</div>
		<div id="btn">
			<button  class="memberBtn" id="common">개인 회원</button>
			<button  class="memberBtn" id="business">사업자 회원</button>
			<form accept="login()">
				<input type="text" class="input-info" placeholder="아이디" id="userId" name="userId"><br>
				<input type="password" class="input-info" placeholder="비밀번호" id="userPwd" name="userPwd">
			</form>
		</div>
		<div id="login-error">
		</div>
		<div id="login-div">
			<button id="login-btn" onclick="enterLogin();">로그인</button>
		</div>
		<div id="other-div">
			<span class="other" id="findId"><a href="<%=request.getContextPath() %>/findId.me">아이디 찾기</a></span>
			<span class="other" id="findPwd"><a href="findPwd.html">비밀번호 찾기</a></span>
			<span class="other" id="enroll"><a href="<%=request.getContextPath()%>/enrollForm.me">회원가입</a></span>
		</div>
	</section>
	<script>
		$(function(){
			$('#common').addClass('selectedBtn');
			
			$('#common').click(function(){
				$(this).addClass('selectedBtn');
				$('#business').removeClass('selectedBtn');
			});
			$('#business').click(function(){
				$(this).addClass('selectedBtn');
				$('#common').removeClass('selectedBtn');
			});
		});
		
		
		function enterLogin(){
			var userId = $('#userId');
			var userPwd = $('#userPwd');
			if(userId.val() == ''){
				$('#login-error').html('아이디를 입력해주세요').css('color','red');
				userId.focus();
			}else if(userPwd.val() == ''){
				$('#login-error').html('비밀번호를 입력해주세요').css('color','red');
				userPwd.focus();
			}else{
				login();
			}
		}
		function login(){
			location.href="<%=request.getContextPath()%>/login";
		}
		
	</script>
</body>
</html>