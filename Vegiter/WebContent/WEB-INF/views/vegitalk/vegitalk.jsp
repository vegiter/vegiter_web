<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegitalk</title>
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
	textarea{outline: none; padding: 1rem;border-style: none;}
	input:focus{outline: none;}
	.wrapper{width: 80%; min-width: 600px; max-width: 1300px; margin: auto; margin-top: 150px; margin-bottom: 40px; overflow: hidden;}
	.option{padding: 10px; display: flex; justify-content: space-between; margin: 10px 0; align-items: center;}
	.opt-type{width: 270px;}
	.option span{margin-right: 10px; color: #ACB5BD; cursor:pointer;font-size: 14px;}
	.option span:hover{color: #41A693; font-weight: bold;}
	.opt-type-filter{margin-bottom: 8px;line-height: 2rem;}
	.opt-search{border-bottom: 1px solid #ACB5BD; padding: 5px 5px 5px 0;}
	.opt-search input{border-style: none; padding-left: 8px; width: 170px; color: #485056; font-size: 16px;}
	button, button i{text-align:center; width: 30px; height: 20px; outline: none; color: #ACB5BD;}
	button, button i:hover{cursor:pointer; color: #41A693;}

	.board {display: flex; flex-wrap: wrap; justify-content: space-around;}
	.board li {padding: 10px;}

	.board-list-img{width: 400px; height: 380px; text-align: center; background-color: #485056; overflow: hidden;}
	.board-list-img img{width: 100%; height: 100%;}

	.board-list-item{background-color: #DEE2E5; height: 210px; text-align: left;}
	.board-list-item h1{font-size: 24px; padding: 12px; font-weight: bold; color: #21403A;}
	.board-list-item-con{padding: 0 15px; height: 80px; color: #485056;}
	.board-list-item-social{text-align: right; bottom: 0; padding: 1rem; color: #485056;}
	.board-list-item-social span{margin-left: 5px;}

	.paging{padding: 10px; text-align: center; margin: 20px 0;}
	.paging span{display: inline-block; background-color: #DEE2E5; padding: 1rem; margin: 2px; color: #485056;}
	.paging span:hover{cursor: pointer; background-color: #41A693; color: #fff;}
	
	.writeBtn{position: fixed; bottom: 50px; right: 10%;color: #fff; cursor: pointer; border-radius: 50%; background-color: #41A693; width: 50px; height: 50px; display: flex; align-items: center; justify-content: center;}
	.writeBtn i{color: #fff;}
</style>
<script src="https://kit.fontawesome.com/34238d14b4.js" crossorigin="anonymous"></script>
<script>document.write('<script src="http://' + (location.host || 'localhost').split(':')[0] + ':35729/livereload.js?snipver=1"></' + 'script>')</script>
<script src="<%= request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
</head>
<body>

	<%@ include file="../common/gnb.jsp" %>
	
	<div class="wrapper">
		<div class="option">
			<div class="opt-type">
				<span class="opt-type-filter">#All</span>
				<span class="opt-type-filter">#공지/이벤트</span>
				<span class="opt-type-filter">#도란도란</span>
				<span class="opt-type-filter">#식단공유</span>
				<span class="opt-type-sort">↑↓최신순</span>
				<span class="opt-type-sort">↑↓좋아요순</span>
			</div>
			<div class="opt-search">
				<input type="text" name="keyword" class="option-search-input">
				<button class="option-search-Btn"><i class="fas fa-search"></i></button>
			</div>
		</div>
		
		<ul class="board">
		    <li class="board-list" onclick="location.href='detail.go'" style="cursor:pointer;">
		    	<div class="board-list-img">
		        	<img class="board-list-img-con" src="img.png">
		        </div>
		        <div class="board-list-item">
		            <h1 class="board-list-item-id">lovevegi</h1>
		            <p class="board-list-item-con">안녕하세요 반갑습니다 게시글이에요</p>
		            <div class="board-list-item-social">
		                <span><i class="far fa-comment-dots"></i>+100</span>
		                <span><i class="far fa-heart"></i>+100</span>
		            </div>
			    </div>
			</li>
		</ul>

		<div class="paging">
			<span class="paging-item">&lt;</span>
			<span class="paging-item">1</span>
			<span class="paging-item">2</span>
			<span class="paging-item">3</span>
			<span class="paging-item">4</span>
			<span class="paging-item">5</span>
			<span class="paging-item">&gt;</span>
		</div>
		
	</div>
	<div class="writeBtn" onclick="location.href='writePost'"><i class="fas fa-pen"></i></div>
	
	<%@ include file="../common/footer.jsp" %>
	
</body>
</html>