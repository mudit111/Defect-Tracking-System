package com.defect.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.defect.service.IssueBl;
import com.defect.service.IssueBlImpl;

public class DeleteIssue extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") != "user") {
			requestDispatcher = request.getRequestDispatcher("invalidAccess.jsp");
			requestDispatcher.forward(request, response);
		} else {
			IssueBl issueBl = new IssueBlImpl();
			try {
				if (issueBl.deleteIssue(request.getParameter("issueName")) == 1) {
					requestDispatcher = request.getRequestDispatcher("success.jsp");
					requestDispatcher.forward(request, response);
				} else {
					requestDispatcher = request.getRequestDispatcher("failure.jsp");
					requestDispatcher.forward(request, response);
				}
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