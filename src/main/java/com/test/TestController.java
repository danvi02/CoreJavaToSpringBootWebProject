package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestController {
	
	@Autowired
	private TestService testService; 
	
	public String test() {
		return testService.test();
	}

}
