/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-11-05 09:16:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vegitalk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import board.model.vo.*;
import login.model.vo.Member;

public final class vegitalk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/vegitalk/../common/gnb.jsp", Long.valueOf(1604311958000L));
    _jspx_dependants.put("/WEB-INF/views/vegitalk/../common/footer.jsp", Long.valueOf(1604311815000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("board.model.vo");
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

      out.write('\n');
      out.write('\n');

	ArrayList<Board> pList = (ArrayList<Board>)request.getAttribute("pList");
	ArrayList<Attachment> aList = (ArrayList<Attachment>)request.getAttribute("aList");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int postCount = pi.getPostCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Vegitalk</title>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("\thtml, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000;}\n");
      out.write("\tarticle, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section {display: block;}\n");
      out.write("\tbody{line-height: 1; font-family: 'Open Sans', sans-serif;}\n");
      out.write("\tol, ul{list-style: none;}\n");
      out.write("\tblockquote, q {quotes: none;}\n");
      out.write("\tblockquote:before, blockquote:after,\n");
      out.write("\tq:before, q:after {content: ''; content: none;}\n");
      out.write("\ttable{border-collapse: collapse; border-spacing: 0;}\n");
      out.write("\tbutton{outline: none; background-color: white;border-style: none;}\n");
      out.write("\ttextarea{outline: none; padding: 1rem;border-style: none;}\n");
      out.write("\tinput:focus{outline: none;}\n");
      out.write("\t.wrapper{width: 80%; min-width: 600px; max-width: 1300px; margin: auto; margin-top: 150px; margin-bottom: 40px; overflow: hidden;}\n");
      out.write("\t#noBoard{margin: 160px auto;}\n");
      out.write("\t.option{padding: 10px; display: flex; justify-content: space-between; margin: 10px 0; align-items: center;}\n");
      out.write("\t.opt-type{width: 270px;}\n");
      out.write("\t.option span{margin-right: 10px; color: #ACB5BD; cursor:pointer;font-size: 14px;}\n");
      out.write("\t.option span:hover{color: #41A693; font-weight: bold;}\n");
      out.write("\t.opt-type.filter{margin-bottom: 8px;line-height: 2rem;}\n");
      out.write("\t.opt-search{border-bottom: 1px solid #ACB5BD; padding: 5px 5px 5px 0;}\n");
      out.write("\t.opt-search input{border-style: none; padding-left: 8px; width: 170px; color: #485056; font-size: 16px;}\n");
      out.write("\tbutton, button i{text-align:center; width: 30px; height: 20px; outline: none; color: #ACB5BD;}\n");
      out.write("\tbutton, button i:hover{cursor:pointer; color: #41A693;}\n");
      out.write("\n");
      out.write("\t.board {margin-top: 50px; display: flex; flex-wrap: wrap; justify-content: space-around;}\n");
      out.write("\t.board li {padding: 10px;}\n");
      out.write("\n");
      out.write("\t.board-list-img{width: 300px; height: 280px; text-align: center; background-color: #485056; overflow: hidden;}\n");
      out.write("\t.board-list-img img{width: 100%; height: 100%;}\n");
      out.write("\n");
      out.write("\t.board-list-item{background-color: #DEE2E5; height: 130px; text-align: left;}\n");
      out.write("\t.board-list-item h1{font-size: 20px; padding: 10px; font-weight: bold; color: #21403A;}\n");
      out.write("\t.board-list-item>p{padding: 0 15px; height: 50px; width: 260px; color: #485056; line-height: 1.5rem;}\n");
      out.write("\t.board-list-item-con>p{text-overflow: ellipsis;}\n");
      out.write("\t.board-list-item-social{text-align: right; color: #485056; padding: 10px 15px;}\n");
      out.write("\t.board-list-item-social span{margin-left: 5px;}\n");
      out.write("\t.board-list-item-social>i{color: #485056;}\n");
      out.write("\n");
      out.write("\t.paging{padding: 10px; text-align: center; margin: 20px 0;}\n");
      out.write("\t.paging span{display: inline-block; background-color: #DEE2E5; padding: 1rem; margin: 2px; color: #485056;}\n");
      out.write("\t.paging span:hover{cursor: pointer; background-color: #41A693; color: #fff;}\n");
      out.write("\t\n");
      out.write("\t.writeBtn{position: fixed; bottom: 50px; right: 10%;color: #fff; cursor: pointer; border-radius: 50%; background-color: #41A693; width: 50px; height: 50px; display: flex; align-items: center; justify-content: center;}\n");
      out.write("\t.writeBtn i{color: #fff;}\n");
      out.write("\t.writeBtn.onHeight{position: absolute; bottom: -40px;}\n");
      out.write("</style>\n");
      out.write("<script src=\"https://kit.fontawesome.com/34238d14b4.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write("/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("\t\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t");
 if(pList == null) { 
      out.write("\n");
      out.write("\t\t\t<p id=\"noBoard\">등록된 게시글이 없습니다.</p>\n");
      out.write("\t\t");
 } else {  
      out.write("\n");
      out.write("\t\t<div class=\"option\">\n");
      out.write("\t\t\t<div class=\"opt-type\">\n");
      out.write("\t\t\t\t<span class=\"opt-type filter\">#All</span>\n");
      out.write("\t\t\t\t<span class=\"opt-type filter\">#공지/이벤트</span>\n");
      out.write("\t\t\t\t<span class=\"opt-type filter\">#도란도란</span>\n");
      out.write("\t\t\t\t<span class=\"opt-type filter\">#식단공유</span>\n");
      out.write("\t\t\t\t<span class=\"opt-type sort\">↑↓최신순</span>\n");
      out.write("\t\t\t\t<span class=\"opt-type sort\">↑↓좋아요순</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"opt-search\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"keyword\" class=\"option-search-input\">\n");
      out.write("\t\t\t\t<button class=\"option-search-Btn\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"board\">\n");
      out.write("\t\t\t");
 for(Board p: pList) { 
      out.write("\n");
      out.write("\t\t\t    <li class=\"board-list\" style=\"cursor:pointer;\">\n");
      out.write("\t\t\t    \t<input type=\"hidden\" value=\"");
      out.print( p.getBoard_no() );
      out.write("\">\n");
      out.write("\t\t\t    \t<input type=\"hidden\" value=\"");
      out.print( p.getBoard_code() );
      out.write("\">\n");
      out.write("\t\t\t    \t<div class=\"board-list-img\">\n");
      out.write("\t\t\t    \t\t");
 for(Attachment a: aList){
			    				int pNo = p.getBoard_no();
			    				int aNo = a.getBoardNo();
			    				if(pNo == aNo) { 
      out.write("\n");
      out.write("\t\t\t        \t\t\t\t<img class=\"board-list-img-con\" src=\"");
      out.print( request.getContextPath() );
      out.write("/uploaded_Images/");
      out.print( a.getAtcName() );
      out.write("\">\n");
      out.write("\t\t\t        \t\t\t\tbreak;\n");
      out.write("\t\t\t        \t");
 		}
			        	   }
      out.write("\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        <div class=\"board-list-item\">\n");
      out.write("\t\t\t            <h1 class=\"board-list-item-id\">");
      out.print( p.getMem_id() );
      out.write("</h1>\n");
      out.write("\t\t\t            <p class=\"board-list-item-con\">");
      out.print( p.getBoard_content() );
      out.write("</p>\n");
      out.write("\t\t\t            <div class=\"board-list-item-social\">\n");
      out.write("\t\t\t                <span><i class=\"far fa-comment-dots\"></i>");
      out.print( p.getBoard_com() );
      out.write("</span>\n");
      out.write("\t\t\t                <span><i class=\"far fa-heart\"></i>");
      out.print( p.getBoard_like() );
      out.write("</span>\n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\t<div class=\"paging\">\n");
      out.write("\t\t\t\t<span class=\"paging-item\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/list.bo?currentPage=");
      out.print( currentPage - 1 );
      out.write("'\">&lt;</span>\n");
      out.write("\t\t\t\t");
 for(int p = startPage; p <= endPage; p++){
				   	 	if(p == currentPage) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"paging-item\">");
      out.print( p );
      out.write("</span>\n");
      out.write("\t\t\t\t\t");
  } else { 
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"paging-item\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/vegiTalk?currentPage=");
      out.print( p );
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</span>\n");
      out.write("\t\t\t\t\t");
  } 
				  } 
      out.write("\t\n");
      out.write("\t\t\t\t<span class=\"paging-item\">&gt;</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
 if(loginUser != null) { 
      out.write("\n");
      out.write("\t<div class=\"writeBtn\" onclick=\"location.href='writePost'\"><i class=\"fas fa-pen\"></i></div>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>푸터</title>\n");
      out.write("<script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("\thtml, body, div, span, img, header, nav, a, p, footer{margin: 0; padding: 0; border: 0; font-size: 100%; font: inherit; vertical-align: baseline; text-decoration: none; border-style: none; color: #000000; list-style: none;}\n");
      out.write("\tbody{line-height: 1; font-family: 'Open Sans', sans-serif;}\n");
      out.write("\tfooter{margin-top: 50px; bottom: 0; padding-top: 16px; width: 100%; height: 100px; background: #41A693; min-width: 500px;}\n");
      out.write("\t.f_div1 {text-align: center; margin: 20px 0; min-width: 600px;}\n");
      out.write("\t.f_div1 span{font-size: 16px; text-align: center; color : white; padding: 2px;}\n");
      out.write("\t.f_div1 p{font-size: 12px;margin: auto; color: white;}\n");
      out.write("\t.f_div1 a{text-decoration: none;}\n");
      out.write("\t.f_div1>p{margin: 8px 0;}\n");
      out.write("\t.f_div1 a{color: #ACB5BD;}\n");
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
      out.write("\t<script>\n");
      out.write("\t\t$(function() { //글쓰기 버튼 푸터 상단 배치\n");
      out.write("\t\t\tvar $w = $(window),\n");
      out.write("\t\t\t\tfHeight = $('footer').outerHeight();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$w.on('scroll', function(){\n");
      out.write("\t\t\t\tvar sT = $w.scrollTop();\n");
      out.write("\t\t\t\tvar hVal = $(document).height() - $w.height() - fHeight;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(sT >= hVal)\n");
      out.write("\t\t\t\t\t$('.writeBtn').addClass('onHeight');\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\t$('.writeBtn').removeClass('onHeight');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(function(){ //sort 옵션 버튼 클릭 이벤트\n");
      out.write("\t\t\t$('.opt-type>span.filter:first').css('color', '#41A693');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('.opt-type>span.filter').on('click', function(){\n");
      out.write("\t\t\t\t$('.opt-type>span.filter').css('color', '#ACB5BD');\n");
      out.write("\t\t\t\t$(this).css('color', '#41A693');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('.opt-type>span.sort:first').css('color', '#41A693');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('.opt-type>span.sort').on('click', function(){\n");
      out.write("\t\t\t\t$('.opt-type>span.sort').css('color', '#ACB5BD');\n");
      out.write("\t\t\t\t$(this).css('color', '#41A693');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(function(){ //상세페이지 이동 분기 처리\n");
      out.write("\t\t\t$('.board-list').click(function(){\n");
      out.write("\t\t\t\tvar bId = $(this).children().val();\n");
      out.write("\t\t\t\tvar bCode = $(this).children().eq(1).val();\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print( request.getContextPath() );
      out.write("/detail?bId=\" + bId + \"&bCode=\" + bCode;\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
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
