/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-06 03:49:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"h-100 gradient-form\" style=\"background-color: #eee;\">\r\n");
      out.write("    <div class=\"container py-1 h-100\">\r\n");
      out.write("        <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("            <div class=\"col-xl-10\">\r\n");
      out.write("                <div class=\"card rounded-3 text-black\">\r\n");
      out.write("                    <div class=\"row g-0\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"card-body p-md-4 mx-md-4 \">\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <img src=\"Images/Flor_con_uv_sin_fondo.png\"\r\n");
      out.write("                                         style=\"width: 185px;\" alt=\"logo\">\r\n");
      out.write("                                    <h3 class=\"mt-1 mb-3 pb-1\">Iniciar Sesion</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <form action=\"ServletLogin\" method=\"post\">\r\n");
      out.write("                                    <div class=\"form-outline mb-2\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"email\">Correo UV</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"matricula\" id=\"email\" class=\"form-control\" minlength=\"9\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-outline mb-2\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"password\">ContraseÃ±a</label>\r\n");
      out.write("                                        <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"text-center pt-1 mb-3 pb-1\">\r\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-3\" name=\"accion\" value=\"ingresar\">\r\n");
      out.write("                                         <a class=\"text-muted\" href=\"\">Forgot password?</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                <div class=\"col-lg-6 d-flex justify-content-start \" >\r\n");
      out.write("                                    <div class=\"p-0\">\r\n");
      out.write("                                    <img src=\"./Images/Captura%20de%20pantalla%202023-05-31%20121109.png\" class=\"img-fluid\" >\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
