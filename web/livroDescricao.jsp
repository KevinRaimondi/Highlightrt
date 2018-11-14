<%@page import="java.text.NumberFormat"%>
<%@ page language="java" %>
<%@page import="connect.livroGetSet" %>
<%@page import="java.util.ArrayList" %>
<%@page import="serv.livroDesc" %>
<%
    NumberFormat z = NumberFormat.getCurrencyInstance();

    int id = Integer.parseInt(request.getParameter("id"));
    livroDesc select = new livroDesc();
    ArrayList<livroGetSet> listarLivro = select.ListarDescricao(id);
   
    
%>
<!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<title>Titulo</title>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" type="text/css" href="estilo/estilos.css" />
		<script src="assets/js/funcoes.js"></script>

	</head>
	<body>
		<div id="wrapper">
		
			<div class="content">
                            <div id="cd">
                            <%
                                for(livroGetSet livro : listarLivro) {
                            %>
					<img src="img/<%=livro.getimagem()%>"/>
					

					<h2>
						<%=livro.getnomeLivro()%>
					</h2>
					<h3><%=livro.getautor() %> </h3>
					<p>&nbsp;</p>
                                        <p><label>GENERO: </label><%=livro.getcategoria()%></a>
					<p><%=livro.getdescricao()%>
                                  
				<% } %>
			</div>
                        </div>
			
		</div>
	</body>
</html>















