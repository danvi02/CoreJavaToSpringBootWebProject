package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CoreJavaToSpringBootWebProject{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(CoreJavaToSpringBootWebProject.class);
        TestController testController = applicationContext.getBean(TestController.class);
        System.out.println(testController.test());
    }
}
