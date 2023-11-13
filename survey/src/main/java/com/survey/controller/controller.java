package com.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.survey.model.users;
import com.survey.configuration.userdetailsimpl;
import com.survey.model.survey;
import com.survey.reposotory.surveyrepository;
import com.survey.reposotory.userrepository;

@RestController
public class controller {
	@Autowired 
	userrepository userepo;
	
	@Autowired 
	surveyrepository surverepo;
	@Autowired
	userdetailsimpl  usedetail;
    @PostMapping("/signup")
	public users signup(@RequestBody users us) {
    	return usedetail.saveUser(us);
			
	}
    @GetMapping("/show")
  	public List<users> showusers() {
  		return userepo.findAll();	
  	} 
  	@PostMapping("/createsurvey")
	public survey createsurvey(@RequestBody survey surv) {
  		surverepo.save(surv);
		return surv;	
	}
  	@GetMapping("/showsurvey/{age}/{gender}")
	public List<survey> showsurvey(@PathVariable int age,@PathVariable String gender) {
		return surverepo.findByCriteria(age,gender);
		
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello moin";
	
	}
}
