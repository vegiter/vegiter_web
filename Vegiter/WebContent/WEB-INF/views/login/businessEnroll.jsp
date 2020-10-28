<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
	* { 
		box-sizing: border-box;
	}
	header{
		position: fixed;
		top: 0;
		z-index: 10;
		width: 100%;
		background: rgba(255,255,255, 0.8);
		border-bottom: 1px solid lightgray;
	}
	nav{
		diplay: inline-block;
		float: right;
		padding: 0;
		height: 40px;
		margin-right: 10%;
	}
	div, ul, li{
		padding: 0;
		margin: 0;
	}
	#logo{
		width: 150px;
		margin-left: 10%
	}
	nav li{
		float: left;
		position: relative;
		padding: 0;
		line-height: 40px; /*굵기*/
	}
	.header nav .wrap > ul{
		display: inline-block;
		position : relative;
	}
	.wrap>ul>li{
		width: 100px;
		height: 63px;
	}
	.wrap>ul>li>a{
		display: block;
		width: 100%;
		text-decoration : none;
		color: black;
		text-align: center;
		margin-top: 10px;
	}
	ol, ul{
		list-style:none;
	}
	nav li:hover{
		font-weight: bolder;
		border-bottom: 3px solid rgb(45,115,102);
	}
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
		margin-left: -10px;
	}
	#common{
		background: rgb(65, 166, 147);
	}
	#common a{
		text-decoration: none;
		color: white;
	}
	#common h4, #business h4{
		margin-left: 40px;
		margin-top: 12px;
		font-weight: normal;
		height: 100%;
	}
	#common h4:hover{
		font-weight: bolder;
	}
	#common:hover{
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
	
	
	#input-boxes{
		width: 656px;
		min-height: 1500px;
		margin: auto;
		background: white;
	}
	
	form h4{
		display: inline-block;
		min-width: 400px;
		font-size: 15px;
		margin: 10px;
		margin-left:20%;
	}
	.file>div>h4{
		display: inline-block;
		width: 200px;
		margin: auto;
		font-size: 15px;
		margin-top: 10px;
		margin-bottom: 10px;
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
	.file{
		width: 400px;
		margin: auto;
	}
	#topImg, #menuImg{
		display: inline-block;
		margin-top: 10px;
		min-width: 180px;
		min-height: 200px;
		background: white;
		border: 3px solid lightgray;
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
	<%@include file="../common/gnb.jsp" %>
		<section>
		<div id="section-header">
			<div class="member-header" id="common"><h4><a href="<%=request.getContextPath()%>/enrollForm.me">일반회원</a></h4></div>
			<div class="member-header" id="business"><h4>사업자 회원</h4></div>
		</div>
		
		<article>
			<form method="post" id="insertMember" action="<%=request.getContextPath()%>/insert.ow" onsubmit="return enroll();" encType="multipart/form-data">
				<div id="input-boxes">
					<p><b>*</b>은 필수 입력칸입니다.</p>
					<h4>아이디(6~16자리 영문소문자, 숫자만 사용가능)<b>*</b></h4>
					<div class="input-info"><input type="text" name="userId" id="userId"></div>
					<div class="error"></div>
					<h4>비밀번호(6~16자리 영문소문자, 숫자, 특수문가 사용가능)<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd1" id="password"></div>
					<div class="error"></div>
					<h4>비밀번호 확인<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd2" id="password2"></div>
					<div class="error"></div>
					<input type="hidden" name="code" value="2">
					<h4>사업주<b>*</b></h4>
					<div class="input-info"><input type="text" name="userName" id="userName"></div>
					<div class="error"></div>
					<h4>사업자 번호<b>*</b></h4>
					<div class="input-info"><input type="number" name="ownNumber" id="ownNumber" placeholder="-포함"></div>
					<div class="error"></div>
					<h4>이메일<b>*</b></h4>
					<div class="input-info"><input type="email" name="email" id="email"></div>
					<div class="error"></div>
					<h4>업체 전화번호<b>*</b></h4>
					<div class="input-info"><input type="number" name="phone" id="phone"></div>
					<div class="error"></div>
					<h4>업체 주소<b>*</b></h4>
					<div class="input-info"><input type="text" name="address" id="address"></div>
					<div class="error"></div>
					<h4>홈페이지</h4>
					<div class="input-info"><input type="url" name="url" id="url"></div>
					<div class="error"></div>
					<div class="file">
						<div><h4>대표이미지</h4>
							<input type="file" onchange="loadImg(this);" name="image" accept="image/jpg, image/jpeg, image/png">
							<div id="topImg"><img src="<%= request.getContextPath() %>/images/common/diagonal.png" id="diagonal1"></div>
						</div>
						<div><h4>메뉴이미지</h4>
							<input type="file" onchange="loadImg2(this);" name="image" accept="image/jpg, image/jpeg, image/png" multiple>
							<div id="menuImg">
								<img src="<%= request.getContextPath() %>/images/common/diagonal.png" id="diagonal2">
							</div>
						</div>
					</div>
				</div>
				<div id="div-btn-enroll"><input type="submit" id="enrollBtn" value="회원가입"></div>
			</form>
			<script>
				$(function(){
					$('input').focusin(function(){
						$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
					}).focusout(function(){
						$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})
					});
				});
				// input error
				var regExp1 = /[a-zA-Z]/; //문자
				var regExp2 = /[0-9]/;	//숫자
				var regExp3 = /\S/; //공백여부
				var regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자
				var regExp5 = /[가-힣]/g; //한글
				
				var idCheck = false;  // pk
				var pwdCheck = false;
				var pwd2Check = false;
				var nameCheck = false;
				var emailCheck = false; //unique
				var ownNumberCheck = false;
				var phoneCheck = false;
				var addressCheck = false;
				var checked = false; 
				
				$("#userId").on('change paste keyup', function(){
					var idCheck = false;
				});
				$("#password").on('change paste keyup', function(){
					var pwdCheck = false;
				});
				$("#passwor2").on('change paste keyup', function(){
					var pwd2Check = false;
				});
				
				$('#userId').change(function(){
					var inputId = $('#userId').val();
					if(inputId == ""){
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
									$('.error').eq(0).text('중복된 아이디입니다.').css('color','red');
									idCheck = false;
								}
							}
						});
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
					console.log(inputPwd);
				});
				
				$('#password2').change(function(){
					var inputPwd2 = $('#password2').val();
					var inputPwd = $('#password').val();
					if(inputPwd == inputPwd2){
						if(inputPwd2.length == 0){
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
						$('.error').eq(5).text('이메일을 입력해주세요').css('color','red');
						emailCheck = false;
					}else{
						$('.error').eq(5).text('사용가능한 이메일입니다.').css('color','green');
						emailCheck = true;
					}
				});
				
				$('#phone').change(function(){
					var phone = $('#phone').val();
					if(phone.length == 0){
						$('.error').eq(6).text('전화번호를 입력해주세요').css('color','red');
						phoneCheck = false;
					}else{
						$('.error').eq(6).text('');
						phoneCheck = true;
					}
				});
				$('#ownNumber').change(function(){
					// pk 중복체크
					var own = $('#ownNumber').val();
					if(own.length < 4){
						$('.error').eq(4).text('사업자 번호를 입력해주세요').css('color','red');
						ownNumberCheck = false;
					}else{
						$.ajax({
							url: '<%=request.getContextPath()%>/checkOwnNumber',
							data : {ownNo:own},
							success: function(data){
								console.log(data);
								
								if(data== 'success2'){
									$('.error').eq(4).text('사용가능한 사업자 번호입니다.').css('color','green');
									ownNumberCheck = true;
								}else{
									$('.error').eq(4).text('중복된 사업자 번호입니다.').css('color','red');
									ownNumberCheck = false;
								}
							}
						});
					}
				});
				$('#address').change(function(){
					var address = $('#address').val();
					if(address.length < 4){
						$('.error').eq(7).text('주소를 입력해주세요').css('color','red');
						addressCheck = false;
					}else{
						$('.error').eq(7).text('');
						addressCheck = true;
					}
				});
				
				// 이미지 미리보기
				function loadImg(value){
					if(value.files[0]){
						var reader = new FileReader();
						
						reader.onload = function(e){
							$('#diagonal1').attr('src', e.target.result).css('width','150px');
						}
						reader.readAsDataURL(value.files[0]);
					}
				}
				
				function loadImg2(value) { 
					if(value.files){
						$div = $('#menuImg');
						$div.find('img').remove();
						
						for(var i = 0; i < value.files.length; i++){
							var reader = new FileReader();
							reader.onload = function(e){
								$img = $('<img>');
								$img.attr("src", e.target.result).css('width','150px');
								$div.append($img);
							}
							reader.readAsDataURL(value.files[i]); 
						}
					}
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
						alert('전화번호를 입력 해주세요');
						$('#phone').focus();
						return false;
					}else if(!ownNumberCheck){
						alert('사업자번호를 확인해주세요');
						$('#ownNumber').focus();
						return false;
					}else if(!addressCheck){
						alert('주소를 확인해주세요');
						$('#address').focus();
						return false;
					}else{
						alert('회원가입이 되었습니다.');
						return true;
					}
				}
			</script>
		</article>
	</section>
</body>
</html>