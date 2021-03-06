<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, board.model.vo.*" %>
<%
	ArrayList<Board> pList = (ArrayList<Board>)request.getAttribute("pList");
	ArrayList<Attachment> aList = (ArrayList<Attachment>)request.getAttribute("aList");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int postCount = pi.getPostCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int opt = (int)request.getAttribute("opt");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegitalk</title>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<style>
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}
	body{line-height: 1; font-family: 'Open Sans', sans-serif;}
	ol, ul{list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after,
	q:before, q:after {content: ''; content: none;}
	table{border-collapse: collapse; border-spacing: 0;}
	button{outline: none; background-color: white;border-style: none;}
	textarea{outline: none; padding: 1rem;border-style: none;}
	input:focus{outline: none;}
	.wrapper{width: 80%; min-width: 600px; max-width: 1300px; min-height: 700px; margin: auto; margin-top: 150px; margin-bottom: 40px; overflow: hidden;}
	#noBoard{margin: 160px auto;}
	.option{padding: 10px; display: flex; justify-content: space-between; margin: 10px 0; align-items: center;}
	.opt-type{width: 270px;}
	.option span{margin-right: 10px; color: #ACB5BD; cursor:pointer;font-size: 14px;}
	.option span:hover{color: #41A693; font-weight: bold;}
	.opt-type.filter{margin-bottom: 8px;line-height: 2rem;}
	.opt-search{border-bottom: 1px solid #ACB5BD; padding: 5px 5px 5px 0;}
	.opt-search input{border-style: none; padding-left: 8px; width: 170px; color: #485056; font-size: 16px;}
	button, button i{text-align:center; width: 30px; height: 20px; outline: none; color: #ACB5BD;}
	button, button i:hover{cursor:pointer; color: #41A693;}

	.board {margin-top: 50px; display: flex; flex-wrap: wrap; justify-content: space-around;}
	.board li {padding: 10px;}
	.board li:hover{opacity: 50px;}

	.board-list-img{width: 300px; height: 280px; text-align: center; background-color: #485056; overflow: hidden;}
	.board-list-img img{width: 100%; height: 100%;}

	.board-list-item{background-color: #DEE2E5; height: 130px; text-align: left;}
	.board-list-item h1{font-size: 20px; padding: 10px; font-weight: bold; color: #21403A;}
	.board-list-item>p{padding: 0 15px; text-overflow: ellipsis; height: 50px; width: 260px; color: #485056; line-height: 1.5rem;}
	.board-list-item-con{text-overflow: ellipsis; overflow: hidden;}
	.board-list-item-social{text-align: right; color: #485056; padding: 10px 15px;}
	.board-list-item-social span{margin-left: 5px;}
	.board-list-item-social>i{color: #485056;}

	.paging{padding: 10px; text-align: center; margin: 20px 0;}
	.paging span{display: inline-block; background-color: #DEE2E5; padding: 1rem; margin: 2px; color: #485056;}
	.paging span:hover{cursor: pointer; background-color: #41A693; color: #fff;}
	
	.writeBtn{position: fixed; bottom: 50px; right: 10%;color: #fff; cursor: pointer; border-radius: 50%; background-color: #41A693; width: 50px; height: 50px; display: flex; align-items: center; justify-content: center;}
	.writeBtn i{color: #fff;}
	.writeBtn.on{position: absolute;bottom: 125px;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
<body>

	<%@ include file="../common/gnb.jsp" %>
	
	<div class="wrapper">
		<% if(pList == null) { %>
			<p id="noBoard">등록된 게시글이 없습니다.</p>
		<% } else {  %>
		<div class="option">
			<div class="opt-type">
				<span class="opt-type filter" value="0">#All</span>
				<span class="opt-type filter" value="3">#도란도란</span>
				<span class="opt-type filter" value="2">#식단공유</span>
				<span class="opt-type filter" value="1">#공지/이벤트</span>
			</div>
			<!-- <div class="opt-search">
				<input type="text" name="keyword" class="option-search-input">
				<button class="option-search-Btn"><i class="fas fa-search"></i></button>
			</div> -->
		</div>
		
		<ul class="board">
			<% for(Board p: pList) { 
				if(p.getBoard_code() > 0) {%>
				    <li class="board-list" style="cursor : pointer;">
				    	<input type="hidden" value="<%= p.getBoard_no() %>">
				    	<input type="hidden" value="<%= p.getBoard_code() %>">
				    	<div class="board-list-img">
				    		<% for(Attachment a: aList) {
				    				
				    				if(p.getBoard_code() == 1 || p.getBoard_code() == 3) {
				    				
				    					if(p.getBoard_no() == a.getBoardNo()) { %>
				        					<img class="board-list-img-con" src="<%= request.getContextPath() %>/uploaded_Images/<%= a.getAtcName() %>">
				        	<%			}
				    				} else { %>
				    					<img class="board-list-img-con" src="<%= request.getContextPath() %>/images/vegitalk/dietList.png">
				    		<%		}
				        	   } %>
				        </div>
				        <div class="board-list-item">
				            <h1 class="board-list-item-id"><%= p.getMem_id() %></h1>
				            <p class="board-list-item-con"><%= p.getBoard_content() %></p>
				            <div class="board-list-item-social">
				                <span><i class="far fa-comment-dots"></i><%= p.getBoard_com() %></span>
				            </div>
					    </div>
					</li>
			<% } 
			} %>
		</ul>
			<div class="paging">
				<span class="paging-item">&lt;</span>
				<% for(int p = startPage; p <= endPage; p++){
				   	 	if(p == currentPage) { %>
							<span class="paging-item"><%= p %></span>
					<%  } else { %>
						<span class="paging-item" onclick="location.href='<%= request.getContextPath() %>/vegiTalk?opt=<%= opt %>&currentPage=<%= p %>'"><%= p %></span>
					<%  } 
				  } %>	
				<span class="paging-item">&gt;</span>
			</div>
		<% } %>
	</div>
	
	<% if(loginUser != null) { %>
		<div class="writeBtn" onclick="location.href='writePost'"><i class="fas fa-pen"></i></div>
	<% } %>
	
	<%@ include file="../common/footer.jsp" %>
	<script>
		$(function() { //글쓰기 버튼 배치
			var $w = $(window),
		    footerHei = $('footer').outerHeight(),
		    $btn = $('.writeBtn');

		  	$w.on('scroll', function() {

		    var sT = $w.scrollTop();
		    var val = $(document).height() - $w.height() - footerHei;

		    if (sT >= val)
		        $btn.addClass('on')
		    else
		    	$btn.removeClass('on')

		  	});
		});
		
		$(function(){
			$('.option-search-input').val();
		});
		
		$(function(){ //상세페이지 이동 분기 처리
			$('.board-list').click(function(){
				var bId = $(this).children().val();
				var bCode = $(this).children().eq(1).val();
				location.href="<%= request.getContextPath() %>/detail?bId=" + bId + "&bCode=" + bCode;
			});
		});
		
		
		$(function() { //sort 옵션 버튼 클릭 이벤트
			var opt = <%= opt %>;
			
			$('.opt-type').children().eq(opt).css('color', '#41A693');
		
			$('.opt-type').children().click(function(){
				location.href="<%= request.getContextPath() %>/vegiTalk?opt=0";
			});
			
			$('.opt-type').children().eq(1).click(function(){
				location.href="<%= request.getContextPath() %>/vegiTalk?opt=1";
			});
			
			$('.opt-type').children().eq(2).click(function(){
				location.href="<%= request.getContextPath() %>/vegiTalk?opt=2";
			});
			
			$('.opt-type').children().eq(3).click(function(){
				location.href="<%= request.getContextPath() %>/vegiTalk?opt=3";
			});
		});
		
		$(function() { //페이징
			var opt = <%= opt %>;
			if(<%= currentPage %> <= 1) {
				$('.paging-item').eq(0).css('background-color', '#ACB5BD');
				$('.paging-item').eq(0).click(function(){
					$('.paging-item').preventDefault();
				});
			} else {
				$('.paging-item').eq(0).click(function(){
					location.href="<%= request.getContextPath() %>/vegiTalk?opt=" + opt + "&currentPage=<%= currentPage - 1 %>";
				});
			}
			
			if(<%= currentPage %> >= <%= maxPage %>) {
				$('.paging-item:last').css('background-color', '#ACB5BD');
				$('.paging-item:last').click(function(){
						$(this).preventDefault();
				});
			} else {
				$('.paging-item:last').click(function(){
					location.href="<%= request.getContextPath() %>/vegiTalk?opt=" + opt + "&currentPage=<%= currentPage + 1 %>";
			
				});
			}
		});
	</script>
</body>
</html>