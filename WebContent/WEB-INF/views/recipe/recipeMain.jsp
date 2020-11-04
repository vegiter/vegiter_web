<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
	.name{
		color:#0D6948;		
	}
	.card:hover{
		cursor:pointer;
	}
	.card-group{margin-top:120px;}
	.card-text{font-weight:bolder}
</style>
</head>
<body>
	
		
		

<div class="card-group">
  <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +1">			<!--RecipeListTypeServlet -->
    <img src="<%= request.getContextPath() %>/images/recipe/비건이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">비건</b></h5>
      <p class="card-text"> 비건 상태는 윤리적, 도덕적인 이유로 동물성 원료를 거부하는 상태입니다. 이는 음식뿐 아니라 생활 전반에 거쳐서 동물성 원료를 거부하는 사람을 뜻합니다.</p>
      
    </div>
  </div>
  <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +2">
    <img src="<%= request.getContextPath() %>/images/recipe/락토이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">락토 베지테리언</b></h5>
      <p class="card-text">락토 베지테리언은 동물성 원료 중 우유까지는 섭취하는 상태입니다</p>
    </div>
  </div>
  <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +3">
    <img src="<%= request.getContextPath() %>/images/recipe/오보이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">오보 베지테리언</b></h5>
      <p class="card-text">오보 베지테리언은 동물성 원료 중 달걀까지 섭취하는 상태입니다.</p>
    </div>
  </div>
    <div class="card"  onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +4">
    <img src="<%= request.getContextPath() %>/images/recipe/락토오보이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">락토 오보 베지테리언</b></h5>
      <p class="card-text">락토-오보 베지테리언은 이름에서도 알 수 있듯이 우유와 달걀 둘 다 섭취하는 비건 지향을 말합니다.</p>
    </div>
  </div>
    <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +5">
    <img src="<%= request.getContextPath() %>/images/recipe/페스코이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">페스코 베지테리언</b></h5>
      <p class="card-text"> 페스코 베지테리언은 땅 위에서 사는 동물들 즉, 소, 닭, 돼지, 오리 등의 동물을 섭취하지 않지만 바다에서 사는 해산물은 섭취하는 비건 지향이라고 할 수 있습니다.</p>
    </div>
  </div>
    <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +6">
    <img src="<%= request.getContextPath() %>/images/recipe/폴로이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">폴로 베지테리언</b></h5>
      <p class="card-text">플렉시테리언은 기본적으로 채식주의를 지향하지만 사정상, 혹은 자기 나름대로의 허용된 기준 안에서 육류(적색육)를 먹는 경우다. 그냥 골고루 먹는 것과 다른 점은, '채식이 기본'이라는 의식의 차이. 보통 채식주의에 입문할 때 가장 먼저 들어서는 단계로 분류한다.</p>
    </div>
  </div>
     <div class="card"	 onclick="location.href='<%=request.getContextPath()%>/recipe.cate?bcate=' +7">
    <img src="<%= request.getContextPath() %>/images/recipe/플렉이미지.PNG" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title"><b class="name">플렉시테리언</b></h5>
      <p class="card-text">플렉시 테리언으 기본적으로 동물성 원료를 피하는 비건이지만 어쩔 수 없는 사정으로 육류를 섭취하는 비건 지향입니다.</p>
    </div>
  </div>
</div>
		
		<script>
			
		
		
		</script>
		
		
		
		
		<%@ include file="../common/gnb.jsp" %>
		
		
		
		<%@ include file="../common/footer.jsp" %>
		

</body>
</html>