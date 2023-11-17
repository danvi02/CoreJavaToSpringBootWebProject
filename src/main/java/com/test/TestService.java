package com.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public String test() {
		return "Test data from service";
	}

}
