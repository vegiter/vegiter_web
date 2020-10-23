<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<style>
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
	#section-header{
		width: 70%;
		height: 100%;
		margin: auto;
		margin-top : 100px;
	}
	.find-header{
		width: 50%;
		display: inline-block;
		height: 50px;
		background: rgb(45, 115, 102);
		font-size: 18px;
		color: white;
	}
	#find-pwd{
		float: right;
		background: rgb(65, 166, 147);
		margin-left: -10px;
	}
	#find-pwd a{
		text-decoration: none;
		color: white;
	}
	#find-id h4, #find-pwd h4{
		margin-left: 40px;
		margin-top: 12px;
		font-weight: normal;
		height: 100%;
	}
	#find-pwd h4:hover{
		font-weight: bolder;
	}
	#find-pwd:hover{
		background: rgb(53, 154, 135);
	}
	
	#content{
		background: rgb(242, 242, 242);
		width: 70%;
		min-height: 400px;
		margin: auto;
		clear: both;
		border: 1px solid rgb(242, 242, 242);
	}
	#common{
		margin-right: 30px;
	}
	#input-boxes{
		min-width: 400px;
		margin: auto;
		padding-left: 20%;
	}
	.input-box{
		display: inline-block;
		width: 400px;
		height: 230px;
		background: white;
		margin-top: 50px;
		border: 2px solid gray;
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
	
	/* 일반회원 */
	#common-input{
		width: 300px;
		margin: auto;
	}
	table{
		font-size: 12px;
	}
	table tr{
		height: 45px;
	}
	table td{
		min-width: 30px;
	}
	.phone{
		width: 50px;
	}
	input[type="number"]::-webkit-outer-spin-button,
	input[type="number"]::-webkit-inner-spin-button {
    	-webkit-appearance: none;
    	margin: 0;
	}
	/* 사업자 회원 */
	#business-input{
		width: 300px;
		margin: auto;
		margin-top: 30px;
	}
	#div-btn-id{
		width: 400px;
		height: 40px;
		margin: auto;
		margin-top: 30px;
		margin-bottom: 30px;
	}
	#IdBtn{
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
	<header class="header">
		<a href="../main.html"><img id="logo" src="../images/logo.PNG"></a>
		<nav>
			<div class="wrap">
				<ul>
					<li><a href="#1">About us</a></li>
					<li><a href="#">식당검색</a></li>
					<li><a href="#">레시피</a></li>
					<li><a href="#">Vegi talk</a></li>
					<li><a href="login.html">My Info</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<section>
		<div id="section-header">
			<div class="find-header" id="find-id"><h4>아이디 찾기</h4></div>
			<div class="find-header" id="find-pwd"><h4><a href="findPwd.html">비밀번호 찾기</a></h4></div>
		</div>
		<article id="content">
			<div id="input-boxes">
				<div class="input-box" id="common">
					<div class="input-header" id="common-header"><h4>일반회원</h4></div>
					<div id="common-input">
						<form>
							<table>
								<tr>
									<td class="confirm"><input type="radio" name="confirm" onclick="emailConfirm();" id="confirm-email">이메일 인증</td>
									<td></td>
									<td class="confirm"><input type="radio" name="confirm" onclick="phoneConfirm();" checked="checked" id="confirm-phone">휴대폰 인증</td>
								</tr>
								<tr>
									<td>이름</td>
									<td colspan="2"><input type="text" name="userName" id="userName"></td>
								</tr>
								<tr>
									<td id="change-name">휴대폰 번호</td>
									<td id="change-input" colspan="2">
										<select name="phone-first">
											<option selected value="010">010</option>
											<option value="011">011</option>
										</select>
										-
										<input type="number" class="phone" name="phone-middle"> -
										<input type="number" class="phone" name="phone-last">
									</td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<script>
					function emailConfirm(){
						$('#change-name').html("이메일 주소");
						$('#change-input').html('<input type="email" name="email">');
					};
					function phoneConfirm(){
						$('#change-name').html("휴대폰 번호");
						$('#change-input').html('<select name="phone-first"><option selected value="010">010</option><option value="011">011</option></select> - <input type="number" class="phone" name="phone-middle"> - <input type="number" class="phone" name="phone-last">');
					};
				
				</script>
				<div class="input-box" id="business">
					<div class="input-header" id="business-header"><h4>사업자 회원</h4></div>
					<div id="business-input">
						<form>
							<table>
								<tr>
									<td>사업주</td>
									<td colspan="2"><input type="text" name="ownName" id="ownName"></td>
								</tr>
								<tr>
									<td>사업자 등록번호</td>
									<td><input type="number" name="ownNumber"></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
			<div id="div-btn-id"><button id="IdBtn" onclick="resultId();">아이디 찾기</button></div>
			<script>
				function resultId(){
					var name = $('#userName');
					var own = $('#ownName');
					var phone = $('.phone');
					
					console.log(name);
					console.log(phone);
					
					console.log("name.val : "  + name.val);
					console.log("name.focus : " + name.focus());
					
					if((name.val == 0 || name.length == 0)|| (own.val == 0 || own.length == 0)){
						alert('이름 또는 사업주를 입력해주세요');
						name.focus();
						$('#userName').focus();
					}
				}
			</script>
		</article>
	</section>
</body>
</html>