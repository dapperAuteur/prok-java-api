package com.intraedge.project.prok.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class Controller {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getRoute() {
		System.out.println("get route");
		return "It works";
	}

}
