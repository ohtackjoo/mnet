/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2019-02-19 08:07:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1550198119777L));
    _jspx_dependants.put("jar:file:/C:/Users/mnet-11/Desktop/oh/wslist/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/nmet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar ck=\"\"\r\n");
      out.write("\t\t$(\"#CKID\").click(function(){    \r\n");
      out.write("\t\t\tvar ID=$(\"#userid\").val();\r\n");
      out.write("\t\t\tconsole.log(ID)\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"joinCheck.do\",\r\n");
      out.write("\t\t\t\tdata:{'ID':ID},\r\n");
      out.write("\t\t\t\tcontentType: \"application/x-www-form-urlencoded; charset=UTF-8\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t            console.log(\"success\");\r\n");
      out.write("\t\t            alert(decodeURIComponent(data.msg));\r\n");
      out.write("\t\t            ck=\"1\";\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        error: function (XMLHttpRequest, textStatus, errorThrown){\r\n");
      out.write("\t\t            alert('서버와의 통신이 원할하지 않습니다.\\n다시 시도 해 주십시오.' );\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#sub\").click(function send() {\r\n");
      out.write("\t\t\tvar $userid=$(\"#userid\").val();\r\n");
      out.write("\t\t\tvar $userPwd=$(\"#userPwd\").val();\r\n");
      out.write("\t\t\tvar $userPwdCk=$(\"#userPwdCk\").val();\r\n");
      out.write("\t\t\tvar $userName=$(\"#userName\").val();\r\n");
      out.write("\t\t\tif($userid==\"\"){\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.usrid();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if($userPwd==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userPwd();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if($userPwdCk==\"\"){\r\n");
      out.write("\t\t\t\talert(\"비밀번호확인을 입력하세요.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userPwdCk();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if($userName==\"\"){\r\n");
      out.write("\t\t\t\talert(\"성명을 입력하세요.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userName();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif($userPwd.length<5 || $userPwd.length>10){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 형식이 올바르지 않습니다.\\n 비밀번호는 5자리이상 10자리이하여야 합니다.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userPwd();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif($userPwd!=$userPwdCk){\r\n");
      out.write("\t\t\t\talert(\"비밀번호 불일치.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userPwd();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(ck==\"\"){\r\n");
      out.write("\t\t\t\talert(\"아이디 중복확인을 클릭하세요.\");\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\tfocus.userPwd();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"join.do\" method=\"post\" id=\"join\">\r\n");
      out.write("\t<label for=\"userid\">아이디:</label>\r\n");
      out.write("\t<input type=\"text\" placeholder=\"아이디를 입력하세요\" name=\"userid\" id=\"userid\">\r\n");
      out.write("\t<input type=\"button\" id=\"CKID\" value=\"중복확인\"><br/>\r\n");
      out.write("\t<label for=\"userPwd\">비밀번호:</label>\r\n");
      out.write("\t<input type=\"password\" placeholder=\"비밀번호를 입력하세요\" name=\"userPwd\" id=\"userPwd\"><br/>\r\n");
      out.write("\t<p>#비밀번호는 5자리이상 10자리 이하여야 합니다.<br/>\r\n");
      out.write("\t<label for=\"userPwdCk\">비밀번호확인:</label>\r\n");
      out.write("\t<input type=\"password\" placeholder=\"비밀번호를 입력하세요\" name=\"userPwdCk\" id=\"userPwdCk\"><br/>\r\n");
      out.write("\t<label for=\"userName\">성명:</label>\r\n");
      out.write("\t<input type=\"text\" placeholder=\"비밀번호를 입력하세요\" name=\"userName\" id=\"userName\"><br/>\r\n");
      out.write("\t<input type=\"submit\" value=\"저장\" id=\"sub\"> \r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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
