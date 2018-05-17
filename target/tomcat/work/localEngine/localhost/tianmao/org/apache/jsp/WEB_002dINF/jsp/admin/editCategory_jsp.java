package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class editCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/admin/../include/admin/adminHeader.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/admin/../include/admin/adminNavigator.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<script src=\"js/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("\t<link href=\"css/bootstrap/3.3.6/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"js/bootstrap/3.3.6/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link href=\"css/back/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("function checkEmpty(id, name){\r\n");
      out.write("\tvar value = $(\"#\"+id).val();\r\n");
      out.write("\tif(value.length==0){\r\n");
      out.write("\t\talert(name+ \"不能为空\");\r\n");
      out.write("\t\t$(\"#\"+id)[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function checkNumber(id, name){\r\n");
      out.write("\tvar value = $(\"#\"+id).val();\r\n");
      out.write("\tif(value.length==0){\r\n");
      out.write("\t\talert(name+ \"不能为空\");\r\n");
      out.write("\t\t$(\"#\"+id)[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(isNaN(value)){\r\n");
      out.write("\t\talert(name+ \"必须是数字\");\r\n");
      out.write("\t\t$(\"#\"+id)[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function checkInt(id, name){\r\n");
      out.write("\tvar value = $(\"#\"+id).val();\r\n");
      out.write("\tif(value.length==0){\r\n");
      out.write("\t\talert(name+ \"不能为空\");\r\n");
      out.write("\t\t$(\"#\"+id)[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(parseInt(value)!=value){\r\n");
      out.write("\t\talert(name+ \"必须是整数\");\r\n");
      out.write("\t\t$(\"#\"+id)[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"a\").click(function(){\r\n");
      out.write("\t\tvar deleteLink = $(this).attr(\"deleteLink\");\r\n");
      out.write("\t\tconsole.log(deleteLink);\r\n");
      out.write("\t\tif(\"true\"==deleteLink){\r\n");
      out.write("\t\t\tvar confirmDelete = confirm(\"确认要删除\");\r\n");
      out.write("\t\t\tif(confirmDelete)\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navitagorDiv\">\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top navbar-inverse\">\r\n");
      out.write("\t\t<img style=\"margin-left:10px;margin-right:0px\" class=\"pull-left\" src=\"img/site/tmallbuy.png\" height=\"45px\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#nowhere\">天猫后台</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"admin_category_list\">分类管理</a>\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"admin_user_list\">用户管理</a>\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"admin_order_list\">订单管理</a>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>编辑分类</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("\r\n");
      out.write("        $(\"#editForm\").submit(function(){\r\n");
      out.write("            if(!checkEmpty(\"name\",\"分类名称\"))\r\n");
      out.write("                return false;\r\n");
      out.write("\r\n");
      out.write("            return true;\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"workingArea\">\r\n");
      out.write("\r\n");
      out.write("\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t<li><a href=\"admin_category_list\">所有分类</a></li>\r\n");
      out.write("\t\t<li class=\"active\">编辑分类</li>\r\n");
      out.write("\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"panel panel-warning editDiv\">\r\n");
      out.write("\t\t<div class=\"panel-heading\">编辑分类</div>\r\n");
      out.write("\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t<form method=\"post\" id=\"editForm\" action=\"admin_category_update\"  enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t<table class=\"editTable\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>分类名称</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input  id=\"name\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>分类圖片</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"categoryPic\" accept=\"image/*\" type=\"file\" name=\"image\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"submitTR\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">提 交</button>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
