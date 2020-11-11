package me.lee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


// 다른건 스캔 안하고 컨트롤러만 스캔하겠다
@Configuration
//@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class) )
@ComponentScan
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/", "jsp");
	}
	
	// 포매터, 인터셉터 설정가능
	@Override
	public void addFormatters(FormatterRegistry registry) {
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	}
	
//	@Bean
//	public HandlerMapping handleMapping() {
//		RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
//		handlerMapping.setInterceptors();
//		handlerMapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		return handlerMapping;
//	}
	
//	@Bean
//	public HandlerAdapter handlerAdapter() {
//		RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
//		// argument를 만들어서 보낼 수 있다.
//		//handlerAdapter.seta
//		return handlerAdapter;
//	}
	
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setPrefix("/WEB-INF/");
//		viewResolver.setSuffix(".jsp");
//		return viewResolver;
//	}
	
	
	
}
