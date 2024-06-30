package com.shiham.servlets;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.shiham.services.BookService;

/**
 * Servlet implementation class Books
 */
public class Books extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	public BookService _service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Books() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		var writer = response.getWriter();
		
		try {
			
			_service.CreateBook();
			writer.append("Book Created!");
		} catch (Exception e) {
			writer.append("Error occured: " + e.getMessage());

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
