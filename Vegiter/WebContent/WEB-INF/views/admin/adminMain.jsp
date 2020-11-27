<%@page import="oracle.jdbc.oracore.PickleContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, login.model.vo.*,shop.model.vo.*,java.lang.String, board.model.vo.*" %>
<%
	ArrayList<Member> memList = (ArrayList<Member>)request.getAttribute("memList");
	ArrayList<Owner> ownList = (ArrayList<Owner>)request.getAttribute("ownList");
	ArrayList<Shop> shopList = (ArrayList<Shop>)request.getAttribute("shopList");
	ArrayList<Member> idList = new ArrayList<Member>();
	
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int listCount = pi.getPostCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int endPage = pi.getEndPage();
	int startPage = pi.getStartPage();
%>
<%! 	
	public boolean isNumber(String str){
		  try {
		      Double.parseDouble(str);
		      return true;
		  } catch(NumberFormatException e) {
		      return false;
		  }
	}
%>
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
		width:200px;
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
		margin-top: 100px;
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

	.content{
		clear: both;
		margin-top: 10px;
		margin-left : 10%;
		margin-right: 10%;
		padding: 12px;
		background: white;
		border-radius: 3px;
		box-shadow: 3px 3px 3px 1px lightgray;
	}
	.title {
		font-size: 20px;
		font-weight: 400;
		margin: 15px;
		padding-bottom: 10px;
		border-bottom: 2px solid #41A693;
	}
	.mem-list-table{
		text-align: center;
		padding: 5px;
		width: 100%;
	}
	.tr-header th{
		background: lightgray;
		height: 20px;
	}
	.mem-list-table td{
		font-size: 13px;
		height: 20px;
		border-bottom: 1px solid lightgray; 
	}
	.pagingArea button{
		background: lightgray;
		border: 1px solid lightgray;
		border-radius: 3px;
	}
	.pagingArea button:hover{
		cursor:pointer;
		color: white;
	}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp" %>
		<section id="member-section">
		<div class="member-li-div">
			<div class="btn">
				<button class="top-btn" id="logout" onclick="location.href='<%= request.getContextPath() %>/logout.me'">로그아웃</button>
			</div>
			<div class="div-name">
				<h3>관리자 창</h3>
			</div>
			<div class="content">
				<div class="title">일반회원 </div>
				<table class="mem-list-table">
					<tr class="tr-header">
						<th><input type="checkbox" id="del-mem-all"></th>
						<th>아이디</th>
						<th>이름</th>
						<th>성별</th>
						<th>이메일</th>
						<th>전화번호</th>
						<th>푸드스타일</th>
						<th>상태</th>
					</tr>
					<%if(memList.isEmpty()){ %>
						<tr>
							<td colspan="8">회원이 없습니다.</td>
						</tr>
					<%}else{ %>
						
						<%for(int i= 0; i < memList.size(); i++){ %>
							<% Member m = memList.get(i); %>
							<%if(m.getMemCode() == 1){ %>
								<tr>
									<td><input type="checkbox" name="delete-mem" class="delete-mem"></td>
									<%if(isNumber(m.getMemId())){ %>
											<td>소셜로그인</td>
									<%}else{ %>
											<td><%=m.getMemId() %></td>
									<%} %>
										<td><%=m.getMemName() %></td>
										<td><%=m.getMemGender()%></td>
										<td><%=m.getMemEmail()%></td>
										<td><%=m.getMemPhone()%></td>
										<td><%=m.getMemStyle()%></td>
										<td><%=m.getMemStatus()%></td>
								</tr>
							<%} %>
						<%} %>
					<%} %>
				</table>
				<div class="pagingArea" align="center">
					<!-- 맨 처음으로 -->
					<button onclick="location.href='<%=request.getContextPath() %>/admin?currentPage=1'">&lt;&lt;</button>
					<!-- 이전 페이지 -->
					<button onclick="location.href='<%=request.getContextPath() %>/admin?currentPage=<%=currentPage - 1%>'" id="beforeBtn">&lt;</button>
					<script>
						// 1페이지 시 비활성화
						if(<%= currentPage %> <= 1){
							var before = $('#beforeBtn');
							before.attr('disabled',true);
						}
					</script>
					<!-- 숫자 목록 버튼 -->
					<%for(int p = startPage; p <= endPage; p++){ %>
						<!-- 현재 페이지 버튼 다르게 -->
						<% if(p == currentPage){ %>
							<button class="choosen" disabled><%=p %></button>
						<%}else{ %>
							<button class="numBtn" onclick="location.href='<%=request.getContextPath() %>/admin?currentPage=<%=p %>'">
								<%=p %>
							</button>
						<%} %>
					<%} %>
					<!-- 다음 페이지로 -->
					<button onclick="location.href='<%=request.getContextPath() %>/admin?currentPage=<%=currentPage + 1 %>'" id="afterBtn">&gt;</button>
					<script>
						if(<%=currentPage%> >= <%=maxPage%>){
							var after = $('#afterBtn');
							after.attr('disabled', true);
						}
					</script>
					
					<button onclick="location.href='<%=request.getContextPath() %>/admin?currentPage=<%=maxPage %>'">&gt;&gt;</button>
				</div>
			</div>
		</div>
		<div class="member-li-div">
			<div class="content">
					<div class="title">사업자 회원 </div>
					<table class="mem-list-table">
						<tr class="tr-header">
							<th><input type="checkbox" id="del-own-all"></th>
							<th>아이디</th>
							<th>이름</th>
							<th>사업자번호</th>
							<th>가게명</th>
							<th>가게 주소</th>
							<th>홈페이지</th>
							<th>상태</th>
						</tr>
						<%if(ownList.isEmpty()){ %>
							<tr>
								<td colspan="7">사업자 회원이 없습니다.</td>
							</tr>
						<%}else{%>
							<%for(int i = 0; i < ownList.size(); i++){ %>
								<% Owner own = ownList.get(i); %>
								<% Shop shop = shopList.get(i); %>
								<%if(own.getOwnNo().equals(shop.getOwnNo())){ %>
									<tr>
										<td><input type="checkbox" name="delete-own" class="delete-own"></td>
										<td><%=own.getMemId()%></td>
										<td><%=own.getOwnName()%></td>
										<td><%=own.getOwnNo()%></td>
										<td><%=shop.getShopName() %></td>
										<td><%=shop.getShopAddress() %></td>
										<td><%=shop.getShopPage() %></td>
<%-- 										<td><%=idList.get(i).getMemStatus() %></td><!--  --> --%>
									</tr>
								<%} %>
							<%} %>
						<%} %>
					</table>
					</div>
					<script>
						var memlist = $('.delete-mem');
						var ownlist = $('.delete-own');
					
					
						$('#del-mem-all').click(function(){
							var isChecked = $(this).is(':checked');
							if(isChecked){
								memlist.prop('checked',true);
							}else{
								memlist.prop('checked',false);
							}
						});
						
						$(".delete-mem").click(function(){
							var count = 0;
							for(var i = 0; i < memlist.length; i++){
								if(memlist[i].checked){
									count++;
								}
							}
							if(count != memlist.length){
								$('#del-mem-all').prop('checked',false);
							}else{
								$('#del-mem-all').prop('checked',true);
							}
							
						});
						
						$('#del-own-all').click(function(){
							var isChecked = $(this).is(':checked');
							if(isChecked){
								ownlist.prop('checked',true);
							}else{
								ownlist.prop('checked',false);
							}
						});
						
						$(".delete-own").click(function(){
							var count = 0;
							for(var i = 0; i < ownlist.length; i++){
								if(ownlist[i].checked){
									count++;
								}
							}
							if(count != ownlist.length){
								$('#del-own-all').prop('checked',false);
							}else{
								$('#del-own-all').prop('checked',true);
							}
						});
					</script>
		</div>
	</section>
</body>
</html>