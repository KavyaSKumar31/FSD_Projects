package comm.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.model.Customer;

@WebServlet("/search.do")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerDAO dao = null;

	@Override
	public void init() throws ServletException {
		dao = new CustomerDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProccess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProccess(request, response);
	}

	protected void doProccess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Customer> list=dao.findCustomer(request.getParameter("search"));
		if(list.isEmpty())
		{
			RequestDispatcher view=request.getRequestDispatcher("list.do");
			view.forward(request, response);
		}
		else
		{
			request.setAttribute("customers", list);
			RequestDispatcher view=request.getRequestDispatcher("search-list.jsp");
			view.forward(request, response);
		}

	}

}
