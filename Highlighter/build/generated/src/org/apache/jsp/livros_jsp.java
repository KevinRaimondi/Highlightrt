package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import serv.livroSelect;
import connect.livroGetSet;
import java.util.ArrayList;
import java.text.NumberFormat;

public final class livros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    NumberFormat z = NumberFormat.getCurrencyInstance();
    livroSelect select = new livroSelect();
    ArrayList<livroGetSet> ListarLivro = select.ListarLivro();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilos.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("             function animar(){\n");
      out.write("                $(\"#carousel ul\").animate({marginLeft:-1100, },1000,function(){\n");
      out.write("                    $(this).find(\"li:last\").after($(this).find(\"li:first\"));\n");
      out.write("                    $(this).css({marginLeft:0});\n");
      out.write("                })\n");
      out.write("            }\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                // Set the interval to be 5 seconds\n");
      out.write("                var rodar = setInterval(animar,4000);\n");
      out.write("                $('#carousel ul').hover(function() {\n");
      out.write("                        clearInterval(rodar);\n");
      out.write("                }, function() {\n");
      out.write("                        rodar = setInterval(animar,4000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("                        \n");
      out.write("                ");

                    int n=1;
                    for(livroGetSet livro : ListarLivro) {
                        if((n % 4 == 0) ){
                
      out.write("\n");
      out.write("                            <div class=\"item last\">\n");
      out.write("                ");
  
                        }
                        else{
                
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                \n");
      out.write("                ");

                    }

                    String nomeLivro = livro.getnomeLivro();
                    if(nomeLivro.length() > 20){
                        nomeLivro = String.format("%.20s", livro.getnomeLivro()) + "...";
                    }
                
      out.write("\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"img/");
      out.print(livro.getimagem() );
      out.write("\"/>\n");
      out.write("                                <figcaption>\n");
      out.write("                                    <h2>\n");
      out.write("                                            <a class=\"titulocd\" href=\"cd.jsp?id=");
      out.print(livro.getId() );
      out.write('"');
      out.write('>');
      out.print(nomeLivro );
      out.write("</a>\n");
      out.write("                                    </h2>\n");
      out.write("                                    \n");
      out.write("                                    <a href=\"cd.jsp?id=");
      out.print(livro.getdescricao() );
      out.write("\" class=\"btn detalhes\">Detalhes</a>\n");
      out.write("                                   \n");
      out.write("                                </figcaption>\n");
      out.write("                            </figure>\n");
      out.write("                        </div>\n");
      out.write("                ");

                        n++;
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
