<%-- 
    Document   : teste
    Created on : 09/11/2018, 00:14:02
    Author     : Karoline
--%><%@page import="serv.livroSelect"%>
<%@page import="connect.livroGetSet"%>
<%@ page language="java" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>



<%
    

    
    
    NumberFormat z = NumberFormat.getCurrencyInstance();
    livroSelect select = new livroSelect();
    ArrayList<livroGetSet> ListarLivro = select.ListarLivro();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Livros:</h1>
                        
                <%
                    int n=1;
                    for(livroGetSet livro : ListarLivro) {
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

                    String nomeLivro = livro.getnomeLivro();
                    if(nomeLivro.length() > 20){
                        nomeLivro = String.format("%.20s", livro.getnomeLivro()) + "...";
                    }
                %>
                            <figure>
                                <img src="images/<%=livro.getimagem() %>"/>
                                
                                <figcaption>
                                    <h2>
                                            <a class="titulocd" href="livroDescricao.jsp?id=<%=livro.getId() %>"><%=nomeLivro %></a>
                                    </h2>
                                    
                                            <h3><%= String.format("%.30s",livro.getautor())+ "..."%></h3>
                                            <h4><%= "GENERO:" +String.format("%.30s",livro.getcategoria())%></h4>
                                            <span><%= String.format("%.100s",livro.getdescricao())+ "..."%></span>
                                </figcaption>
                            </figure>
                        </div>
                <%
                        n++;
                    }
                %>
            </div>
    </body>
</html>
