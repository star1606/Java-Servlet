package me.lee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// 디스패처 서블릿 등록 - 스프링부트 없이 사용하는 방법
public class WebApplication implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		// @EnableWebMvc 하려면 설정해놔야됨
		context.setServletContext(servletContext);
		
		//이번에는 web.xml을 사용하지 않고 WebApplicationInitializer에 자바 코드로 디스패처 서블릿 등록하는 방법으로 한다
		context.register(WebConfig.class);
		context.refresh();
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic app = servletContext.addServlet("app", dispatcherServlet);
		app.addMapping("/app/*");
	}
}
