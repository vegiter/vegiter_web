<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="board.model.vo.*, java.util.ArrayList" %>
    <% 
		Board board=(Board)request.getAttribute("board");
		
    	ArrayList<Attachment> atList=(ArrayList<Attachment>)request.getAttribute("fileList");
    	
		Attachment titleImg=atList.get(0);
    	
    	ArrayList<Content> conList=(ArrayList<Content>)request.getAttribute("conList");
    	
    	Content titleCon=conList.get(0);
    	
    	ArrayList<Comments> list = (ArrayList<Comments>)request.getAttribute("list");
    	
    	BookMark bookList=(BookMark)request.getAttribute("bookList");
    	

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title></title>
<style>

	#post-img{width: 100%; height: auto;}
	button{outline: none; background-color: white;border-style: none;}
	.title{text-align: center; margin-bottom:20px;}
	ol, ul{list-style: none;}
	 .comment{
		width: 800px;
		height:auto;
		background-color: #F3F3F3;  
		padding: 18px;
		margin-left:350px;
		margin-top: 10px;
		} 

	.write-img{margin-left:450px; width: 600px; height:330px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}
	#post-img{width: 100%; height: auto;border-radius: 5px; }
	.wrapper{margin-top:100px;}
	.card-img{border-radius: 5px;}


	.comment-list{width: 100%;padding: 0;display: inline-block;}
	.comment-input{display: flex;justify-content: space-between;margin-top: 20px;vertical-align: middle;}
	#comUserId{width: 20%;font-weight: bold;overflow: hidden;}
	#comContent{width: 65%;}
	#comDate{width: 15%;text-align: right;}
	.comment-input-field{width: 85%;border-style: none;padding: 8px; outline:none;}
	.comment-input-submit{width: 60px;}
	.comment-input-submit:hover{background-color: #41A693;color: #fff;} 
	.commentRow{padding-top: 12px;}

	/*-------------------------*/
	/* .comment{box-sizing:border-box;width: 500px;background-color: #F0F3F5; height: auto;padding: 14px; margin-top: 8px;}
	.comment-list{width: 100%; padding: 0; display: inline-block; margin-top: 8px;}
	.comment-input{display: flex; justify-content: space-between; margin-top: 20px; vertical-align: middle;}
	#comUserId{display: inline-block; width: 15%; bold; overflow: hidden; font-size: 14px; font-weight: bold !important; height: 20px !important;}
	#comContent{display: inline-block; width: 60%; font-size: 14px; height: 20px !important;}
	#comDate{display: inline-block; width: 20%; text-align: right; font-size: 14px;
			 height: 20px !important;}
	.commentRow{padding-top: 12px;}
	.comment-input-field{width: 85%;border-style: none; padding: 8px; outline:none;}
	.comment-input-submit{width: 50px;}
	.comment-input-submit:hover{background-color: #41A693;color: #fff;} */
	
	
	/*------------------------*/
	
	#title{font-size: 30px;}
	#top{margin-left:300px;}
	

	.content {width: 600px; min-height: 80px; height: auto; padding: 15px; line-height: 1.5; resize:none;
	margin-left:450px;margin-top:10px; outline: none; border-style: none; color:#6B6B6B; font-weight:bold}
	.form-control{width: 800px; min-height: 80px; height: auto; padding: 15px; line-height: 1.5;
	 resize:none;margin-top:10px; outline: none; border-style: none; background-color:white; }
	.part{margin-left:100px;}
	
	
	#update{margin-left:1100px;}
	#update button{ background-color:#E2F3E6; border-radius: 5px; outline: none;}
	#update>button:hover{background-color:#41A693}
	
	
	
	
	fa-bookmark{font-size: 15px;cursor: pointer;}
	.fa-bookmark:hover{cursor: pointer;	color: #41A693;}
	
	#bookMark{color:gray;}
	#bookMarkchecked{color:green;}	
	
	
	
	.social{width: 1000px;display: flex;justify-content: flex-end;margin: 10px 0; margin-left:150px;}
	span>i {font-size: 18px;vertical-align: middle;}
	.social>span{padding: 3px;padding-left: 8px;padding-right: 8px; }
	.social>span:nth-child(1):hover{cursor: default;}
	.social>span:nth-child(2):hover{cursor: pointer;color:#00FC8F;border-radius: 15px;}
	
	
	
	
</style> 
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
</head>
<body>
<div class="wrapper">
	
		<%@ include file="../common/gnb.jsp" %>



	<div class="title">			
			<span id="title"><b><%=board.getBoard_title() %></b></span>
	</div>		
	
		
				<div id="top">
					<span id="userId"><%=board.getMem_id()%></span>
					<span id="date"><b><br><%=board.getBoard_date() %></b></span>	
					 <%if(bookList ==null){ %>		 	
					<i class="far fa-bookmark" id="bookMark"></i>
					 <% }else{ %>
					<i class="far fa-bookmark" id="bookMarkchecked"></i>
					<% } %> 
					
			
					 <script>
						$(function(){
							
						<% if(loginUser != null) { %>	
							var num=0;
							var bId=<%=board.getBoard_no()%>;
							var user="<%=loginUser.getMemId()%>";
							$('#bookMark').click(function(){		/*선택*/
								$.ajax({
									url:'Check_bookmark.recipe',
									data:{bId:bId,user:user},
									success:function(data){
										console.log(data);
									}
								}); 
								location.reload();						
							});
/*-----------------------------------------------------------------------------------------------------------------*/			
							$('#bookMarkchecked').click(function(){		/*선택해제*/
								$.ajax({
									url:'Uncheck_bookmark.recipe',
									data:{bId:bId,user:user},
									success:function(data){
										console.log(data);
									}
								}); 
								location.reload();	
							});
							<% } else{%>		
							$('#bookMark').click(function(){		/*선택*/
								window.alert('로그인후 가능합니다.');					
							});
							
							
							
							<%}%>
							
						});	
					</script> 
					
				</div>
				
			
				<span id="update">
				<button id="delete" onclick="deleteRecipe()"><b>삭제</b></button>
				<button id="modify" onclick="updateRecipe()"><b>수정</b></button>
				</span>			
			
			<script>
				function deleteRecipe(){
					var bool=confirm("정말로 삭제하시겠습니까?");
					var bcate=<%=board.getBoard_cate()%>;
					var bId=<%=board.getBoard_no()%>;
					if(bool){
						location.href="<%=request.getContextPath()%>/delete.recipe?bId=" + bId + "&bcate=" +bcate; 
					}
				}
				
				function updateRecipe(){
					var bool=confirm("정말로 수정하시겠습니까?");
					var bcate=<%=board.getBoard_cate()%>;
					var bId=<%=board.getBoard_no()%>;
					if(bool){
						location.href="<%=request.getContextPath()%>/update.recipe?bId=" + bId + "&bcate=" +bcate;
					}
				}
			</script>
			
					
	<div id="thumbnail">
		<div class="write-img">
			<img src="<%=request.getContextPath() %>/thumnail_uploadFiles/<%=titleImg.getAtcName()%>" id="post-img" alt="비어있습니다.">	
			
	</div>
		<textarea class="content" readonly><%=titleCon.getContent() %></textarea>
	</div>
	
	<%for(int i=1; i<atList.size(); i++){ %>
  		<div class="part">
 				<br><br><br>
 			<div class="row no-gutters">
   				<div class="col-md-4" id="titleImgArea1">
   			 		<img id="contentImg<%=i %>" class="card-img" width="300" height="300"
   			 		 src="<%=request.getContextPath() %>/thumnail_uploadFiles/<%=atList.get(i).getAtcName()%>">
    			</div>
    				<div class="col-md-8">
    					<div class="card-body">
    		  				<textarea class="form-control" name="content" id="content1" aria-label="With textarea"
    		  				 cols="500" rows="9" disabled  style="background-color:transparent">
    		  				 <%if(conList.get(i).getContent()==null){
    		  					 
    		  				 }else{ %>
    		  				 
    		  				 <%=conList.get(i).getContent() %>
    		  				 <%} %></textarea>
      					</div>
     				</div>
  			</div>
 		</div>
 	<%} %>						 
 							 
	
			<%for(int i=0; i<conList.size(); i++){
					System.out.println(i+":"+conList.get(i).getContent());
					
			}%>
			



		<div class="social">
			<span><i class="far fa-comment-dots" id="commentImg"></i>
				<%=board.getBoard_com()%>+</span>
				
			<span class="social-item checked" id="likeButton">
			<i class="far fa-heart" >
				<input type="hidden" name="veguntype" value=0>
			</i>
				<b id="likescale"><%=board.getBoard_like() %>+</b></span>
		</div>
		
		<script>
		
		$(function(){
			var num=0;
			var like=<%=board.getBoard_like() %>;
			var bId=<%=board.getBoard_no()%>;
			$('#likeButton').click(function(){
								
 				num++;
 				console.log(num);
 				if(num % 2 !=0){
 					$(this).css({'background':'#41A693','border-radius':'15px','color':'#FF3F3F'});
 					$(this).children().eq(1).text(++like +"+");
				}else{
					$(this).css({'background':'white','color':'black'});
					$(this).children().eq(1).text(--like +"+");						 
				}
 				$.ajax({
						url:'updateLike.recipe',
						data:{num:num,bId:bId},
						success:function(data){
							console.log(data);
						}
					});
			});
		});	
		</script>
		

 	<div class="comment">		
			<ul class="comment-list" id="commentSelect">
			<% if(list.isEmpty()) {%>
				<span style="color: gray; font-size: 14px;"><%= board.getMem_id() %>님과 가장 먼저 댓글로 이야기해보세요!</span>
			<% } else { %>
			<% 		for(int i = 0; i < list.size(); i++) { %>
					<div class="row commentRow">
						<div class="col-2 commentCol" id='comUserId'><%= list.get(i).getMemId() %></div>
						<div class="col-7 commentCol" id='comContent'><%= list.get(i).getComContent() %></div>
						<div class="col-3 commentCol" id='comDate'><%=  list.get(i).getComDate()  %></div>
					</div>
				
			  <% } %>
		<% } %>
			</ul>
		
				<%-- <% } %> --%>
			
		<% if(loginUser != null) { %>
		<div class="comment-input">
			<input type="hidden" name="user" value="<%=loginUser.getMemId() %>">
			<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요."  id="commentContent">
			<button type="submit" class="comment-input-submit" id="addComment">등록</button>
		</div>
		<%}else{ %>
		<div class="comment-input">
			<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요."  id="commentContentNot">
			<button type="submit" class="comment-input-submit" id="addCommentNot">등록</button>
		</div>
		<%} %>
		
			<script>
				$('#commentContentNot').click(function(){
					window.alert('로그인 후 가능합니다.');
				});
				
				$('#addCommentNot').click(function(){
					window.alert('로그인 후 가능합니다.');
				});
			</script>
		
		
	</div> 




</div>

			

	<script>
	 $('#addComment').click(function(){
		 	var loginUserId=$('.comment-input').children().eq(0).val();
		 
			if(loginUserId != null) {
				var writer = loginUserId;
			}
			
			var bId =  '<%= board.getBoard_no() %>';
			var content = $('#commentContent').val();	//댓글입력한 곳
			
			// 댓글 수 추가
			if(content == null || content == '') {
				alert("댓글을 입력해주세요");
			} else {
				
				$.ajax({
					url: 'countComment.recipe',
					data: {bId:bId},
					success: function(data){
						console.log(data);
					}
				});
			
				$.ajax({
					url: 'insertComment.recipe',
					data: {writer:writer, bId:bId, content:content},
					success: function(data){
					console.log(data);
					
					$('#commentSelect').html('');
					$('#commentContent').val('');	// 댓글 입력 후 기존 내용 삭제
					
					var commentResult = "";
					
					for(var i=0 in data){
						commentResult += "<br><div class='col-2 commentCol' id='comUserId'>" + data[i].memId + "</div>"
											+ "<div class='col-7 commentCol' id='comContent'>" + data[i].comContent + "</div>"
											+ "<div class='col-3 commentCol' id='comDate'>" + data[i].comDate + "</div> <br>";
						}
							$('#commentSelect').html('<div class="row commentRow">' + commentResult + '</div>');
						}
					});
			
			}
			
		});
	
	
	</script>


	<%@ include file="../common/footer.jsp" %>
	
</body>
</html>