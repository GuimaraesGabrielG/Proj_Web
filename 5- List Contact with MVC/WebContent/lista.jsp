<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home - Lista de Pessoas</title>
</head>
<body>

<c:forEach items="${lista}" var="pessoa">

<p>${pessoa.nome}</p>
<p>${pessoa.email}</p>
<hr>
</c:forEach>


</body>
</html>