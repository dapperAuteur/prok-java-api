package com.intraedge.project.prok.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.utilities.Utility;


@RestController
@RequestMapping(Utility.apiVersion)
public class SessionPractice {
	
	@RequestMapping("todoapp/count")
	public int count(HttpSession session) {
		int count = 0;
		if(session.getAttribute("count") != null ) {
			count = (int) session.getAttribute("count");
		}
		session.setAttribute("count", count + 1);
		return count;
	}
	
	

}
