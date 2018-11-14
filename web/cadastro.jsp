<%-- 
    Document   : cadastro
    Created on : 07/11/2018, 13:25:27
    Author     : Karoline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="estilo/form.css" />
        <title>Cadastro</title>
    </head>
    <body>
     <div class="formulario">
                    <!--form method="post" action="validar.jsp"-->
                    <form method="post" action="cadUsuario">
                        <label for="txt_usuario">nome</label>
                        <input type="text" name="nome" id="nome" required placeholder="Nome " maxlength="50" size="50"/><br/>
                        <label for="txt_email">E-Mail</label>
                        <input type="text" name="email" id="email" required placeholder="E-Mail " maxlength="50" size="50"/><br/>
                        <label for="txt_senha">Senha*:</label>
                        <input type="password" name="senha" id="senha" required placeholder="Senha" maxlength="14" size="50"/><br/>
                        <input type="submit" value="Enviar"/>
                    </form>
     </div>
                    
                          
    </body>
</html>
