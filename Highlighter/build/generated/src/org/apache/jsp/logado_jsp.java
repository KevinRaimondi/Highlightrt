package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logado_jsp extends org.apache.jasper.runtime.HttpJspBase
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


   int i; 
   String logado;
   if (session.getAttribute("logado")!= null){
       logado =(String) session.getAttribute("logado");
   }
   else{
       logado = "false";
   }
   
 
      out.write("\n");
      out.write("\n");
      out.write("<!-- Abre HTML -->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <!-- Abre Head -->\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Base</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery.slidertron-0.1.js\"></script>\n");
      out.write("<link href=\"estilo/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link href=\"estilo/slidertron.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("@import \"slidertron.css\";\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <!-- Abre Body -->\n");
      out.write("<body>\n");
      out.write("<!-- fim Head Wrapper -->\n");
      out.write("<div id=\"logo\">\n");
      out.write("\t<h1><a href=\"#\">Highlighter </a></h1>\n");
      out.write("\t</div>\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("                    ");

                    if (logado != "true") {
                    
      out.write("\n");
      out.write("                    \n");
      out.write("\t\t\t<li><a href=\"#\" class=\"first\">Inicio</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Sobre</a></li>\n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                        <li><a href=\"cadastro.jsp\" target=\"meio\">Cadastro</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\" target=\"meio\">Logar</a></li>\n");
      out.write("                        \n");
      out.write("                           ");
 
                    }
                    else{
                
      out.write("\n");
      out.write("                <a href=\"\"> Olá ");
      out.print(session.getAttribute("nomeCompleto"));
      out.write("</a>\n");
      out.write("                        <a href=\"logout.jsp\"> Sair</a>\n");
      out.write("                ");
        
                    }
                
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Fim do topo -->\n");
      out.write("\t</div>\n");
      out.write("<!-- fim da Head -->\n");
      out.write("\n");
      out.write("<!-- Inicio do slide-->\n");
      out.write("<div id=\"slideshow\">\n");
      out.write("\t<!-- start -->\n");
      out.write("\t<div id=\"foobar\">\n");
      out.write("\t\t<div id=\"col1\"><a href=\"#\" class=\"previous\">&nbsp;</a></div>\n");
      out.write("\t\t<div id=\"col2\">\n");
      out.write("\t\t\t<div class=\"viewer\">\n");
      out.write("\t\t\t\t<div class=\"reel\">\n");
      out.write("\t\t\t\t\t<div class=\"slide\"><img src=\"images/caro1.jpg\"> <span>Primeira imagem do slide</span> </div>\n");
      out.write("\t\t\t\t\t<div class=\"slide\"><img src=\"images/caro2.jpg\"> <span>Segunda imagem do slide</span> </div>\n");
      out.write("\t\t\t\t\t<div class=\"slide\"><img src=\"images/caro3.jpg\"> <span>Terceira imagem do slide</span> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"col3\"><a href=\"#\" class=\"next\">&nbsp;</a></div>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$('#foobar').slidertron({\n");
      out.write("\t\t\t\t\t\t\tviewerSelector:\t\t\t'.viewer',\n");
      out.write("\t\t\t\t\t\t\treelSelector:\t\t\t'.viewer .reel',\n");
      out.write("\t\t\t\t\t\t\tslidesSelector:\t\t\t'.viewer .reel .slide',\n");
      out.write("\t\t\t\t\t\t\tnavPreviousSelector:\t'.previous',\n");
      out.write("\t\t\t\t\t\t\tnavNextSelector:\t\t'.next',\n");
      out.write("\t\t\t\t\t\t\tnavFirstSelector:\t\t'.first',\n");
      out.write("\t\t\t\t\t\t\tnavLastSelector:\t\t'.last'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t<!-- Fim do slide -->\n");
      out.write("    <!-- iframe -->\n");
      out.write("</div>\n");
      out.write("<div id=\"page\">\n");
      out.write("\t<div id=\"page-bgtop\">\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("                    <!-- texto retirado por motivos ESTETICOS!! -->\n");
      out.write("            <h2 class=\"title\"><a href=\"#\"></a></h2>\n");
      out.write("\t\t<iframe src=\"conteudo_iframe.htm\" style=\"width:620px;height:520px;\" frameborder=\"0\" scrolling=\"no\" name=\"meio\"></iframe>\n");
      out.write("\t</div>\n");
      out.write("\t\t<!-- fim do iframe-->\n");
      out.write("        <!-- Lista de categorias-->\n");
      out.write("\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Categorias</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Artes</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Autoajuda</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Biografias</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Educação</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Ficção cientifica e fantasia</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Gastronomia e vinhos</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">História</a></li>\n");
      out.write("                                                <li><a href=\"#\">Humor</a></li>\n");
      out.write("                                                <li><a href=\"#\">Livros infantis</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Mistério e suspense</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Negócios e investimentos</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Poesia</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Psicologia</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Religião e espiritualidade</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Romances</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Fim da lista -->\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Fim da pagina -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p>&copy; Untitled. All rights reserved. Design by <a href=\"\" rel=\"\">KLRAIMONDI</a>.</p>\n");
      out.write("</div>\n");
      out.write("<!-- Creditos e fechamento do body -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
