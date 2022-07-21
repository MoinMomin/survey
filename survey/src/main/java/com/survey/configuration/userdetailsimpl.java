 package com.survey.configuration;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.survey.model.users;
	import com.survey.reposotory.userrepository;
@Service
  public class userdetailsimpl implements UserDetailsService  {
      @Autowired
	private  userrepository urepo;


@Autowired
private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		users user=urepo.getUserByUsername(username);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+user);
		  if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
		return new userdetails(user);
	}

	public users saveUser(users user) {

		String password = user.getPassword();
		String encodedPasswod = passwordEncoder.encode(password);
		user.setPassword(encodedPasswod);

		user = urepo.save(user);
		return user;
	}
	  
  }
 