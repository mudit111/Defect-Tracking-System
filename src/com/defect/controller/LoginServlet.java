package com.defect.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.defect.entity.Password;
import com.defect.service.PasswordBl;
import com.defect.service.PasswordBlImpl;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PasswordBl passwordBl = new PasswordBlImpl();
		Password password = new Password();
		try {
			password = passwordBl.getPassword(request.getParameter("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (password != null) {
			HttpSession session = request.getSession(false);
			session.setAttribute("user", "user");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("userLogged.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("invalidLogin.jsp");
			requestDispatcher.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
