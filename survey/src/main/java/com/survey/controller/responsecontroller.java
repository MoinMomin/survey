package com.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.survey.model.response;
import com.survey.reposotory.responserepository;

@RestController
public class responsecontroller {
	@Autowired 
	responserepository resprepo;
    @PostMapping("/saveresponse")
	public String saveresponse(@RequestBody response reso) {
    	int i=resprepo.findresponseByUIDandRid(reso.getUid(),reso.getRid()).size();
	if(i==0) {
		resprepo.save(reso);
		return " you already saved resopnse";
	}
	return "response saved successfully";
	
	}
   @GetMapping("/showresponse/{uid}")
    public List<response> responses(@PathVariable int uid) {
	  return resprepo.findUid(uid);
    }
}
