package com.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration // optional
@ComponentScan(basePackages = "com.mvc")
@EnableWebMvc
public class AppConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/views/");
		vw.setSuffix(".jsp");
//		vw.setViewClass(JstlView.class); // optional
		return vw;
	}
	
}
