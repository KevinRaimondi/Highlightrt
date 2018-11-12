<% 
//destroi as sessions iniciadas para realizaчуo do logoff:::::
session.invalidate();
//redireciona apos destroir as sessions para index.......FUNЧAO DE REDIRECIONAMENTO
response.sendRedirect("index.jsp");

%>