<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TestJsp</title>
</head>
<body>
	<h1>Ciao a tutti</h1>
	<ul>
		<li>Codici di OK - 2XX</li>
		<li>Codici Codici che rappresentano una risposta dal server che
			non è stata in grado di soddisfare la richiesta - 4XX</li>
		<li>Codici di K.O. - 5XX</li>
	</ul>

	<form action="utente.jsp">
		<label>Nome: </label><input type="text" name="nome"> <label>Cognome:
		</label><input type="text" name="cognome"> <input type="submit">
	</form>

	<form action="redirect.jsp">
		<input type="submit">
	</form>

	<br>

	<form action="divisione.jsp">
		Numero1: <input type="text" name="num1" /><br> Numero2: <input
			type="text" name="num2" /><br> <input type="submit"
			value="Dividi!" />
	</form>

	<br>
	<form action="controller">
		<label>Nome da passare al controller:</label> <input type="text"
			name="nome"><br> 
		<label>Cognome da passare al controller:</label> <input type="text"
			name="cognome"><br> 
		<input type="submit" value="Invia al controller" />
	</form>

	
	<jsp:useBean id="calc" class="bean.Calcolatrice" />
	<% out.print(calc.hello()); %>

</body>
</html>