package de.java2enterprise.webshop2;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter("/register")
public class SecurityFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String code = request.getParameter("code");
		if("supergeheim123".equals(code)) {
			chain.doFilter(request, response);
		} else {
			final String remoteAddr = request.getRemoteAddr();
			final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			final String requestURI = httpServletRequest.getRequestURI();
			final ServletContext sc = request.getServletContext();
			sc.log("Warning: importer access by remoteAddr " + remoteAddr + " on " + requestURI);
			final RequestDispatcher dispatcher = request.getRequestDispatcher("signedout.html");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
