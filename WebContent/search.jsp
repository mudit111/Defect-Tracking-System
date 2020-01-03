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
<title>Search Issue</title>
</head>
<body>
	<h1>Search Issue</h1>
	<form action="SearchIssue" method="post">
		<input type="submit" value="Search By Name" name="issue"> <input
			type="submit" value="Search By Type" name="issue"> <input
			type="submit" value="Search By Project" name="issue"> <input
			type="submit" value="Search By Client" name="issue"> <input
			type="submit" value="Search All Issues" name="issue"> <input
			type="submit" value="Logout" name="issue">
	</form>
</body>
</html>