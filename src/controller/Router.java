package controller;

import java.io.IOException;
import com.google.gson.*;

import hillClimbing.Queens;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("started");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		//System.out.println(action);

		try {
			switch (action) {
			case "/":
				main(request, response);
				break;
			default:
				//main(request, response);
				break;
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}
	private void main(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Queens queens = new Queens(8);
		Gson gson = new Gson();
		
		request.setAttribute("queens1", gson.toJson(queens.getPositions()));
		request.setAttribute("board1", gson.toJson(queens.getMatrixCollisions()));
		
		queens.run();
		
		request.setAttribute("solution", gson.toJson(queens.getSolution()));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/main.jsp");
		dispatcher.forward(request, response);
	}
}
