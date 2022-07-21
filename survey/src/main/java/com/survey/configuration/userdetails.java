package com.survey.configuration;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.survey.model.users;

public class userdetails implements UserDetails {

private users user;
@Autowired
private BCryptPasswordEncoder passwordEncoder;
	
	public userdetails(users user2) {
		this.user=user2;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getUsertype());
        return Arrays.asList(authority);
	}
	@Override
	public String getPassword() {
		
		System.out.print("*******************"+user.getPassword());
		return user.getPassword();
	}

	@Override
	public String getUsername() {

		System.out.print("*******************"+user.getName());
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
