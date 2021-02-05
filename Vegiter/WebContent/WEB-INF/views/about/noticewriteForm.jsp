<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>공지사항</title>
<style>
	article{margin-top:30px;}
	.cardwrap{display:inline-block;}	
	form{padding: 50px;margin-left: 100px;margin-right: 100px;}
	
	.form-control{display:inline-block;resize: none; }
	
	#titleImgArea{
		margin-left:400px;
	}
	section{
		height: 750px;
	}
</style>
</head>
<body>
	<%@ include file="../common/gnb.jsp" %>
	<section>
	  <article class="writeform">	
  		<form action="<%=request.getContextPath()%>/insert.notice" onsubmit="return writeNotice();" method="post"  encType="multipart/form-data">		
  			<div class="insertArea">
 				<div class="input-group input-group-sm mb-3">
 			 		<div class="input-group-prepend">
 			   			<span class="input-group-text" id="inputGroup-sizing-sm">title</span>
 					</div>
 					<input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" name="title" id="input-title">
				</div>
				<br><br><br>
 				<div class="row no-gutters">
    				<div class="col-md-8">
    					<div class="card-body">
    		  				<textarea class="form-control" name="content" id="input-content" aria-label="With textarea" cols="500" rows="9"></textarea>
      					</div>
     				 </div>
  				</div>
			</div>
			<div class="btnArea">	
  				<input class="btn btn-success" type="submit" value="Submit" >
  			</div>
		</form>
		<script>
			function writeNotice(){
				var title = $('#input-title').val();
				var content = $('#input-content').val();
				if(title.length <= 0){
					alert('제목을 입력해주세요');
					return false;
				}else if(content.length <= 0){
					alert('내용을 입력해주세요.');
					return false;
				}
				return true;
			}
		</script>
		</article>			
	</section>
	<%@ include file="../common/footer.jsp" %>
</body>
</html>