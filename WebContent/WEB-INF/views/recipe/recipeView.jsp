<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="board.model.vo.*, java.util.ArrayList" %>
    <% 
    	Board board=(Board)request.getAttribute("board");
    	ArrayList<Attachment> list=(ArrayList)request.getAttribute("attchment");
    	ArrayList<Reply> list =(ArrayList)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<title></title>
<style>

	#post-img{width: 100%; height: auto;}
	button{outline: none; background-color: white;border-style: none;}
	ol, ul{list-style: none;}
	.comment{
		width: 800px;
		height:auto;
		background-color: #F3F3F3;  
		padding: 18px;
		margin-left:350px;
		margin-top: 10px;
		}

	.write-img{margin-left:450px; width: 600px; height:400px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}
	#post-img{width: 100%; height: auto;border-radius: 5px; }
	.wrapper{margin-top:100px;}
	.card-img{border-radius: 5px;}

	.comment-list{width: 100%;padding: 0;display: flex;}
	.comment-input{display: flex;justify-content: space-between;margin-top: 20px;vertical-align: middle;}
	#comUserId{width: 20%;font-weight: bold;overflow: hidden;}
	#comContent{width: 65%;}
	#comDate{width: 15%;text-align: right;}
	.comment-input-field{width: 85%;border-style: none;padding: 8px; outline:none;}
	.comment-input-submit{width: 60px;}
	.comment-input-submit:hover{background-color: #41A693;color: #fff;}
	.title{text-align: center; margin-bottom:20px;}

	
	
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
	.fa-bookmark:hover{cursor: pointer;color: #41A693;}
	.social{width: 1000px;display: flex;justify-content: flex-end;margin: 10px 0; margin-left:150px;}
	span>i {font-size: 18px;vertical-align: middle;}
	.social>span{padding: 3px;padding-left: 8px;padding-right: 8px; }
	.social>span:nth-child(1):hover{cursor: default;}
	.social>span:nth-child(2):hover{cursor: pointer;background-color: #41A693;color: #fff;border-radius: 15px;}
	
</style> 
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
</head>
<body>
<div class="wrapper">
	
		
	


	<div class="title">			
			<span id="title"><b>제목입니다.</b></span>
	</div>		
				<div id="top">
					<span id="userId">Id User01</span>
					<span id="date"><b><br>2020-10-10</b></span>				
					<i class="far fa-bookmark"></i>
				</div>
					
				<span id="update">
				<button id="delete" onclick="deleteBoard()"><b>삭제</b></button>
				<button id="modify"><b>수정</b></button>
				</span>			
			
			<script>
				function deleteBoard(){
					var bool=confirm("정말로 삭제하시겠습니까?");
					if(bool){
						location.href='<%=request.getContextPath()%>/delete.bo?bId=<%=board.getBoard_no()%>';
					}
				}
			
			
			</script>
			
			
					
	<div id="thumbnail">
		<div class="write-img">
			<img src="<%=request.getContextPath() %>/images/recipe/비건이미지.PNG" id="post-img" alt="비어있습니다.">	
			
	</div>
		<textarea class="content" readonly>처음 설명부분</textarea>
	</div>
	
	
  							 <div class="part">
 							 	<br><br><br>
 							 	 <div class="row no-gutters">
   			 						<div class="col-md-4" id="titleImgArea1">
   			 							<img src="<%=request.getContextPath() %>/images/recipe/비건이미지.PNG" id="contentImg2" class="card-img" width="300" height="300">
    								</div>
    							     <div class="col-md-8">
    						 			 <div class="card-body">
    		  								<textarea class="form-control" name="content" id="content1" aria-label="With textarea" cols="500" rows="9" disabled  style="background-color:transparent">aaa</textarea>
      									</div>
     				   	 		  </div>
  							   </div>
 							 </div>
 							 
 							 <div class="part">
 							 	<br><br><br>
 							 	 <div class="row no-gutters">
   			 						<div class="col-md-4" id="titleImgArea1">
   			 							<img src="<%=request.getContextPath() %>/images/recipe/비건이미지.PNG" id="contentImg2" class="card-img" width="300" height="300">
    								</div>
    							     <div class="col-md-8">
    						 			 <div class="card-body">
    		  								<textarea class="form-control" name="content" id="content1" aria-label="With textarea" cols="500" rows="9" disabled  style="background-color:transparent">aaa</textarea>
      									</div>
     				   	 		  </div>
  							   </div>
 							 </div>
 							 
 							 <div class="part">
 							 	<br><br><br>
 							 	 <div class="row no-gutters">
   			 						<div class="col-md-4" id="titleImgArea1">
   			 							<img src="<%=request.getContextPath() %>/images/recipe/비건이미지.PNG" id="contentImg2" class="card-img" width="300" height="300">
    								</div>
    							     <div class="col-md-8">
    						 			 <div class="card-body">
    		  								<textarea class="form-control" name="content" id="content1" aria-label="With textarea" cols="500" rows="9" disabled  style="background-color:transparent">aaa</textarea>
      									</div>
     				   	 		  </div>
  							   </div>
 							 </div>
 							 
 							 <div class="part">
 							 	<br><br><br>
 							 	 <div class="row no-gutters">
   			 						<div class="col-md-4" id="titleImgArea1">
   			 							<img src="<%=request.getContextPath() %>/images/recipe/비건이미지.PNG" id="contentImg2" class="card-img" width="300" height="300">
    								</div>
    							     <div class="col-md-8">
    						 			 <div class="card-body">
    		  								<textarea class="form-control" name="content" id="content1" aria-label="With textarea" cols="500" rows="9" disabled  style="background-color:transparent">aaa</textarea>
      									</div>
     				   	 		  </div>
  							   </div>
 							 </div>
	
			


		<div class="social">
			<span><i class="far fa-comment-dots"></i>
				100+</span>
			<span class="social-item checked"><i class="far fa-heart"></i>
				100+</span>
		</div>

	<div class="comment">
		<ul class="comment-list">
			<li  id="comUserId">user01</li>
			<li  id="comContent">comment</li>
			<li  id="comDate">2020-11-11</li>
		</ul>
		
		<div class="comment-input">
			<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요.">
			<button type="submit" class="comment-input-submit">등록</button>
		</div>
	</div>

</div>
<%@ include file="../common/gnb.jsp" %>

	<%@ include file="../common/footer.jsp" %>
	
</body>
</html>