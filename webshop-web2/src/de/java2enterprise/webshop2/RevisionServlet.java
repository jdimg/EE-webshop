package de.java2enterprise.webshop2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RevisionServlet
 */
@WebServlet("/revision")
public class RevisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		final PrintWriter out = response.getWriter();
		
		String remoteAddr = request.getRemoteAddr();
		log("Remote address: " + remoteAddr);
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("Ihre IP-Adresse lautet: " + remoteAddr);
		out.println("</body>");
		out.println("</html>");
	}
}