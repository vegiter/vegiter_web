<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
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
	<%@ include file="../common/gnb.jsp" %>
		<section>
		<div id="section-header">
			<div class="member-header" id="common"><h4>일반회원</h4></div>
			<div class="member-header" id="business"><h4><a href="<%= request.getContextPath()%>/businessEnroll">사업자 회원</a></h4></div>
		</div>
		<article id="social-enroll">
			<div class="social" id="social">
				<p>소셜로 간편하게 로그인하세요.</p>
				<a href="/naverLogin"><img src="<%= request.getContextPath() %>/images/common/naver.png" id="naver"></a>
				<a href="#"><img src="<%= request.getContextPath() %>/images/common/kakao.png" id="kakao"></a>
			</div>
		</article>
		<article>
			<form method="post" id="insertMember" action="<%=request.getContextPath() %>/insert.me" onsubmit="return enroll();">
				<div id="input-boxes">
					<p><b>*</b>은 필수 입력칸입니다.</p>
					<h4>아이디(6자리이상 영문, 숫자 1개 이상)<b>*</b></h4>
					<div class="input-info"><input type="text" name="userId" id="userId"></div>
					<div class="error" id="id-error"></div>
					<h4>비밀번호(6자리이상 영문, 숫자, 특수문자 1개 이상)<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd" id="password"></div>
					<div class="error"></div>
					<h4>비밀번호 확인<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd2" id="password2"></div>
					<div class="error"></div>
					<input type="hidden" name="code" value="1">
					<h4>이름<b>*</b></h4>
					<div class="input-info"><input type="text" name="userName" id="userName"></div>
					<div class="error"></div>
					<h4>이메일<b>*</b></h4>
					<div class="input-info"><input type="email" name="email" id="email"></div>
					<div class="error"></div>
					<h4>성별</h4>
					<div class="input-info">
						<select name="gender">
							<option selected value="N">성별</option>
							<option value="F">남자</option>
							<option value="M">여자</option>
							<option value="N">선택 안함</option>
						</select>
					</div>
					<h4>휴대폰 번호<b>*</b></h4>
					<div class="input-info" id="phone-msg">
						<input type="number" class="phone" name="phone" id="phone" placeholder="(-)미포함">
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
				<div id="div-btn-enroll"><input type="submit" id="enrollBtn" value="회원가입"></div>
			</form>
			<script>
				var regExp1 = /[a-zA-Z]/; //문자
				var regExp2 = /[0-9]/;	//숫자
				var regExp3 = /\S/; //공백여부
				var regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자
				var regExp5 = /[가-힣]/g; //한글
				
				$(function(){
					$('input').focusin(function(){
						$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
					}).focusout(function(){
						$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})
					});
				});
				
				var idCheck = false;  // pk
				var pwdCheck = false;
				var pwd2Check = false;
				var nameCheck = false;
				var emailCheck = false; //unique
				var phoneCheck = false; //인증
				var checked = false; //전체 체크
				
				$("#userId").on('change paste keyup', function(){
					var idCheck = false;
				});
				$("#password").on('change paste keyup', function(){
					var pwdCheck = false;
				});
				$("#passwor2").on('change paste keyup', function(){
					var pwd2Check = false;
				});
				$("#email").on('change paste keyup', function(){
					var emailCheck = false;
				});
				$("#phone").on('change paste keyup', function(){
					var phoenCheck = false;
				});
				
				$('#userId').change(function(){
					var inputId = $('#userId').val();

					if(inputId.length == 0){
						$('.error').eq(0).text('아이디를 입력해주세요').css('color','red');
					}else if(!regExp1.test(inputId) || !regExp2.test(inputId) || !regExp3.test(inputId) || inputId.length < 6 ){
						$('.error').eq(0).text('아이디는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
					}else{
						// 중복 체크!
						$.ajax({
							url: '<%= request.getContextPath()%>/checkId.me',
							data: {userId: inputId},
							success: function(data){
								console.log(data);
								
								if(data == 'success'){
									$('.error').eq(0).text('사용가능한 아이디입니다.').css('color','green');
									idCheck = true;
								}else{
									$('.erro').eq(0).text('중복된 아이디입니다.').css('color','red');
									idCheck = false;
								}
							}
						});
					}
					
				})
				
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
							$('.error').eq(2).text('');
							pwd2Check = false;
						}else{
							$('.error').eq(2).text('비밀번호가 일치합니다.').css('color','green');
							pwd2Check = true;
						}
					}else{
						$('.error').eq(2).text('비밀번호가 일치하지 않습니다.').css('color','red');
						pwd2Check = false;
					}
				});
				
				$('#userName').change(function(){
					var name = $('#userName').val();
					if(name.length == 0){
						$('.error').eq(3).text('이름을 입력해주세요').css('color','red');
						nameCheck = false;
					}else if(!regExp5.test(name) || regExp2.test(name) || regExp4.test(name)){
						$('.error').eq(3).text('이름을 올바르게 입력해주세요').css('color','red');
						nameCheck = false;
					}else{
						$('.error').eq(3).text('');
						nameCheck = true;
					}
				});
				
				$('#email').change(function(){
					var email = $('#email').val();
					if(email.length == 0){
						$('.error').eq(4).text('이메일을 입력해주세요').css('color','red');
						emailCheck = false;
					}else{
						$('.error').eq(4).text('사용가능한 이메일입니다.').css('color','green');
						emailCheck = true;
					}
				});
				
				$('#phone').change(function(){
					var phone = $('#phone').val();
					if(phone.length == 0){
						$('.error').eq(5).text('휴대폰 번호를 입력해주세요').css('color','red');
					}else{
						$('.error').eq(5).text('');
					}
				});
				function sendConfirm(){
					console.log('askdasdfas');
					
				}
				function confirm(){
					// 확인문자까지 해야 true
					$('.error').eq(5).text('인증이 완료되었습니다.').css('color','green');
					phoneCheck = true;
				}
				
				function enroll(){
					if(!idCheck){
						alert('아이디를 확인해주세요');
						$('#userId').focus();
						return false;
					}else if(!pwdCheck){
						alert('비밀번호를 입력해주세요');
						$('#password').focus();
						return false;
					}else if(!pwd2Check){
						alert('비밀번호가 일치하지 않습니다.');
						$('#password2').focus();
						return false;
					}else if(!nameCheck){
						alert('이름을 바르게 입력해주세요');
						$('#userName').focus();
						return false;
					}else if(!emailCheck){
						alert('이메일을 입력해주세요');
						$('#email').focus();
						return false;
					}else if(!phoneCheck){
						alert('휴대폰 인증확인을 해주세요');
						$('#phone').focus();
						return false;
					}else{
						alert('회원가입이 되었습니다.');
						return true;
					}
				}
				
				function info(){
					window.open('foodStyle.html','푸드스타일이란?','width=600,height=450');
				}
			</script>
		</article>
	</section>
</body>
</html>