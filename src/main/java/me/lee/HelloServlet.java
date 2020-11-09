package me.lee;

import java.io.IOException;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//HttpServlet이 아
public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>Hello Servlet</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("</html>");
	}
	

	// 독자적으로 실행 불가능하다. 톰캣이 필요하다.
	
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
}
