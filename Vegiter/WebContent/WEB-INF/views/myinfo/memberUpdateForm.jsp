<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>	
/*  	*{border: 2px solid green;}   */
	body{
		background: rgb(246, 246, 246);
	}
	.name{
		font-size: 30px;
		font-weight: bold;
		margin-top: 80px;
	}
	.name h3{
		width: 500px;
		height: 50px;
		margin: auto;
		text-align: center;
		background: darkgray;
		color: white;
		border-radius: 5px;
		box-shadow: 2px 2px 3px 2px lightgray;
	}
	.outer{
		margin-top: 10px;
	}
	#updateForm{
	}
	.table{
    	margin: auto;
    	border-radius: 5px;
    	background: white;
    	box-shadow: 2px 2px 3px 2px lightgray;
    	padding: 10px;
    	width: 500px;
	}
	.table td{
		height: 40px;
	}
	.input-header{
		width: 150px;
		text-align: center;
	}
	input, select{
		border: 1px solid gray;
		height: 25px;
		margin-left: 20px;
	}
	#userId-td{
		padding-left: 20px;
	}
	#myForm td {text-align: center;}
	#myForm>table{margin: auto;}
	#updateBtn {background: black; color: white;}
	#updatePwdBtn {background: black; color: white;}
	#deleteBtn {background: right gray color: white;}
	#goMain {background: #2D7366; color: white;}
</style>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
<%
	char gender = loginUser.getMemGender();
	String gen[] = new String[3];
	switch(gender){
	case 'N' : gen[0] = "selected"; break;
	case 'F' : gen[1] = "selected"; break;
	case 'M' : gen[2] = "selected"; break;
	}
	
	String style = loginUser.getMemStyle();
	String styleArr[] = new String[7];
	switch(style){
	case "플렉": styleArr[0] = "selected"; break;
	case "락토": styleArr[1] = "selected"; break;
	case "오보": styleArr[2] = "selected"; break;
	case "락토오보": styleArr[3] = "selected"; break;
	case "페스코": styleArr[4] = "selected"; break;
	case "폴로": styleArr[5] = "selected"; break;
	case "비건": styleArr[6] = "selected"; break;
	}
%>
	<div class="name">
		<h3>My Page</h3>
	</div>		
	<div class="outer">
		<form action="<%= request.getContextPath() %>/update.me" method="post" id="updateForm" name="updateForm">
			<table class="table">
				<tr>
					<td class="input-header">아이디</td>
					 <td width="center" id="userId-td">
					 	<%= loginUser.getMemId() %>
					 </td>
				</tr>
				<tr>
					<td class="input-header">이름</td>
					<td><input type="text" name="myName" required value="<%= loginUser.getMemName() %>"></td>
				</tr>
				<tr>
					<td class="input-header">연락처</td>
					<td>
						<input type="tel" maxlength="11" name="myPhone" placeholder="(-없이)01012345678" 
						value="<%= loginUser.getMemPhone() == null ? "" : loginUser.getMemPhone() %>">
					</td>
				</tr>
				<tr>
					<td class="input-header">이메일</td>
					<td><input type="email" name="myEmail" placeholder="joker@naver.com" required
					value="<%= loginUser.getMemEmail() == null ? "" : loginUser.getMemEmail() %>">
					</td>
				</tr>
				<tr>
					<td class="input-header">성별</td>
					<td>
						<select name="gender">
							<option value="N">--</option>
							<option value="F" <%= gen[1]%>>여자</option>
							<option value="M" <%= gen[2]%>>남자</option>
							<option value="N" <%= gen[0]%>>선택안함</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="input-header">푸드 스타일</td>
					<td>
						<select name="style">
							<option selected value=null>-------------</option>
							<option value="플렉시터리언" <%= styleArr[0] %>>플렉시터리언</option>
							<option value="락토" <%= styleArr[1] %>>락토</option>
							<option value="오보" <%= styleArr[2] %>>오보</option>
							<option value="락토오보" <%= styleArr[3] %>>락토오보</option>
							<option value="페스코" <%= styleArr[4] %>>페스코</option>
							<option value="폴로" <%= styleArr[5] %>>폴로</option>
							<option value="비건" <%= styleArr[6] %>>비건</option>
						</select>
					</td>
				</tr>
			</table>
			<!-- 성별/ 푸드스타일 -->
			<br>
							
			<div class="btns" align="center">
				<input id="updateBtn" type="submit" value="수정하기">
				<input type="button" id="cancelBtn" onclick="location.href='javascript:history.go(-1)'" value="취소하기">
			</div>
			
		</form>
	</div>
<%@ include file="../common/footer.jsp" %>
</body>
</html>