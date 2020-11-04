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
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<style>
	footer,section,.inputtext,nav{display:block;}	
	a{text-decoration:none;	color:black;}
	body{line-height: 1; font-family: 'Open Sans', sans-serif;}
	.cardwrap{display:inline-block;margin-left:80px;}
	article{padding: 100px;	margin: 20px;}
	#tag_filter{margin-left:220px;border:2px solid lightgray;width:1100px;height:80px;}
	.img{display:inline-block;}
	#menuname{display:fixed;margin-top:100px; }
	.sort{margin-left:1200px;font-size:10px;}
	.col{display:inline-block;border: 3px solid black;padding:1px;margin:1px;}
	.sortType{cursor:pointer;}
	#write{margin-left:1200px;margin-top:100px;padding-top: 1000px;cursor:pointer;		}
	.text{margin-left:600px;}
	h2{text-align:center;}
	.card h-100:hover{cursor:pointer;}
</style>

<title>Insert title here</title>
</head>
<body>
	<!-- GNB  -->
		<%@ include file="../common/gnb.jsp" %>
	
	
	 <div id="menuname"><h3>&nbsp;&nbsp;RECIPE</h3></div>
  	
    
    <br>
    
    	<div class="sort">
    		<input type="hidden">
			<span class="sortType"><input type="hidden" name="cate" value="1"> 최신순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="2">좋아요순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="3">댓글순</span>
		</div>
    
    
  	<script>
		$(function(){
			$('.sortType').click(function(){
					var sortType=$(this).children().eq(0).val();			//최신순이면 1, 좋아요순이면 2 , 댓글순이면 3				
					location.href='<%=request.getContextPath()%>/recipe.sort?sortType=' +sortType;   //2에다 만듬									
			});
		});

	</script> 
    
    
    
	
	<article class="cardwrap">
	
	<div class="row row-cols-1 row-cols-sm-5">
	
  	<% if(bList.isEmpty() || tList.isEmpty()){ %> 
		<h2><font color="gray">등록된 레시피가 없습니다.</font></h2>
		<% } else{ %>
		
	<% for(int i=0; i < bList.size(); i++){ %>
					<% Board b = bList.get(i); %>
			<div class="col">
    <div class="card h-100">
    	<input type="hidden" value="<%=b.getBoard_no() %>">
    		<% for(int j=0; j<tList.size(); j++){ %>
    			<% Attachment a =tList.get(j);%>
    			<% if(b.getBoard_no()==a.getBoardNo()){ %>	
    	 			<img src="<%= request.getContextPath()%>/thumnail_uploadFiles/<%=a.getAtcName()%>" width="250px" height="150px">
      				<%} %>
      			<%} %>
      			
      <div class="card-body">
       		 <h5><%=b.getBoard_title()%></h5>
       		 <img src="<%= request.getContextPath() %>/images/recipe/like.png" height="30px" width="30px"><b><%=b.getBoard_like() %></b>  &nbsp;
       		 <img src="<%= request.getContextPath() %>/images/recipe/comment.png" height="25px" width="25px"><b><%=b.getBoard_com() %></b>
      	</div>
   	 </div>  	   	 
  </div>
  
  		<%} %> 
  	<%} %>   

	</div>  
  
  	<script>
		$(function(){
			$('.card h-100').click(function(){
				var bId=$(this).children().children().eq(0).val();
				location.href="<%=request.getContextPath()%>/detail.recipe?bId=" +bId;
			});
		});
		
	</script>
  					
		
		<!-- 글쓰기 버튼 -->
  	 <%if(loginUser == null){ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="alert('로그인 후 이용가능합니다.')"></span>	
	<%} else{ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="location.href='<%=request.getContextPath()%>/write'"></span>	
	<%} %>    
	
 	
		
	</article>
		
	
	 <div class="text">
 		<form  id="select" action="<%=request.getContextPath() %>/select.re" method="post">
 			<input type="text" class="search" maxlength="100" size="50"> 
 			<input type="submit" value="검색" id="search">
 		</form>
 	</div>
	
	

	
	<!-- Footer  -->
	<%@ include file="../common/footer.jsp" %>
	
	
</body>
</html>