<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="login.model.vo.Member,java.util.ArrayList,myPage.model.vo.Bookmark, board.model.vo.*, shop.model.vo.*" %>
<%
	ArrayList<Board> bList = (ArrayList<Board>)request.getAttribute("bList");
	ArrayList<Attachment> fList = (ArrayList<Attachment>)request.getAttribute("fList");
	ArrayList<Board> writeList = (ArrayList<Board>)request.getAttribute("writeList");
	ArrayList<Attachment> writefList = (ArrayList<Attachment>)request.getAttribute("writefList");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegiter MyPage</title>
<style>
	body{
		background: rgb(246, 246, 246);
		margin-bottom: -100px;
	}
	#profile-all{
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
	#bookmark .profile-content,  #writeBoard .profile-content{
		width: 500px;
	}
	#bookmark .profile-header, #writeBoard .profile-header{
		border-right: none;
	}
/* 	*{border: 1px solid green;} */
</style>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
<br>
<br>
<br>
	<section id="profile-all">
		<div class="main">
			<div class="btn">
				<button class="top-btn" id="logout" onclick="location.href='<%= request.getContextPath() %>/logout.me'">로그아웃</button>
				<%if(loginUser.getMemPwd() != null){ %>
				<button class="top-btn" id="updatePwdBtn" onclick="location.href='<%= request.getContextPath() %>/updatePwdForm.me'">비밀번호 변경</button>
				<%} %>
				<input class="top-btn" id="deleteBtn" type="button" value="회원탈퇴" onclick="deleteMember();">
			</div>
			<div class="div-name">
				<h3>My Page</h3>
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
			
			
			<%if(loginUser.getMemCode() == 2){ %>
			<%	ArrayList<Shop> shopList = (ArrayList<Shop>)request.getAttribute("shopList"); %>
				<div class="content">
				<div class="title">가게정보</div>
				<div class="subtitle">
					<table id="shopList">
					<%if(shopList != null){ %>
						<%for(int i = 0; i < shopList.size(); i++){ %>
								<tr class="thumnail-tr">
									<td class="profile-header">
										업체명
									</td>
									<td class="profile-content">
										<%= shopList.get(i).getShopName() %>
									</td>
								</tr>
								<tr class="thumnail-tr">
									<td class="profile-header">
										주소
									</td>
									<td class="profile-content">
										<%= shopList.get(i).getShopAddress() %>
										<%if(shopList.get(i).getShopCoord() != null){ %>
										<%= shopList.get(i).getShopCoord() %>
										<%} %>
									</td>
								</tr>
								<tr class="thumnail-tr">
									<td class="profile-header">
										홈페이지
									</td>
									<td class="profile-content">
									<%if(shopList.get(i).getShopPage() == null){ %>
										--
									<%}else{ %>
										<%= shopList.get(i).getShopPage() %>
									<%} %>
									</td>
								</tr>
								<%} %>
							<%} %>
						<%} %>
					</table>
				</div> 
			</div>
			
			
			<div class="content">
				<div class="title">북마크</div>
				<div class="subtitle">
					<table id="bookmark">
					<%if(bList.isEmpty()){ %>
						<tr>북마크가 없습니다.</tr>
					<%}else{ %>
						<%for(int i = 0; i < bList.size(); i++){ %>
							<% int code = bList.get(i).getBoard_code(); %>
							<% String codeName = ""; %>
								<tr class="thumnail-tr">
									<td class="profile-header" id="fList-td">
									<%if(fList.get(i) != null){ %>
										<img src="<%=request.getContextPath()%>/thumnail_uploadFiles/<%= fList.get(i).getAtcName()%>">
										<input type="hidden" name="bNo" id="no<%=i %>" value="<%=bList.get(i).getBoard_no()%>">
									<%} %>
									</td>
									<td class="profile-content">
										<%
										switch(code){
										case 0: codeName = "레시피"; break;
										case 1: codeName = "도란도란"; break;
										case 2: codeName = "식단"; break;
										case 3: codeName = "공지사항"; break;
										} 
										%>
										<span id="boardCode-span"><%= codeName %></span>
										<%= bList.get(i).getBoard_title() %>
									</td>
									<td><%= bList.get(i).getBoard_date() %></td>
									<td><%= bList.get(i).getMem_id() %></td>
								</tr>
							<%} %>
						<%} %>
					</table>
				</div> 
			</div>
		</div>
	<script>
		function logout(){
			location.href='<%= request.getContextPath() %>/logout.me';
		}
		$('#profile-revise').click(function(){

			window.location.href='<%= request.getContextPath() %>/UpdateForm.me';	
		});
		function deleteMember(){
			var bool = confirm("정말 탈퇴하시겠습니까?");
			
			if(bool){
				location.href='delete.me';
			}
		}
		/* 상세조회 */
		$(function(){
			$('#bookmark td').mouseover(function(){
				$(this).parent().css({'font-weight':'bolder','cursor':'pointer'})
			}).mouseout(function(){
				$(this).parent().css('font-weight','normal');
			}).click(function(){
				var num = $(this).parent().find('input').val();
				location.href = '<%=request.getContextPath()%>/detail.recipe?bId='+num;
			});
		})
		
	</script>
	<div class="content">
				<div class="title">게시글 확인하기</div>
				<div class="subtitle">
					<table id="writeBoard">
					<%if(writeList.isEmpty()){ %>
						<tr class="none-list">게시한 목록이 없습니다.</tr>
					<%}else{ %>
						<%for(int i = 0; i < writeList.size(); i++){ %>
							<% int code = writeList.get(i).getBoard_code(); %>
							<% String codeName = ""; %>
								<tr class="thumnail-tr">
									<td class="profile-header" id="wList-td">
									<%if(writefList.get(i) != null ){ %>
									
										<%if(writeList.get(i).getBoard_no() == writefList.get(i+1).getBoardNo()) {%>
										<!-- -1이 있음! -->
										<img src="<%=request.getContextPath()%>/thumnail_uploadFiles/<%= writefList.get(i+1).getAtcName()%>">
										<%} %>
										<input type="hidden" name="bNo" id="no<%=i %>" value="<%=writeList.get(i).getBoard_no()%>">
									<%} %>
									</td>
									<td class="profile-content">
										<%
										switch(code){
										case 0: codeName = "레시피"; break;
										case 1: codeName = "도란도란"; break;
										case 2: codeName = "식단"; break;
										case 3: codeName = "공지사항"; break;
										} 
										%>
										<span id="write-boardCode-span"><%= codeName %></span>
										<%= writeList.get(i).getBoard_title() %>
									</td>
									<td><%= writeList.get(i).getBoard_date() %></td>
								</tr>
							<%} %>
						<%} %>
					</table>
				</div> 
			</div>
			<script>
				$(function(){
					$('#writeBoard td').mouseover(function(){
						$(this).parent().css({'font-weight':'bolder','cursor':'pointer'})
						
					}).mouseout(function(){
						$(this).parent().css('font-weight','normal');
					}).click(function(){
						var num = $(this).parent().find('input').val();
						location.href = "<%=request.getContextPath()%>/detail.recipe?bId="+num;
					});
				});
			</script>

	</section>
	<%@ include file="../common/footer.jsp" %>
	
	
</body>
</html>