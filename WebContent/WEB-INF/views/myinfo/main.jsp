<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="login.model.vo.Member" %>
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
	.div-name {
		text-align: center;
		width: 500px;
		height: 50px;
		margin: auto;
	}
	.content{
		background: rgb(242, 242, 242);
	
	}
	.title {
		text-align: center;
		font-size: 2.0rem;
		font-weight: 400;
	}
	.subtitle{
		text-align: center;
		font-size: 0.8rem;
		font-weight: 300;
	}
	
	.price {
		text-align: center;
		margin-top: 50px;	
		font-size: 16px;
   		height: 100%;
    	outline: none;
    	padding-inline-end: 40px;
    	padding-inline-start: 52px;
	}
	.check {
		color: #007bff;
		inquiryBtn: transparent;
		background-imge: none;
		border-color: #007bff;
	}
	.inquiryBtn{
		margin-top: 80px;
		color: #21303A;
	}
	.logout{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
	.list{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
	.book{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
</style>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>

	<div id="zeroArea"></div>
	
		<div class="main">
			<div class="div-name">
				My Page
			</div>
			<div class="content">		
				<div class="title">
					회원 정보 수정
				</div>
				<br><br><br>
				<div class="subtitle">
					<label><%= loginUser.getMemName() %>님의 회원정보를 안전하게 보호하기 위해<br><br>
					비밀번호를 한번 더 확인해 주세요.</label>
				</div>	
			</div>
		</div>
		
		<div class="price" align="center">
				<input class="pwd" type="password" name="userPwd" placeholder="PASS WORD">
				<button class="check" id="myPage" onclick="location.href='<%= request.getContextPath() %>/myPage.me'">CHECK</button>
		</div>
		
		<div class="inquiryBtn" align="center">
			<button class="logout" onclick="location.href='<%= request.getContextPath() %>/logout.me'">로그아웃</button>
			<button class="book">레시피 북마크</button>
		</div>
	<script>
		function logout(){
			location.href='<%= request.getContextPath() %>/logout.me';
		}
	</script>
<%@ include file="../common/footer.jsp" %>
</body>
</html>