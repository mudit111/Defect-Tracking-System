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
<title>Create Issue</title>
</head>
<body>
	<h1>Create New Issue</h1>
	<form action="CreateIssue" method="post">
		Issue Name: <input type="text" required="required" name="issueName"><br>
		<br> Issue Type: <select name="issueType">
			<option value="bug">Bug</option>
			<option value="enhancement">Enhancement</option>
			<option value="work request">Work Request</option>
		</select> <br>
		<br> Issue Project: <input type="text" required="required"
			name="issueProject"><br>
		<br> Issue Client: <input type="text" required="required"
			name="issueClient"><br>
		<br> <input type="submit" value="Create Issue">
	</form>
</body>
</html>