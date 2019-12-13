

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String fName, lName;

	private List<String> errors = null;
	private String email;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hey I am in controller.do");
		errors = new LinkedList<String>();
		fName = request.getParameter("fName");
		if ((fName == null) || (fName.length() < 5)) {
			errors.add("<font color='red'>first name can't be null or less than 5 chars</font>");
		}
		lName = request.getParameter("lName");
		if ((lName == null) || (lName.length() < 5)) {
			errors.add("<font color='red'>last name can't be null or less than 5 chars</font>");
		}
		
		email = request.getParameter("email").toString();
		if (email.length()<8) {
			errors.add("<font color='red'>email field can't be blank</font>");
		}

		if (!errors.isEmpty()) {
			request.setAttribute("errors", errors);
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
		} else {
			request.setAttribute("success", new Customer(fName, lName,email));
			RequestDispatcher view = request.getRequestDispatcher("success.jsp");
			view.include(request, response);

		}
	}

}
