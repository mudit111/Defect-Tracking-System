package com.defect.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserMenuServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") != "user") {
			requestDispatcher = request.getRequestDispatcher("invalidAccess.jsp");
			requestDispatcher.forward(request, response);
		} else {
			switch (request.getParameter("issue")) {
			case "Create New Issue":
				requestDispatcher = request.getRequestDispatcher("/create.jsp");
				requestDispatcher.include(request, response);
				break;
			case "Update Issue":
				requestDispatcher = request.getRequestDispatcher("/update.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Delete Issue":
				requestDispatcher = request.getRequestDispatcher("/delete.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Search Issue":
				requestDispatcher = request.getRequestDispatcher("/search.jsp");
				requestDispatcher.forward(request, response);
				break;
			case "Logout":
				requestDispatcher = request.getRequestDispatcher("/logout.jsp");
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