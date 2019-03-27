package com.niit.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		
		Student student=(Student)context.getBean("student");
		System.out.println("Name : "+ student.getName());
		System.out.println("Age " +student.getAge());
	}

}
