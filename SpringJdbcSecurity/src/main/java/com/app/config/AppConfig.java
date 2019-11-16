package com.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.app")
@PropertySource("app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public InternalResourceViewResolver invr() {
		InternalResourceViewResolver i=new InternalResourceViewResolver();
		i.setPrefix(env.getProperty("prefix"));
		i.setSuffix(env.getProperty("suffix"));
		return i;
	}
	@Bean
	public BasicDataSource bs() {
		BasicDataSource b=new BasicDataSource();
		b.setDriverClassName(env.getProperty("db"));
		b.setUrl(env.getProperty("url"));
		b.setUsername(env.getProperty("un"));
		b.setPassword(env.getProperty("pwd"));
		return b;
	}
	
	
	
}
