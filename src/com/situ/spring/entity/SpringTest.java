package com.situ.spring.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student student = (Student)context.getBean("student");
    	System.out.println(student);
    	System.out.println("dasdada");
    
    }
}
