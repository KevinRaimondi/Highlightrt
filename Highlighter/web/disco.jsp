<%@page import="java.text.NumberFormat"%>
<%@ page language="java" %>
<%@page import="connect.discoGet" %>
<%@page import="java.util.ArrayList" %>
<%@page import="serv.discoSelect" %>


<%
    NumberFormat z = NumberFormat.getCurrencyInstance();
    discoSelect dao1 = new discoSelect();
    ArrayList<discoGet> ListaDisco = dao1.ListarDisco();
%>

<!doctype html>
<html>
    <head>
        <title>Musics</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="estilo/estilos.css" />
        <script type="text/javascript" src="assets/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript">
            function animar(){
                $("#carousel ul").animate({marginLeft:-1100, },1000,function(){
                    $(this).find("li:last").after($(this).find("li:first"));
                    $(this).css({marginLeft:0});
                })
            }
            $(document).ready(function(){
                // Set the interval to be 5 seconds
                var rodar = setInterval(animar,4000);
                $('#carousel ul').hover(function() {
                        clearInterval(rodar);
                }, function() {
                        rodar = setInterval(animar,4000);
                });
            });
        </script>
    </head>
    <body>
       
                <%
                    int n=1;
                    for(discoGet disco : ListaDisco) {
                        if((n % 4 == 0) ){
                %>
                            <div class="item last">
                <%  
                        }
                        else{
                %>
                            <div class="item">
                                
                <%
                    }

                    String titulo = disco.getTitulo_disco();
                    if(titulo.length() > 20){
                        titulo = String.format("%.20s", disco.getTitulo_disco()) + "...";
                    }
                %>
                            <figure>
                                <img src="img/<%= disco.getCapa_disco() %>"/>
                                <figcaption>
                                    <h2>
                                            <a class="titulocd" href="cd.jsp?id=<%= disco.getId_disco() %>"><%=titulo %></a>
                                    </h2>
                                    <span class="btn preco"><%=z.format(disco.getPreco_disco()) %></span>
                                    <a href="cd.jsp?id=<%= disco.getId_disco() %>" class="btn detalhes">Detalhes</a>
                                    <a href="javascript:void();" onclick="javascript:adicionarprod(<%= disco.getId_disco() %>,<%= disco.getPreco_disco() %>);" class="btn comprar">Comprar</a>
                                </figcaption>
                            </figure>
                        </div>
                <%
                        n++;
                    }
                %>
            </div>
        
            
        </div>
    </body>
</html>















