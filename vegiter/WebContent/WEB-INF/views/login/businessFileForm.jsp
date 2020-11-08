<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String memId = (String)request.getAttribute("memId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

/* 내용부분 */
section {
	margin: 12%;
	margin-top: 100px;
	background: rgb(242, 242, 242);
	min-height: 800px;
	border: 1px solid rgb(242, 242, 242);
}

#section-header {
	width: 656px;
	height: 100%;
	margin: auto;
}

.member-header {
	width: 100%;
	display: inline-block;
	height: 50px;
	background: rgb(45, 115, 102);
	font-size: 18px;
	color: white;
}

#business {
	float: right;
	margin-left: -10px;
}

#common {
	background: rgb(65, 166, 147);
}

#common a {
	text-decoration: none;
	color: white;
}

#common h4, #business h4 {
	margin-left: 40px;
	margin-top: 12px;
	font-weight: normal;
	height: 100%;
}

#common h4:hover {
	font-weight: bolder;
}

#common:hover {
	background: rgb(53, 154, 135);
}

.input-header {
	margin: 0;
	height: 40px;
	width: 100%;
	box-shadow: 0px 5px 5px 0px lightgray;
}

.input-header h4 {
	margin: auto;
	margin-left: 10px;
	margin-top: 10px;
}

#input-boxes {
	width: 656px;
	min-height: 500px;
	margin: auto;
	background: white;
}

form h4 {
	display: inline-block;
	min-width: 400px;
	font-size: 15px;
	margin: 10px;
	margin-left: 20%;
}

.file>div>h4 {
	display: inline-block;
	width: 200px;
	margin: auto;
	font-size: 15px;
	margin-top: 10px;
	margin-bottom: 10px;
}

.input-info {
	width: 400px;
	height: 40px;
	padding: 0;
	margin: auto;
}

.error {
	height: 20px;
	width: 400px;
	margin: auto;
	margin-top: 2px;
	font-size: 12px;
}

select {
	width: 400px;
	height: 40px;
	border: 2px solid lightgray;
}

input {
	width: 400px;
	height: 100%;
	border: 2px solid lightgray;
}

input[type="number"]::-webkit-outer-spin-button, input[type="number"]::-webkit-inner-spin-button
	{
	-webkit-appearance: none;
	margin: 0;
}

form p b, b {
	color: red;
}

form p {
	display: inline-block;
	font-size: 12px;
	margin: 0;
	float: right;
}

.file {
	width: 400px;
	margin: auto;
}

#topImg, #menuImg {
	display: inline-block;
	margin-top: 10px;
	min-width: 180px;
	min-height: 200px;
	background: white;
	border: 3px solid lightgray;
}

#div-btn-enroll {
	clear: both;
	width: 450px;
	height: 40px;
	margin: auto;
	margin-top: 30px;
	margin-bottom: 30px;
}

.btn {
	width: 45%;
	height: 100%;
	background: rgb(45, 115, 102);
	color: white;
	border: none;
	font-size: 18px;
}
</style>
</head>
<body>
	<%@include file="../common/gnb.jsp"%>
	<section>
		<div id="section-header">
			<div class="member-header" id="business">
				<h4>사업자 회원</h4>
			</div>
		</div>
		<article>
			<form method="post" id="insertFiles"
				action="<%=request.getContextPath()%>/insert.ow" onsubmit="return saveFiles();"
				encType="multipart/form-data">
				<div id="input-boxes">
					<div class="file">
						<div>
							<input type="hidden" name="memId" value=<%=memId%>>
							<h4>대표이미지</h4>
							<input type="file" onchange="loadImg(this);" name="image"
								accept="image/jpg, image/jpeg, image/png">
							<div id="topImg">
								<img
									src="<%=request.getContextPath()%>/images/common/diagonal.png"
									id="diagonal1">
							</div>
						</div>
						<div>
							<h4>메뉴이미지</h4>
							<input type="file" onchange="loadImg2(this);" name="image"
								accept="image/jpg, image/jpeg, image/png" multiple>
							<div id="menuImg">
								<img
									src="<%=request.getContextPath()%>/images/common/diagonal.png"
									id="diagonal2">
							</div>
						</div>
					</div>
				</div>
				<div id="div-btn-enroll">
					<input type="submit" class="btn" id="enrollBtn" value="저장하기">
					<button class="btn" id="close">닫기</button>
				</div>
			</form>
		</article>
	</section>
	<script>
		var fileCheck = false;
		var closeBtn = false;
		
		console.log("<%=memId%>");
		$('#close').click(function(){
			closeBtn = true;
			location.href="<%=request.getContextPath()%>";
		});
		// 이미지 미리보기
		
		function loadImg(value) {
			if (value.files[0]) {
				var reader = new FileReader();
				fileCheck = true;
				reader.onload = function(e) {
					$('#diagonal1').attr('src', e.target.result).css('width',
							'150px');
				}
				reader.readAsDataURL(value.files[0]);
			}
		}

		function loadImg2(value) {
			if (value.files) {
				$div = $('#menuImg');
				$div.find('img').remove();
				fileCheck = true;

				for (var i = 0; i < value.files.length; i++) {
					var reader = new FileReader();
					reader.onload = function(e) {
						$img = $('<img>');
						$img.attr("src", e.target.result).css('width', '150px');
						$div.append($img);
					}
					reader.readAsDataURL(value.files[i]);
				}
			}
		}
		function saveFiles(){
			if(fileCheck){
				alert('저장되었습니다.');
				return true;
			}else if(closeBtn){
				return false;
			}else{
				alert('사진파일을 올려주세요');
				return false;
			}
			
		}
	</script>
</body>
</html>