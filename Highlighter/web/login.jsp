
<%!
   int i;
   String erro;
 %>
<%
 if (session.getAttribute("erro")!= null){
       erro =(String) session.getAttribute("erro");
   }
   else{
       erro="0";
   }
%>
<!doctype html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8" />
        <link rel="stylesheet" type="text/css" href="estilo/form.css" />
    </head>
    <body>
        <div class="formulario">
                    <!--form method="post" action="validar.jsp"-->
                    <form method="post" action="logarUsuario">
                        <label for="usuario">E-Mail*:</label>
                        <input type="text" name="usuario" id="usuario" required placeholder="Usuário" maxlength="50" size="50"/><br/>
                        <label for="senha">Senha*:</label>
                        <input type="password" name="senha" id="senha" required placeholder="Senha" maxlength="14" size="50"/><br/>
                        <input type="submit" value="Enviar"/>
                    </form>
                    <%
                        if(erro=="1"){
                    %>
                            <div class="alert alert-danger">
                                Usuário e/ou senha incorretos!
                            </div>
                    <%
                        }
                        if(erro=="2"){
                    %>
                            <div class="alert alert-danger">
                                Página restrita efetue login
                            </div>
                    <%
                        }
                    %>
                </div>
           
    </body>
</html>















