<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegiter회원관리</title>
<style>
	body{
		background: rgb(246, 246, 246);
		margin-bottom: -100px;
	}
	#member-section{
		margin-top: 50px;
		background: rgb(246, 246, 246);
	}
	.btn{
		margin-top: 20px;
		width:480px;
		margin-left: 1300px; 
		margin-bottom: 10px;
		float: right;
	}
	.top-btn{
		display:inline;
		background: rgb(45, 115, 102);
		width: 100px;
		height: 25px;
		color: white;
		font-size: 12px;
		box-shadow: 0px 1px 1px 1px #21403A;
		border-radius: 16px;
	}
	.top-btn:hover{
		background: #21403A;
		cursor: pointer;
	}
	.div-name {
		clear: both;
		height: 60px;
		margin-left: 10%;
		margin-right: 10%;
		color: white;
		background: rgb(45, 115, 102);
		border-radius: 3px;
	}
	.div-name h3{
		display: inline-block;
		margin-top: 15px;
		margin-left: 15px;
		font-weight: normal;
	}
	#profile-revise{
		diplay: inline-block;
		margin-top: 19px;
		margin-right: 15px;
		font-size: 13px;
		color: lightgray;
		float: right;
	}
	#profile-revise:hover{
		font-weight:bolder;
		cursor: pointer;
	}
	.content{
		clear: both;
		margin-top: 10px;
		margin-left : 10%;
		margin-right: 10%;
		padding: 10px;
		background: white;
		border-radius: 3px;
		box-shadow: 3px 3px 3px 1px lightgray;
	}
	.title {
		font-size: 20px;
		font-weight: 400;
		margin: 15px;
		padding-bottom: 10px;
		border-bottom: 1px solid lightgray;
	}
	#profile{
		margin: 10px;
	}
	#profile tr td,#bookmark tr td, #shopList tr td{
		width: 100px;
		height: 40px;
		padding-left: 10px;
	}
	.profile-header{
		border-right: 1px solid lightgray;
	}
	#boardCode-span, #write-boardCode-span{
		font-weight: bolder;
		color: rgb(45, 115, 102);
		margin-right: 5px;
	}
	#list{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
	#fList-td img, #wList-td img{
		width: 80px; 
		height: 80px;
		background: darkgray;
	}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp" %>
		<section id="member-section">
		<div class="member-li-div">
			<div class="div-name">
				<h3>MemberList</h3>
				<span id="profile-revise">프로필 수정하기 &gt;</span>
			</div>
			<div class="content">
				<div class="title">회원 프로필</div>
				<div class="subtitle">
					<table id="profile">
						<tr>
							<td class="profile-header">이름</td>
							<td class="profile-content"><%= loginUser.getMemName() %></td>
						</tr>
						<tr>
							<td class="profile-header">이메일</td>
							<td class="profile-content"><%= loginUser.getMemEmail()%></td>
						</tr>
						<tr>
							<td class="profile-header">성별</td>
							<td class="profile-content">
								<%if(loginUser.getMemGender() == 'N'){ %> 
									--
								<%}else if(loginUser.getMemGender() == 'F'){ %>
									여자 
								<%}else{ %> 
									남자
								<%} %>
							</td>
						</tr>
						<tr>
							<td class="profile-header">휴대폰번호</td>
							<td class="profile-content"><%= loginUser.getMemPhone()%></td>
						</tr>
						<tr>
							<td class="profile-header">푸드스타일</td>
							<td class="profile-content">
								<% if(loginUser.getMemStyle() == null){ %> 
									-- 
								<% }else{%>
									<%= loginUser.getMemStyle() %> 
								<%} %>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</section>>
</body>
</html>