<%@page import="utility.SessionGuard"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="menu.jsp"%>
	<h1>Profilo Utente</h1>
	
	<%
		SessionGuard.getSessionGuard().validateSession(request, response);
	
		String nome = (String) session.getAttribute("nome");
		String cognome = (String) session.getAttribute("cognome");
		out.print("Ciao " + nome + " " + cognome + ", benvenuto nel nostro sito!<br>");
		
		out.print("Autenticato con: " + (String) session.getAttribute("email"));
	%>

</body>
</html>