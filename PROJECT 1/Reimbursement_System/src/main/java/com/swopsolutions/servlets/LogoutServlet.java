package com.swopsolutions.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	public static String hello = "hello";
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		request.getRequestDispatcher("index.html").include(request, response);
		HttpSession session = request.getSession(false);
		if( session !=null) {
			session.invalidate();
		}
		pw.println("<p>Your are successfully logged out</p>");
		pw.println("</div>");
		pw.println("<a href=\"login\"> back to login<a/>");
		pw.println("</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("wass good");
	}
}