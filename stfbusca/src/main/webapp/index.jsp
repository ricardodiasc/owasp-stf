<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>	
<body>

	<div id="lessonContent">
		<form accept-charset="UNKNOWN" method="GET" name="form"
			action="index.jsp" enctype="">
			<h1>S Search</h1>
			<table align="center" cellspacing="0" border="0" cellpadding="2">
				<tbody>
					<tr>
						<td colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<th colspan="2" align="center">A fonte de buscas.</th>
					</tr>
					<tr>
						<td colspan="2">&nbsp;</td>
					</tr>
					<tr>
						<td align="right"><b>Pesquisar: </b></td>
						<td align="left"><input name="busca" type="TEXT"
							value=""></td>
					</tr>
					<tr align="center">
						<td colspan="2"><input name="SUBMIT" type="SUBMIT"
							value="Search"></td>
					</tr>
				</tbody>
			</table>
			<% String busca = request.getParameter("busca");	%>
			<%if(busca != null && !busca.equals("")){ %>
			<br>
			<hr>
			<br>Results for: <%= busca %>
			<!-- Search results  -->
			<br>
			<br>
			<b>Nenhum resultado encontrado.</b>
			<!-- End of Search results  -->
			<%} %>
		</form>
	</div>

</body>
</html>