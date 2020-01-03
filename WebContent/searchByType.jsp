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
		Client: <input type="text" name="type" required="required" /> <input
			type="submit" value="Search">
	</form>
</body>
</html>