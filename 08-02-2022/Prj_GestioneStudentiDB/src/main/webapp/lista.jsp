<%@page import="model.Studente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

	<table>
	<tr> 
		<th>ID</th>	
		<th>Nome</th>
		<th>Cognome</th>
		<th>Genere</th>
		<th>Indirizzo</th>
		<th>Citta</th>	
		<th>Provincia</th>	
		<th>Regione</th>	
		<th>Email</th>	
		<th>Data Nascita</th>	
		<th>Data Inserimento</th>	
	</tr>
	
	<%
 		List<Studente> lista = (List<Studente>) request.getAttribute("listaStudenti");
		if(lista!=null){
			for(Studente p : lista){
				out.print("<tr>");
				out.print("<td>" + p.getId() + 	 "</td>");
				out.print("<td>" + p.getNome() + "</td>");
				out.print("<td>" + p.getGenere() + "</td>");
				out.print("<td>" + p.getCognome() + "</td>");
				out.print("<td>" + p.getIndirizzo() + "</td>");
				out.print("<td>" + p.getCitta() + "</td>");
				out.print("<td>" + p.getProvincia() + "</td>");
				out.print("<td>" + p.getRegione() + "</td>");
				out.print("<td>" + p.getEmail() + "</td>");
				out.print("<td>" + p.getDataNascita() + "</td>");
				out.print("<td>" + p.getDataInserimento() + "</td>");
				out.print("<td>" + 
							"<form method = \"post\" action=\"cancellaStudente?deleteId=" + p.getId() + "\">" +
							"<input type=\"submit\">Elimina</input>" +
							"</form> </td>");
				out.print("<td>" + 
						"<form method = \"get\" action=\"modificaStudente\">"+
						"<input type=\"text\" hidden name=\"modificaId\" value=\""+p.getId()+ "\" >" +
						"<input type=\"submit\">Modifica</input>" +
						"</form> </td>");
				out.print("</tr>");
			}
		}else{
			out.print("<br> Non ci sono prodotti in lista <br>");
		}
		
		
	%>

	</table>
	
	<% 
	String msg=(String)request.getAttribute("avvisoMessaggio");
	if(msg!=null){
		out.print("<script>alert(\""+msg+"\");</script>");
	}
	%>
	
</body>
</html>