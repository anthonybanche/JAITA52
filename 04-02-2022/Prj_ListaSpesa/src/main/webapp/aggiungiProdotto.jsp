<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="aggiungiProdotto">
		<input type="text" name="nome">
		<input type="number" name="prezzo" step="0.01"> <!-- Valori numerici decimali fino alla seconda cifra decimale -->
		<input type="text" name="reparto">
		<input type="submit" value="Aggiungi">
	</form>

</body>
</html>