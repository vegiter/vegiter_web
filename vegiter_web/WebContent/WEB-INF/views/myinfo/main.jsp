<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="login.model.vo.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#zeroArea {
	display: block;
	height: 70px;
}
	.name {
		
		text-align: center;
		font-size: 4.5rem;
		font-weight: bold;
	}
	.title {
		text-align: center;
		font-size: 2.0rem;
		font-weight: 400;
		margin-top: 60px
	}
	.subtitle{
		text-align: center;
		font-size: 0.8rem;
		font-weight: 300;
	}
	
	.price {
		text-align: center;
		margin-top: 50px;	
		font-size: 16px;
   		height: 100%;
    	outline: none;
    	padding-inline-end: 40px;
    	padding-inline-start: 52px;
	}
	.check {
		color: #007bff;
		inquiryBtn: transparent;
		background-imge: none;
		border-color: #007bff;
	}
	.inquiryBtn{
		margin-top: 80px;
		color: #21303A;
	}
	.logout{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
	.list{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
	.book{
		background-color: #21403A;
		width: 180px;
		height: 50px;
		color: white;
		font-weight: bold;
		font-size: 1.25rem;
		border-radius: 16px;
	}
</style>
</head>
<body>
<%@ include file="../common/gnb.jsp" %>

	<div id="zeroArea"></div>
		<section id="login">
		<div class="main">
			<div class="name">
			My Page
			</div>		
			<div class="title">
			회원 정보 수정
			</div>
			<br><br><br>
			<div class="subtitle">
				<label><%= loginUser.getMemName() %>님의 회원정보를 안전하게 보호하기 위해<br><br>
				비밀번호를 한번 더 확인해 주세요.</label>
			</div>	
			
		</div>
		
		<form id="register-form">
		<div class="price" align="center">
<%-- 				<input type=text id=userId value=<%= loginUser.getMemId() %> name="userId"> --%>
				<input class="pwd" type="password" name="userPwd" id="userPwd" placeholder="PASS WORD">
				<button class="check" id="check">CHECK</button>
		</div>
		</form>
		
		<div class="inquiryBtn" align="center">
			<button class="logout" onclick="location.href='<%= request.getContextPath() %>/logout.me'">로그아웃</button>
			<!-- <button class="book">레시피 북마크</button> -->
		</div>
	<script>
<%--		var PwdCheck = false;--%>
		
		function logout(){
			location.href='<%= request.getContextPath() %>/logout.me';
		}
		
 		$(document).ready(function() {
			$("#check").click(function() {
				var form_data = {
						userId: $("#userId").val(),
						userPwd: $("#userPwd").val()
					};
			     $.ajax({
			    	 url:'/vegiter_web/checkPwd.me', //request 보낼 서버의 경로
			         type:'get', // 메소드(get, post, put 등)
			    	 data: form_data, //보낼 데이터
			    	 success: function(response) {
			    		 console.log(response);
			    		 if(response == 'success') {
			    			 alert("로그인 성공");
			    			 location.href='<%= request.getContextPath() %>/myPage.me'; 
			    		 }
			    		 else {
			    			 alert("로그인 실패");
			    		 }
			    	 }
			    });
			    return false;
			 });
		});
 		
/*  		function checklication(){
 			var sendObject = {
 					userPwd : $("#userPwd").val()
 			}
 		$.ajax({
 			contentType: "application/json; charset=utf-8",
 			type: "post",
 			url:'/vegiter_web/checkPwd.me',
 			data: JSON.stringfy(sendObject),
 			success: function(result){
 				if (result.userPwd == false){
 					$("#userPwd").html(result.userPwd + "비밀번호가 틀렸습니다.");
 				} else {
 					$("#userPwd")
 				}
 			},
 			error: function(){
 				alert("failed to communicate");
 			}
 		});
 	} */
 </script>	
 <script>

		
			</script>				

<%-- var aaa = '<%=request.getContextPath()%>/checkPwd.me'; --%>
<%-- alert(<%=request.getContextPath()%>/checkPwd.me); --%>
<%-- console.log(<%= request.getContextPath() %>/logout.me); --%>

<%--$.ajax({
	contentType: "application/json; charset=utf-8",
	type: "post",
    url:'/vegiter_web/checkPwd.me', //request 보낼 서버의 경로
//     type:'get', // 메소드(get, post, put 등)
    data: JSON.stringify(sendObject),//보낼 데이터
    success: function(result) {
		if (result.myPage == false){
			$("#myPage").html(result.userPwd + "틀렸습니다");
		} else {
			$("#myPage").html(result.userPwd + "ㅎㅇ"));
		}
		
/*		if (result.idResult == false){
//			$("#idResult");
			$("#idResult").html(result.userPwd + "은(는) 사용 불가능합니다.");
		} else {
//			$("#idResult");
			$("#idResult").html(result.userPwd + "은(는) 사용 가능합니다.");
		}     */
	},
    	alert("???");
        //서버로부터 정상적으로 응답이 왔을 때 실행
    },
    error: function(err) {
        //서버로부터 응답이 정상적으로 처리되지 못햇을 때 실행
        alert("비밀번호가 틀립니다.");
    }
    
});
--%>



<!-- // 출처: https://dororongju.tistory.com/96 [웹 개발 메모장]
// 	 	$.ajax({
//             url: "/vegiter_web/checkPwd.me",
//             data : {userPwd : userPwd},
//             success : function(data) {
				
//                   if (data == 'success') {
//                         PwdCheck = true;
//                         alert("data" + data);
//                   } else {
//                         PwdCheck = false;
//                         alert('비밀번호가 틀렸습니다.');
                        
//                   }
//             }

//        	}); 
// 		return false;  -->
		
			
			
			
		
	</script>
<%@ include file="../common/footer.jsp" %>
</body>
</html>