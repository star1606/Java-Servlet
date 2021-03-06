package me.lee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
// 컨트롤러는 빈으로 등록하지 않겠다.
public class AppConfig {

}
