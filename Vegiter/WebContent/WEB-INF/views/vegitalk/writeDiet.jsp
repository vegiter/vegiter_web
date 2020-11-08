<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식단 작성</title>
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
	.wrapper{width: 600px; min-width: 600px; margin: auto; margin-top: 150px; margin-bottom: 100px; overflow: hidden;}
	.write-type {margin: 10px 0; font-size: 14px; color: #ACB5BD;}
	.write-type button{margin-right: 2px; color: #ACB5BD; font-size: 14px;}
	.write-type button:hover{background-color: #F0F3F5; border-radius: 5px;}
	.write-type button:nth-child(1){color: #ACB5BD; font-weight: normal;}
	.write-type button:nth-child(2){color: #41A693;font-weight: bold;}
	.dietList {margin: 20px 0;width: 100%;text-align: center;border-collapse: collapse;}
	.dietList th, td{padding: 15px 5px; border: 4px solid #fff; background-color:  #F0F3F5;;}
	.dietList th{background-color: #41A693;color: #FFF;}
	.dietList .dietList-input{margin: 0; padding: 0;}
	input{text-align: center; width: 90%;padding: 5px 4px;margin: 5px 0;border-style: none;border-bottom: 1px solid #ACB5BD;outline: none;background-color:  #F0F3F5;}
	input:nth-child(1){color: #333B3F; font-weight: bold; font-size: 18px;}
	input:nth-child(2){font-size: 12px;}
	.listBtn{margin: 18px 0;text-align: center;font-size: 24px;color: #ACB5BD;}
	.listBtn>span:hover{color: #41A693;}
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
			<button id="type-one" onclick="writePost();">#도란도란</button>
			<button id="type-two">#식단</button>
		</div>
	<form class="write" action="<%= request.getContextPath() %>/insertDiet" method="post">
		<input type="hidden" name="boardCode" value="2">
		
		<table class="dietList">
			<tr>
				<th>아침</th>
				<th>점심</th>
				<th>저녁</th>
			</tr>
			<tr name="diet">
				<td>
					<input type="text" name="mFood" val="" placeholder="아침 메뉴 입력">
					<input type="url" name="mUrl" val="" placeholder="레시피 링크 입력">
				</td>
				<td>
					<input type="text" name="lFood" val="" placeholder="점심 메뉴 입력">
					<input type="url" name="lUrl" val="" placeholder="레시피 링크 입력" >
				</td>
				<td>
					<input  type="text" name="eFood" placeholder="저녁 메뉴 입력">
					<input type="url" name="eUrl"placeholder="레시피 링크 입력">
				</td>
			</tr>
		</table>

		<div class="listBtn">
			<span id="addRow"><i class="far fa-plus-square"></i></span>&nbsp;
			<span id="removeRow"><i class="far fa-minus-square"></i></span>
		</div>

		<textarea name="boardContent" id="wirte-area" placeholder="게시글을 작성해주세요."></textarea>
		<button type="submit" name="submitBtn" id="write-submit-btn">등록</button>
	</form>
</div>

<script>
	function writePost(){
		$('body').load("writePost");
		
	}
	
	$(function(){
		$('#addRow').click(function(){
			var trCnt = $('.dietList tr[name="diet"]').length;
			console.log(trCnt);
			if(trCnt > 6) {
				alert('최대 7일까지 작성할 수 있어요.')
			} else {
				var addRow = '<tr name="diet">' +
							 '	<td>' +
							 '		<input type="text" name="mFood" placeholder="아침 메뉴 입력">' +
							 '		<input type="url" name="mUrl" placeholder="레시피 링크 입력">' +
							 '	</td>' +
							 '	<td>' +
							 '		<input type="text" name="lFood" placeholder="점심 메뉴 입력">' +
							 '		<input type="url" name="lUrl" placeholder="레시피 링크 입력">' +
							 '	</td>' +
							 '	<td>' +
							 '		<input  type="text" name="eFood" placeholder="저녁 메뉴 입력">' +
							 '		<input type="url" name="eUrl"placeholder="레시피 링크 입력">' +
							 '	</td>' +
							 '</tr>';
				$('tr[name="diet"]:last').after(addRow);
			}
		});
	});
	
	$(function(){
		$('#removeRow').click(function(){
			var trCnt = $('.dietList tr[name="diet"]').length;
			if(trCnt > 1) {
				$('tr[name="diet"]:last').remove();
			} else {
				alert('하루 이상의 식단을 입력해주세요.');
			}
		});
	});
	
	$(function(){
		$('#write-submit-btn').click(function(){
			var content = $('textarea').val();
			if(content.length == 0) {
				alert('게시글 작성해주세요.');
				return false;
			}
			return true;
		});
	});
</script>
</body>
</html>