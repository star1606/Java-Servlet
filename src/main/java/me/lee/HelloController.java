package me.lee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello, DispatcherServlet used," + helloService.getName();
	}
	// 뷰 객체 찾아지고 뷰에다가 모델 객체를 바인딩해서 뷰를 렌더링함
	// 뷰를 리스폰스에다가 실어서 보냄
	@GetMapping("/sample")
	public String sample() {
		return "/WEB-INF/sample.jsp";
	}
}
