/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-28 10:34:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import login.model.vo.Member;

public final class enroll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/login/../common/gnb.jsp", Long.valueOf(1603880951000L));
    _jspx_dependants.put("/WEB-INF/views/login/../common/footer.jsp", Long.valueOf(1603876593000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("login.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>회원가입</title>\n");
      out.write("<style>\n");
      out.write("\t* { box-sizing: border-box; border: 1px solid green;}\n");
      out.write("\t\n");
      out.write("\t/* 내용부분 */\n");
      out.write("\tsection{\n");
      out.write("\t\tmargin: 12%;\n");
      out.write("\t\tmargin-top: 100px;\n");
      out.write("\t\tbackground: rgb(242, 242, 242);\n");
      out.write("\t\tmin-height: 800px;\n");
      out.write("\t\tborder: 1px solid rgb(242, 242, 242);\n");
      out.write("\t}\n");
      out.write("\t#section-header{\n");
      out.write("\t\twidth: 656px;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t}\n");
      out.write("\t.member-header{\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\theight: 50px;\n");
      out.write("\t\tbackground: rgb(45, 115, 102);\n");
      out.write("\t\tfont-size: 18px;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t#business{\n");
      out.write("\t\tfloat: right;\n");
      out.write("\t\tbackground: rgb(65, 166, 147);\n");
      out.write("\t\tmargin-left: -10px;\n");
      out.write("\t}\n");
      out.write("\t#business a{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t#common h4, #business h4{\n");
      out.write("\t\tmargin-left: 40px;\n");
      out.write("\t\tmargin-top: 12px;\n");
      out.write("\t\tfont-weight: normal;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t}\n");
      out.write("\t#business h4:hover{\n");
      out.write("\t\tfont-weight: bolder;\n");
      out.write("\t}\n");
      out.write("\t#business:hover{\n");
      out.write("\t\tbackground: rgb(53, 154, 135);\n");
      out.write("\t}\n");
      out.write("\t#naverIdLogin{\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t}\n");
      out.write("\t.input-header{\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\tbox-shadow: 0px 5px 5px 0px lightgray;\n");
      out.write("\t}\n");
      out.write("\t.input-header h4{\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-left: 10px;\n");
      out.write("\t\tmargin-top: 10px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#social-enroll{\n");
      out.write("\t\twidth: 656px;\n");
      out.write("\t\theight: 120px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tclear: both;\n");
      out.write("\t\tbackground: white;\n");
      out.write("\t}\n");
      out.write("\t#social-enroll p{\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tmargin-left: 25px;\n");
      out.write("\t\tpadding-top: 10px;\n");
      out.write("\t\tpadding-bottom: 10px;\n");
      out.write("\t}\n");
      out.write("\t#social img{\n");
      out.write("\t\tmargin-left: 25px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#input-boxes{\n");
      out.write("\t\twidth: 656px;\n");
      out.write("\t\tmin-height: 700px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t\tbackground: white;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tform h4{\n");
      out.write("\t\tmin-width: 400px;\n");
      out.write("\t\tfont-size: 15px;\n");
      out.write("\t\tmargin: 10px;\n");
      out.write("\t\tmargin-left:20%;\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t}\n");
      out.write("\t.input-info{\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\theight: 40px;\t\t\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t}\n");
      out.write("\t.error{\n");
      out.write("\t\theight: 20px;\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: 2px;\n");
      out.write("\t\tfont-size: 12px;\n");
      out.write("\t}\n");
      out.write("\tselect{\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\theight: 40px; \n");
      out.write("\t\tborder: 2px solid lightgray;\n");
      out.write("\t} \n");
      out.write("\tinput{\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tborder: 2px solid lightgray;\n");
      out.write("\t}\n");
      out.write("\tinput[type=\"number\"]::-webkit-outer-spin-button,\n");
      out.write("\tinput[type=\"number\"]::-webkit-inner-spin-button {\n");
      out.write("    \t-webkit-appearance: none;\n");
      out.write("    \tmargin: 0;\n");
      out.write("\t}\n");
      out.write("\tform p b, b{\n");
      out.write("\t\tcolor: red;\n");
      out.write("\t}\n");
      out.write("\tform p{\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\tfont-size: 12px;\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tfloat: right;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.phone-btn{\n");
      out.write("\t\tbackground: rgb(45, 115, 102);\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\theight: 38px;\n");
      out.write("\t\tborder-radius: 0;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tfloat: right;\n");
      out.write("\t}\n");
      out.write("\t#phone-msg, #phone-ok{\n");
      out.write("\t\tborder: 1px solid white;\n");
      out.write("\t}\n");
      out.write("\t#phone{\n");
      out.write("\t\twidth: 70%;\n");
      out.write("\t}\n");
      out.write("\t#phoneConfirm{\n");
      out.write("\t\twidth: 80%;\n");
      out.write("\t}\n");
      out.write("\t#phone-ok{\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t}\n");
      out.write("\t#sendMsg{\n");
      out.write("\t\twidth: 30%;\n");
      out.write("\t}\n");
      out.write("\t#msgOk{\n");
      out.write("\t\twidth: 20%;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t/* 푸드스타일 */\n");
      out.write("\t#style-info{\n");
      out.write("\t\tmargin-bottom: 5px;\n");
      out.write("\t}\n");
      out.write("\t#style-info a{\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfloat: right;\n");
      out.write("\t\tfont-size: 13px;\n");
      out.write("\t\tcolor: blue;\n");
      out.write("\t\tmargin-top: 5px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#div-btn-enroll{\n");
      out.write("\t\tclear:both;\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: 30px;\n");
      out.write("\t\tmargin-bottom: 30px;\n");
      out.write("\t}\n");
      out.write("\t#enrollBtn{\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tbackground: rgb(45, 115, 102);\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tfont-size: 18px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("  <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/naveridlogin_js_sdk_2.0.0.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');

	Member loginUser  = (Member)session.getAttribute("loginUser");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>GNB</title>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("\t\n");
      out.write("\thtml, body, div, span, img, header, nav, ul, li{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000; list-style: none;}\n");
      out.write("\tbody{line-height: 1;}\n");
      out.write("\t.gnb{width: 100%; height:62px; border-bottom: 1px solid lightgray; min-width: 800px; position: fixed; top: 0; background-color: #fff; text-align: center;}\n");
      out.write("\t.gnb-nav ul{width: 80%; max-width: 1000px;  min-width: 800px; margin: auto; display: flex; flex-direction : row; text-align: center;}\n");
      out.write("\t#logo {width: 130px;}\n");
      out.write("\t.gnb-nav-list{left: 0; width: 90px; cursor: pointer; margin: auto; text-align: center; line-height: 50px; border: 1px solid white;}\n");
      out.write("\t.gnb-nav-list:nth-child(1){margin-right: 200px;}\n");
      out.write("\t.gnb-nav-list:nth-child(1):hover{border: none; margin-right: 200px;}\n");
      out.write("\t.gnb-nav-list:hover {font-weight: bold; border-bottom: 3px solid #41A693;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header class=\"gnb\">\n");
      out.write("\t\t<nav class=\"gnb-nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("'\"><img id=\"logo\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("'\" src=\"");
      out.print( request.getContextPath() );
      out.write("/images/common/logo.png\" style=\"cursor: pointer;\"></li>\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\">About</li>\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\">식당검색</li>\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\">레시피</li>\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/vegiTalk'\">VegiTalk</li>\n");
      out.write("\t\t\t\t");
if(loginUser == null){ 
      out.write("\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/login.me'\">Login</li>\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\n");
      out.write("\t\t\t\t<li class=\"gnb-nav-list\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/myPage'\">My Info</li>\n");
      out.write("\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\t<section>\n");
      out.write("\t\t<div id=\"section-header\">\n");
      out.write("\t\t\t<div class=\"member-header\" id=\"common\"><h4>일반회원</h4></div>\n");
      out.write("\t\t\t<div class=\"member-header\" id=\"business\"><h4><a href=\"");
      out.print( request.getContextPath());
      out.write("/businessEnroll\">사업자 회원</a></h4></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<article id=\"social-enroll\">\n");
      out.write("\t\t\t<div class=\"social\" id=\"social\">\n");
      out.write("\t\t\t\t<p>소셜로 간편하게 로그인하세요.</p>\n");
      out.write("\t\t\t\t<div id=\"naverIdLogin\"></div>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/images/common/kakao.png\" id=\"kakao\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\tvar naverLogin = new naver.LoginWithNaverId(\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tclientId: \"w3sXDEgZtjtnF9AcUJSw\",\n");
      out.write("\t\t\t\t\tcallbackUrl: \"http://127.0.0.1:9981/Vegiter\",\n");
      out.write("\t\t\t\t\tisPopup: true, /* 팝업을 통한 연동처리 여부 */\n");
      out.write("\t\t\t\t\tloginButton: {color: \"white\", type:3, height:40} /* 로그인 버튼의 타입을 지정 */\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\n");
      out.write("\t\t\t\t/* 설정정보를 초기화하고 연동을 준비 */\n");
      out.write("\t\t\t\tnaverLogin.init();\n");
      out.write("\t\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t</article>\n");
      out.write("\t\t<article>\n");
      out.write("\t\t\t<form method=\"post\" id=\"insertMember\" action=\"");
      out.print(request.getContextPath() );
      out.write("/insert.me\" onsubmit=\"return enroll();\">\n");
      out.write("\t\t\t\t<div id=\"input-boxes\">\n");
      out.write("\t\t\t\t\t<p><b>*</b>은 필수 입력칸입니다.</p>\n");
      out.write("\t\t\t\t\t<h4>아이디(6자리이상 영문, 숫자 1개 이상)<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\"><input type=\"text\" name=\"userId\" id=\"userId\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"error\" id=\"id-error\"></div>\n");
      out.write("\t\t\t\t\t<h4>비밀번호(6자리이상 영문, 숫자, 특수문자 1개 이상)<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\"><input type=\"password\" name=\"userPwd\" id=\"password\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"error\"></div>\n");
      out.write("\t\t\t\t\t<h4>비밀번호 확인<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\"><input type=\"password\" name=\"userPwd2\" id=\"password2\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"error\"></div>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"code\" value=\"1\">\n");
      out.write("\t\t\t\t\t<h4>이름<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\"><input type=\"text\" name=\"userName\" id=\"userName\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"error\"></div>\n");
      out.write("\t\t\t\t\t<h4>이메일<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\"><input type=\"email\" name=\"email\" id=\"email\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"error\"></div>\n");
      out.write("\t\t\t\t\t<h4>성별</h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\">\n");
      out.write("\t\t\t\t\t\t<select name=\"gender\">\n");
      out.write("\t\t\t\t\t\t\t<option selected value=\"N\">성별</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"F\">남자</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"M\">여자</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"N\">선택 안함</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h4>휴대폰 번호<b>*</b></h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\" id=\"phone-msg\">\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" class=\"phone\" name=\"phone\" id=\"phone\" placeholder=\"(-)미포함\">\n");
      out.write("\t\t\t\t\t\t<button class=\"phone-btn\" id=\"sendMsg\" onclick=\"sendConfirm();\">인증번호 전송</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\" id=\"phone-ok\">\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" class=\"phone\" name=\"phoneConfirm\" id=\"phoneConfirm\">\n");
      out.write("\t\t\t\t\t\t<button class=\"phone-btn\" id=\"msgOk\" onclick=\"confirm();\">확인</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"error\"></div>\n");
      out.write("\t\t\t\t\t<h4>푸드스타일</h4>\n");
      out.write("\t\t\t\t\t<div class=\"input-info\">\n");
      out.write("\t\t\t\t\t\t<select name=\"style\">\n");
      out.write("\t\t\t\t\t\t\t<option selected value=null>-------------</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"미크\">미크</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"꼬크\">꼬크</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"오크\">오크</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"에크\">에크</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"에그\">에그</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"밀크\">밀크</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"베지\">베지</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"error\" id=\"style-info\"><a onclick=\"info();\">푸드스타일이란?</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"div-btn-enroll\"><input type=\"submit\" id=\"enrollBtn\" value=\"회원가입\"></div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\tvar regExp1 = /[a-zA-Z]/; //문자\n");
      out.write("\t\t\t\tvar regExp2 = /[0-9]/;\t//숫자\n");
      out.write("\t\t\t\tvar regExp3 = /\\S/; //공백여부\n");
      out.write("\t\t\t\tvar regExp4 = /[~!@#$%^&*()_+|<>?:{}]/; //특수문자\n");
      out.write("\t\t\t\tvar regExp5 = /[가-힣]/g; //한글\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(function(){\n");
      out.write("\t\t\t\t\t$('input').focusin(function(){\n");
      out.write("\t\t\t\t\t\t$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});\n");
      out.write("\t\t\t\t\t}).focusout(function(){\n");
      out.write("\t\t\t\t\t\t$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar idCheck = false;  // pk\n");
      out.write("\t\t\t\tvar pwdCheck = false;\n");
      out.write("\t\t\t\tvar pwd2Check = false;\n");
      out.write("\t\t\t\tvar nameCheck = false;\n");
      out.write("\t\t\t\tvar emailCheck = false; //unique\n");
      out.write("\t\t\t\tvar phoneCheck = false; //인증\n");
      out.write("\t\t\t\tvar checked = false; //전체 체크\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#userId\").on('change paste keyup', function(){\n");
      out.write("\t\t\t\t\tvar idCheck = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#password\").on('change paste keyup', function(){\n");
      out.write("\t\t\t\t\tvar pwdCheck = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#passwor2\").on('change paste keyup', function(){\n");
      out.write("\t\t\t\t\tvar pwd2Check = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#email\").on('change paste keyup', function(){\n");
      out.write("\t\t\t\t\tvar emailCheck = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#phone\").on('change paste keyup', function(){\n");
      out.write("\t\t\t\t\tvar phoenCheck = false;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#userId').change(function(){\n");
      out.write("\t\t\t\t\tvar inputId = $('#userId').val();\n");
      out.write("\n");
      out.write("\t\t\t\t\tif(inputId.length == 0){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(0).text('아이디를 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t}else if(!regExp1.test(inputId) || !regExp2.test(inputId) || !regExp3.test(inputId) || inputId.length < 6 ){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(0).text('아이디는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t// 중복 체크!\n");
      out.write("\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.print( request.getContextPath());
      out.write("/checkId.me',\n");
      out.write("\t\t\t\t\t\t\tdata: {userId: inputId},\n");
      out.write("\t\t\t\t\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\tif(data == 'success'){\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.error').eq(0).text('사용가능한 아이디입니다.').css('color','green');\n");
      out.write("\t\t\t\t\t\t\t\t\tidCheck = true;\n");
      out.write("\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.erro').eq(0).text('중복된 아이디입니다.').css('color','red');\n");
      out.write("\t\t\t\t\t\t\t\t\tidCheck = false;\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#password').change(function(){\n");
      out.write("\t\t\t\t\tvar inputPwd = $('#password').val();\n");
      out.write("\t\t\t\t\tif(inputPwd.length ==  0){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(1).text('비밀번호를 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t\tpwdCheck = false;\n");
      out.write("\t\t\t\t\t}else if(!regExp1.test(inputPwd) || !regExp2.test(inputPwd) || !regExp3.test(inputPwd) || !regExp4.test(inputPwd) || inputPwd.length < 6 ){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(1).text('비밀번호는 6자리 이상, 문자, 숫자로 구성하여야 합니다.').css('color','red');\n");
      out.write("\t\t\t\t\t\tpwdCheck = false;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('.error').eq(1).text('사용가능한 비밀번호입니다.').css('color','green');\n");
      out.write("\t\t\t\t\t\tpwdCheck = true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#password2').change(function(){\n");
      out.write("\t\t\t\t\tvar inputPwd2 = $('#password2').val();\n");
      out.write("\t\t\t\t\tvar inputPwd = $('#password').val();\n");
      out.write("\t\t\t\t\tif(inputPwd == inputPwd2){\n");
      out.write("\t\t\t\t\t\tif(inputPwd2 == \"\"){\n");
      out.write("\t\t\t\t\t\t\t$('.error').eq(2).text('');\n");
      out.write("\t\t\t\t\t\t\tpwd2Check = false;\n");
      out.write("\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t$('.error').eq(2).text('비밀번호가 일치합니다.').css('color','green');\n");
      out.write("\t\t\t\t\t\t\tpwd2Check = true;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('.error').eq(2).text('비밀번호가 일치하지 않습니다.').css('color','red');\n");
      out.write("\t\t\t\t\t\tpwd2Check = false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#userName').change(function(){\n");
      out.write("\t\t\t\t\tvar name = $('#userName').val();\n");
      out.write("\t\t\t\t\tif(name.length == 0){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(3).text('이름을 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t\tnameCheck = false;\n");
      out.write("\t\t\t\t\t}else if(!regExp5.test(name) || regExp2.test(name) || regExp4.test(name)){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(3).text('이름을 올바르게 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t\tnameCheck = false;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('.error').eq(3).text('');\n");
      out.write("\t\t\t\t\t\tnameCheck = true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#email').change(function(){\n");
      out.write("\t\t\t\t\tvar email = $('#email').val();\n");
      out.write("\t\t\t\t\tif(email.length == 0){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(4).text('이메일을 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t\temailCheck = false;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('.error').eq(4).text('사용가능한 이메일입니다.').css('color','green');\n");
      out.write("\t\t\t\t\t\temailCheck = true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#phone').change(function(){\n");
      out.write("\t\t\t\t\tvar phone = $('#phone').val();\n");
      out.write("\t\t\t\t\tif(phone.length == 0){\n");
      out.write("\t\t\t\t\t\t$('.error').eq(5).text('휴대폰 번호를 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$('.error').eq(5).text('');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tfunction sendConfirm(){\n");
      out.write("\t\t\t\t\tconsole.log('askdasdfas');\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tfunction confirm(){\n");
      out.write("\t\t\t\t\t// 확인문자까지 해야 true\n");
      out.write("\t\t\t\t\t$('.error').eq(5).text('인증이 완료되었습니다.').css('color','green');\n");
      out.write("\t\t\t\t\tphoneCheck = true;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tfunction enroll(){\n");
      out.write("\t\t\t\t\tif(!idCheck){\n");
      out.write("\t\t\t\t\t\talert('아이디를 확인해주세요');\n");
      out.write("\t\t\t\t\t\t$('#userId').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else if(!pwdCheck){\n");
      out.write("\t\t\t\t\t\talert('비밀번호를 입력해주세요');\n");
      out.write("\t\t\t\t\t\t$('#password').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else if(!pwd2Check){\n");
      out.write("\t\t\t\t\t\talert('비밀번호가 일치하지 않습니다.');\n");
      out.write("\t\t\t\t\t\t$('#password2').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else if(!nameCheck){\n");
      out.write("\t\t\t\t\t\talert('이름을 바르게 입력해주세요');\n");
      out.write("\t\t\t\t\t\t$('#userName').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else if(!emailCheck){\n");
      out.write("\t\t\t\t\t\talert('이메일을 입력해주세요');\n");
      out.write("\t\t\t\t\t\t$('#email').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else if(!phoneCheck){\n");
      out.write("\t\t\t\t\t\talert('휴대폰 인증확인을 해주세요');\n");
      out.write("\t\t\t\t\t\t$('#phone').focus();\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\talert('회원가입이 되었습니다.');\n");
      out.write("\t\t\t\t\t\treturn true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tfunction info(){\n");
      out.write("\t\t\t\t\twindow.open('foodStyle.html','푸드스타일이란?','width=600,height=450');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t</article>\n");
      out.write("\t</section>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("\tfooter{\n");
      out.write("\t\tmargin-top: 50px;\n");
      out.write("\t\tbottom: 0;\n");
      out.write("\t\tpadding-top: 16px;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100px;\n");
      out.write("\t\tbackground: #41A693;\n");
      out.write("\t\tmin-width: 500px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.f_div1 {\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.f_div1 span{\n");
      out.write("\t\tfont-size: 16px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tcolor : white;\n");
      out.write("\t\tpadding: 2px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.f_div1 p{\n");
      out.write("\t\tfont-size: 12px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t.f_div1 a{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"f_div1\">\n");
      out.write("\t\t\t<a href=\"#\"><span>About</span></a>\n");
      out.write("\t\t\t<span> | </span>\n");
      out.write("\t\t\t<span>Privacy</span>\n");
      out.write("\t\t\t<span> | </span>\n");
      out.write("\t\t\t<span>Feedback</span>\n");
      out.write("\t\t\t<span> | </span>\n");
      out.write("\t\t\t<a href=\"#\"><span>Top</span></a>\n");
      out.write("\t\t\t<p><a href=\"https://github.com/vegiter/vegiter_web\">채채식 팀 GitHub</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}