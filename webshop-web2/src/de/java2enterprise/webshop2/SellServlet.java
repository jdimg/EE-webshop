package de.java2enterprise.webshop2;

import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SellServlet
 */
@WebServlet(urlPatterns = {"/sell"}, asyncSupported=true)
@MultipartConfig(
		location="/tmp",
		fileSizeThreshold=1024*1024,
		maxFileSize=1024*1024*10,
		maxRequestSize=1024*1024*30)
public class SellServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final AsyncContext ac = request.startAsync();
		ServletInputStream in = request.getInputStream();
		in.setReadListener(new FotoReadListener(ac));
	}
}