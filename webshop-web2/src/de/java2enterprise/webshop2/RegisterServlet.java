package de.java2enterprise.webshop2;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		final String email = request.getParameter("email");
		final String password = request.getParameter("password");
		
/*		final Cookie customer_email = new Cookie("email", email);
		response.addCookie(customer_email);
		final Cookie customer_password = new Cookie("password", password);
		response.addCookie(customer_password);
	*/
		
		final RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.forward(request, response);
		
//		final PrintWriter out = response.getWriter();
//		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<br>Ihre eingegebenen Daten:");
//		out.println("<br>E-Mail: " + email);
//		out.println("<br>Password: " + password);
//		out.println("</body>");
//		out.println("</html>");
	}
}