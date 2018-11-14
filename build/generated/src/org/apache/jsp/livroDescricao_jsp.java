package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import connect.livroGetSet;
import java.util.ArrayList;
import serv.livroDesc;

public final class livroDescricao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    NumberFormat z = NumberFormat.getCurrencyInstance();

    int id = Integer.parseInt(request.getParameter("id"));
    livroDesc select = new livroDesc();
    ArrayList<livroGetSet> listarLivro = select.ListarDescricao(id);
   
    

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Titulo</title>\n");
      out.write("\t\t<meta charset=\"UTF-8\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilos.css\" />\n");
      out.write("\t\t<script src=\"assets/js/funcoes.js\"></script>\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"wrapper\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("                            <div id=\"cd\">\n");
      out.write("                            ");

                                for(livroGetSet livro : listarLivro) {
                            
      out.write("\n");
      out.write("\t\t\t\t\t<img src=\"img/");
      out.print(livro.getimagem());
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void();\" onclick=\"javascript:adicionarprod();\" class=\"btn comprar\">Comprar</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t");
      out.print(livro.getnomeLivro());
      out.write("\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t<h3>");
      out.print(livro.getautor() );
      out.write(" </h3>\n");
      out.write("\t\t\t\t\t<p>&nbsp;</p>\n");
      out.write("                                        <p><label>GENERO: </label><a href=\"banda.jsp?id=");
      out.print(livro.getId());
      out.write('"');
      out.write('>');
      out.print(livro.getcategoria());
      out.write("</a>\n");
      out.write("\t\t\t\t\t<p>");
      out.print(livro.getdescricao());
      out.write("\n");
      out.write("                                  \n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
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
