<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.5.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"	crossorigin="anonymous"></script>
<script	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<style>
	footer{
		display : inline-block;
		margin-top: 50px;
		bottom: 0;
		padding-top: 16px;
		width: 100%;
		height: 100px;
		background: #41A693;
		min-width: 500px;
	}
	
	.f_div1 {
		text-align: center;
	}
	
	.f_div1 span{
		font-size: 16px;
		text-align: center;
		color : white;
		padding: 2px;
	}
	
	.f_div1 p{
		font-size: 12px;
		margin: auto;
		color: white;
	}
</style>
</head>
<body>
	<footer>
		<div class="f_div1">
			<a href="#" onclick="aboutPage();"><span>About</span></a>
			<span> | </span>
			<span>Privacy</span>
			<span> | </span>
			<span>Feedback</span>
			<span> | </span>
			<a href="#"><span>Top</span></a>
			<p><a href="https://github.com/vegiter/vegiter_web">채채식 팀 GitHub</a></p>
		</div>
	</footer>
	
	<script>
		function aboutPage(){
		location.href = '<%= request.getContextPath() %>/aboutPage.me';
		}
	</script>
</body>
</html>