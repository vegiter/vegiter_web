<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인하기</title>
<style>
	#btn-div{
		margin:0;
		padding: 0;
		height: 20px;
	}
	.check {
		margin: 0;
		padding: 0px;
		height: 20px;
		width: 60px;
	}
	#cancel{
		margin-top: 4px;
	}
	
	#pwdCheckForm{
		width: 200px;
		height: 100px;
		margin: auto;
	}
</style>
</head>
<body>
	<form action="<%=request.getContextPath()%>/myPage.me" id="pwdCheckForm">
		<input class="pwd" type="password" name="userPwd" placeholder="PASS WORD">
		<div id="btn-div">
			<button class="check" id="myPage" >CHECK</button>
			<button class="check" id="cancel" onclick="window.close();">CAHCEL</button>
		</div>
	</form>
	<script>
		
	</script>
</body>
</html>