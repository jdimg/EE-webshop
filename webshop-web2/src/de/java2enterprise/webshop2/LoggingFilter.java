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

@WebFilter(urlPatterns= {"/sell"}, dispatcherTypes= {DispatcherType.FORWARD})

public class LoggingFilter implements Filter {

	public void destroy() {	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		ServletContext sc = request.getServletContext();
		sc.log("LoggingFilter");
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {	}

}
