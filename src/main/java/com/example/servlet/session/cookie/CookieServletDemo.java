package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServletDemo
 */
@WebServlet("/CookieServletDemo")
public class CookieServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		out.print("Welcome " + firstName + " " + lastName);
		Cookie ck = new Cookie("firstName", firstName);
		Cookie ck1 = new Cookie("lastName", lastName);
		response.addCookie(ck);
		response.addCookie(ck1);
		out.print("<form action='CookieWelcomeServletDemo'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();
	}

}
