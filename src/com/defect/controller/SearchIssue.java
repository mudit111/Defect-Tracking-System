package com.defect.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchIssue extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") != "user") {
			requestDispatcher = request.getRequestDispatcher("invalidAccess.jsp");
			requestDispatcher.forward(request, response);
		} else {
			switch (request.getParameter("issue")) {
			case "Search By Name":
				requestDispatcher = request.getRequestDispatcher("searchByName.jsp");
				requestDispatcher.include(request, response);
				break;
			case "Search By Type":
				requestDispatcher = request.getRequestDispatcher("searchByType.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Search By Project":
				requestDispatcher = request.getRequestDispatcher("searchByProject.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Search By Client":
				requestDispatcher = request.getRequestDispatcher("searchByClient.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Search All Issues":
				requestDispatcher = request.getRequestDispatcher("searchAllIssues.jsp");
				requestDispatcher.forward(request, response);
				break;

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}