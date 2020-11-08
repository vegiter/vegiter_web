<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인하기</title>
<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-3.5.1.min.js"></script>
<style>
	#btn-div{
		margin:0;
		padding: 0;
		height: 25px;
	}
	.check {
		margin: 0;
		padding: 0px;
		height: 20px;
		width: 60px;
		background:rgb(45, 115, 102);
		color: white;
		border-radius: 3px;
	}
	.check:hover{
		background: #21403A;
		cursor: pointer;
	}
	#myPage{
		margin-left: 30px;
	}
	#cancel{
		margin-top: 4px;
	}
	.pwd{
		width: 190px;
	}
	#pwdCheckForm{
		width: 200px;
		min-height: 100px;
		margin: auto;
		margin-top: 10px;
		padding: 10px;
		border: 2px solid black;
		border-radius: 5px;
		box-shadow: 3px 3px 3px 1px lightgray; 
	}
	.header-div{
		margin-top: 10px;
		margin-bottom: 10px;
		
	}
	#error{
		margin-top: 5px;
		margin-bottom: 5px;
		height: 20px;
		font-size: 12px;
	}
</style>
</head>
<body>
	<form id="pwdCheckForm" onsubmit="return checkPwd();" action="<%=request.getContextPath()%>/myPage.me">
		<div class="header-div" id="header-div">비밀번호를 확인해주세요</div>
		<input class="pwd" id="userPwd" type="password" name="userPwd" placeholder="PASS WORD">
		<div id="error" class="error"></div>
		<div id="btn-div">
			<button class="check" id="myPage" >CHECK</button>
			<button class="check" id="cancel" onclick="window.close();">CAHCEL</button>
		</div>
	</form>
	<script>
		var check = false;
		$('#myPage').click(function(){
			console.log('click');
			var inputPwd = $('#userPwd').val();
			if(inputPwd == '' || inputPwd.length < 1){
				console.log('asdfa');
				$('#error').text('비밀번호를 입력해주세요').css('color','red');
				check = false;
			}else{
				check = true;
			}
		});
		function checkPwd(){
			if(check){
				return true;
			}else{
				return false;
			}
			
		}
	</script>
</body>
</html>