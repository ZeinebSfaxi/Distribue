package com.esprit.jobs;

import org.springframework.web.bind.annotation.RequestMapping;

public class JobRestAPI {
	private String title="Hello";
	
	@RequestMapping("/hello") //path mte37ha
	public String sayHello() {
		System.out.println(title);
		return title;
	}

}
