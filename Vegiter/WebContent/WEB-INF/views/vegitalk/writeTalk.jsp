<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성</title>
<style>
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}
	body{line-height: 1;}
	ol, ul{list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after,
	q:before, q:after {content: ''; content: none;}
	table{border-collapse: collapse; border-spacing: 0;}
	button{outline: none; background-color: white;border-style: none;}
	textarea{outline: none;padding: 1rem;border-style: none;}
	.wrapper{width: 600px;min-width: 600px;margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}
	.write-type {margin: 10px 0; font-size: 14px; color: #ACB5BD;}
	.write-type button{margin-right: 2px; color: #ACB5BD; font-size: 14px; cursor: pointer;}
	.write-type button:hover{background-color: #F0F3F5; border-radius: 5px;}
	.write-type button:nth-child(1){color: #41A693;font-weight: bold;}
	
	.write-img{width: 600px; height: 550px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}
	.write-img-btn{padding: 50px; border: 2px dotted #858E96; border-radius: 20px; color: #858E96;}
	#post-img{width: 100%; height: auto;}
	#wirte-area {width: 570px; min-height: 200px; margin: 20px 0; padding: 15px; line-height: 1.5;resize: none;}

	#write-submit-btn{width: 600px;line-height: 3;color: #41A693;background-color: #F2F2F2;}
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
			<button type="button" id="type-two" onclick="writeDiet();">#식단</button>
		</div>
	<form class="write" action="<%= request.getContextPath() %>/insert.do" method="post">
		<div class="write-img">
			<label class="write-img-btn" for="imgFile">이미지 추가하기</label>
			<input type="file" id="imgFile" accept="image/*" style="display: none;">
			<!-- <img src="img.png" id="post-img"> -->
		</div>
		
		<textarea name="write" id="wirte-area" rows="10" placeholder="게시글을 입력하세요."></textarea>

		<button type="submit" name="submitBtn" id="write-submit-btn" onclick="location.href='<%= request.getContextPath() %>/updateTalk'">등록</button>
	</form>
</div>
<script>
	function writeDiet(){
		$('body').load("writeDiet");
	}
</script>
</body>
</html>