package com.stackroute.book.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stackroute.book.model.Book;
import com.stackroute.book.model.User;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.stackroute.book")
@EnableWebMvc
@EnableAspectJAutoProxy

public class ApplicationContextConfig {

	
	@Bean
	@Autowired
	// DataSource object/Bean storing the
	// details related to the connection
	// like driver, the URL, the username
	// password
	public DataSource dataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // loop back ip address or localhost
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/employeedb");	
		dataSource.setUsername("root");
		dataSource.setPassword("root");
	    return dataSource;
	}
	
	@Bean
	@Autowired
	
	// This bean is basically mapping datasource and 
	// hibernate settings
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource)
	{
	 LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
     sessionFactoryBean.setDataSource(dataSource);	
     Properties hibernateProperties=new Properties();
     hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
     hibernateProperties.put("hibernate.show_sql","true");
     hibernateProperties.put("hibernate.hbm2ddl.auto","update");
     sessionFactoryBean.setAnnotatedClasses(User.class,Book.class);
     sessionFactoryBean.setHibernateProperties(hibernateProperties);
     return sessionFactoryBean;
	}
	
	@Bean
	@Autowired
	/* This bean is responsible for performing the insertion/deletion/updation within a transaction process */
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransaction=new HibernateTransactionManager();
		hibernateTransaction.setSessionFactory(sessionFactory);
		return hibernateTransaction;
		
	}
	
}
