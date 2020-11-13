<title>Vegiter</title>
<!-- jquery -->
<script src="js/jquery-3.5.1.min.js"></script>
<!-- 부트스트랩 -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<style>
#zeroArea {
	display: block;
	height: 70px;
}

#main_arti_1 {
	display: block;
	width: 100%;
	margin-top: 1px;
}

.carousel {
	display: block;
	margin-top: 20px;
}

#main_arti_3 {
	clear: both;
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	margin-top: 20px;
	position: relative;
}

.mainDiv {
	margin: auto;
	width: 90%;
}
</style>
</head>
<body>
	<%@ include file="WEB-INF/views/common/gnb.jsp"%>
	<div id="zeroArea"></div>


	<section>
		<div class="mainDiv">
			<article class="arti" id="arti_1">
				<img src="images/main/main_arti_1.png" id="main_arti_1">
			</article>

			<article>
				<div id="carouselExampleIndicators" class="carousel slide"
					data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="images/main/main1.jpg" class="d-block w-100">
						</div>
						<div class="carousel-item">
							<img src="images/main/main2.png" class="d-block w-100">
						</div>
						<div class="carousel-item">
							<img src="images/main/main3.jpg" class="d-block w-100">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleIndicators"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
			</article>

			<article class="arti" id="arti_2">
				<img src="images/main/main_arti_3.png" id="main_arti_3">
			</article>
		</div>
	</section>

	<%@ include file="WEB-INF/views/common/footer.jsp"%>
</body>
</html>