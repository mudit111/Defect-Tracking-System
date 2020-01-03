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
<title>User Logged</title>
</head>
<body>
	<form action="UserMenuServlet" method="post">
		<input type="submit" value="Create New Issue" name="issue"> <input
			type="submit" value="Update Issue" name="issue"> <input
			type="submit" value="Delete Issue" name="issue"> <input
			type="submit" value="Search Issue" name="issue"> <input
			type="submit" value="Logout" name="issue">
	</form>
</body>
</html>