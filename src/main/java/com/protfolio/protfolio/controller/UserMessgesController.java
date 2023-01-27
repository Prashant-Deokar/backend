package com.protfolio.protfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protfolio.protfolio.entity.UserMessgesEntity;
import com.protfolio.protfolio.repository.UserMessgesRepository;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:60985")

public class UserMessgesController {

	@Autowired
	private UserMessgesRepository userMessgesRepository;
//	 @RequestMapping("/")
//	    public String home(){
//	        return "Hello World!";
//	    }
	@CrossOrigin("http://localhost:60985")
	 @PostMapping("/meassge")
	  UserMessgesEntity newMeassge(@RequestBody UserMessgesEntity newMeassge) {
	    return userMessgesRepository.save(newMeassge);
	  }
}
