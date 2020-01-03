<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%
	session = request.getSession(false);
	if (session.getAttribute("user") != "user") {
		response.sendRedirect("invalidAccess.jsp");
	}
%>
<head>
<meta charset="ISO-8859-1">
<title>Thankyou</title>
</head>
<body>
<h1>Logged Out</h1>	
</body>
</html>