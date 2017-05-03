<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostra Parametri</title>
</head>
<body>
	<%@ page import = "java.io.*, javax.servlet.*, javax.servlet.http.*, javax.servlet.http.HttpSession" %>
	<%HttpSession sessione = request.getSession(); %>
	<p> Hai confermato i seguenti dati:</p>
	<p> Nome: <%sessione.getAttribute("NOME"); %> </p>
	<p> Cognome : <%sessione.getAttribute("COGNOME"); %> </p>
</body>
</html>