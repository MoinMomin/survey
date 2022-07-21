
package com.survey.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.survey.model.users;

@Configuration

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	userdetailsimpl uds;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println(uds);
		auth.userDetailsService(uds).passwordEncoder(encoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
		.antMatchers("/signup","/show","/swagger-ui/*").permitAll()
		
		//.antMatchers("/showsurvey/*/*").authenticated()
				.antMatchers("/createsurvey","/showresponse/*").hasAuthority("Coordinator")
				// .antMatchers("/common").hasAnyAuthority("Employeee,Manager,Admin")
				.anyRequest().authenticated()

				.and().formLogin()//.defaultSuccessUrl("/welcome", true)

				//.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

				.and().exceptionHandling().accessDeniedPage("/accessDenied");

	}
}
