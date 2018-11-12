<%
   int i; 
   String logado;
   if (session.getAttribute("logado")!= null){
       logado =(String) session.getAttribute("logado");
   }
   else{
       logado = "false";
   }
   
 %>

<!-- Abre HTML -->
<html xmlns="http://www.w3.org/1999/xhtml">
    <!-- Abre Head -->
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Base</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="jquery/jquery.slidertron-0.1.js"></script>
<link href="estilo/style.css" rel="stylesheet" type="text/css" media="screen" />
<link href="estilo/slidertron.css" rel="stylesheet" type="text/css" media="screen" />
<style type="text/css">
@import "slidertron.css";
</style>
</head>
    <!-- Abre Body -->
<body>
<!-- fim Head Wrapper -->
<div id="logo">
	<h1><a href="#">Highlighter </a></h1>
	</div>
<div id="header">
	<div id="menu">
		<ul>
                    <%
                    if (logado != "true") {
                    %>
                    
			<li><a href="#" class="first">Inicio</a></li>
			<li><a href="#">Sobre</a></li>
                        
                
                        <li><a href="cadastro.jsp" target="meio">Cadastro</a></li>
                        <li><a href="login.jsp" target="meio">Logar</a></li>
                        
                           <% 
                    }
                    else{
                %>
                <a href=""> Olá <%=session.getAttribute("nome")%></a>
                        <a href="logout.jsp"> Sair</a>
                <%        
                    }
                %>
		</ul>
	</div>
	<!-- Fim do topo -->
	</div>
<!-- fim da Head -->

<!-- Inicio do slide-->
<div id="slideshow">
	<!-- start -->
	<div id="foobar">
		<div id="col1"><a href="#" class="previous">&nbsp;</a></div>
		<div id="col2">
			<div class="viewer">
				<div class="reel">
					<div class="slide"><img src="images/caro1.jpg"> <span>Primeira imagem do slide</span> </div>
					<div class="slide"><img src="images/caro2.jpg"> <span>Segunda imagem do slide</span> </div>
					<div class="slide"><img src="images/caro3.jpg"> <span>Terceira imagem do slide</span> </div>
				</div>
			</div>
		</div>
		<div id="col3"><a href="#" class="next">&nbsp;</a></div>
	</div>
	<script type="text/javascript">

						$('#foobar').slidertron({
							viewerSelector:			'.viewer',
							reelSelector:			'.viewer .reel',
							slidesSelector:			'.viewer .reel .slide',
							navPreviousSelector:	'.previous',
							navNextSelector:		'.next',
							navFirstSelector:		'.first',
							navLastSelector:		'.last'
						});
						
					</script>
	<!-- Fim do slide -->
    <!-- iframe -->
</div>
<div id="page">
	<div id="page-bgtop">
		<div id="content">
                    <!-- texto retirado por motivos ESTETICOS!! -->
            <h2 class="title"><a href="#"></a></h2>
		<iframe src="conteudo_iframe.htm" style="width:620px;height:520px;" frameborder="0" scrolling="no" name="meio"></iframe>
	</div>
		<!-- fim do iframe-->
        <!-- Lista de categorias-->
		<div id="sidebar">
			<ul>
				<li>
					<h2>Categorias</h2>
					<ul>
						<li><a href="#">Artes</a></li>
						<li><a href="#">Autoajuda</a></li>
						<li><a href="#">Biografias</a></li>
						<li><a href="#">Educação</a></li>
						<li><a href="#">Ficção cientifica e fantasia</a></li>
						<li><a href="#">Gastronomia e vinhos</a></li>
						<li><a href="#">História</a></li>
                                                <li><a href="#">Humor</a></li>
                                                <li><a href="#">Livros infantis</a></li>
						<li><a href="#">Mistério e suspense</a></li>
						<li><a href="#">Negócios e investimentos</a></li>
						<li><a href="#">Poesia</a></li>
						<li><a href="#">Psicologia</a></li>
						<li><a href="#">Religião e espiritualidade</a></li>
						<li><a href="#">Romances</a></li>
					</ul>
				</li>
				</ul>
		</div>
		<!-- Fim da lista -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- Fim da pagina -->
</div>
<div id="footer">
	<p>&copy; Untitled. All rights reserved. Design by <a href="" rel="">KLRAIMONDI</a>.</p>
</div>
<!-- Creditos e fechamento do body -->
</body>
</html>