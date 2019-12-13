package comm.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.LeagueDao;
import comm.example.dao.LeagueDaoImpl;
import comm.example.model.League;

public class AddLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String title;
	private String season;
	private int year;
	private List<String> errors;
	private LeagueDao dao = null;

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
		errors = new ArrayList<String>();
		String sYear = request.getParameter("year");
		try {
			year = Integer.parseInt(sYear);
		} catch (Exception e) {
			// TODO: handle exception
			errors.add("year field must be numeric");
		}
		title = request.getParameter("title");
		if (title.length() <= 8) {
			errors.add("invalid title");
		}
		season = request.getParameter("season");
		if (season.equals("Unknown")) {
			errors.add("select a season");
		}
		if (!errors.isEmpty()) {
			request.setAttribute("ERROR", errors);
			RequestDispatcher view = request.getRequestDispatcher("add_league.view");
			view.forward(request, response);
		} else {

			League l = new League(season, year, title);
			request.setAttribute("SUCCESS", l);
			dao = new LeagueDaoImpl();
			dao.createLeague(l);
			RequestDispatcher view = request.getRequestDispatcher("add_league.view");
			view.forward(request, response);
		}

	}

}
