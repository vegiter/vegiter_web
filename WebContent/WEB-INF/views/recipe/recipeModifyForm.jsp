<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="board.model.vo.*, java.util.ArrayList" %>
<%
	Board board=(Board)request.getAttribute("board");
	ArrayList<Attachment> atList=(ArrayList<Attachment>)request.getAttribute("fileList");
	Attachment titleImg=atList.get(0);
	ArrayList<Content> conList=(ArrayList<Content>)request.getAttribute("conList");
	Content titleCon=conList.get(0);
	int cate = board.getBoard_cate();
	String[] checkCate = new String[8];
	switch(cate){
	case 1 : checkCate[0] = "selected"; break;
	case 2 : checkCate[1] = "selected"; break;
	case 3 : checkCate[2] = "selected"; break;
	case 4 : checkCate[3] = "selected"; break;
	case 5 : checkCate[4] = "selected"; break;
	case 6 : checkCate[5] = "selected"; break;
	case 7 : checkCate[6] = "selected"; break;
	default : checkCate[7] = "selected"; break;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
	
	footer,section,.inputtext{display:block;}	
	article{margin-top:30px;}
	.cardwrap{display:inline-block;}	
	form{padding: 50px;margin-left: 100px;margin-right: 100px;}
	
	.form-control{display:inline-block;resize: none; }
	
	#titleImgArea{
		margin-left:400px;
	}
	#content1{
		margin-left:380px;
		width:500px; height:auto;
	}

	#tileImgtitle,#contentname{
		margin-left:200px;
		color:gray;
	}
	
	.card-img,.card{
		border:2px dashed darkgray;
	}
	
	.row no-gutters,card-img{
		position:absolute;
	}
	
.select-script{position:relative; width:200px; height:32px; line-height:30px; border:1px solid #606976; border-radius:4px; text-transform:uppercase; background:#fffff; }
.select-script label{position:absolute; width:90%; font-size:.70em; color:#606976; top:0; left:0; padding:0 5%;}
.select-script label:after{content:'▼'; width:40px; height:30px; position:absolute; top:0; right:0; font-size:.70em; color:#fff; text-align:center; background:#606976;}
.select-script select{width:100%; height:40px; opacity:0; filter:alpha(opacity=0); -ms-filter:alpha(opacity=0);}

	
	
	
</style>
<title>Vegiter</title>
</head>
<body>

 	

 
 <section>
 	
  			
	  	
  <article class="writeform">	
  
  <form action="<%=request.getContextPath()%>/insert.recipe" onsubmit="return writeBoard();" method="post"  encType="multipart/form-data">		
  		<div class="insertArea">
 			 <div class="input-group input-group-sm mb-3">
 		 <div class="input-group-prepend">
 			   <span class="input-group-text" id="inputGroup-sizing-sm">title</span>
 		 </div>
 			 <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" name="title" value="<%=board.getBoard_title()%>">
		</div>			
  			
 
<div class="select-box select-script">
    <label for="selectbox">선택해 주세요</label>
    <select id="selectbox" title="선택 구분" name="cate">
        <option value="0" <%= checkCate[7]%>>선택해 주세요</option>
        <option value="1" <%= checkCate[0]%>>비건</option>
        <option value="2" <%= checkCate[1]%>>락토</option>
        <option value="3" <%= checkCate[2]%>>오보</option>
        <option value="4" <%= checkCate[3]%>>락토오보</option>
        <option value="5" <%= checkCate[4]%>>페스코</option>
        <option value="6" <%= checkCate[5]%>>폴로</option>
        <option value="7" <%= checkCate[6]%>>플렉</option>
    </select>
</div>
		

		
		
	<script>
	 $(document).ready(function(){		 
	    var select = $('.select-script select');
	    select.change(function(){
	        var select_name = $(this).children('option:selected').text();
	        $(this).siblings("label").text(select_name);
	    });
	 
	}); 
	</script>
	
	<br>
		<table id="insertThumbTable">			
					<tr>
						<td>
							<div id="titleImgArea">
									<div id="tileImgtitle"><b>THUMBNAIL</b></div>
								<%if(titleImg != null){%>
								<img id="titleImg" class="card" width="500" height="300" src="<%= request.getContextPath()%>/thumnail_uploadFiles/<%=titleImg.getAtcName()%>">	
								
							</div>
							<div class="card-body">
    		  						<textarea class="form-control" name="content" id="content1" aria-label="With textarea" cols="500" rows="9"><%=conList.get(0).getContent()%></textarea>
								</div>
						</td>
					</tr>													
		</table>
		<%for(int i = 1; i < 11; i++){%>
						<div>
 							<br><br><br><div id="contentname"><b>content</b></div><br><br><br>
 							 	 <div class="row no-gutters">
   			 						<div class="col-md-4" id="titleImgArea<%=i-1%>">
   			 <%if(i <= atList.size()){ %>
				<%if(atList.get(i) != null){ %>
								
 							
   			 							<img id="contentImg<%=i%>" class="card-img" width="300" height="300" src="<%= request.getContextPath()%>/thumnail_uploadFiles/<%=atList.get(i).getAtcName()%>">
    								
    			<%}%>
    		<%}else{%>
    									<img id="contentImg<%=i%>" class="card-img" width="300" height="300" >
    		<%} %>	
    								</div>
    							     <div class="col-md-8">
    						 			 <div class="card-body">
    		  								<textarea class="form-control" name="content"  aria-label="With textarea" cols="500" rows="9"><%=conList.get(i).getContent()%></textarea>
      									</div>
     				   	 		  </div>
  							   </div>
 							 </div>
 					 
 		<%} %>	 
 
						
						
						
				<div id="fileArea">
					
					<input type="file" id="thumbnailImg0" multiple="multiple" name="thumbnailImg0" onchange="LoadImg(this,0)">
					<input type="file" id="thumbnailImg1" multiple="multiple" name="thumbnailImg1" onchange="LoadImg(this,1)">
					<input type="file" id="thumbnailImg2" multiple="multiple" name="thumbnailImg2" onchange="LoadImg(this,2)">
					<input type="file" id="thumbnailImg3" multiple="multiple" name="thumbnailImg3" onchange="LoadImg(this,3)">
					<input type="file" id="thumbnailImg4" multiple="multiple" name="thumbnailImg4" onchange="LoadImg(this,4)">
					<input type="file" id="thumbnailImg5" multiple="multiple" name="thumbnailImg5" onchange="LoadImg(this,5)">
					<input type="file" id="thumbnailImg6" multiple="multiple" name="thumbnailImg6" onchange="LoadImg(this,6)">
					<input type="file" id="thumbnailImg7" multiple="multiple" name="thumbnailImg7" onchange="LoadImg(this,7)">
					<input type="file" id="thumbnailImg8" multiple="multiple" name="thumbnailImg8" onchange="LoadImg(this,8)">
					<input type="file" id="thumbnailImg9" multiple="multiple" name="thumbnailImg9" onchange="LoadImg(this,9)">
					<input type="file" id="thumbnailImg10" multiple="multiple" name="thumbnailImg10" onchange="LoadImg(this,10)">
					<input type="file" id="thumbnailImg11" multiple="multiple" name="thumbnailImg11" onchange="LoadImg(this,11)">					
				</div>
						
				<script>
					$(function(){
						$("#fileArea").hide();
						
						$("#titleImgArea").click(function(){
							$("#thumbnailImg0").click();
						});
						
						$("#titleImgArea0").click(function(){
							$("#thumbnailImg1").click();
						});
						$("#titleImgArea1").click(function(){
							$("#thumbnailImg2").click();
						});
						$("#titleImgArea2").click(function(){
							$("#thumbnailImg3").click();
						});
						$("#titleImgArea3").click(function(){
							$("#thumbnailImg4").click();
						});
						$("#titleImgArea4").click(function(){
							$("#thumbnailImg5").click();
						});
						$("#titleImgArea5").click(function(){
							$("#thumbnailImg6").click();
						});
						$("#titleImgArea6").click(function(){
							$("#thumbnailImg7").click();
						});
						$("#titleImgArea7").click(function(){
							$("#thumbnailImg8").click();
						});
						$("#titleImgArea8").click(function(){
							$("#thumbnailImg9").click();
						});
						$("#titleImgArea9").click(function(){
							$("#thumbnailImg10").click();
						})
						$("#titleImgArea10").click(function(){
							$("#thumbnailImg11").click();
						});
						
						
					});
				
					function LoadImg(value,num){
						if(value.files && value.files[0]){
							var reader =new FileReader();
							
							reader.onload=function(e){
								switch(num){
								case 0: 
									$("#titleImg").attr("src", e.target.result);
									break;
								case 1:
									$("#contentImg1").attr("src", e.target.result);
									break;
								case 2: 
									$("#contentImg2").attr("src", e.target.result);
									break;
								case 3:
									$("#contentImg3").attr("src", e.target.result);
									break;
								case 4:
									$("#contentImg4").attr("src", e.target.result);
									break;
								case 5:
									$("#contentImg5").attr("src", e.target.result);
									break;
								case 6:
									$("#contentImg6").attr("src", e.target.result);
									break;
								case 7:
									$("#contentImg7").attr("src", e.target.result);
									break;
								case 8:
									$("#contentImg8").attr("src", e.target.result);
									break;
								case 9:
									$("#contentImg9").attr("src", e.target.result);
									break;
								case 10:
									$("#contentImg10").attr("src", e.target.result);
									break;
								case 11:
									$("#contentImg11").attr("src", e.target.result);
									break;
									
								}
							}
							reader.readAsDataURL(value.files[0]);
						}						
					}
				</script>												
			</div>
		
		<div class="btnArea">	
  			<input class="btn btn-success" type="submit" value="Submit" >
  		</div>
  	
  	</form>
  		<script>
  			function writeBoard(){
  				var a=$("#selectbox").val();
  				if(a==0){
  					alert("카테고리를 선택해주세요");
  					return false;
  				}else{
  					return true;
  				}
  			}
  		</script>
  		
  		
  	</article>		

 </section>
		
		<%@ include file="../common/footer.jsp" %>
 

</body>
</html>