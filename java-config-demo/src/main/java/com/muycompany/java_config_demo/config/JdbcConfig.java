package com.muycompany.java_config_demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.muycompany.java_config_demo.model.CustomerDao;
import com.muycompany.java_config_demo.model.CustomerDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.muycompany.java_config_demo")
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String user;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.driver}")
	private String driver;
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl(url);
		ds.setDriverClassName(driver);
		ds.setUsername(user);
		ds.setPassword(password);
		return ds;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	@Bean
	public CustomerDao customerDao()
	{
		return new CustomerDaoImpl(jdbcTemplate());
	}
	

}
