package de.java2enterprise.webshop2;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class IsSecureLogger
 */
@WebFilter(urlPatterns={"/*"}, dispatcherTypes= {
			DispatcherType.REQUEST,
			DispatcherType.FORWARD,
			DispatcherType.INCLUDE,
			DispatcherType.ASYNC,
			DispatcherType.ERROR}, asyncSupported=true)
public class IsSecureLogger implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ServletContext sc = request.getServletContext();
		sc.log("LoggingFilter...");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {	}

}