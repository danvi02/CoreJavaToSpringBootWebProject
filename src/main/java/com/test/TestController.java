package com.test;

public class TestController {

	private TestService testService;
	
	public String test() {
		return testService.test();
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

}
