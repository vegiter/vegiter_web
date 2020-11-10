<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>	
	/* *{border: 2px solid green;} */
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
	#updateForm{
	width: 500px;
	margin-left: 150px;
	}
	.table{
/*   		border: 1px solid #ccc; */
    	padding: 0 5px;
    	margin-bottom: 0px; 
    	width: 350px;
		height: 70px;
    	margin: auto;
    	
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
		
		<form action="<%= request.getContextPath() %>/update.me" method="post" id="updateForm" name="updateForm">
			<table class="table">
				<tr>
					<td width="center">아이디</td>
					 <td width="center">
					 <%= loginUser.getMemId() %>
					<%--  <input type="text" maxlength="13" name="myId" required vlaue= "<%= loginUser.getMemId() %>"> --%>
					 </td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="myName" required vlaue="<%= loginUser.getMemName() %>"></td>
				</tr>
				<tr>
					<td>연락처</td>
					<td>
						<input type="tel" maxlength="11" name="myPhone" placeholder="(-없이)01012345678" 
						vlaue="<%= loginUser.getMemPhone() == null ? "" : loginUser.getMemPhone() %>">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="myEmail" placeholder="joker@naver.com" required
					vlaue="<%= loginUser.getMemEmail() == null ? "" : loginUser.getMemEmail() %>">
					</td>
				</tr>
			</table>
			
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