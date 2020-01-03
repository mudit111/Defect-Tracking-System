<%@page import="com.defect.entity.Issue"%>
<%@page import="java.util.List"%>
<%@page import="com.defect.service.IssueBlImpl"%>
<%@page import="com.defect.service.IssueBl"%>
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
	<h1>Issue By Name</h1>
	<table border="1">
		<thead>
			<tr>
				<th>#</th>
				<th>Issue Name</th>
				<th>Issue Type</th>
				<th>Issue Client</th>
				<th>Issue Project</th>
			</tr>
		</thead>
		<tbody>
			<%
				IssueBl issueBl = new IssueBlImpl();
				int i = 1;
				Issue issue = issueBl.getIssue(request.getParameter("name"));
				if (issue != null) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=issue.getIssueName()%></td>
				<td><%=issue.getIssueType()%></td>
				<td><%=issue.getIssueClient()%></td>
				<td><%=issue.getIssueProject()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>