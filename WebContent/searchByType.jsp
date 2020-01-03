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
<title>Issues By Type</title>
</head>
<body>
	<form action="issueByType.jsp" method="post">
		Type: <select name="type">
			<option value="bug">Bug</option>
			<option value="enhancement">Enhancement</option>
			<option value="work request">Work Request</option>
		</select> <input type="submit" value="Search"/>
	</form>
</body>
</html>