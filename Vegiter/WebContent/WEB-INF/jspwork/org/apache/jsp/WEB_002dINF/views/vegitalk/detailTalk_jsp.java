/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-11-06 04:56:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vegitalk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Board;
import board.model.vo.Attachment;
import login.model.vo.Member;

public final class detailTalk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/vegitalk/../common/gnb.jsp", Long.valueOf(1604311958000L));
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
    _jspx_imports_classes.add("board.model.vo.Attachment");
    _jspx_imports_classes.add("board.model.vo.Board");
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

      out.write('\n');
      out.write('\n');

	Board post = (Board)request.getAttribute("post");
	Attachment atc = (Attachment)request.getAttribute("atc");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>도란도란</title>\n");
      out.write("<style>\n");
      out.write("\thtml, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}\n");
      out.write("\tarticle, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}\n");
      out.write("\tbody{line-height: 1; font-family: 'Open Sans', sans-serif;}\n");
      out.write("\tol, ul{list-style: none;}\n");
      out.write("\tblockquote, q {quotes: none;}\n");
      out.write("\tblockquote:before, blockquote:after, q:before, q:after {content: ''; content: none;}\n");
      out.write("\ttable{border-collapse: collapse; border-spacing: 0;}\n");
      out.write("\tbutton{outline: none; background-color: white;border-style: none;}\n");
      out.write("\ttextarea{outline: none; padding: 1rem;border-style: none;}\n");
      out.write("\t.wrapper{width: 500px; min-width: 500px; margin: auto;margin-top: 150px;margin-bottom: 100px;overflow: hidden;}\n");
      out.write("\t#wirte-area{resize: vertical;}\n");
      out.write("\t.write-my {display: flex;justify-content: flex-end;}\n");
      out.write("\t.write-my button{margin-bottom: 10px; margin-right: 2px;color: #333B3F;font-weight: bold; left: 0;}\n");
      out.write("\t.write-my button:hover{background-color: #F0F3F5;border-radius: 5px;}\n");
      out.write("\t.write-my button:active{background-color: #41A693;color: #FFF;}\n");
      out.write("\t.selected{color: #41A693;font-weight: bold;}\n");
      out.write("\t.write-img{margin: 0 auto; width: 500px; height: 450px; overflow: hidden; background-color: #F0F3F5; text-align: center; line-height: 550px;}\n");
      out.write("\t.write-img-btn{padding: 50px; border: 2px dotted #858E96; border-radius: 20px; color: #858E96;}\n");
      out.write("\t#post-img{width: 100%; height: 100%;}\n");
      out.write("\t#wirte-area {width: 470px; min-height: 100px; height: auto; padding: 15px; line-height: 1.5; resize:none;}\n");
      out.write("\t.social{width: 500px;display: flex;justify-content: flex-end;margin: 10px 0;}\n");
      out.write("\tspan>i {font-size: 18px;vertical-align: middle;}\n");
      out.write("\t.social>span{padding: 3px;padding-left: 8px;padding-right: 8px;}\n");
      out.write("\t.social>span:nth-child(1):hover{cursor: default;}\n");
      out.write("\t.social>span:nth-child(2):hover{cursor: pointer;background-color: #41A693;color: #fff;border-radius: 15px;}\n");
      out.write("\t.checked{color: #41A693;font-weight: bold;}\n");
      out.write("\t.user{padding: 1rem;color: #333B3F;font-weight: bold;font-size: 19px;display: flex;justify-content: space-between;align-items: center;}\n");
      out.write("\t.user-info{width: 95%;display: flex;justify-content: space-between;}\n");
      out.write("\t#userId{font-size: 20px;}\n");
      out.write("\t.fa-bookmark{font-size: 20px;cursor: pointer;}\n");
      out.write("\t.fa-bookmark:hover{cursor: pointer;color: #41A693;}\n");
      out.write("\t.comment{box-sizing:border-box;width: 500px;background-color: #F0F3F5; height: auto;padding: 14px;margin-top: 10px;}\n");
      out.write("\t.comment-list{width: 100%;padding: 0;display: flex;margin-top: 8px;}\n");
      out.write("\t.comment-input{display: flex;justify-content: space-between;margin-top: 20px;vertical-align: middle;}\n");
      out.write("\t#comUserId{width: 20%;font-weight: bold;overflow: hidden;font-size: 14px;}\n");
      out.write("\t#comContent{width: 65%;font-size: 14px;}\n");
      out.write("\t#comDate{width: 15%;text-align: right;font-size: 14px;}\n");
      out.write("\t.comment-input-field{width: 85%;border-style: none;padding: 8px; outline:none;}\n");
      out.write("\t.comment-input-submit{width: 50px;}\n");
      out.write("\t.comment-input-submit:hover{background-color: #41A693;color: #fff;}\n");
      out.write("</style>\n");
      out.write("<script src=\"https://kit.fontawesome.com/34238d14b4.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write("/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\thtml, body, div, span, img, header, nav, ul, li{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000; list-style: none;}\n");
      out.write("\tbody{line-height: 1; font-family: 'Open Sans', sans-serif;}\n");
      out.write("\t.gnb{width: 100%; height:62px; border-bottom: 1px solid lightgray; min-width: 800px; position: fixed; top: 0; background-color: #fff; text-align: center;}\n");
      out.write("\t.gnb-nav ul{width: 80%; max-width: 1000px;  min-width: 800px; margin: auto; display: flex; flex-direction : row; text-align: center;}\n");
      out.write("\t#logo {width: 130px; right: 0; top: 0; bottom: 0;}\n");
      out.write("\t.gnb-nav-list{left: 0; width: 90px; cursor: pointer; margin: auto; text-align: center; line-height: 51px;}\n");
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
      out.write("<div class=\"wrapper\">\n");
      out.write("\t");
 if(loginUser != null && (loginUser.getMemId()).equals(post.getMem_id())){ 
      out.write("\n");
      out.write("\t\t<div class=\"write-my\">\n");
      out.write("\t\t\t<button id=\"delete\">삭제</button>\n");
      out.write("\t\t\t<button id=\"modify\">수정</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"write-img\">\n");
      out.write("\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/uploaded_Images/");
      out.print( atc.getAtcName() );
      out.write("\" id=\"post-img\">\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"user\">\n");
      out.write("\t\t<div class=\"user-info\">\n");
      out.write("\t\t<span id=\"userId\">");
      out.print( post.getMem_id() );
      out.write("</span>\n");
      out.write("\t\t\t<span id=\"date\">");
      out.print( post.getBoard_date() );
      out.write("</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<i class=\"far fa-bookmark\"></i>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<textarea name=\"write\" id=\"wirte-area\" readonly>");
      out.print( post.getBoard_content() );
      out.write("</textarea>\n");
      out.write("\t\n");
      out.write("\t<div class=\"social\">\n");
      out.write("\t\t<span><i class=\"far fa-comment-dots\"></i>\n");
      out.write("\t\t");
      out.print( post.getBoard_com() );
      out.write("</span>\n");
      out.write("\t\t<span class=\"social-item checked\"><i class=\"far fa-heart\"></i>\n");
      out.write("\t\t");
      out.print( post.getBoard_like() );
      out.write("</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"comment\">\n");
      out.write("\t\t<ul class=\"comment-list\">\n");
      out.write("\t\t\t<li class=\"comment-list-item\" id=\"comUserId\">작성자</li>\n");
      out.write("\t\t\t<li class=\"comment-list-item\" id=\"comContent\">댓글이다</li>\n");
      out.write("\t\t\t<li class=\"comment-list-item\" id=\"comDate\">2020.10.10</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<div class=\"comment-input\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"comment-input-field\" placeholder=\"댓글을 입력하세요.\">\n");
      out.write("\t\t\t<button type=\"submit\" class=\"comment-input-submit\">등록</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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