package com.stackroute.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@EnableWebMvc
@Configuration
@ComponentScan("com.stackroute.controller")
/* This configuration class is equivalent to servletname-servlet.xml */

public class WebConfig implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver internalResourceViewResolver()
	{
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setViewClass(JstlView.class);
		view.setPrefix("/WEB-INF/views/");
		view.setSuffix(".jsp");
		return view;
		
	}
	

}
