<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.outer {
		width: 600px; height: 500px; background-color: rgba(255, 255, 255, 0.4); border: 5px solid white; 
		color: black; margin-left: auto; margin-right: auto; margin-top: 100px;}
	.contxt {
    	line-height: 19px;
    	margin-top: 10px;
   		letter-spacing: -1px;
    	color: #666;
    	margin-left: 130px;}
	#updatePwdForm td{text-align: right; height: 50px;}
	
	#updatePwdBtn{	background-color: #21403A;
					width: 180px;
					height: 50px;
					color: white;
					font-weight: bold;
					font-size: 1.25rem;
					border-radius: 16px; }
					
	#cancelBtn{		background-color: #21403A;
					width: 180px;
					height: 50px;
					color: white;
					font-weight: bold;
					font-size: 1.25rem;
					border-radius: 16px; }
					
	#updatePwdForm>table{margin: auto;}
</style>
<!-- 비밀번호가 같은지 다른지 확인하는 유효성검사도 넣기 -->
<title>Insert title here</title>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
	
	<div class="outer">
		<br>
		<h2 align="center">비밀번호 수정하기</h2>
		
		<form action="<%= request.getContextPath() %>/updatePwd.me" method="post" id="updatePwdForm" name="updatePwdForm" onsubmit="return send();">
		<table>
				<tr>
					<td><input class="password" type="password" name="userPwd1" id="userPwd1" placeholder="현재 비밀번호" 
					style="width:335px; height:40px"></td>
				</tr>
				<tr>

					<td><input class="newPwd" type="password" name="newPwd" id="newPwd" placeholder="새 비밀번호"
					style="width:335px; height:40px"></td>
				</tr>
				<tr>
					<td><input class="newPwd2" type="password" name="newPwd2" id="newPwd2" placeholder="새 비밀번호 확인"
					style="width:335px; height:40px"></td>
				</tr>
				<tr>
					<td><div id="error" class="error"></div></td>
				</tr>
		</table>
			
			<br><br>
			
			<div class="btns" align="center">
				<input id="updatePwdBtn" type="submit" value="변경하기">
				<input type="button" id="cancelBtn" onclick="location.href='javascript:history.back();'" value="취소하기">
			</div>
		</form>
	</div>
	
	<script>
		
		$(function(){
			$('input').focusin(function(){
				$(this).css({'border':'2px soild green', 'box-shadow': '0x 0px 5px green'});
			}).focusout(function(){
				$(this).css({'border':'2px solid lightgray','box-shadow':'none'});
			});
		});
		var checkPwd = false;
		
		var regExp1 = /\d/; //숫자
		var regExp2 = /\S/; //띄어쓰기 제외
		var regExp3 = /[a-z]|[A-Z]/; //영어 사용/ 대소문자 구분
		var regExp4 = /~!@#$%^&*()_+|\-,.=`/; //특수 문자 사용 여부
		
		$('#newPwd2')
		function send(){
			var newPwd = $("input[name='newPwd']");
			var newPwd2 = $("input[name='newPwd2']");
			
			if(newPwd.val().trim() != newPwd2.val().trim()){
				alert('비밀번호가 다릅니다.');
				newPwd2.val('');
				newPwd2.focus();
				
				return false;
			} else if(newPwd.val().trim() == '' || newPwd2.val().trim() == ''){
				alert('비밀번호를 입력해주세요');
				return false;
			}else if(checkPwd){
				$('#error').text('비밀번호는 6자리 이상 영문, 특수문자, 숫자 1개 이상입력해야 합니다.');
			}
			  return true;
		}
	</script>
<%@ include file="../common/footer.jsp" %>
</body>
</html>