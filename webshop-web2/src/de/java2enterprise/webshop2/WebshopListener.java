package de.java2enterprise.webshop2;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class WebshopListener
 *
 */
@WebListener
public class WebshopListener implements HttpSessionListener {

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
    	HttpSession session = event.getSession();
    	ServletContext servletContext = session.getServletContext();
    	servletContext.log("SESSION CREATED " + event.toString());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	HttpSession session = event.getSession();
    	ServletContext servletContext = session.getServletContext();
    	servletContext.log("SESSION DESTROYED " + event.toString());
    }
}