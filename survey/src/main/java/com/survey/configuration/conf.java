package com.survey.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
public class conf {
	@Bean
	 BCryptPasswordEncoder passwordEncoder() {
		 // System.out.println("12121212"); 
		  return new BCryptPasswordEncoder();}
}
