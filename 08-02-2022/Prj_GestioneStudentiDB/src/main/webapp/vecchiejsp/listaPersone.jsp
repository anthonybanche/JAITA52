<%@page import="model.Persona"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="repository.Database"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% 
 Database db= Database.getDatabase(); 
 List<Persona> lp=db.getListaPersone();
 
 out.print("<ul>");
 for(Persona p:lp){
	 out.print( "<li>"+p.getNome()+" "+p.getCognome()+" "+p.getEmail()+"</li>");
 }
 out.print("</ul>");
 
 %>

</body>
</html>