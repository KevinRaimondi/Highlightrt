package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import connect.discoGet;
import java.util.ArrayList;
import serv.discoSelect;

public final class disco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    NumberFormat z = NumberFormat.getCurrencyInstance();
    discoSelect dao1 = new discoSelect();
    ArrayList<discoGet> ListaDisco = dao1.ListarDisco();

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Musics</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo/estilos.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function animar(){\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("                ");

                    int n=1;
                    for(discoGet disco : ListaDisco) {
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

                    String titulo = disco.getTitulo_disco();
                    if(titulo.length() > 20){
                        titulo = String.format("%.20s", disco.getTitulo_disco()) + "...";
                    }
                
      out.write("\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"img/");
      out.print( disco.getCapa_disco() );
      out.write("\"/>\n");
      out.write("                                <figcaption>\n");
      out.write("                                    <h2>\n");
      out.write("                                            <a class=\"titulocd\" href=\"cd.jsp?id=");
      out.print( disco.getId_disco() );
      out.write('"');
      out.write('>');
      out.print(titulo );
      out.write("</a>\n");
      out.write("                                    </h2>\n");
      out.write("                                    <span class=\"btn preco\">");
      out.print(z.format(disco.getPreco_disco()) );
      out.write("</span>\n");
      out.write("                                    <a href=\"cd.jsp?id=");
      out.print( disco.getId_disco() );
      out.write("\" class=\"btn detalhes\">Detalhes</a>\n");
      out.write("                                    <a href=\"javascript:void();\" onclick=\"javascript:adicionarprod(");
      out.print( disco.getId_disco() );
      out.write(',');
      out.print( disco.getPreco_disco() );
      out.write(");\" class=\"btn comprar\">Comprar</a>\n");
      out.write("                                </figcaption>\n");
      out.write("                            </figure>\n");
      out.write("                        </div>\n");
      out.write("                ");

                        n++;
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </div>\n");
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
