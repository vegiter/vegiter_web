<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#zeroArea {
		display: block;
		height: 70px;
	}
	.name{
		text-align: center;
		font-size: 4.5rem;
		font-weight: bold;
		}
	.outer{
		width: 48%; height: 450px; background-color: rgba(255, 255, 255, 0.4); border: 5px solid white;
		margin-left: auto; margin-right: auto; margin-top: 5%;
	}
	.table{
  		border: 1px solid #ccc;
    	padding: 0 5px;
    	margin-bottom: 0px;
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
	<div id="zeroArea"></div>
	<div class="name">
		My Page
	</div>		
	<div class="outer">
		
		<form action="<%= request.getContextPath() %>/UpdateForm.me" method="post" id="myForm" name="myForm">
			<table>
				<tr>
					<td width="center">아이디</td>
					 <td width="200px">
					 <%-- <input type="text" maxlength="13" name="myId" vlaue= "<%= loginUser.getMemId() %>"> --%>
					 <%= loginUser.getMemId() %>
					 </td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
					<!-- <input type="text" name="myName" required> -->
					<%= loginUser.getMemName() %>
					</td>
				</tr>
				<tr>
					<td>멤버코드</td>
					<td>
				<!-- 	<input type="text" maxlength="15" name="myCode"> -->
					<%= loginUser.getMemCode() %>
					</td>
				</tr>
				<tr>
					<td>연락처</td>
					<td>
						<!-- <input type="tel" maxlength="11" name="myPhone" placeholder="(-없이)01012345678"> -->
						<%= loginUser.getMemPhone() == null ? "-" : loginUser.getMemPhone() %>
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
<!-- 					<input type="email" name="myEmail" placeholder="joker@naver.com" required> -->
						<%= loginUser.getMemEmail() == null ? "-" : loginUser.getMemEmail() %>
					</td>
				</tr>
			</table>
			
			<br>
			
			<div class="myPageBtns" align="center">
				<input id="updateBtn" type="submit" value="수정하기">
				<input id="updatePwdBtn" type="button" value="비밀번호 변경 하기" onclick="location.href='updatePwdForm.me'">
				<input id="deleteBtn" type="button" value="탈퇴하기" onclick="deleteMember();">
				<input type="button" id="goMain" onclick="location.href='<%= request.getContextPath() %>'" value="메인으로" >
			</div> 
		</form>
	</div>
<%@ include file="../common/footer.jsp" %>
</body>
</html>