<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
   * { 
      box-sizing: border-box;
   }

   /* 내용부분 */
   section{
      margin: 12%;
      margin-top: 100px;
      background: rgb(242, 242, 242);
      min-height: 800px;
      border: 1px solid rgb(242, 242, 242);
   }
   #section-header{
      width: 656px;
      height: 100%;
      margin: auto;
   }
   .member-header{
      width: 50%;
      display: inline-block;
      height: 50px;
      background: rgb(45, 115, 102);
      font-size: 18px;
      color: white;
   }
   #business{
      float: right;
      margin-left: -10px;
   }
   #common{
      background: rgb(65, 166, 147);
   }
   #common a{
      text-decoration: none;
      color: white;
   }
   #common h4, #business h4{
      margin-left: 40px;
      margin-top: 12px;
      font-weight: normal;
      height: 100%;
   }
   #common h4:hover{
      font-weight: bolder;
   }
   #common:hover{
      background: rgb(53, 154, 135);
   }
   
   .input-header{
      margin: 0;
      height: 40px;
      width: 100%;
      box-shadow: 0px 5px 5px 0px lightgray;
   }
   .input-header h4{
      margin: auto;
      margin-left: 10px;
      margin-top: 10px;
   }
   
   
   #input-boxes{
      width: 656px;
      min-height: 800px;
      margin: auto;
      background: white;
   }
   
   form h4{
      display: inline-block;
      min-width: 400px;
      font-size: 15px;
      margin: 10px;
      margin-left:20%;
   }
   .file>div>h4{
      display: inline-block;
      width: 200px;
      margin: auto;
      font-size: 15px;
      margin-top: 10px;
      margin-bottom: 10px;
   }
   .input-info{
      width: 400px;
      height: 40px;      
      padding: 0;
      margin: auto;
   }
   #address{
      width: 310px;
      margin: auto;
      margin-left: 20%;
   }
   #map-btn{
      width: 80px;
      font-size: 12px;
      height: 40px;
      
   }
   #map{
      margin-left: 20%;
   }
   .error{
      height: 20px;
      width: 400px;
      margin: auto;
      margin-top: 2px;
      font-size: 12px;
   }
   select{
      width: 400px;
      height: 40px; 
      border: 2px solid lightgray;
   } 
   input{
      width: 400px;
      height: 100%;
      border: 2px solid lightgray;
   }
   input[type="number"]::-webkit-outer-spin-button,
   input[type="number"]::-webkit-inner-spin-button {
       -webkit-appearance: none;
       margin: 0;
   }
   form p b, b{
      color: red;
   }
   form p{
      display: inline-block;
      font-size: 12px;
      margin: 0;
      float: right;
   }
   .file{
      width: 400px;
      margin: auto;
   }
   #topImg, #menuImg{
      display: inline-block;
      margin-top: 10px;
      min-width: 180px;
      min-height: 200px;
      background: white;
      border: 3px solid lightgray;
   }
   
   #div-btn-enroll{
      clear:both;
      width: 400px;
      height: 40px;
      margin: auto;
      margin-top: 30px;
      margin-bottom: 30px;
   }
   #enrollBtn{
      width: 100%;
      height: 100%;
      background: rgb(45, 115, 102);
      color: white;
      border: none;
      font-size: 18px;
   }
</style>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6dff5015989a59ffc86e086a9b96831c&libraries=services"></script>
</head>
<body>
   <%@include file="../common/gnb.jsp" %>
      <section>
      <div id="section-header">
         <div class="member-header" id="common"><h4><a href="<%=request.getContextPath()%>/enrollForm.me">일반회원</a></h4></div>
         <div class="member-header" id="business"><h4>사업자 회원</h4></div>
      </div>
      
      <article>
         <form method="post" id="insertMember" action="<%=request.getContextPath()%>/insert.me" onsubmit="return enroll();">
            <div id="input-boxes">
               <p><b>*</b>은 필수 입력칸입니다.</p>
               <h4>아이디(6~16자리 영문소문자, 숫자만 사용가능)<b>*</b></h4>
               <div class="input-info"><input type="text" name="userId" id="userId"></div>
               <div class="error"></div>
               <h4>비밀번호(6~16자리 영문소문자, 숫자, 특수문가 사용가능)<b>*</b></h4>
               <div class="input-info"><input type="password" name="userPwd" id="password"></div>
               <div class="error"></div>
               <h4>비밀번호 확인<b>*</b></h4>
               <div class="input-info"><input type="password" name="userPwd2" id="password2"></div>
               <div class="error"></div>
               <input type="hidden" name="code" value="2">
               <h4>사업주<b>*</b></h4>
               <div class="input-info"><input type="text" name="userName" id="userName"></div>
               <div class="error"></div>
               
               <h4>사업자 번호<b>*</b></h4>
               <div class="input-info"><input type="number" name="ownNumber" id="ownNumber" placeholder="-포함"></div>
               <div class="error"></div>
               <h4>이메일<b>*</b></h4>
               <div class="input-info"><input type="email" name="email" id="email"></div>
               <div class="error"></div>
               <h4>업체 전화번호<b>*</b></h4>
               <div class="input-info"><input type="number" name="phone" id="phone"></div>
               <div class="error"></div>
               <h4>업체명<b>*</b></h4>
               <div class="input-info"><input type="text" name="shopName" id="shopName"></div>
               <div class="error"></div>
               
               <h4>업체 주소<b>*</b></h4>
               <input type="text" class="input-info"  name="address" id="address" >
               <input type="button" id="map-btn" onclick="execDaumPostcode()" value="주소 검색"><br>
               <div id="map" style="width:300px;height:300px;margin-top:10px;display:none"></div>
<!--             <div class="input-info"><input type="text" name="address" id="address"></div> -->
               <div class="error"></div>
               
               <h4>상세 주소<b>*</b></h4>
               <div class="input-info"><input type="text" name="detaladdress" id="detailaddress"></div>
               <div class="error"></div>
               <h4>홈페이지</h4>
               <div class="input-info"><input type="url" name="url" id="url"></div>
               <div class="error"></div>
            </div>
            <div id="div-btn-enroll"><input type="submit" id="enrollBtn" value="회원가입"></div>
         </form>
         <script>
            $(function(){
               $('input').focusin(function(){
                  $(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});
               }).focusout(function(){
                  $(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})
               });
            });
            // input error
            var regExp1 = /[a-zA-Z]/; //문자
            var regExp2 = /[0-9]/;   //숫자
            var regExp3 = /\S/; //공백여부
            var regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자
            var regExp5 = /[가-힣]/g; //한글
            
            var idCheck = false;  // pk
            var pwdCheck = false;
            var pwd2Check = false;
            var nameCheck = false;
            var emailCheck = false; //unique
            var ownNumberCheck = false;
            var phoneCheck = false;
            var shopNameCheck = false;
            var addressCheck = false;
            var checked = false; 
            
            $("#userId").on('change paste keyup', function(){
               var idCheck = false;
            });
            $("#password").on('change paste keyup', function(){
               var pwdCheck = false;
            });
            $("#passwor2").on('change paste keyup', function(){
               var pwd2Check = false;
            });
            
            $('#userId').change(function(){
               var inputId = $('#userId').val();
               if(inputId == ""){
                  $('.error').eq(0).text('아이디를 입력해주세요').css('color','red');
               }else if(!regExp1.test(inputId) || !regExp2.test(inputId) || !regExp3.test(inputId) || inputId.length < 6 ){
                  $('.error').eq(0).text('아이디는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
               }else{
                  // 중복 체크!
                  $.ajax({
                     url: '<%= request.getContextPath()%>/checkId.me',
                     data: {userId: inputId},
                     success: function(data){
                        console.log(data);
                        
                        if(data == 'success'){
                           $('.error').eq(0).text('사용가능한 아이디입니다.').css('color','green');
                           idCheck = true;
                        }else{
                           $('.error').eq(0).text('중복된 아이디입니다.').css('color','red');
                           idCheck = false;
                        }
                     }
                  });
               }
            });
            $('#password').change(function(){
               var inputPwd = $('#password').val();
               if(inputPwd.length ==  0){
                  $('.error').eq(1).text('비밀번호를 입력해주세요').css('color','red');
                  pwdCheck = false;
               }else if(!regExp1.test(inputPwd) || !regExp2.test(inputPwd) || !regExp3.test(inputPwd) || !regExp4.test(inputPwd) || inputPwd.length < 6 ){
                  $('.error').eq(1).text('비밀번호는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');
                  pwdCheck = false;
               }else{
                  $('.error').eq(1).text('사용가능한 비밀번호입니다.').css('color','green');
                  pwdCheck = true;
               }
               console.log(inputPwd);
            });
            
            $('#password2').change(function(){
               var inputPwd2 = $('#password2').val();
               var inputPwd = $('#password').val();
               if(inputPwd == inputPwd2){
                  if(inputPwd2.length == 0){
                     $('.error').eq(2).text('');
                     pwd2Check = false;
                  }else{
                     $('.error').eq(2).text('비밀번호가 일치합니다.').css('color','green');
                     pwd2Check = true;
                  }
               }else{
                  $('.error').eq(2).text('비밀번호가 일치하지 않습니다.').css('color','red');
                  pwd2Check = false;
               }
               
               console.log("pwd2 : " + inputPwd2);
            });
            $('#userName').change(function(){
               var name = $('#userName').val();
               if(name.length == 0){
                  $('.error').eq(3).text('이름을 입력해주세요').css('color','red');
                  nameCheck = false;
               }else if(!regExp5.test(name) || regExp2.test(name) || regExp4.test(name)){
                  $('.error').eq(3).text('이름을 올바르게 입력해주세요').css('color','red');
                  nameCheck = false;
               }else{
                  $('.error').eq(3).text('');
                  nameCheck = true;
               }
            });
            
            $('#email').change(function(){
               var email = $('#email').val();
               if(email.length == 0){
                  $('.error').eq(5).text('이메일을 입력해주세요').css('color','red');
                  emailCheck = false;
               }else{
                  $('.error').eq(5).text('사용가능한 이메일입니다.').css('color','green');
                  emailCheck = true;
               }
            });
            
            $('#phone').change(function(){
               var phone = $('#phone').val();
               if(phone.length == 0){
                  $('.error').eq(6).text('전화번호를 입력해주세요').css('color','red');
                  phoneCheck = false;
               }else{
                  $('.error').eq(6).text('');
                  phoneCheck = true;
               }
            });
            $('#ownNumber').change(function(){
               // pk 중복체크
               var ownNumber = $('#ownNumber').val();
               if(ownNumber.length < 4){
                  $('.error').eq(4).text('사업자 번호를 입력해주세요').css('color','red');
                  ownNumberCheck = false;
               }else{
                  $.ajax({
                     url: '<%=request.getContextPath()%>/checkOwnNumber',
                     data : {ownNumber:ownNumber},
                     success: function(data){
                        console.log(data);
                        
                        if(data== 'success2'){
                           $('.error').eq(4).text('사용가능한 사업자 번호입니다.').css('color','green');
                           ownNumberCheck = true;
                        }else{
                           $('.error').eq(4).text('중복된 사업자 번호입니다.').css('color','red');
                           ownNumberCheck = false;
                        }
                     }
                  });
               }
            });
            $('#shopName').change(function(){
               var shop = $('#shopName').val();
               if(address.length < 4){
                  $('.error').eq(7).text('업체명을 입력해주세요').css('color','red');
                  shopNameCheck = false;
               }else{
                  $('.error').eq(7).text('');
                  shopNameCheck = true;
               }
            });
            $('#address').change(function(){
               var address = $('#address').val();
               if(address.length < 4){
                  $('.error').eq(8).text('주소를 입력해주세요').css('color','red');
                  addressCheck = false;
               }else{
                  $('.error').eq(8).text('');
                  addressCheck = true;
               }
            });
            
            function enroll(){
               if(!idCheck){
                  alert('아이디를 확인해주세요');
                  $('#userId').focus();
                  return false;
               }else if(!pwdCheck){
                  alert('비밀번호를 입력해주세요');
                  $('#password').focus();
                  return false;
               }else if(!pwd2Check){
                  alert('비밀번호가 일치하지 않습니다.');
                  $('#password2').focus();
                  return false;
               }else if(!nameCheck){
                  alert('이름을 바르게 입력해주세요');
                  $('#userName').focus();
                  return false;
               }else if(!emailCheck){
                  alert('이메일을 입력해주세요');
                  $('#email').focus();
                  return false;
               }else if(!phoneCheck){
                  alert('전화번호를 입력 해주세요');
                  $('#phone').focus();
                  return false;
               }else if(!ownNumberCheck){
                  alert('사업자번호를 확인해주세요');
                  $('#ownNumber').focus();
                  return false;
               }else if(!shopNameCheck){
                  alert('업체명을 입력해주세요');
                  $('#shopName').focus();
                  return false;
               }else if(!addressCheck){
                  alert('주소를 확인해주세요');
                  $('#address').focus();
                  return false;
               }else{
                  alert('회원가입이 되었습니다.');
                  return true;
               }
            }
         </script>
         <script>
         var mapContainer = document.getElementById('map'), // 지도를 표시할 div
           mapOption = {
               center: new daum.maps.LatLng(37.537187, 127.005476), // 지도의 중심좌표
               level: 5 // 지도의 확대 레벨
           };

       //지도를 미리 생성
          var map = new daum.maps.Map(mapContainer, mapOption);
       //주소-좌표 변환 객체를 생성
       var geocoder = new daum.maps.services.Geocoder();
       //마커를 미리 생성
          var marker = new daum.maps.Marker({
           position: new daum.maps.LatLng(37.537187, 127.005476),
           map: map
          });


    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var addr = data.address; // 최종 주소 변수

                // 주소 정보를 해당 필드에 넣는다.
                document.getElementById("address").value = addr;
                
                addressCheck = true;
                
                // 주소로 상세 정보를 검색
                geocoder.addressSearch(data.address, function(results, status) {
                    // 정상적으로 검색이 완료됐으면
                    if (status === daum.maps.services.Status.OK) {

                        var result = results[0]; //첫번째 결과의 값을 활용

                        // 해당 주소에 대한 좌표를 받아서
                        var coords = new daum.maps.LatLng(result.y, result.x);
                        // 지도를 보여준다.
                        mapContainer.style.display = "block";
                        
                        map.relayout();
                        // 지도 중심을 변경한다.
                        map.setCenter(coords);
                        // 마커를 결과값으로 받은 위치로 옮긴다.
                        marker.setPosition(coords)
                    }
                });
            }
        }).open();
    }
</script>
      </article>
   </section>
</body>
</html>