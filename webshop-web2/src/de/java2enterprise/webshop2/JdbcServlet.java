package de.java2enterprise.webshop2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcServlet
 */
//@WebServlet(urlPatterns= {"/db_settings"},
//	initParams = {
//		@WebInitParam(name="driver", value="oracle.jdbc.OracleDriver"),
//		@WebInitParam(name="url", value="jdbc:oracle:thin:@//localhost:1521/XE"),
//		@WebInitParam(name="username", value="onlineshop_user"),
//		@WebInitParam(name="password", value="123456"),
//	}
//)
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		final String driver = getInitParameter("driver");
//		final String url = getInitParameter("url");
//		final String username = getInitParameter("username");
//		final String password = getInitParameter("password");
		final String jdbc_properties = getInitParameter("jdbc_properties");
//		final ServletContext application = getServletContext();
		final InputStream in = new FileInputStream(jdbc_properties);
		final Properties p = new Properties();
		p.load(in);
		
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<br>driver: " + p.getProperty("driver"));
		out.println("<br>url: " + p.getProperty("url"));
		out.println("<br>username: " + p.getProperty("username"));
		out.println("<br>password: " + p.getProperty("password"));
		out.println("</body>");
		out.println("</html>");
	}
}