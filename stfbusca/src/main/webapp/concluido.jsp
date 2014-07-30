<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado cadastro</title>
</head>
<body>
<h1>Cadastro concluido</h1>
<br>
<a href=concluido.jsp?url=index.jsp>Voltar</a>
<% 
String url = request.getParameter("url");
if(url != null && !url.equals(""))
	response.sendRedirect(url); %>

</body>
</html>