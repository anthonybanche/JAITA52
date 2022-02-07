<%@page import="model.Prodotto"%>
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

	<%@ include file="menu.jsp"%>

	<table>
	<tr> 
		<th>ID</th>	
		<th>Nome</th>
		<th>Prezzo</th>
		<th>Reparto</th>	
		<th>Azioni</th>	
	</tr>
	
	<%
 		List<Prodotto> lista = (List<Prodotto>) request.getAttribute("lista");
		if(lista!=null){
			for(Prodotto p : lista){
				out.print("<tr>");
				out.print("<th>" + p.getId() + "</th>");
				out.print("<th>" + p.getNome() + "</th>");
				out.print("<th>" + p.getPrezzo() + "</th>");
				out.print("<th>" + p.getCategoria() + "</th>");
				out.print("<th>" + 
					"<form method = \"post\" action=\"removeProdotto?id=" + p.getId() + "\">" +
					"<input type=\"submit\"><i class=\" fa fa-trash \"></i></input>" +
					"</form>"
					+ "</th>");
				out.print("</tr>");
			}
		}else{
			out.print("<br> Non ci sono prodotti in lista <br>");
		}
		
		
	%>

	</table>
	
	<a href="aggiungiProdotto.jsp">Aggiungi Prodotto</a>
	
</body>
</html>