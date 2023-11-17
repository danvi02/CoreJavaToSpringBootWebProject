package com.test;

public class CoreJavaToSpringBootWebProject{
    public static void main(String[] args) {

        TestController testController = new TestController();
        TestService testService = new TestService();
        testController.setTestService(testService);
        System.out.println(testController.test());
    }
}
