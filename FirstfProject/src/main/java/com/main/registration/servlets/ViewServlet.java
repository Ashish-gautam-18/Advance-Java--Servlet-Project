 package com.main.registration.servlets;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String linkName = request.getParameter("linkName");
    	List<User> listUser = null;
    	String msg=null;
    	switch(linkName) {
		case "delete":	
			String username=request.getParameter("username");
			UserDAO.delete(username);
			msg= "Deleted Sucessfully";
			break;
		case "edit":
			String uname=request.getParameter("uname");
			String email=request.getParameter("email");
			String username1=request.getParameter("username");
			 String password=request.getParameter("password");
			 String mobileNo=request.getParameter("number");
			 UserDAO.updateProfile(uname, email, username1, password, mobileNo);
			 msg= "Edited Succesfully";
			 break;
    	}
		try {
			listUser = UserDAO.selectAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listUser", listUser);
		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
		dispatcher.forward(request, response);
    }
}
 