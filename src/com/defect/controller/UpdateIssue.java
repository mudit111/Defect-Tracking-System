package com.defect.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.defect.entity.Issue;
import com.defect.service.IssueBl;
import com.defect.service.IssueBlImpl;

public class UpdateIssue extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") != "user") {
			requestDispatcher = request.getRequestDispatcher("invalidAccess.jsp");
			requestDispatcher.forward(request, response);
		} else {
			Issue issue = new Issue();
			issue.setIssueName(request.getParameter("issueName"));
			issue.setIssueType(request.getParameter("issueType"));
			IssueBl issueBl = new IssueBlImpl();
			try {
				System.out.println(issueBl.updateIssue(issue));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
