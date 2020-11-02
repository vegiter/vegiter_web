<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<!-- jquery -->
<script src="js/jquery-3.5.1.min.js"></script>
<!-- 폰트 -->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap"
	rel="stylesheet">
<style>
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

</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>
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
									<td colspan="2"><input type="text" name="" id="userName"></td>
								</tr>
								<tr>
									<td id="change-name">휴대폰 번호</td>
									<td id="change-input" colspan="2">
										<select name="phone-first" id="phone-first">
											<option selected value="010">010</option>
											<option value="011">011</option>
										</select>
										-
										<input type="number" class="phone" name="phone-middle" id="phone-middle" > -
										<input type="number" class="phone" name="phone-last" id="phone-last">
									</td>
								</tr>
							</table>
							<div class="div-btn" id="btn1"><input type="submit" class="IdBtn" value="일반회원 아이디 찾기"></div>
						</form>
					</div>
				</div>
				<script>
					function emailConfirm(){
						$('#change-name').html("이메일 주소");
						$('#change-input').html('<input type="email" name="email" id="email">');
					};
					function phoneConfirm(){
						$('#change-name').html("휴대폰 번호");
						$('#change-input').html('<select name="phone-first"><option selected value="010">010</option><option value="011">011</option></select> - <input type="number" class="phone" name="phone-middle" id="phone-middle"> - <input type="number" class="phone" name="phone-last" id="phone-last">');
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
				$('#phone-middle').change(function(){
					console.log($(this).val());
				});
			
				$('#phone-first').change(function(){
					console.log($(this).val());
				});
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
						}else if($('#email').val().length < 2){
							alert('이메일을 입력해주세요');
							$('#email').focus();
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

</body>
</html>