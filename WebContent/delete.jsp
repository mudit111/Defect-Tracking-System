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
<title>Delete Issue</title>
</head>
<body>
	<h1>Delete Issue</h1>
	<form action="DeleteIssue" method="post">
		Issue Name: <input type="text" required="required" name="issueName"><br>
		<br> <input type="submit" value="Delete Issue">
	</form>
</body>
</html>