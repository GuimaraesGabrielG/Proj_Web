<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>
	<form action="PessoaController" method="get">
		<label for="fname">Nome</label><br> 
		<input type="text" id="idnome" name="txtNome"><br> 
			
		<label for="lname">Email</label><br> 
		<input type="text" id="idemail" name="txtEmail">
			
		<br><br> 
		<button type="submit">Enviar</button>
	</form>
</body>
</html>