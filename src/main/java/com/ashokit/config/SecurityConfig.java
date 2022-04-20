package com.ashokit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	protected void configure(HttpSecurity http) throws Exception {
		/*
		 * http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
		 * http.formLogin(); http.httpBasic();
		 */
		http.authorizeRequests()
		    .antMatchers("/balance").authenticated()
		    .antMatchers("/statement").authenticated()
		    .antMatchers("/lone").authenticated()
		    .antMatchers("/home").permitAll()
		    .antMatchers("/contact").permitAll()
		    .and().formLogin()
		    .and().httpBasic();
		
	}

}
