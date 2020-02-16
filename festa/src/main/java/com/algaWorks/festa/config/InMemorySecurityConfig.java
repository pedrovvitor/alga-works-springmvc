package com.algaWorks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication
.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
		builder.inMemoryAuthentication()
		.withUser("pedro").password("{noop}123").roles("ADMIN");
		
	}
}
