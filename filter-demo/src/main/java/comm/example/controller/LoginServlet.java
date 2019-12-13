package comm.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String uName=request.getParameter("uName");
	String pass=request.getParameter("uPassword");
	if((uName.equals("dummy"))&& (pass.equals("dummy")))
	{
		HttpSession session=request.getSession();
		session.setAttribute("uName", uName);
		RequestDispatcher view=request.getRequestDispatcher("view.do");
		view.forward(request, response);
	}
	}

}
