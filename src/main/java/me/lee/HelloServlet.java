package me.lee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	
	// 독자적으로 실행 불가능하다. 톰캣이 필요하다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// web.xml에서 설정해서 ApplicationContext를 꺼내 쓸 수 있다.
		// 서블릿 컨텍스트를 통해서 애플리케이션 컨텍스트를 꺼낸다.
		System.out.println("doget감");
			
		ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		// IoC컨테이너에 있는 Bean을 꺼내서 쓰는 것임
		// 그리고 애플리케이션 컨텍스트에서 빈을 가져온다

		HelloService helloService = context.getBean(HelloService.class);
		
		
		System.out.println("doGet");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<body>");
		//resp.getWriter().println("<h1>Hello " + getName() + "</h1>"); 이거는 서블릿에서 등록한거 바로 가져온거
		resp.getWriter().println("<h1>Hello " + helloService.getName() + "</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("</html>");
	}
	

//	private Object getName() {
//		return getServletContext().getAttribute("name");
//	}
	

	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
}
