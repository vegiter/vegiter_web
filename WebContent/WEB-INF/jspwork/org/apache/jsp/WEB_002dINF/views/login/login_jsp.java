/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-28 10:10:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<title>Vegitor 로그인</title>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground: rgb(242, 242, 242);\n");
      out.write("\t}\n");
      out.write("\theader{\n");
      out.write("\t\theight: 150px;\n");
      out.write("\t}\n");
      out.write("\t#login{\n");
      out.write("\t\tbackground: white;\n");
      out.write("\t\twidth: 400px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: 150px;\n");
      out.write("\t\tpadding: 50px;\n");
      out.write("\t\tpadding-top: 70px;\n");
      out.write("\t\tpadding-bottom: 70px;\n");
      out.write("\t}\n");
      out.write("\tdiv.login-header{\n");
      out.write("\t\twidth: 200px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-bottom: 20px;\n");
      out.write("\t}\n");
      out.write("\tdiv.login-header img{\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: auto;\n");
      out.write("\t}\n");
      out.write("\tsection{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t}\n");
      out.write("\t#btn{\n");
      out.write("\t\twidth: 304px;\n");
      out.write("\t\theight: 200px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tborder: 1px solid black;\n");
      out.write("\t}\n");
      out.write("\t#login-div{\n");
      out.write("\t\twidth: 304px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t}\n");
      out.write("\t#login-btn{\n");
      out.write("\t\tbackground: rgb(45,115,102);\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 45px;\n");
      out.write("\t\tfont-size: 23px;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t}\n");
      out.write("\t.memberBtn{\n");
      out.write("\t\tbackground: lightgray;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\twidth: 152px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t}\n");
      out.write("\t#business{\n");
      out.write("\t\tmargin-left: -6px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tinput.input-info{\n");
      out.write("\t\theight: 30px;\n");
      out.write("\t\twidth: 80%;\n");
      out.write("\t\tmargin: 25px;\n");
      out.write("\t\tmargin-left: 22px;\n");
      out.write("\t\tborder: 1px solid lightgray;\n");
      out.write("\t}\n");
      out.write("\tinput#userId{\n");
      out.write("\t\tmargin-top: 30px;\n");
      out.write("\t}\n");
      out.write("\t#userPwd{\n");
      out.write("\t\tmargin-top: 0;\n");
      out.write("\t}\n");
      out.write("\tdiv#login-error{\n");
      out.write("\t\theight: 35px;\n");
      out.write("\t\twidth: 75%;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tpadding-top: 8px;\n");
      out.write("\t}\n");
      out.write("\tdiv#other-div{\n");
      out.write("\t\twidth : 240px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tmargin-top: 30px;\n");
      out.write("\t}\n");
      out.write("\tspan a{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\n");
      out.write("\tspan.other a{\n");
      out.write("\t\tcolor: gray;\n");
      out.write("\t\tborder-right: 2px solid gray;\n");
      out.write("\t\tpadding-right: 4px;\n");
      out.write("\t\tfont-size:13px;\n");
      out.write("\t}\n");
      out.write("\tspan#enroll a{\n");
      out.write("\t\tborder: none;\n");
      out.write("\t}\n");
      out.write("\t.selectedBtn{\n");
      out.write("\t\tbackground: rgb(45,115,102);\n");
      out.write("\t\tcursor: default;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\t<section id=\"login\">\n");
      out.write("\t\t<div class=\"login-header\" id=\"login-header\">\n");
      out.write("\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/images/common/logo.png\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form onsubmit=\"return login()\" action=\"");
      out.print(request.getContextPath());
      out.write("/login\">\n");
      out.write("\t\t\t<div id=\"btn\">\n");
      out.write("\t\t\t\t<button  class=\"memberBtn\" id=\"common\">개인 회원</button>\n");
      out.write("\t\t\t\t<button  class=\"memberBtn\" id=\"business\">사업자 회원</button>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-info\" placeholder=\"아이디\" id=\"userId\" name=\"userId\"><br>\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"input-info\" placeholder=\"비밀번호\" id=\"userPwd\" name=\"userPwd\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"login-error\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"login-div\">\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"login-btn\" value=\"로그인\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div id=\"other-div\">\n");
      out.write("\t\t\t<span class=\"other\" id=\"findId\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/findId.me\">아이디 찾기</a></span>\n");
      out.write("\t\t\t<span class=\"other\" id=\"findPwd\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/findPwd.me\">비밀번호 찾기</a></span>\n");
      out.write("\t\t\t<span class=\"other\" id=\"enroll\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/enrollForm.me\">회원가입</a></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$('#common').addClass('selectedBtn');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('#common').click(function(){\n");
      out.write("\t\t\t\t$(this).addClass('selectedBtn');\n");
      out.write("\t\t\t\t$('#business').removeClass('selectedBtn');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#business').click(function(){\n");
      out.write("\t\t\t\t$(this).addClass('selectedBtn');\n");
      out.write("\t\t\t\t$('#common').removeClass('selectedBtn');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('input').focusin(function(){\n");
      out.write("\t\t\t\t$(this).css({'border':'2px solid green', 'box-shadow':'0px 0px 5px green'});\n");
      out.write("\t\t\t}).focusout(function(){\n");
      out.write("\t\t\t\t$(this).css({'border':'2px solid lightgray', 'box-shadow':'none'})\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\tfunction login(){\n");
      out.write("\t\t\tvar userId = $('#userId');\n");
      out.write("\t\t\tvar userPwd = $('#userPwd');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(userId.val() == ''){\n");
      out.write("\t\t\t\t$('#login-error').html('아이디를 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\tuserId.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else if(userPwd.val() == ''){\n");
      out.write("\t\t\t\t$('#login-error').html('비밀번호를 입력해주세요').css('color','red');\n");
      out.write("\t\t\t\tuserPwd.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
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