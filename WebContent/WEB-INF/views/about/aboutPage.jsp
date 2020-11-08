<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<title>About</title>
=======
<title>Insert title here</title>
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
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
<<<<<<< HEAD
<!-- 구글 그래프 api -->
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
=======
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
<!-- 폰트   -->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@900&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap"
	rel="stylesheet">
<<<<<<< HEAD
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap"
	rel="stylesheet">
=======
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
<style>
#zeroArea {
	display: block;
	height: 70px;
}

#title {
	margin: 20px;
	font-family: 'Noto Sans JP', sans-serif;
	font-size: 34px;
}

#main_div1 {
<<<<<<< HEAD
	width: 90%;
	margin: 10px auto;
=======
	/*  		border: 1px solid lightgray;  */
	margin-top: 50px;
	width: 85%;
	margin: 50px auto;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
}

.sub_title {
	font-family: 'Noto Sans KR', sans-serif;
	margin: 20px;
}

.about {
	border: 1px solid lightgray;
}

h3, h2 {
	font-weight: bold;
	margin: 20px;
}

p {
	margin: 20px;
}

#about_arti_1 {
	display: block;
<<<<<<< HEAD
	width: 70%;
=======
	width: 80%;
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	margin: 30px auto;
}

#about_arti_2 {
	display: block;
	width: 70%;
	margin: 30px auto;
}

#about_arti_3 {
	display: block;
	width: 70%;
	margin: 30px auto;
	margin-top: -10px;
}
<<<<<<< HEAD

#about_arti_4 {
	display: block;
	width: 70%;
	margin: 30px auto;
	margin-top: -10px;
}

body {
	line-height: 1.4 !important;	<!--!important  가장 우선임-->
	font-family: 'Open Sans', sans-serif;
}
</style>

=======
</style>
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
</head>
<body>
	<%@ include file="../common/gnb.jsp"%>

<<<<<<< HEAD
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
	<div id="zeroArea"></div>

	<section>
		<article>
			<div id="main_div1">
<<<<<<< HEAD
=======
				<div id="title_div">
					<h3 id="title">Vegiter</h3>
				</div>
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
				<br>

				<div id="about_div1" class="about">
					<h3 class="sub_title">소개</h3>


					<article class="arti" id="arti_1">
						<img
<<<<<<< HEAD
							src="<%=request.getContextPath()%>/images/about/about_arti1.jpg"
=======
							src="<%= request.getContextPath() %>/images/about/about_arti1.jpg"
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
							id="about_arti_1">
					</article>

					<div id="sub_div1">
						<p class="text-justify">Vegiter는 건강한 채식에 관한 홍보 및 정보제공을 위해 만들어
							졌습니다. 1970년대 이래로 세계적으로 영양과잉과 이로인하여 심혈관질환, 당뇨, 암, 비만 등 다양한 만성질환의
							수가 증가하고 있습니다. 뿐만 아니라 세계적인 노령화는 건강한 노후에 대한 화두를 던지고 있습니다. 영양과잉으로 인한
							만성질환의 증가와 노령화라는 두가지 주제는 의료비의 상승과 국가재정에 대한 위협의 결과를 낳고, 이것은 다시
							국민복지에 대한 부담으로 작용하게 되었습니다. 보다 생산적이고 미래지향적이며 공동체의 행복을 위해 구성된 국가기반의
							복지정책들이 의료비로 인하여 소모적으로 변질되고 있는것입니다. 이러한 시점에서 근본원인인 건강한 먹거리에 대한
							과학적인 연구가 세계적으로 진행되고 있습니다. 본 Vegiter는 건강한 채식중심의 식생활에 대한 과학적인 정보를
							일반시민들에게 제공함으로써 보다 건강하고 미래지향적이며 행복한 미래건설에 일익을 담당하고자 하는 목적을 가지고
							있습니다.</p>
					</div>
				</div>
				<br> <br>

				<div id="about_div2" class="about">
					<h3 class="sub_title">비건이란?</h3>

					<div id="sub_div1">
						<p>채식 혹은 채식주의 하면 무엇이 생각나나요? 고기를 먹지 않고 채소나 과일 같은 식물성 음식만 먹는
							것이라고 생각하고 있나요? 사실 채식에는 여러 종류가 있답니다. 채소만 먹는 채식부터 달걀이나 우유는 먹거나,
							생선이나 닭고기까지는 먹는 채식도 있지요. 고기는 NO! 채식주의 그렇다면 채식을 하는 사람들은 맛있는 고기를 도대체
							왜 안 먹는 걸까요? 이유는 사람마다 다르지만 건강을 위해서인 경우도 있고, 동물과 환경을 보호하기 위해서인 경우도
							있어요. 스님처럼 종교적인 이유로 채식을 하는 경우도 있지요. 제레미 리프킨의 《육식의 종말》이라는 책을 보면,
							인간의 육식을 위해 키워지는 전세계 12억 8000마리의 소들이 전세계 토지의 24퍼센트를 차지하고 있으며, 미국의
							경우 곡물의 70퍼센트를 가축이 먹어치운다고 해요. 반대로 리어 키스의 책 《채식의 배신》을 보면, 채식의 의도는
							좋지만 건강을 위해 혹은 환경 오염의 해결책으로 채식을 하는 것은 잘못된 것이라며 채식보다 더 나은 대안을 찾을 수
							있다고 하지요. 육식이냐 채식이냐 잡식이냐는 누구도 강요할 수 없는 것이며 무엇을 먹을지는 자신이 결정하는 거예요.
							하지만 무엇을 먹을 것인가 생각하며, 건강과 환경을 한 번 더 생각해 보는 것은 의미 있는 일이겠지요?</p>
					</div>

					<h4 class="sub_title">비건의 시대, 마이너에서 메이저로 ! 비거니즘</h4>
					<article class="arti" id="arti_1">
						<img
<<<<<<< HEAD
							src="<%=request.getContextPath()%>/images/about/about_arti2.png"
=======
							src="<%= request.getContextPath() %>/images/about/about_arti2.png"
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
							id="about_arti_2">
					</article>
					<br>
					<div id="sub_div1">
						<p>
							인간과 지구가 생존하기 위한 필수불가결한 선택인지도 모른다. 식품을 넘어 패션, 화장품 등으로 빠르게 번져나가는
							비건('Vegan')의 바람은 올해 소비 트랜드를 뒤흔드는 강력한 키워드로 떠올랐다. 육식을 거부하고 동물의 가죽으로
							만든 옷을 입지 않으며, 안정성을 빌미로 동물 실험을 자행한 화장품에 대해 불매에 나선 비건! 그들의 목소리는 더
							이상 외곽에서 울리던 아싸(아웃사이더)가 아니다. <br> <br> '채밍아웃'이란 단어를
							들어봤는가? 채식을 지향하는 것을 커밍아웃 했다 라는 뜻에서 비롯한 신조어이다. 대중적이지 못한 소수의 고백이란
							의미가 담겨있다<br> 하지만 '채식주의가 유별나다'라고 생각했던 시정도 사라지고 있다 <br>
						</p>
					</div>
				</div>
				<br> <br>

				<div id="about_div3" class="about">
					<h3 class="sub_title">채식의 단계</h3>

					<article class="arti" id="arti_1">
						<img
<<<<<<< HEAD
							src="<%=request.getContextPath()%>/images/about/about_arti3.png"
=======
							src="<%= request.getContextPath() %>/images/about/about_arti3.png"
>>>>>>> parent of 1d9bf72... 불필요한 파일 제거
							id="about_arti_3">
					</article>
				</div>
			</div>
		</article>
	</section>
<<<<<<< HEAD
	<div id="about_div4" class="about"
		style="width: 90%; height: 600px; text-align: center; margin: 30px auto; margin-top: 40px;">
		<h3>비건 성향 설문조사</h3>
		<br> <br>
		<div class="container" id="research-form">
			<div class="row">
				<div class="col-4">
					<div class="list-group" id="list-tab" role="tablist">
						<a class="list-group-item list-group-item-action active"
							id="research-list-1" data-toggle="list" href="#list-1" role="tab"
							aria-controls="home">비건</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-2" data-toggle="list" href="#list-2" role="tab"
							aria-controls="profile">락토 베지터리언</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-3" data-toggle="list" href="#list-3" role="tab"
							aria-controls="messages">오보 베지터리언</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-4" data-toggle="list" href="#list-4" role="tab"
							aria-controls="settings">락토 오보 베지터리언</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-5" data-toggle="list" href="#list-5" role="tab"
							aria-controls="settings">페스코 베지터리언</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-6" data-toggle="list" href="#list-6" role="tab"
							aria-controls="settings">폴로 베지터리언</a> <a
							class="list-group-item list-group-item-action"
							id="research-list-7" data-toggle="list" href="#list-7" role="tab"
							aria-controls="settings">플렉시터리언</a>
					</div>
				</div>
				<div class="col-8">
					<div class="tab-content text-center" id="nav-tabContent">
						<div class="tab-pane fade show active" id="list-1"
							style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/비건.png">
						</div>
						<div class="tab-pane fade" id="list-2" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/락토.png">
						</div>
						<div class="tab-pane fade" id="list-3" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/오보.png">
						</div>
						<div class="tab-pane fade" id="list-4" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/락토 오보.png">
						</div>
						<div class="tab-pane fade" id="list-5" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/페스코.png">
						</div>
						<div class="tab-pane fade" id="list-6" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/폴로.png">
						</div>
						<div class="tab-pane fade" id="list-7" style="padding-top: 50px;">
							<img src="<%=request.getContextPath()%>/images/about/플렉.png">
						</div>
					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					<button class="btn btn-outline-info btn-block" id="btn-research-1">3D
						그래프 결과보기</button>
				</div>
				<div class="col-6">
					<button class="btn btn-outline-info btn-block" id="btn-research-2">막대
						그래프 결과보기</button>
				</div>
			</div>
		</div>

		<div id="research-chart-1"
			style="width: 700px; height: 450px; margin: auto;"></div>
		<div id="research-chart-2"
			style="width: 700px; height: 450px; margin: auto;"></div>
	</div>


	<script>	
	// 3d 그래프 결과 버튼
	$('#btn-research-1').on('click', function(e){
		$('div#research-chart-1').show();
	}); 
	
	// 막대 그래프 결과 버튼
	$('#btn-research-2').on('click', function(e){
		$('div#research-chart-2').show();
	});


	// 온 로드
	$(()=>{
		$('div#research-chart-1').hide();			// 처음 페이지 로드 될 때 차트 숨김
		$('div#research-chart-2').hide();
		var selected = 1;
		var resultList;	
		google.charts.load('current', {'packages':['corechart']});		// 3d 원형 그래프
		google.charts.load('current', {'packages':['bar']});			// 막대 그래프
		
		// id 추출해서 선택한 값 대입 
		$('#list-tab > a').click((e)=>{
			var $obj = $(e.target);
			var no = $obj.prop("id").split('-')[2];
			selected = no;
			console.log(selected);
		});
		
		
	// 버튼 클릭 시 3d 그래프 그리기	
	$('#btn-research-1').click(()=>{
	
		$.ajax({
			url:"<%=request.getContextPath()%>/research",
			type: "get",
			data: {selected:selected},
			dataType: "json",
			success: data => {
				$('#research-form').hide();
				google.charts.setOnLoadCallback(drawChart(data));

			},
			error: (jqxhr, textStatus, errorThrown)=>{
				console.log(jqxhr, textStatus, errorThrown);
			}
		});
	
	});
	
	// 버튼 클릭 시 3d 그래프 그리기	
	$('#btn-research-2').click(()=>{
	
		$.ajax({
			url:"<%=request.getContextPath()%>/research",
			type: "get",
			data: {selected:selected},
			dataType: "json",
			success: data => {
				$('#research-form').hide();
				google.charts.setOnLoadCallback(drawStuff(data));

			},
			error: (jqxhr, textStatus, errorThrown)=>{
				console.log(jqxhr, textStatus, errorThrown);
			}
		});
	
	});

	function drawChart(list) {

		console.log(list[0].cnt);

		var data = google.visualization.arrayToDataTable([
			['Title', 'Title'],
			['비건', list[0].cnt],
			['락토', list[1].cnt],
			['오보', list[2].cnt],
			['락토 오보', list[3].cnt],
			['페스코', list[4].cnt],
			['폴로', list[5].cnt],
			['플렉', list[6].cnt]
		]);

		var options = {
			title: '',
			is3D: true
		};

		var chart = new google.visualization.PieChart(document.getElementById('research-chart-1'));

		chart.draw(data, options);
	}
	
	function drawStuff(list) {

		console.log(list[0].cnt);

		var data = new google.visualization.arrayToDataTable([
			['', ''],
			['비건', list[0].cnt],
			['락토', list[1].cnt],
			['오보', list[2].cnt],
			['락토 오보', list[3].cnt],
			['페스코', list[4].cnt],
			['폴로', list[5].cnt],
			['플렉', list[6].cnt]
		]);

		var options = {
		          legend: { position: 'top'},
		          bar: { groupWidth: "80%" }
		        };

		var chart = new google.charts.Bar(document.getElementById('research-chart-2'));
        chart.draw(data, options);
	}
});
	
</script>
=======

>>>>>>> parent of 1d9bf72... 불필요한 파일 제거

	<%@ include file="../common/footer.jsp"%>
</body>
</html>