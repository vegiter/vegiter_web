<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성</title>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<style>
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}
	body{line-height: 1; font-family: 'Open Sans', sans-serif;}
	ol, ul{list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after,
	q:before, q:after {content: ''; content: none;}
	table{border-collapse: collapse; border-spacing: 0;}
	button{outline: none; background-color: white;border-style: none;}
	textarea{outline: none;padding: 1rem;border-style: none;}
	.wrapper{width: 600px;min-width: 600px;margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}
	.write-type {margin: 20px 0; font-size: 14px; color: #ACB5BD; font-weight: bold;}
	.write-type button{margin-right: 2px; color: #ACB5BD; font-size: 14px; cursor: pointer;}
	.write-type button:hover{background-color: #F0F3F5; border-radius: 5px;}
	.write-type button:nth-child(1){color: #41A693;font-weight: bold;}
	
	#uploadImg{width: 500px; height: 450px; line-height: 450px; overflow: hidden; background-color: #F0F3F5; margin: 0 auto; text-align: center;}
	#uploadLabel{font-size: 50px; padding: 30px 40px;}
	#uploadLabel>i{color: #858E96;}
	#post-img{width: 100%; height: 100%;}
	#boardContent {width: 570px; min-height: 200px; margin: 20px 0; padding: 15px; line-height: 1.5;resize: none;}

	#write-submit-btn{width: 600px; color: #41A693; background-color: #F2F2F2; max-height: 70%;}
	#write-submit-btn:hover{color: white;background-color: #41A693;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
<body>
	<%@ include file="../common/gnb.jsp" %>
	<div class="wrapper">
		<div class="write-type">
			게시글 타입 선택: 
			<button type="button" id="type-one">#도란도란</button>
			<button type="button" id="type-two">#식단</button>
		</div>
		
		<form class="write" method="post" encType="multipart/form-data" action="<%= request.getContextPath() %>/insertTalk">
			<input type="hidden" name="boardCode" id="boardCode" value="1">
			
			<div class="write-img" id="uploadImg">
				<label id="uploadLabel" style=""><i class="far fa-file-image"></i></label>
				<input type="file" accept="image/*" id="imgFile" name="imgFile" onchange="readURL(this);" style="display:none;">
				<img src="" id="post-img">
			</div>
			
			<textarea name="boardContent" id="boardContent" rows="10" placeholder="게시글을 입력하세요."></textarea>
	
			<button type="submit" name="submitBtn" id="write-submit-btn">등록</button>
		</form>
	</div>
	
	<script>
		$(function(){
			$('#type-two').click(function(){
				$('body').load("writeDiet");
			});
		});
		
		$(function(){
			$('#uploadImg').click(function(){
				$('#imgFile')[0].click();
				//form에 감싸여 버튼 클릭 시 event bubbling으로 인해 제출 이벤트가 반복되는 오류가 있음
				//[0] 혹은 get(0)을 추가하여 클릭 이벤트가 무한 동작하는 것을 방지
				//혹은 on 메소드 사용 ex: on('click', function(e){e.stopPropagation(); 필요한 코드 작성...})
			});
		});
		
		function readURL(input) {
	        if (input.files && input.files[0]) {
	        	$('#uploadLabel').css('display', 'none');
	            var reader = new FileReader();
	            reader.onload = function (e) {
	                $('#post-img').attr('src', e.target.result);
	            }
	            reader.readAsDataURL(input.files[0]);
	        }
	    }
	</script>
</body>
</html>