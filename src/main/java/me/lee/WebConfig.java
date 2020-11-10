package me.lee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;


// 다른건 스캔 안하고 컨트롤러만 스캔하겠다
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class) )
public class WebConfig {

}
