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
<title>Issue By Name</title>
</head>
<body>
	<form action="issueByName.jsp" method="post">
		Name: <input type="text" name="name" required="required" /> <input
			type="submit" value="Search">
	</form>
</body>
</html>