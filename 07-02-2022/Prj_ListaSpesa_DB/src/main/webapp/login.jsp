<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginJsp</title>
</head>
<body>

	<%@ include file="menu.jsp"%>
	<h1>Login Page</h1>
	<br>

	<form action="login" method="post">
		<label>Email:</label><input type="text" name="email" /> <br>
		<label>Password:</label><input type="password" name="password" /> <br>
		<input type="submit" value="login" />
	</form>

</body>
</html>