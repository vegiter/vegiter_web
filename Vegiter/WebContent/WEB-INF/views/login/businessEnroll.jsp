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
		border: 5px solid lightgray;
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
			<div class="member-header" id="common"><h4><a href="enroll.html">일반회원</a></h4></div>
			<div class="member-header" id="business"><h4>사업자 회원</h4></div>
		</div>
		
		<article>
			<div id="input-boxes">
				<form>
					<p><b>*</b>은 필수 입력칸입니다.</p>
					<h4>아이디(6~16자리 영문소문자, 숫자만 사용가능)<b>*</b></h4>
					<div class="input-info"><input type="text" name="userId" id="userId"></div>
					<div class="error"></div>
					<h4>비밀번호(6~16자리 영문소문자, 숫자, 특수문가 사용가능)<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd" id="password"></div>
					<div class="error"></div>
					<h4>비밀번호 확인<b>*</b></h4>
					<div class="input-info"><input type="password" name="userPwd2" id="password2"></div>
					<div class="error"></div>
					<h4>사업주<b>*</b></h4>
					<div class="input-info"><input type="text" name="userName" id="userName"></div>
					<div class="error"></div>
					<h4>사업자 번호<b>*</b></h4>
					<div class="input-info"><input type="number" name="ownNumber" id="ownNumber"></div>
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
							<input type="file" onchange="loadImg(event);" name="image" accept="image/jpg, image/jpeg, image/png">
							<div id="topImg"><img src="../images/diagonal.PNG" id="diagonal1"></div>
						</div>
						<div><h4>메뉴이미지</h4>
							<input type="file" onchange="loadImg2(event);" name="image" accept="image/jpg, image/jpeg, image/png" multiple>
							<div id="menuImg"><img src="../images/diagonal.PNG" id="diagonal2"></div>
						</div>
					</div>
				</form>
			</div>
			<div id="div-btn-enroll"><button id="enrollBtn" onclick="enroll();">회원가입</button></div>
			<script>
				$(function(){
					
				});
				
				// 이미지 미리보기
				function loadImg(event){
					var reader = new FileReader();
					
					reader.onload = function(e){
						var img = document.createElement('img');
						document.getElementById("diagonal1").remove();
						img.setAttribute("src", e.target.result);
						img.width="150";
						img.height="100";
						document.querySelector("div#topImg").appendChild(img);
					};
					reader.readAsDataURL(event.target.files[0]);
				}
				function loadImg2(event) { 
					document.getElementById("diagonal2").remove();
					
					for (var image of event.target.files) { 
						var reader = new FileReader(); 
						reader.onload = function(event) { 
							var img = document.createElement("img");
							img.setAttribute("src", event.target.result);
							img.width="150";
							img.height="120";
							document.querySelector("div#menuImg").appendChild(img); 
							}; 
						console.log(image); 
						reader.readAsDataURL(image); 
					} 
				}

				function enroll(){
					
				}
			</script>
		</article>
	</section>
</body>
</html>