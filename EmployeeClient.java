package com.niit.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeClient {

	public static void main(String[] args) {
		// Java Traditional way
		Employee eRef = new Employee();
		eRef.setEid(100);
		eRef.setEname("Neeti");
		//eRef.setEaddress("Red Wood Shores");
		
		System.out.println("Employee Details : " +eRef);
		
		//Spring way |(Inversion of Control)
		//We will not create Objects,instead IOC container will create
		//We are just configuring the Objects
		Resource res = new ClassPathResource("employeebean.xml");
		BeanFactory factory=new XmlBeanFactory(res); //api Spring container will parse xml file
		// & create Objects.
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
		
		//2 ways of using getBean method
		Employee e1 = (Employee)factory.getBean("emp1");
		//Employee e2 = factory.getBean("emp2",Employee.class);
		
		//Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee Details : " +e1);
		//System.out.println("Employee Details :" +e2);
	}

}
