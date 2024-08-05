package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
		// there need to exist a welcome.jsp file in src/main/webapp/WEB-INF/views
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
		// there need to exist a hello.jsp file in src/main/webapp/WEB-INF/views
	}
}
