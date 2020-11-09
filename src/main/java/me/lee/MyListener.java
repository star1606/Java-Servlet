package me.lee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Inintialized");
		sce.getServletContext().setAttribute("name", "lee");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context Destroyed");
	}
}
