<% 
//destroi as sessions iniciadas para realiza��o do logoff:::::
session.invalidate();
//redireciona apos destroir as sessions para index.......FUN�AO DE REDIRECIONAMENTO
response.sendRedirect("index.jsp");

%>