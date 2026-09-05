package com.main.registration.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
        String mobileNo = request.getParameter("number");
        String password = request.getParameter("password");
		User user = (User) UserDAO.search(mobileNo,password);
		request.setAttribute("user", user);
		if(user!=null) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("SearchSucess.jsp");
		dispatcher.forward(request, response);}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("SearchFail.jsp");
			dispatcher.forward(request, response);
		}
	}

}