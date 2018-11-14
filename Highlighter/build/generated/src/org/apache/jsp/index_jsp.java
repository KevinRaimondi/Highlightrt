package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


   int i;
   String erro;
 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

 if (session.getAttribute("erro")!= null){
       erro =(String) session.getAttribute("erro");
   }
   else{
       erro="0";
   }

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/form.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"formulario\">\n");
      out.write("                    <!--form method=\"post\" action=\"validar.jsp\"-->\n");
      out.write("                    <form method=\"post\" action=\"logarUsuario\">\n");
      out.write("                        <label for=\"usuario\">E-Mail*:</label>\n");
      out.write("                        <input type=\"text\" name=\"usuario\" id=\"usuario\" required placeholder=\"Usuário\" maxlength=\"50\" size=\"50\"/><br/>\n");
      out.write("                        <label for=\"senha\">Senha*:</label>\n");
      out.write("                        <input type=\"password\" name=\"senha\" id=\"senha\" required placeholder=\"Senha\" maxlength=\"14\" size=\"50\"/><br/>\n");
      out.write("                        <input type=\"submit\" value=\"Enviar\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                        if(erro=="1"){
                    
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">\n");
      out.write("                                Usuário e/ou senha incorretos!\n");
      out.write("                            </div>\n");
      out.write("                    ");

                        }
                        if(erro=="2"){
                    
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">\n");
      out.write("                                Página restrita efetue login\n");
      out.write("                            </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
