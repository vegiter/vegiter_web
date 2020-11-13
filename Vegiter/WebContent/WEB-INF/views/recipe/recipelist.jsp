<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.ArrayList, board.model.vo.*" %>
    <%
    ArrayList<Board> bList=(ArrayList<Board>)request.getAttribute("bList");
    ArrayList<Attachment> tList=(ArrayList<Attachment>)request.getAttribute("tList");
    int bcate= (int)request.getAttribute("bcate");
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<style>
	footer,section,.inputtext,nav{display:block;}	
	a{text-decoration:none;	color:black;}
	body{line-height: 1; font-family: 'Open Sans', sans-serif;}
	.cardwrap{display:inline-block;margin-left:80px;}
	article{padding: 100px;	margin: 20px;}
	#tag_filter{margin-left:220px;	border:2px solid lightgray;	width:1100px;height:80px;}
	.img{display:inline-block;}
	#menuname{display:fixed;margin-top:100px; }
	.sort{margin-left:1200px;font-size:10px; min-width:300px; min-height:30px;}
	.col{display:inline-block;	border: 3px solid black; padding:1px; margin:1px; }
	#listwrap{margin-left:130px;}
	.sortType{cursor:pointer; }
	#write{margin-left:1500px;margin-top:100px; padding-top: 1000px;cursor:pointer;}
	.text{margin-top:100px;margin-left:650px;}
	h2{text-align:center;}
	.card h-100:hover{cursor:pointer; }
	.col{max-width:"250px"; max-height:"150px"; min-width:"250px"; min-height:"150px"; border-radius: 10px;}
	#error{margin-left:550px;}
	#nomenu{margin-top:10px;margin-left:50px; margin-bottom:35px;}
</style>

<title>Insert title here</title>
</head>
<body>
	<!-- GNB  -->
		<%@ include file="../common/gnb.jsp" %>
	
	
	 <div id="menuname"><h3>&nbsp;&nbsp;RECIPE</h3></div>
    <br>
    		<% if(bList.isEmpty()){ %> 
    				<article class="cardwrap" id="nomenu">	
						<div class="row row-cols-1 row-cols-sm-5" >
							<h2><font color="gray" id="error">등록된 레시피가 없습니다.</font></h2>
						</div>
					</article>
			<%} else{%>

    	<div class="sort">
     		<input type="hidden" name="veguntype" value="<%=bList.get(0).getBoard_cate()%>">
			<span class="sortType"><input type="hidden" name="cate" value="1"> 최신순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="2">좋아요순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="3">댓글순</span>|
			<span class="sortType"><input type="hidden" name="cate" value="4">조회순</span>
		</div>
			
    
   	<script>
		$(function(){
			$('.sortType').click(function(){
					var sortType=$(this).children().eq(0).val();			//최신순이면 1, 좋아요순이면 2 , 댓글순이면 3	
 					var type=$('.sort').children().eq(0).val();
					
 					location.href="<%=request.getContextPath()%>/recipe.sort?sortType=" + sortType + "&type=" + type + "&bcate=" +<%=bcate%>;
			});
		});

	</script>  
    
    
	<article class="cardwrap">
	
	<div class="row row-cols-1 row-cols-sm-5" id="listwrap">
	
  	<% if(bList.isEmpty() && tList.isEmpty()){ %> 
		<h2><font color="gray">등록된 레시피가 없습니다.</font></h2>
	<% } else{ %>
		<% for(int i=0; i < bList.size(); i++){ %>
			<% Board b = bList.get(i); %>
				<% 
					System.out.println("");%>
				<div class="col">
    				<input type="hidden" value="<%=b.getBoard_no() %>">
    					<% for(int j=0; j<tList.size(); j++){ %>
    						<% Attachment a = tList.get(j);%>
    						    
				    			<% if(b.getBoard_no() == a.getBoardNo()){ %>
				    						
    	 							<img src="<%= request.getContextPath()%>/thumnail_uploadFiles/<%=a.getAtcName()%>" width="250px" height="150px">
      							<%} %>
      						<%} %>
      						<%System.out.println(""); %>
      			      <div class="card-body">
       					 <h5><%=b.getBoard_title()%></h5>
       					 <i class="far fa-heart"></i><b><%=b.getBoard_like() %></b>  &nbsp;
       		 				<i class="far fa-comment-dots"></i><b><%=b.getBoard_com() %></b>
      				</div>  	 	   	 
  				</div>
  		<%} %> 
  	<%} %>   
  	



	</div>  
  
  	<script>
		$(function(){
			$('.col').click(function(){
				var bId=$(this).children().eq(0).val();
				location.href="<%=request.getContextPath()%>/detail.recipe?bId=" +bId;
			});
		});
		
	</script>
  				
  				
  				
 			
  				
  	<%} %>					
		
	</article>	
		
		<!-- 글쓰기 버튼 -->
  	 <%if(loginUser == null){ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="alert('로그인 후 이용가능합니다.')"></span>	
	<%} else{ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="location.href='<%=request.getContextPath()%>/write'"></span>	
	<%} %>    
	
 	
		
	
		
	<div class="text">
 		<form  id="select" action="<%=request.getContextPath() %>/search.re" method="post">
 			<%-- <input type="hidden" value="<%=bList.get(0).getBoard_cate()%>" name="type"> --%>
 			<input type="hidden" value="<%=bcate%>" name="type">
 			<input type="text" class="search" maxlength="100" size="50" name="search"> 
 			<input type="submit" value="검색" id="search">
 		</form>
 	</div>

	
	
	
	
	<!-- Footer  -->
	<%@ include file="../common/footer.jsp" %>
	
	
</body>
</html>