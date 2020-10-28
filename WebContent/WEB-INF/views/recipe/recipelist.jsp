<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.ArrayList, board.model.vo.*" %>
    <%
    ArrayList<Board> bList=(ArrayList<Board>)request.getAttribute("bList");
    ArrayList<Attachment> tList=(ArrayList<Attachment>)request.getAttribute("tList");
    %>
<!DOCTYPE html>



<html>
<head>
<meta charset="UTF-8">
<style>
	
	footer,section,.inputtext{
		display:block;
	}	
	
	.cardwrap{
	display:inline-block;
	}
	
	article{
		padding: 100px;
		margin: 20px;
	}

				
	#tag_filter{
		margin-left:270px;
		border:2px solid lightgray;
		width:1100px;
		height:80px;
	}
	.img{
		display:inline-block;
	}
	
	#menuname{
		display:fixed;
		margin-top:100px; 
	}
	.typeimg{
		cursor:pointer;
		font-size:15px;
	}
	
	.cardwrap{
		margin-left:80px;
	}
	
	.sort{
		margin-left:1250px;
		font-size:10px;
	}
	
	.col{
		display:inline-block;
		border: 3px solid black;
		padding:1px;
		margin:1px;
	}
	
</style>

<title>Insert title here</title>
</head>
<body>
	<!-- GNB  -->
		<%@ include file="../common/gnb.jsp" %>
	
	
	 <div id="menuname"><h6>&nbsp;&nbsp;RECIPE</h6></div>
  	
 
	
    <div class="n-img-hashtag" id="tag_filter" align="center">
         <span class="typeimg">
         		<input type="hidden" name="cate" value="1">
               <b>비건</b><img src="<%= request.getContextPath() %>/images/recipe/비건.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
        		
        <span class="typeimg">
        		<input type="hidden" name="cate" value="2">
               <b>락토</b><img src="<%= request.getContextPath() %>/images/recipe/락토.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	
         <span class="typeimg">
         		<input type="hidden" name="cate" value="3">
               <b>오보</b><img src="<%= request.getContextPath() %>/images/recipe/오보.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	
         <span class="typeimg">
         		<input type="hidden" name="cate" value="4">
               <b>락토오보</b><img src="<%= request.getContextPath() %>/images/recipe/락토오보.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      
        	 
          <span class="typeimg">
          		<input type="hidden" name="cate" value="5">
               <b>페스코</b><img src="<%= request.getContextPath() %>/images/recipe/페스코.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
        	 
         <span class="typeimg">
         		<input type="hidden" name="cate" value="6">
               <b>폴로</b><img src="<%= request.getContextPath() %>/images/recipe/폴로.png">
        </span>
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
        	    
          <span class="typeimg">
          		<input type="hidden" name="cate" value="7">
               <b>플렉</b><img src="<%= request.getContextPath() %>/images/recipe/플렉.png">
        </span>
    </div>
    <br>
    
    	<div class="sort">
			<span class="sortType"> 최신순 |</span>
			<span class="sortType">좋아요순|</span>
			<span class="sortType">댓글순</span>
		</div>
    
	
	<article class="cardwrap">
	
		<div class="row row-cols-1 row-cols-sm-5">
	
	
	<% for(int i=0; i < bList.size(); i++){ %>
					<% Board b = bList.get(i); %>
	
			<div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b><%=b.getBoard_count() %></b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
  	<%} %>
  
  
  		<div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
  <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
  <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
  <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
   <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
   <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  
   <div class="col">
    <div class="card h-100">
       <a href="view.html"><img src="<%= request.getContextPath() %>/images/recipe/post.png" class="card-img-top" alt="..."></a>
      <div class="card-body">
       	 <h5 class="card-title"> <a href="view.html">Card title</a></h5>
       			 <p class="card-text"> <a href="view.html">This is a short card.</a></p>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b>1111</b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b>22</b>
      	</div>
   	 </div>  	   	 
  </div>
  

		</div>
	
	</article>
	
	<!-- Footer  -->
	<%@ include file="../common/footer.jsp" %>
	
	
		
	
	<script>
	$(function(){
		$('.typeimg').mouseenter(function(){
				$(this).children().css('cursor','pointer');
		}).click(function(){
			var bcate=$(this).children().eq(0).val();
			
				location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +bcate; 
			
		});
	});

		
	</script>
	
	

	
	
	
	
	
	
	
	
</body>
</html>