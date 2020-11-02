<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.ArrayList, board.model.vo.*" %>
    <%
    ArrayList<Board> bList=(ArrayList<Board>)request.getAttribute("bList");
    ArrayList<Attachment> tList=(ArrayList<Attachment>)request.getAttribute("tList");
    String VeganType=(String)request.getAttribute("VeganType");
    
    
    
/* 	 PageInfo pi =(PageInfo)request.getAttribute("pi");
	
	int listCount =pi.getListCount();
	int currentPage= pi.getCurrentPage();
	int maxPage=pi.getMaxPage();
	int startPage=pi.getStartPage();
	int endPage=pi.getEndPage();  */
    
    
    
    
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<style>
	
	footer,section,.inputtext{
		display:block;
	}	
	
	body{
		line-height: 1; font-family: 'Open Sans', sans-serif;
		}
	
	.cardwrap{
	display:inline-block;
	margin-left:80px;
	
	}
	
	article{
		padding: 100px;
		margin: 20px;
	}

				
	#tag_filter{
		margin-left:220px;
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
	

	
	.sort{
		margin-left:1200px;
		font-size:10px;
	}
	
	.col{
		display:inline-block;
		border: 3px solid black;
		padding:1px;
		margin:1px;
	}
	
	.sortType{
		cursor:pointer;
	}
	
	#write{
		margin-left:1200px;
		margin-top:100px;
		padding-top: 1000px;
		cursor:pointer;		
	}
	
	.text{
		margin-left:600px;
	}
	h2{
		text-align:center;
	}
</style>

<title>Insert title here</title>
</head>
<body>
	<!-- GNB  -->
		<%@ include file="../common/gnb.jsp" %>
	
	
	 <div id="menuname"><h3>&nbsp;&nbsp;RECIPE</h3></div>
  	
 
	
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
    
    
    
    
    <br>
    
    	<div class="sort">
    		<input type="hidden">
			<span class="sortType"><input type="hidden" name="cate" value="1"> 최신순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="2">좋아요순 </span>|
			<span class="sortType"><input type="hidden" name="cate" value="3">댓글순</span>
		</div>
    
    
    <%-- 	<script>
		$(function(){
			$('.sortType').click(function(){
					var sortType=$(this).children().eq(0).val();			//최신순이면 1, 좋아요순이면 2 , 댓글순이면 3
				
					location.href='<%=request.getContextPath()%>/recipe.sort?sortType=' +sortType;   //2에다 만듬
				}					
			});
		});
	</script> --%>
    
    
    
	
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
  

  
  
  
  

		
		<!-- 글쓰기 버튼 -->
 <%-- 	<%if(loginUser == null){ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="alert('로그인 후 이용가능합니다.')"></span>	
	<%} else{ %>
		<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="location.href='<%=request.getContextPath()%>/write'"></span>	
	<%} %>  --%>
	
			<span id="write"><img src="<%=request.getContextPath() %>/images/recipe/write.png" height="50px" width="50px" onclick="location.href='<%=request.getContextPath()%>/write'"></span>	
	
		
	</article>

	
	 <div class="text">
 		<form  id="select" action="<%=request.getContextPath() %>/select.re" method="post">
 			<input type="text" class="search" maxlength="100" size="50"> 
 			<input type="submit" value="검색" id="search">
 		</form>
 	</div>
	
	
	<%-- 	<!-- 페이징 -->
		<div class="pagingArea" align="center">
			
			<!-- 맨 처음으로 -->
			<button onclick="location.href='<%=request.getContextPath()%>/list.bo?currrentPage=1'">&lt;&lt;</button>
			
			<!-- 이전 페이지로 -->
			<button onclick="location.href='<%= request.getContextPath()%>/list.bo?currentPage=<%=currentPage -1%>'"
				id="beforeBtn">&lt;</button>
			
			<!-- currentPage가 1일때는 이전버튼을 비활성화 해야함! -->
			<script>
				if(<%= currentPage%>  <=1){
					var before = $('#beforeBtn');
					before.attr('disabled','true');	
						//attr:값넣기
				}
			</script>
		
		
		<!-- 목록버튼!! 숫자!!! -->
			<% for(int p =startPage; p<=endPage; p++){ %>
				<% if(p == currentPage){ %>
					<button id="choosen" disabled><%=p %></button>
				<% } else { %>
					<button id="numBtn" 
						onclick="location.href='<%=request.getContextPath()%>/list.bo?currentPage=<%=p%>'">
						<%=p %>
					</button>
				<% } %>
			<% } %>

		
			<!-- 다음페이지로 -->
			<button onclick="location.href='<%=request.getContextPath()%>/list.bo?currentPage=<%=currentPage +1 %>'"
				id="afterBtn">&gt;</button>
			
			
			<!-- currentPage가 마지막일때는 다음버튼을 비활성화 해야함! -->
			<script>
				if(<%=currentPage%> >=<%=maxPage%>){
					var after=$('#afterBtn');
					after.attr('disabled','true');
				}
			</script>
			

			<!-- 맨 끝으로 -->
			<button onclick="location.href='<%=request.getContextPath()%>/list.bo?currentPage=<%=maxPage%>'">&gt;&gt;</button>
		</div> --%>

	
	<!-- Footer  -->
	<%@ include file="../common/footer.jsp" %>
	
	
</body>
</html>