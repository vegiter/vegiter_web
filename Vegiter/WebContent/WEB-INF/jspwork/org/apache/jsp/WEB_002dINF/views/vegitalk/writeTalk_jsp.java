/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-27 13:13:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vegitalk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeTalk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/vegitalk/../common/gnb.jsp", Long.valueOf(1603786176000L));
  }

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
      out.write("<title>게시판 작성</title>\n");
      out.write("<style>\n");
      out.write("\thtml, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}\n");
      out.write("\tarticle, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}\n");
      out.write("\tbody{line-height: 1;}\n");
      out.write("\tol, ul{list-style: none;}\n");
      out.write("\tblockquote, q {quotes: none;}\n");
      out.write("\tblockquote:before, blockquote:after,\n");
      out.write("\tq:before, q:after {content: ''; content: none;}\n");
      out.write("\ttable{border-collapse: collapse; border-spacing: 0;}\n");
      out.write("\tbutton{outline: none; background-color: white;border-style: none;}\n");
      out.write("\ttextarea{outline: none;padding: 1rem;border-style: none;}\n");
      out.write("\t.wrapper{width: 600px;min-width: 600px;margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}\n");
      out.write("\t.write-type {margin: 10px 0; font-size: 14px; color: #ACB5BD;}\n");
      out.write("\t.write-type button{margin-right: 2px; color: #ACB5BD; font-size: 14px; cursor: pointer;}\n");
      out.write("\t.write-type button:hover{background-color: #F0F3F5; border-radius: 5px;}\n");
      out.write("\t.write-type button:nth-child(1){color: #41A693;font-weight: bold;}\n");
      out.write("\t\n");
      out.write("\t.write-img{width: 600px; height: 550px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}\n");
      out.write("\t.write-img-btn{padding: 50px; border: 2px dotted #858E96; border-radius: 20px; color: #858E96;}\n");
      out.write("\t#post-img{width: 100%; height: auto;}\n");
      out.write("\t#wirte-area {width: 570px; min-height: 200px; margin: 20px 0; padding: 15px; line-height: 1.5;resize: none;}\n");
      out.write("\n");
      out.write("\t#write-submit-btn{width: 600px;line-height: 3;color: #41A693;background-color: #F2F2F2;}\n");
      out.write("\t#write-submit-btn:hover{color: white;background-color: #41A693;}\n");
      out.write("</style>\n");
      out.write("<script src=\"https://kit.fontawesome.com/34238d14b4.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write("/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("header {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.8);\n");
      out.write("\tborder-bottom: 1px solid lightgray;\n");
      out.write("\tmin-width: 800px;\n");
      out.write("\tposition: fixed;\n");
      out.write("\ttop: 0;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tfloat: right;\n");
      out.write("\tpadding: 0;\n");
      out.write("\theight: 40px;\n");
      out.write("\tmargin-right: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div, ul, li {\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#logo {\n");
      out.write("\twidth: 150px;\n");
      out.write("\tmargin-left: 5%\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav li {\n");
      out.write("\tfloat: left;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tline-height: 40px; /*굵기*/\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header nav .wrap>ul {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrap>ul>li {\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 63px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrap>ul>li>a {\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 100%;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: black;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ol, ul {\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav li:hover {\n");
      out.write("\tfont-weight: bolder;\n");
      out.write("\tborder-bottom: 3px solid rgb(45, 115, 102);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header class=\"header\">\n");
      out.write("\t\t<img id=\"logo\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("'\" src=\"");
      out.print( request.getContextPath() );
      out.write("/images/common/logo.png\" style=\"cursor: pointer;\">\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">식당검색</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">레시피</a></li>\n");
      out.write("\t\t\t\t\t<li><a onclick=\"goVegitalk();\">Vegi talk</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Info</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction goVegitalk() {\n");
      out.write("\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/vegitalk.go\";\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"write-type\">\n");
      out.write("\t\t\t게시글 타입 선택: \n");
      out.write("\t\t\t<button type=\"button\" id=\"type-one\" onclick=\"\">#도란도란</button>\n");
      out.write("\t\t\t<button type=\"button\" id=\"type-two\" onclick=\"writeDiet();\">#식단</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t<form class=\"write\" action=\"");
      out.print( request.getContextPath() );
      out.write("/insert.do\" method=\"post\">\n");
      out.write("\t\t<div class=\"write-img\">\n");
      out.write("\t\t\t<label class=\"write-img-btn\" for=\"imgFile\">이미지 추가하기</label>\n");
      out.write("\t\t\t<input type=\"file\" id=\"imgFile\" accept=\"image/*\" style=\"display: none;\">\n");
      out.write("\t\t\t<!-- <img src=\"img.png\" id=\"post-img\"> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<textarea name=\"write\" id=\"wirte-area\" rows=\"10\" placeholder=\"게시글을 입력하세요.\"></textarea>\n");
      out.write("\n");
      out.write("\t\t<button type=\"submit\" name=\"submitBtn\" id=\"write-submit-btn\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/updateTalk'\">등록</button>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\tfunction writeDiet(){\n");
      out.write("\t\t$('body').load(\"writeDiet\");\n");
      out.write("\t}\n");
      out.write("</script>\n");
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
