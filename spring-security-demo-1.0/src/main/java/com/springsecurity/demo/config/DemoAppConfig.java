package com.springsecurity.demo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springsecurity.demo")

public class DemoAppConfig {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public DataSource securityDataSource() {

		// create connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();

		// set the jdbc driver class

		try {
			securityDataSource.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}

		// set database connection props

		securityDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring_security_demo_plaintext?useSSL=false");
		securityDataSource.setUser("root");
		securityDataSource.setPassword("Passw0rd@1234");

		// set connection pool props

		securityDataSource.setInitialPoolSize(5);

		securityDataSource.setMinPoolSize(5);

		securityDataSource.setMaxPoolSize(20);

		securityDataSource.setMaxIdleTime(3000);

		return securityDataSource;
	}

}
