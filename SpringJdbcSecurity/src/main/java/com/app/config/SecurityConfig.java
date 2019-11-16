package com.app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:app.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private Environment env;
	
   	@Override
   	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
   		auth.jdbcAuthentication().dataSource(ds).usersByUsernameQuery(env.getProperty("sql1"))
   		    .authoritiesByUsernameQuery(env.getProperty("sql2"))
   		    .passwordEncoder(encoder);
   	}
   	
   @Override
   protected void configure(HttpSecurity http) throws Exception {
	
	   http.authorizeRequests()
	   .antMatchers("/all").permitAll()		   
	   .antMatchers("/admin").hasAuthority("AADMIN")
       .antMatchers("/emp").hasAnyAuthority("EMP")
	   .anyRequest().authenticated()
	   .and().formLogin().defaultSuccessUrl("/view",true)
	   .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	   .and().exceptionHandling().accessDeniedPage("/denied")
	   						   ;
	   						   
   }

}
