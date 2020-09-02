package com.stackroute.keepnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.stackroute.keepnote.filter.JwtFilter;

@SpringBootApplication
public class KeepnoteserviceApplication {
	
	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter()
	{
		final FilterRegistrationBean<JwtFilter> registrationBean=new FilterRegistrationBean<JwtFilter>();
		JwtFilter filter=new JwtFilter();
		registrationBean.setFilter(filter);
		registrationBean.addUrlPatterns("/api/v2/note/*");
		return registrationBean;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(KeepnoteserviceApplication.class, args);
	}

}
