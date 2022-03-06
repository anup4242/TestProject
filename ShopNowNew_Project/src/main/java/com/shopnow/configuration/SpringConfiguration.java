package com.shopnow.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@EnableTransactionManagement
@ComponentScan("com.shopnow")
@Configuration
@EnableWebMvc
@PropertySource("classpath:application.properties")
public class SpringConfiguration 
{
	
	@Autowired
	private Environment environment;
	
	@Bean
	public BCryptPasswordEncoder passEncoder()
	{
		
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public InternalResourceViewResolver view()
	{
		System.out.println("in view resolver");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("/WEB-INF/JSP/");
		return viewResolver;
	}
	
	@Bean 
	public LocalSessionFactoryBean sessionFactory()
	{
		
		LocalSessionFactoryBean sessionfactory = new LocalSessionFactoryBean();
		sessionfactory.setHibernateProperties(hiberProperties());
		sessionfactory.setDataSource(dataSource());
		sessionfactory.setPackagesToScan("com.shopnow.model");
		return sessionfactory;
	}
	
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		System.out.println("****************"+environment.getRequiredProperty("jdbc.url"));
		datasource.setDriverClassName(environment.getRequiredProperty("jdbc.drivername"));
		datasource.setUrl(environment.getRequiredProperty("jdbc.url"));
		datasource.setUsername(environment.getRequiredProperty("jdbc.username"));
		datasource.setPassword(environment.getRequiredProperty("jdbc.pass"));
		return datasource;
	}
	
	public Properties hiberProperties()
	{
		System.out.println(environment.getRequiredProperty("hibernate.dialect"));
		Properties hibproperty = new Properties();
		////Important
		hibproperty.put("hibernate.dialect",environment.getRequiredProperty("hibernate.dialect") );
		hibproperty.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		hibproperty.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hdm2ddl.auto"));
		return hibproperty;
	}

	
	@Autowired
	@Bean
	public HibernateTransactionManager transaction(SessionFactory ob)
	{
		HibernateTransactionManager tx = new HibernateTransactionManager();
		
		tx.setSessionFactory(ob);
		
		return tx;
		
	}
}