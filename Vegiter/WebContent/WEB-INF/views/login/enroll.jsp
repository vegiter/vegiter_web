<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="../js/jquery-3.5.1.min.js"></script>
<style>
	* { box-sizing: border-box;}
	
	/* 내용부분 */
	section{
		margin: 12%;
		margin-top: 100px;
		background: rgb(242, 242, 242);
		min-height: 800px;
		border: 1px solid rgb(242, 242, 242);
	}
	#section-header{
		width: 656px;
		height: 100%;
		margin: auto;
	}
	.member-header{
		width: 50%;
		display: inline-block;
		height: 50px;
		background: rgb(45, 115, 102);
		font-size: 18px;
		color: white;
	}
	#business{
		float: right;
		background: rgb(65, 166, 147);
		margin-left: -10px;
	}
	#business a{
		text-decoration: none;
		color: white;
	}
	#common h4, #business h4{
		margin-left: 40px;
		margin-top: 12px;
		font-weight: normal;
		height: 100%;
	}
	#business h4:hover{
		font-weight: bolder;
	}
	#business:hover{
		background: rgb(53, 154, 135);
	}
	
	.input-header{
		margin: 0;
		height: 40px;
		width: 100%;
		box-shadow: 0px 5px 5px 0px lightgray;
	}
	.input-header h4{
		margin: auto;
		margin-left: 10px;
		margin-top: 10px;
	}
	
	#social-enroll{
		width: 656px;
		height: 120px;
		margin: auto;
		clear: both;
		background: white;
	}
	#social-enroll p{
		margin: 0;
		margin-left: 25px;
		padding-top: 10px;
		padding-bottom: 10px;
	}
	#social img{
		margin-left: 25px;
	}
	
	#input-boxes{
		width: 656px;
		min-height: 700px;
		margin: auto;
		margin-top: 20px;
		background: white;
	}
	
	form h4{
		min-width: 400px;
		font-size: 15px;
		margin: 10px;
		margin-left:20%;
		display: inline-block;
	}
	.input-info{
		width: 400px;
		height: 40px;		
		padding: 0;
		margin: auto;
	}
	.error{
		height: 20px;
		width: 400px;
		margin: auto;
		margin-top: 2px;
		font-size: 12px;
	}
	select{
		width: 400px;
		height: 40px; 
		border: 2px solid lightgray;
	} 
	input{
		width: 400px;
		height: 100%;
		border: 2px solid lightgray;
	}
	input[type="number"]::-webkit-outer-spin-button,
	input[type="number"]::-webkit-inner-spin-button {
    	-webkit-appearance: none;
    	margin: 0;
	}
	form p b, b{
		color: red;
	}
	form p{
		display: inline-block;
		font-size: 12px;
		margin: 0;
		float: right;
	}
	
	.phone-btn{
		background: rgb(45, 115, 102);
		color: white;
		height: 38px;
		border-radius: 0;
		border: none;
		margin: auto;
		float: right;
	}
	#phone-msg, #phone-ok{
		border: 1px solid white;
	}
	#phone{
		width: 70%;
	}
	#phoneConfirm{
		width: 80%;
	}
	#phone-ok{
		margin-top: 20px;
	}
	#sendMsg{
		width: 30%;
	}
	#msgOk{
		width: 20%;
	}
	
	/* 푸드스타일 */
	#style-info{
		margin-bottom: 5px;
	}
	#style-info a{
		cursor: pointer;
		float: right;
		font-size: 13px;
		color: blue;
		margin-top: 5px;
	}
	
	#div-btn-enroll{
		clear:both;
		width: 400px;
		height: 40px;
		margin: auto;
		margin-top: 30px;
		margin-bottom: 30px;
	}
	#enrollBtn{
		width: 100%;
		height: 100%;
		background: rgb(45, 115, 102);
		color: white;
		border: none;
		font-size: 18px;
	}
</style>
</head>
<body>
		<section>
		<div id="section-header">
			<div class="member-header" id="common"><h4>일반회원</h4></div>
			<div class="member-header" id="business"><h4><a href="businessEnroll.html">사업자 회원</a></h4></div>
		</div>
		<article id="social-enroll">
			<div class="social" id="social">
				<p>소셜로 간편하게 로그인하세요.</p>
				<a href="#"><img src="../images/naver.PNG" id="naver"></a>
				<a href="#"><img src="../images/kakao.PNG" id="kakao"></a>
			</div>
		</article>
		<article>
			<form method="post" accept="enroll();">
				<div id="input-boxes">
					<p><b>*</b>은 필수 입력칸입니다.</p>
					<h4>아이디(6자리이상 영문, 숫자 1개 이상)<b>*</b></h4>
					<div class="input-info"><input type="text" name="userId" id="userId" onblur="idConfirm();"></div>
					<div class="error" id="id-error"></div>
					<h4>비밀번호(6자리이상 영문, 숫자, 특수문자 1개 이상)<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd" id="password" onblur="passwordConfirm();"></div>
					<div class="error"></div>
					<h4>비밀번호 확인<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd2" id="password2" onblur="password2Confirm();"></div>
					<div class="error"></div>
					<h4>이름<b>*</b></h4>
					<div class="input-info"><input type="text" name="userName" id="userName" onblur="nameConfirm();"></div>
					<div class="error"></div>
					<h4>이메일<b>*</b></h4>
					<div class="input-info"><input type="email" name="email" id="email" onblur="emailConfirm();"></div>
					<div class="error"></div>
					<h4>성별</h4>
					<div class="input-info">
						<select name="gender">
							<option selected value="NULL">성별</option>
							<option value="F">남자</option>
							<option value="M">여자</option>
							<option value="Not">선택 안함</option>
						</select>
					</div>
					<h4>휴대폰 번호<b>*</b></h4>
					<div class="input-info" id="phone-msg">
						<input type="number" class="phone" name="phone" id="phone" onblur="inputPhone();">
						<button class="phone-btn" id="sendMsg" onclick="sendConfirm();">인증번호 전송</button>
					</div>
					<div class="input-info" id="phone-ok">
						<input type="number" class="phone" name="phoneConfirm" id="phoneConfirm">
						<button class="phone-btn" id="msgOk" onclick="confirm();">확인</button>
					</div>
					<div class="error"></div>
					<h4>푸드스타일</h4>
					<div class="input-info">
						<select name="style">
							<option selected value=null>-------------</option>
							<option value="미크">미크</option>
							<option value="꼬크">꼬크</option>
							<option value="오크">오크</option>
							<option value="에크">에크</option>
							<option value="에그">에그</option>
							<option value="밀크">밀크</option>
							<option value="베지">베지</option>
						</select>
					</div>
					<div class="error" id="style-info"><a onclick="info();">푸드스타일이란?</a></div>
				</div>
				<div id="div-btn-enroll"><button id="enrollBtn" onclick="enterEnroll();">회원가입</button></div>
			</form>
			<script>
				var idCheck = true;
				var pwdCheck = true;
				var nameCheck = true;
				var emailCheck = true;
				var phoneCheck = true;
				
				var regExp1 = /[a-zA-Z]/; //문자
				var regExp2 = /[0-9]/;	//숫자
				var regExp3 = /\S/; //공백여부
				var regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자
				var regExp5 = /[가-힣]/; //한글
				
				$(function(){
					
					$('input').focusin(function(){
						$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
					}).focusout(function(){
						$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})
					});
					
				});
				function idConfirm(){
					// id 입력시 
					var inputId = $('#userId').val();
					
					if(inputId.length == 0){
						$('.error').eq(0).text('아이디를 입력해주세요').css('color','red');
						idCheck = false;
					}else if(!regExp1.test(inputId) || !regExp2.test(inputId) || !regExp3.test(inputId) || inputId.length < 6 ){
						$('.error').eq(0).text('아이디는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
						idCheck = false;
					}else{
						// 중복 체크!
						$('.error').eq(0).text('사용가능한 아이디입니다.').css('color','green');
					}
				}
				function passwordConfirm(){
					// 비번 입력시
					var inputPwd = $('#password').val();
					
					if(inputPwd.length ==  0){
						$('.error').eq(1).text('비밀번호를 입력해주세요').css('color','red');
						pwdCheck = false;
					}else if(!regExp1.test(inputPwd) || !regExp2.test(inputPwd) || !regExp3.test(inputPwd) || !regExp4.test(inputPwd) || inputPwd.length < 6 ){
						$('.error').eq(1).text('비밀번호는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
						pwdCheck = false;
					}else{
						$('.error').eq(1).text('사용가능한 비밀번호입니다.').css('color','green');
					}
				}
				
				function password2Confirm(){
					var pwd1 = $('#password').val();
					var pwd2 = $('#password2').val();
					if(pwd1 == pwd2){
						if(pwd2.length == 0){
							$('.error').eq(2).text('');
							pwdCheck = false;
						}else{
							$('.error').eq(2).text('비밀번호가 일치합니다.').css('color','green');
						}
					}else{
						$('.error').eq(2).text('비밀번호가 일치하지 않습니다.').css('color','red');
						pwdCheck = false;
					}
				}
				
				function nameConfirm(){
					var name = $('#userName').val();
					if(name.length == 0){
						$('.error').eq(3).text('이름을 입력해주세요').css('color','red');
						nameCheck = false;
					}else if(!regExp5.test(name) || regExp2.test(name) || regExp4.test(name)){
						$('.error').eq(3).text('이름을 올바르게 입력해주세요').css('color','red');
						nameCheck = false;
					}else{
						$('.error').eq(3).text('');
					}
				}
				
				function emailConfirm(){
					var email = $('#email').val();
					if(email.length == 0){
						$('.error').eq(4).text('이메일을 입력해주세요').css('color','red');
						emailCheck = false;
					}else{
						// 중복체크 >> ajax사용?
						// unique로 만들기
						$('.error').eq(4).text('사용가능한 이메일입니다.').css('color','green');
					}
				}
				function inputPhone(){
					var phone = $('#phone').val();
					if(phone.length == 0){
						$('.error').eq(5).text('휴대폰 번호를 입력해주세요').css('color','red');
					}else{
						$('.error').eq(5).text('');
					}
				}
				function enterEnroll(){
					if(!idCheck){
						alert('아이디를 올바르게 입력해주세요');
						$('#userId').focuse();
					}
					if(!pwdCheck){
						alert('비밀번호를 올바르게 입력해주세요');
						$('#userPwd').focus();
					}
				}
				function enroll(){
					
				}
				
				function sendConfirm(){
					
				}
				function confirm(){
					// 확인문자까지 해야 true
					$('.error').eq(5).text('인증이 완료되었습니다.').css('color','green');
				}
				function info(){
					window.open('foodStyle.html','푸드스타일이란?','width=600,height=450');
				}
			</script>
		</article>
	</section>
</body>
</html>