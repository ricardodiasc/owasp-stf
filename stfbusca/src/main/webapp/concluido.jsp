<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado cadastro</title>
</head>
<body>
<h1>Cadastro concluido</h1>
<br>
<a href=concluido.jsp?url=index.jsp
<% 
String url = request.getParameter("url");
if(url != null && !url.equals(""))
	response.sendRedirect(url); %>

</body>
</html>