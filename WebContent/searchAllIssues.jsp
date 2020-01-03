<%@page import="com.defect.service.IssueBlImpl"%>
<%@page import="com.defect.service.IssueBl"%>
<%@page import="com.defect.entity.Issue"%>
<%@page import="java.util.List"%>
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
<title>All Issues</title>
</head>
<body>
	<h1>All Issues</h1>
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
				List<Issue> issueList = issueBl.getAllIssues();
				for (Issue u : issueList) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=u.getIssueName()%></td>
				<td><%=u.getIssueType()%></td>
				<td><%=u.getIssueClient()%></td>
				<td><%=u.getIssueProject()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>