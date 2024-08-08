package com.kh.controller;

import java.io.IOException;

import com.kh.model.dao.EmployeeDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		EmployeeDAO dao = new EmployeeDAO();		
	}
		Employee employee = dao.search(id)
				
			if(employee!=null) {
				request.getAtribute("employee");
				request.getRequestDispatcher("views/search.jsp");
			} else {
				response.sendRedirect("views/fail.jsp");
			}

}

}