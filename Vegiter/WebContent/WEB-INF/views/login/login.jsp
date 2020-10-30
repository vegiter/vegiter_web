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
	#social-login{
		width: 75%;
		margin: auto;
		margin-top: 10px;
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
<script src="<%=request.getContextPath()%>/js/naveridlogin_js_sdk_2.0.0.js"></script>
<script src="<%=request.getContextPath()%>/js/naverLogin_implicit-1.0.2.js"></script>

</head>
<body>
		<section id="login">
		<div class="login-header" id="login-header">
			<a href="index.jsp">
				<img src="<%= request.getContextPath() %>/images/common/logo.png">
			</a>
		</div>
		<form onsubmit="return login()" action="<%=request.getContextPath()%>/login">
			<div id="btn">
				<button  class="memberBtn" id="common">개인 회원</button>
				<button  class="memberBtn" id="business">사업자 회원</button>
			
				<input type="text" class="input-info" placeholder="아이디" id="userId" name="userId"><br>
				<input type="password" class="input-info" placeholder="비밀번호" id="userPwd" name="userPwd">
			</div>
			<div id="login-error">
			</div>
			<input type="hidden" name="social" id="social">
			<div id="login-div">
				<input type="submit" id="login-btn" value="로그인">
			</div>
		</form>
		<div id="social-login">
			<div id="naverIdLogin"></div>
		</div>
		<div id="other-div">
			<span class="other" id="findId"><a href="<%=request.getContextPath() %>/findId.me">아이디 찾기</a></span>
			<span class="other" id="findPwd"><a href="<%=request.getContextPath()%>/findPwd.me">비밀번호 찾기</a></span>
			<span class="other" id="enroll"><a href="<%=request.getContextPath()%>/enrollForm.me">회원가입</a></span>
		</div>
	</section>
	<script type="text/javascript">
		var naverLogin = new naver.LoginWithNaverId(
			{
				clientId : "w3sXDEgZtjtnF9AcUJSw",
				callbackUrl : "http://localhost:9981/Vegiter/",
				isPopup : false,
				loginButton : {color : "white",type : 2, height : 40}
		});
		naverLogin.init();
		window.addEventListener('load', function() {
			naverLogin.getLoginStatus(function(status) {
				if (status) {
					/* (6) 로그인 상태가 "true" 인 경우 로그인 버튼을 없애고 사용자 정보를 출력합니다. */
					setLoginStatus();
				}
			});
		});
		function setLoginStatus() {
			var uniqId = naverLogin.user.getId();
			$('#userId').val(uniqId);
			$('#social').val(true);
			login();
		}
	</script>
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
			
			$('input').focusin(function(){
				$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
			}).focusout(function(){
				$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})
			});
		});
		
		function login(){
			var userId = $('#userId');
			var userPwd = $('#userPwd');
			
			if(userId.val() == ''){
				$('#login-error').html('아이디를 입력해주세요').css('color','red');
				userId.focus();
				return false;
			}else if(userPwd.val() == ''){
				if($('#social').val()){
					return true;
				}else{
					$('#login-error').html('비밀번호를 입력해주세요').css('color','red');
					userPwd.focus();
					return false;
				}
			}else{
				return true;
			}
		}
	</script>
</body>
</html>