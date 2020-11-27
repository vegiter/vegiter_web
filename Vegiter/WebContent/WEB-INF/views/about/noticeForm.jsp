<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,board.model.vo.*" %>
<%
	ArrayList<Board> noticeList = (ArrayList<Board>)request.getAttribute("noticeList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.sub-nav-div{
		position: fixed;
		margin-top: 61px;
	}
	#sub-navi{
		display: inline-block;
	}
	.navi-title{
		width: 120px;
		height: 40px;
		border: 2px solid white;
		background: #41A693;
		text-align: center;
		color: white;
	}
	.navi-title:hover{
		background:rgb(45, 115, 102);
	}
	#li-about, #li-notice, #li-qn{
		border-bottom: none;
	}
	#li-qn, #li-about:hover{
		cursor:pointer;
	}
	#li-notice{
		background:rgb(45, 115, 102);
	}
	
	/* 내용 */
	body{
		background:rgb(246, 246, 246);
	}
	section{
		border: 1px solid rgb(246, 246, 246);
		min-height: 800px;
	}
	.notice-div{
		width: 700px;
		min-height: 100px; 
		background: white;
		margin: auto;
		margin-top: 100px;
		border-radius: 5px;
		box-shadow: 0px 2px 3px 3px lightgray;
		padding: 10px;
	}
	#notice-header{
		text-align: center;
		height: 50px;
		
	}
	#notice-table{
		width: 100%;
		height: 100%;
		border-top:2px solid #41A693;
	}
	#notice-table th{
		height: 30px;
		border-bottom: 1px solid #41A693;
	}
	#write{
		margin-left:90%;
		cursor:pointer;
		position: fixed;
	}
</style>
<body>

	<%@ include file="../common/gnb.jsp" %>
	<div class="sub-nav-div">
		<ul id="sub-navi">
			<li class="navi-title" id="li-about" onclick="location.href='<%=request.getContextPath()%>/aboutPage.me'">Vegiter소개</li>
			<li class="navi-title" id="li-notice">공지사항</li>
			<li class="navi-title" id="li-qn" onclick="location.href='<%=request.getContextPath()%>/faq'">문의사항</li>
		</ul>
	</div>
	<section>
		<div class="notice-div">
			<div id="notice-header">
				<h2>공지사항</h2>
			</div>
			<table id="notice-table">
				<tr>
					<th id="th-li-no">글번호</th>
					<th id="th-li-title">제목</th>
					<th id="th-li-count">조회수</th>
					<th id="th-li-date">작성일</th>
				</tr>
				<%if(noticeList.isEmpty()){ %>
					<tr><td colspan="4">공지사항이 없습니다.</td></tr>
				<%}else{ %>
					<%for(int i = 0; i <= noticeList.size(); i++){ %>
						<tr>
							<td><%= i+1 %></td>
							<td><%= noticeList.get(i).getBoard_title() %></td>
							<td><%= noticeList.get(i).getBoard_count() %></td>
							<td><%= noticeList.get(i).getBoard_date() %></td>
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
	</section>
			<!-- 글쓰기 버튼 -->
  	 <%if(loginUser != null && loginUser.getMemId().equals("admin")){ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="location.href='<%=request.getContextPath()%>/write.no'"></span>	
	<%} %>   
	<%@ include file="../common/footer.jsp" %>
</body>
</html>