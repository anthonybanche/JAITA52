<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Modifica studente <a href="listaStudenti"> Indietro </a>
	<form method="post" action="modificaStudente">
		Id: <input type="number" name="id" hidden value="<%=request.getAttribute("id")%>"><br>
		Nome: <input type="text" name="nome" value="<%=request.getAttribute("nome")%>"><br>
		Cognome:<input type="text" name="cognome" value="<%=request.getAttribute("cognome")%>"><br>
		Genere:<input type="text" name="genere" value="<%=request.getAttribute("genere")%>"><br>
		Indirizzo:<input type="text" name="indirizzo" value="<%=request.getAttribute("indirizzo")%>"><br>
		Città:<input type="text" name="citta" value="<%=request.getAttribute("citta")%>"><br>
		Provincia:<input type="text" name="provincia" value="<%=request.getAttribute("provincia")%>"><br>
		Regione:<input type="text" name="regione" value="<%=request.getAttribute("regione")%>"><br>
		Email:<input type="text" name="email" value="<%=request.getAttribute("email")%>"><br>
		<!--   Date Nascita:<input type="text" name="reparto"><br> -->
		<input type="submit" value="Salva">
	</form>

</body>
</html>