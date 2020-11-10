package me.lee;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter Init");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter");
		chain.doFilter(request, response); // 필터 체인에다가 doFilter 메소드로 연결해줘야함
		// 마지막 필터는 서블릿에 연결됨.
	}
	@Override
	public void destroy() {
		System.out.println("Filter Destroy");
		
	}
}
