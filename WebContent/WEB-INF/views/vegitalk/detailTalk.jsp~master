<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도란도란</title>
<style>
	html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}
	article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}
	body{line-height: 1;}
	ol, ul{list-style: none;}
	blockquote, q {quotes: none;}
	blockquote:before, blockquote:after, q:before, q:after {content: ''; content: none;}
	table{border-collapse: collapse; border-spacing: 0;}
	button{outline: none; background-color: white;border-style: none;}
	textarea{outline: none;padding: 1rem;border-style: none;}
	.wrapper{width: 600px;min-width: 600px;margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}
	#wirte-area{resize: vertical;}
	.write-my {display: flex;justify-content: flex-end;}
	.write-my button{margin-bottom: 10px;margin-right: 2px;color: #333B3F;font-weight: bold;left: 0;}
	.write-my button:hover{background-color: #F0F3F5;border-radius: 5px;}
	.write-my button:active{background-color: #41A693;color: #FFF;}
	.selected{color: #41A693;font-weight: bold;}
	
	.write-img{width: 600px; height: 550px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}
	.write-img-btn{padding: 50px; border: 2px dotted #858E96; border-radius: 20px; color: #858E96;}
	#post-img{width: 100%; height: auto;}
	
	#wirte-area {width: 570px; min-height: 80px; height: auto; padding: 15px; line-height: 1.5; resize:none;}
	.social{width: 600px;display: flex;justify-content: flex-end;margin: 10px 0;}
	span>i {font-size: 18px;vertical-align: middle;}
	.social>span{padding: 3px;padding-left: 8px;padding-right: 8px;}
	.social>span:nth-child(1):hover{cursor: default;}
	.social>span:nth-child(2):hover{cursor: pointer;background-color: #41A693;color: #fff;border-radius: 15px;}
	.checked{color: #41A693;font-weight: bold;}
	.user{padding: 1rem;color: #333B3F;font-weight: bold;font-size: 19px;display: flex;justify-content: space-between;align-items: center;}
	.user-info{width: 95%;display: flex;justify-content: space-between;}
	#userId{font-size: 22px;}
	.fa-bookmark{font-size: 22px;cursor: pointer;}
	.fa-bookmark:hover{cursor: pointer;color: #41A693;}
	.comment{width: 564px;background-color: #F0F3F5; height: auto;padding: 18px;margin-top: 10px;}
	.comment-list{width: 100%;padding: 0;display: flex;}
	.comment-input{display: flex;justify-content: space-between;margin-top: 20px;vertical-align: middle;}
	#comUserId{width: 20%;font-weight: bold;overflow: hidden;}
	#comContent{width: 65%;}
	#comDate{width: 15%;text-align: right;}
	.comment-input-field{width: 85%;border-style: none;padding: 8px; outline:none;}
	.comment-input-submit{width: 60px;}
	.comment-input-submit:hover{background-color: #41A693;color: #fff;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>
<div class="wrapper">
	<div class="write-my">
		<button id="delete">삭제</button>
		<button id="modify">수정</button>
	</div>

	<div class="write-img">
		<img src="img.png" id="post-img">
	</div>
	
	<div class="user">
		<div class="user-info">
		<span id="userId">아이디</span>
			<span id="date">2020-10-10</span>
		</div>
		<i class="far fa-bookmark"></i>
	</div>
	
	<textarea name="write" id="wirte-area" readonly>안녕하세요, 작성자입니다.</textarea>
	
	<div class="social">
		<span><i class="far fa-comment-dots"></i>
		100+</span>
		<span class="social-item checked"><i class="far fa-heart"></i>
		100+</span>
	</div>

	<div class="comment">
		<ul class="comment-list">
			<li class="comment-list-item" id="comUserId">작성자</li>
			<li class="comment-list-item" id="comContent">댓글이다</li>
			<li class="comment-list-item" id="comDate">2020.10.10</li>
		</ul>
		<div class="comment-input">
			<input type="text" class="comment-input-field" placeholder="댓글을 입력하세요.">
			<button type="submit" class="comment-input-submit">등록</button>
		</div>
	</div>
</div>

</body>
</html>