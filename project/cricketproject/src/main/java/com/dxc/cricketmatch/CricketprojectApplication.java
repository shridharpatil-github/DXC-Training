package com.dxc.cricketmatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.dxc.cricketmatch.filter.*;
/**
 * @author Paartha
 * CricketprojectApplication main class{@SpringBootApplication} is a convenience
 * annotation that is equivalent to {@Configuration ,@ComponentScan,@EnableAutoConfiguration} 
 *
 */
@SpringBootApplication
public class CricketprojectApplication {
	

	/**
	 * @return registrationBean
	 */
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter()
	{
		final FilterRegistrationBean<JwtFilter> registrationBean=new FilterRegistrationBean<JwtFilter>();
		JwtFilter filter=new JwtFilter();
		registrationBean.setFilter(filter);
		registrationBean.addUrlPatterns("/cricketmatch/api/*");
		return registrationBean;		
	}

	/**
	 * @param args 
	 * run() used to run a {SpringApplication} .
	 */
	public static void main(String[] args) {
		SpringApplication.run(CricketprojectApplication.class, args);
	}

}
