<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar tarefas</title>
<link rel="stylesheet" type="text/css"	href="resources/style.css" />
</head>
<body>

	<h3>Adicionar tarefa</h3>
	<form:errors path="tarefa.descricao" cssStyle="color:red"/>
	<form action="adicionaTarefa" method="post">
		Descri��o: <br>
		<textarea name="descricao" rows="8" cols="80"></textarea><br>
		<br>
		<input type="submit" value="Adicionar" />
	</form>
	
</body>
</html>