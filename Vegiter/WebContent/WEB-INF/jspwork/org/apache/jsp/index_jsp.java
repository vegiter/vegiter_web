/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-20 20:52:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/gnb.jsp", Long.valueOf(1603227116000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1603226738000L));
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
      out.write("<title>Vegiter</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- GNB  -->\n");
      out.write("\t");
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
      out.write("header:scroll{\n");
      out.write("\tdisplay: hidden;\n");
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
      out.write("\t\t<a href=\"#\"><img id=\"logo\" src=\"");
      out.print( request.getContextPath() );
      out.write("/images/common/logo.png\"></a>\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">식당검색</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">레시피</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Vegi talk</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">My Info</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t<div style=\"height: 3000px;\">zㅋㅋ</div>\n");
      out.write("\t\n");
      out.write("\t<!-- Footer  -->\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\tintegrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
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