<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="board.model.vo.*, board.model.vo.Attachment, java.util.ArrayList"%>
<%
	Board post = (Board) request.getAttribute("post");
	Attachment atc = (Attachment) request.getAttribute("atc");
	ArrayList<Comments> list = (ArrayList) request.getAttribute("list");
	BookMark bmkList = (BookMark) request.getAttribute("bmkList");
	System.out.println(post);
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
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var,
	b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav,
	output, ruby, section, summary, time, mark, audio, video {margin: 0;padding: 0;border: 0;font-size: 100%;font: inherit;vertical-align: baseline;text-decoration: none;border-style: none;color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup,
	menu, nav, section {display: block;}
	ody {line-height: 1;font-family: 'Open Sans', sans-serif;}
	ol, ul {list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after, q:before, q:after {content: '';content: none;}
	table {border-collapse: collapse;border-spacing: 0;}
	button {outline: none;background-color: white;border-style: none;}

	textarea {outline: none;padding: 1rem;border-style: none;}
	.wrapper {width: 500px;min-width: 500px;margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}
	
	#wirte-area {resize: vertical;}
	.write-my {display: flex;justify-content: flex-end;}
	.write-my button {margin-bottom: 10px;margin-right: 2px;color: #333B3F;font-weight: bold;left: 0;}
	.write-my button:hover {background-color: #F0F3F5;border-radius: 5px;}
	.write-my button:active {background-color: #41A693;color: #FFF;}

	.selected {color: #41A693;font-weight: bold;}
	.write-img {margin: 0 auto;width: 500px;height: 450px;overflow: hidden;background-color: #F0F3F5;text-align: center;line-height: 550px;}
	.write-img-btn {padding: 50px;border: 2px dotted #858E96;border-radius: 20px;color: #858E96;}

	#post-img {width: 100%;height: 100%;}
	#wirte-area {width: 470px;min-height: 150px;overflow:visible;padding: 15px;line-height: 1.5;resize: none;}
	
	.social {width: 500px;display: flex;justify-content: flex-end;margin: 10px 0;}
	span>i {font-size: 18px;vertical-align: middle;}
	.social>span {padding: 3px;padding-left: 8px;padding-right: 8px;}
	
	.checked {color: #41A693;font-weight: bold;}
	.user {padding: 1rem;color: #333B3F;font-size: 19px;display: flex;justify-content: space-between;align-items: center;}
	.user-info {width: 95%;display: flex;justify-content: space-between;}
	
	#userId {font-size: 20px; font-weight:bold;}
	.fa-bookmark {font-size: 20px;cursor: pointer;}
	.fa-bookmark:hover {cursor: pointer;color: #41A693;}
	.comment {box-sizing: border-box;width: 500px;background-color: #F0F3F5;height: auto;padding: 14px;margin-top: 8px;}
	.comment-list {width: 100%;padding: 0;display: inline-block;margin-top: 8px;}
	.comment-input {display: flex;justify-content: space-between;margin-top: 20px;vertical-align: middle;}
	#comUserId {width: 15%;font-weight: bold;overflow: hidden;font-size: 14px;font-weight: bold !important;height: 20px !important;}
	#comContent {width: 50%;font-size: 14px;height: 20px !important;}
	#comDelBtn {width: 5%;text-align: right;font-size: 14px;height: 20px;important;font-size: 10px;cursor: pointer;}
	#comDate {width: 30%;font-size: 12px;height: 20px;important;font-size:12px;}
	.commentRow {padding-top: 12px;}
	.comment-input-field {width: 85%;border-style: none;padding: 8px;outline: none;}
	.comment-input-submit {width: 50px;}
	.comment-input-submit:hover {background-color: #41A693;color: #fff;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>
	<div class="wrapper">
		<%
			if (loginUser != null && (loginUser.getMemId()).equals(post.getMem_id())) {
		%>
		<div class="write-my">
			<button id="delete">삭제</button>
			<button id="modify">수정</button>
		</div>
		<%
			}
		%>

		<%
			if (atc != null) {
		%>
		<div class="write-img">
			<img
				src="<%=request.getContextPath()%>/uploaded_Images/<%=atc.getAtcName()%>"
				id="post-img">
		</div>
		<%
			}
		%>

		<div class="user">
			<input type="hidden" name="bId" value="<%=post.getBoard_no()%>">
			<input type="hidden" name="bCode" value="<%=post.getBoard_code()%>">


			<div class="user-info">
				<span id="userId"><%=post.getMem_id()%></span> <span id="date"><%=post.getBoard_date()%></span>
			</div>
			<%-- <i class="far fa-bookmark" id="bmkBtn" value="<%=bmkList%>"></i> --%>
		</div>

		<textarea name="write" id="wirte-area" readonly><%=post.getBoard_content()%></textarea>

		<div class="social">
			<span><i class="far fa-comment-dots" id="comCnt"></i><%=post.getBoard_com()%></span>
		</div>

		<div class="comment">
			<ul class="comment-list" id="commentSelect">

				<%
					if (list.isEmpty()) {
				%>
				<span style="color: gray; font-size: 14px;"><%=post.getMem_id()%>님과
					가장 먼저 댓글로 이야기해보세요!</span>
				<%
					} else {
				%>
				<%
					for (int i = 0; i < list.size(); i++) {
				%>
					<li class="row commentRow">
						<input type="hidden" value="<%= list.get(i).getComNo() %>">
						<span class="col-2 commentCol" class="comUserId" id="comUserId"><%= list.get(i).getMemId() %></span>
						<span class="col-7 commentCol" id="comContent"><%= list.get(i).getComContent() %></span>
						<% if(loginUser != null) { %>
							<span class="comDelBtn"><i class="fas fa-times comDelBt" id="comDelBtn"></i></span>
						<% } %>
						<span class="col-3 commentCol" id="comDate"><%= list.get(i).getComDate() %></span>
					</li>
				<%
					}
				%>
				<%
					}
				%>
			</ul>
			<%
				if (loginUser != null) {
			%>
			<div class="comment-input">
				<input type="hidden" name="user" id="lo" value="<%=loginUser.getMemId()%>">
				<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요" id="commentContent">
				<button type="submit" class="comment-input-submit" id="addComment">등록</button>
			</div>
			<%
				}
			%>
		</div>
	</div>

	<script>
		//댓글 관련
		 $('#addComment').click(function(){
			var loginUserId = $('.comment-input').children().eq(0).val();
			
			if(loginUserId != null) {
				var writer = loginUserId;
			}
			
			var bId =  '<%=post.getBoard_no()%>';
			var content = $('#commentContent').val();
			
			// 댓글 수 추가
			if(content == null || content == '') {
				alert("댓글을 입력해주세요");
			} else {
				$.ajax({
					url:'<%= request.getContextPath() %>/countComment.bo',
					data:{bId:bId},
					success: function(data){}
				});
			
				$.ajax({
					url: '<%= request.getContextPath() %>/insertComment.bo',
					data: {writer:writer, bId:bId, content:content},
					success: function(data){
						$('#commentSelect').html('');
						$('#commentContent').val('');	// 댓글 입력 후 기존 내용 삭제
								
							var commentResult = "";
							
							for(var i=0 in data){
								commentResult += "<li class='row commentRow'><input type='hidden' value=''><div class='col-2' id='comUserId'>" + data[i].memId + "</div>"
													+ "<div class='col-7' id='comContent'>" + data[i].comContent + "</div>"
													+ "<div class='col-3' id='comDate'>" + data[i].comDate + "</div></li>";
							}
						$('#commentSelect').html(commentResult).trigger("create");
					}
				});	
			}
		});
		
		$('.comDelBtn').click(function(){
			var comNo = $(this).parents().children().val();
			var bId =  '<%=post.getBoard_no()%>';
			var user = '<%= loginUser.getMemId() %>';
			var writer = $(this).prev().prev().text();
			var bool = confirm('댓글을 정말 삭제하시겠어요?');
			console.log(user);
			console.log(writer);
			if(bool) {
				if(writer !== user) {
					alert('본인의 댓글만 삭제할 수 있습니다.');
				} else {
					$.ajax({
						url: '<%= request.getContextPath() %>/deleteCom',
						data: {bId:bId, comNo:comNo},
						success: function(data){
							$(this).parents().rimove();
						}
					});
					location.reload();
				}
			}
		});
		 
		//삭제
		$('#delete').click(function(){
			var bId = $('.user').children().val();
			var bCode = $('.user').children().eq(1).val();
			var bool = confirm('게시글을 정말 삭제하시겠어요?');
			if(bool) {
				location.href = "<%= request.getContextPath() %>/delete?bId=" + bId + "&bCode=" + bCode;
			}
		});
		
		//수정
		$('#modify').click(function(){
			var bId = $('.user').children().val();
			var bCode = $('.user').children().eq(1).val();
			location.href="<%=request.getContextPath()%>/editForm?bId=" + bId + "&bCode=" + bCode;
		});
		
		$('#modify').click(function(){
			var bId = $('.user').children().val();
			var bCode = $('.user').children().eq(1).val();
			location.href="<%=request.getContextPath()%>/editForm?bId=" + bId + "&bCode=" + bCode;
		});
		
		$('#wirte-area').on('keydown keyup', function () {
			 $(this).height(1).height( $(this).prop('scrollHeight')+ 12 );	
		});
	</script>
</body>
</html>