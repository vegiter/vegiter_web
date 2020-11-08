<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<!-- jquery -->
<script src="js/jquery-3.5.1.min.js"></script>
<<<<<<< HEAD
<!-- 폰트 -->
=======
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
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap"
	rel="stylesheet">
<style>
<<<<<<< HEAD
body {
	line-height: 1;
	font-family: 'Open Sans', sans-serif;
}
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
	font-size: 20px;
	color: white;
}

#find-pwd {
	float: right;
	background: rgb(65, 166, 147);
	margin-left: -10px;
}

#find-pwd a {
	text-decoration: none;
	color: white;
}

#find-id h4, #find-pwd h4 {
	margin-left: 40px;
	margin-top: 10px;
	font-weight: normal;
	height: 60%;
}

#find-pwd h4:hover {
	font-weight: bolder;
}

#find-pwd:hover {
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

#input-boxes {
	width: 450px;
	margin: auto;
}
.input-box {
	display: inline-block;
	width: 480px;
	height: 280px;
	margin-bottom: 5%;
	background: white;
	border: 2px solid gray;
}

.input-header {
	margin: 0;
	height: 40px;
	width: 100%;
	box-shadow: 0px 5px 5px 0px lightgray;
}

.input-header h4 {
	margin: auto;
	margin-left: 10px;
	margin-top: 10px;
	font-size: 18px;
	color: dimgray;
}

/* 일반회원 */
#common{
	margin-top: 15px;
}
#common-input {
	width: 350px;
	margin: auto;
}
#common{
	margin-top: 10px;
}
table {
	font-size: 15px;
}

table tr {
	height: 45px;
}

table td {
	min-width: 30px;
}

.phone {
	width: 50px;
}

input[type="number"]::-webkit-outer-spin-button, input[type="number"]::-webkit-inner-spin-button
	{
	-webkit-appearance: none;
	margin: 0;
}
/* 사업자 회원 */
#business{
	margin-top: 10px;
}
#business-input {
	width: 350px;
	margin: auto;
	margin-top: 30px;
}

.div-btn{
	width: 230px;
	height: 35px;
	margin: auto;
	margin-top: 25px;
	margin-bottom: 30px;
}
.IdBtn {
	width: 100%;
	height: 100%;
	background: dimgray;
	color: white;
	border: none;
	font-size: 14px;
}
.IdBtn:hover{
	background: rgb(64,64,64);
	cursor: pointer;
}

=======
#zeroArea {
	display: block;
	height: 70px;
}

#findArea {
	border: 1px solid lightgray;
	background: white;
	width: 60%;
	height: 900px;
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

#member {
	display: inline;
	width: 49.5%;
	height: 800px;
	margin-top: 30px;
}

#owner {
	display: inline;
	width: 49.5%;
	height: 800px;
	margin-top: 30px;
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

#nameInput {
	margin-left: 60px;
}

#emailInput {
	margin-left: 45px;
	margin-bottom: 50px;
}

#ownerName {
	margin-left: 80px;
}

#ownerNum {
	margin-left: 45px;
	margin-bottom: 50px;
}
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>
<<<<<<< HEAD
	<section>
		<div id="section-header">
			<div class="find-header" id="find-id"><h4>아이디 찾기</h4></div>
			<div class="find-header" id="find-pwd"><h4><a href="<%=request.getContextPath()%>/findPwd.me">비밀번호 찾기</a></h4></div>
		</div>
		<article id="content">
			<div id="input-boxes">
				<div id="input">
				<div class="input-box" id="common">
					<div class="input-header" id="common-header"><h4>일반회원</h4></div>
					<div id="common-input">
						<form action="<%=request.getContextPath()%>/findMemberId.me"
								method="post" id="findMemberId" name="findMemberId"
								onsubmit="return findId();">
							<table>
								<tr>
									<td class="confirm"><input type="radio" name="confirm" onclick="phoneConfirm();" checked="checked" id="confirm-phone">휴대폰 인증</td>
									<td></td>
									<td class="confirm"><input type="radio" name="confirm" onclick="emailConfirm();" id="confirm-email">이메일 인증</td>
								</tr>
								<tr>
									<td>이름</td>
									<td colspan="2"><input type="text" name="userName" id="userName"></td>
								</tr>
								<tr>
									<td id="change-name">휴대폰 번호</td>
									<td id="change-input" colspan="2">
										<select name="phone-first" id="phone-first">
											<option selected value="010">010</option>
											<option value="011">011</option>
										</select>
										-
										<input type="number" class="phone" name="phone-middle" id="phone-middle" maxlength="4" oninput="maxLengthCheck(this)"> -
										<input type="number" class="phone" name="phone-last" id="phone-last"  maxlength="4" oninput="maxLengthCheck(this)">
									</td>
								</tr>
							</table>
							<div class="div-btn" id="btn1"><input type="submit" class="IdBtn" value="일반회원 아이디 찾기"></div>
						</form>
					</div>
				</div>
				<script type="text/javascript">
					function maxLengthCheck(object){
				   	 if (object.value.length > object.maxLength){
				    	  object.value = object.value.slice(0, object.maxLength);
				  	  }    
				 	 }
				</script>
				<script>
					function emailConfirm(){
						$('#change-name').html("이메일 주소");
						$('#change-input').html('<input type="email" name="email" id="email" required>');
					};
					function phoneConfirm(){
						$('#change-name').html("휴대폰 번호");
						$('#change-input').html('<select name="phone-first"><option selected value="010">010</option><option value="011">011</option></select> - <input type="number" class="phone" name="phone-middle" id="phone-middle"  maxlength="4" oninput="maxLengthCheck(this)"> - <input type="number" class="phone" name="phone-last" id="phone-last"  maxlength="4" oninput="maxLengthCheck(this)">');
					};
					
				</script>
				<div class="input-box" id="business">
					<div class="input-header" id="business-header"><h4>사업자 회원</h4></div>
					<div id="business-input">
						<form  action="<%=request.getContextPath()%>/findOwnerId.me"
								method="post" id="findOwnerId" name="findOwnerId"
								onsubmit="return findOwner();">
							<table>
								<tr>
									<td>사업주</td>
									<td colspan="2"><input type="text" name="ownerName" id="ownName"></td>
								</tr>
								<tr>
									<td>사업자 등록번호</td>
									<td><input type="number" name="ownerNum"></td>
								</tr>
							</table>
							<div class="div-btn" id="btn2"><input type="submit" class="IdBtn" value="사업자 아이디 찾기"></div>
						</form>
					</div>
					</div>
				</div>
			</div>
			<script>
				$('input').focusin(function(){
					$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
				}).focusout(function(){
					$(this).css({'border':'1px solid black', 'box-shadow':'none'})
				});
				function findId() {
					var name = $('#userName').val();
					var phone1 = $('#phone-first').val();
					var phone2 = $('#phone-middle').val();
					var phone3 = $('#phone-last').val();
					
					if($('#confirm-phone').attr('checked') == 'checked'){
						if(name.length < 2){
							alert('이름을 입력해주세요.');
							$('#userName').focus();
							return false;
						}else if(phone2.length < 4 || phone3.length < 4 ){
							alert('휴대폰 번호를 입력해주세요.');
							return false;
						}else{
							return true;
						}
					}else{
						if(name.length < 2){
							alert('이름을 입력해주세요');
							$('#userName').focus();
							return false;
						}else{
							return true;
						}
					}
					
				}
				
				function findOwner() {
					var ownerName = $('#ownerName').val();
					var ownerNum = $('#ownerNum').val();

					console.log(ownerName);
					console.log(ownerNum);

					if (ownerName.length < 2 || ownerNum.length < 4) {
						alert('다시 입력해주세요');
						return false;
					} else {
						return true;
					}

					return false;
				}
			</script>
		</article>
	</section>

=======

	<div id="zeroArea"></div>

	<div id="findArea">

		<div class="titleArea">
			<p class="title">아이디 찾기</p>
		</div>

		<form action="<%= request.getContextPath() %>/findMemberId.me" method="post" id="findMemberId" name="findMemberId" onsubmit="return findId();">
		<br><br>
				<span id="member"><p class="pTitle">일반 회원 아이디 찾기</p>
					<p class="text">이름 :</p>
					<input type="text" class="input" id="nameInput" name="nameInput"><br>
					<p class="text">이메일 :</p>
					<input type="email" class="input" id="emailInput" name="emailInput"><br>
					<div class="text-center">
						<input type="submit" class="btn btn-secondary findBtn" id="btn1"
							value="일반 회원 아이디 찾기" >
<!-- 							onclick="findId();" -->
					</div> </span>
		</form>
		<br><br>
		<form action="<%= request.getContextPath() %>/findOwnerId.me" method="post" id="findOwnerId" name="findOwnerId" onsubmit="return findOwner();">
		<br><br>
			<span id="owner"><p class="pTitle">사업자 회원 아이디 찾기</p>
				<p class="text">사업주 :</p>
				<input type="text" class="input" id="ownerName" name="ownerName"><br>
				<p class="text">사업자 번호 :</p>
				<input type="text" class="input" id="ownerNum" name="ownerNum"><br>
				<div class="text-center">
					<input type="submit" class="btn btn-secondary findBtn" id="btn2"
						value="사업자 회원 아이디 찾기" >
<!-- 						onclick="findOwnerId();" -->
			</div> </span>
		</form>
	</div>

<%-- 	<%@ include file="../common/footer.jsp"%> --%>

	<script>
		function findId(){ 
			var name = $('#nameInput').val();
			var email = $('#emailInput').val();
			
			console.log(1);
			console.log(email);
			
			if(name.length < 3 || email.length < 3){
				alert('다시 입력해주세요');
				return false;
			} else {
				return true;
			}
		}
		
		function findOwner(){
			var ownerName = $('#ownerName').val();
			var ownerNum = $('#ownerNum').val();
			
			console.log(ownerName);
			console.log(ownerNum);
			
			if(ownerName.length < 3 || ownerNum.length < 4){
				alert('다시 입력해주세요');
				return false;
			} else {
				return true;
			}
			
			return false;
		}
		</script>
	
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
</body>
</html>