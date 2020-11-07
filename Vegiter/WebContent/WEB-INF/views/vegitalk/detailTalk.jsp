<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.*, board.model.vo.Attachment, java.util.ArrayList" %>
<%
	Board post = (Board)request.getAttribute("post");
	Attachment atc = (Attachment)request.getAttribute("atc");
	ArrayList<Comments> list = (ArrayList)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도란도란</title>
<!-- 부트스트랩 -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<style>
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}
	body{line-height: 1; font-family: 'Open Sans', sans-serif;}
	ol, ul{list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after, q:before, q:after {content: ''; content: none;}
	table{border-collapse: collapse; border-spacing: 0;}
	button{outline: none; background-color: white;border-style: none;}
	textarea{outline: none; padding: 1rem;border-style: none;}
	.wrapper{width: 500px; min-width: 500px; margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}
	#wirte-area{resize: vertical;}
	.write-my {display: flex;justify-content: flex-end;}
	.write-my button{margin-bottom: 10px; margin-right: 2px;color: #333B3F;font-weight: bold; left: 0;}
	.write-my button:hover{background-color: #F0F3F5;border-radius: 5px;}
	.write-my button:active{background-color: #41A693;color: #FFF;}
	.selected{color: #41A693;font-weight: bold;}
	.write-img{margin: 0 auto; width: 500px; height: 450px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}
	.write-img-btn{padding: 50px; border: 2px dotted #858E96; border-radius: 20px; color: #858E96;}
	#post-img{width: 100%; height: 100%;}
	#wirte-area {width: 470px; min-height: 100px; height: auto; padding: 15px; line-height: 1.5; resize:none;}
	.social{width: 500px;display: flex;justify-content: flex-end;margin: 10px 0;}
	span>i {font-size: 18px;vertical-align: middle;}
	.social>span{padding: 3px;padding-left: 8px;padding-right: 8px;}
	.social>span:nth-child(1):hover{cursor: default;}
	.social>span:nth-child(2):hover{cursor: pointer;background-color: #41A693;color: #fff;border-radius: 15px;}
	.checked{color: #41A693;font-weight: bold;}
	.user{padding: 1rem;color: #333B3F;font-weight: bold;font-size: 19px;display: flex;justify-content: space-between;align-items: center;}
	.user-info{width: 95%;display: flex;justify-content: space-between;}
	#userId{font-size: 20px;}
	.fa-bookmark{font-size: 20px;cursor: pointer;}
	.fa-bookmark:hover{cursor: pointer;color: #41A693;}
	.comment{box-sizing:border-box;width: 500px;background-color: #F0F3F5; height: auto;padding: 14px; margin-top: 8px;}
	.comment-list{width: 100%; padding: 0; display: inline-block; margin-top: 8px;}
	.comment-input{display: flex; justify-content: space-between; margin-top: 20px; vertical-align: middle;}
	#comUserId{display: inline-block; width: 15%; bold; overflow: hidden; font-size: 14px; font-weight: bold !important; height: 20px !important;}
	#comContent{display: inline-block; width: 60%; font-size: 14px; height: 20px !important;}
	#comDate{display: inline-block; width: 20%; text-align: right; font-size: 14px;
			 height: 20px !important;}
	.commentRow{padding-top: 12px;}
	.comment-input-field{width: 85%;border-style: none; padding: 8px; outline:none;}
	.comment-input-submit{width: 50px;}
	.comment-input-submit:hover{background-color: #41A693;color: #fff;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
<div class="wrapper">
	<% if(loginUser != null && (loginUser.getMemId()).equals(post.getMem_id())){ %>
		<div class="write-my">
			<button id="delete">삭제</button>
			<button id="modify">수정</button>
		</div>
	<% } %>
	
	<div class="write-img">
		<% if(post.getBoard_code() == 1 || post.getBoard_code() == 3){%>
		<img src="<%= request.getContextPath() %>/uploaded_Images/<%= atc.getAtcName() %>" id="post-img">
		<% } else{ %>
			식단
		<% } %>
	</div>
	
	<div class="user">
		<div class="user-info">
		<span id="userId"><%= post.getMem_id() %></span>
			<span id="date"><%= post.getBoard_date() %></span>
		</div>
		<i class="far fa-bookmark"></i>
	</div>
	
	<textarea name="write" id="wirte-area" readonly><%= post.getBoard_content() %></textarea>
	
	<div class="social">
		<span><i class="far fa-comment-dots"></i>
		<%= post.getBoard_com() %></span>
		<span class="social-item checked"><i class="far fa-heart"></i>
		<%= post.getBoard_like() %></span>
	</div>

	<div class="comment">
		<ul class="comment-list" id="commentSelect">
		<% if(list.isEmpty()) {%>
			댓글로 소통을 해보세요!
		<% } else { %>
		<% 		for(int i = 0; i < list.size(); i++) { %>
			<div class="row commentRow">
				<div class="col-2 commentCol" id='comUserId'><%=  list.get(i).getMemId()  %></div>
				<div class="col-7 commentCol" id='comContent'><%=  list.get(i).getComContent()  %></div>
				<div class="col-3 commentCol" id='comDate'><%=  list.get(i).getComDate()  %></div>
			</div>
<%-- 			<li class="comment-list-item" id="comUserId" style="width: 50px;"><%=  list.get(i).getMemId()  %></li> --%>
<%-- 			<li class="comment-list-item" id="comContent" style="width: 50px;" ><%=  list.get(i).getComContent()  %></li> --%>
<%-- 			<li class="comment-list-item" id="comDate" style="width: 50px;"><%=  list.get(i).getComDate()  %></li><br> --%>
			
			  <% } %>
		<% } %>
		</ul>
		<div class="comment-input">
			<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요." id="commentContent">
			<button type="submit" class="comment-input-submit" id="addComment">등록</button>
		</div>
	</div>
</div>

	<script>
		// 온 로드
// 		$(()=>{
			
// 		}

// 		$('#list-tab > a').click((e)=>{
// 			var $obj = $(e.target);
// 			var no = $obj.prop("id").split('-')[2];
// 			selected = no;
// 			console.log(selected);
// 		});
		
			
		$('#addComment').click(function(){
			
				
			var writer = '<%= loginUser.getMemId() %>';
			var bId =  '<%= post.getBoard_no() %>';
			var content = $('#commentContent').val();
			
			
			
			// 댓글 수 추가
			if(content == null || content == '') {
				alert("댓글을 입력해주세요");
			} else {
				$.ajax({
					url: 'countComment.bo',
					data: {bId:bId},
					success: function(data){
						console.log(data);
					}
				});
			
			
			$.ajax({
				url: 'insertComment.bo',
				data: {writer:writer, bId:bId, content:content},
				success: function(data){
					console.log(data);
					
// 					var c = $('#commentSelect').html('');
					$('#commentSelect').html('');
					$('#commentContent').val('');	// 댓글 내용 없애기
					
// 					$('.comment-list').on('click','#commentSelect *', function(e) {  });
					
					var commentResult = "";
					
					for(var i=0 in data){
// 						console.log(data[i]);
						commentResult += "<div class='col-2' id='comUserId'>" + data[i].memId + "</div>"
											+ "<div class='col-7' id='comContent'>" + data[i].comContent + "</div>"
											+ "<div class='col-3' id='comDate'>" + data[i].comDate + "</div>";
// 						$('.comment-list').append("<div class='col-2' id='comUserId'>" + data[i].memId + "</div>")
// 						.append("<div class='col-7' id='comContent'>" + data[i].comContent + "</div>")
// 						.append("<div class='col-3' id='comDate'>" + data[i].comDate + "</div>");
					}
					$('#commentSelect').html('<div class="row commentRow">' + commentResult + '</div>');
				}
			});
			}
		});
		
		
	</script>
</body>
</html>