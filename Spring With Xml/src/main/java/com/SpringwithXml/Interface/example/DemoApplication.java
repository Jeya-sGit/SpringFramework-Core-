package com.SpringwithXml.Interface.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext con=new ClassPathXmlApplicationContext("NewFile.xml");
		University uni=con.getBean("uni",University.class);
	    uni.display();
		
	}
	

}
//http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
//http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> <!-- bean definitions here -->
//
//<context:annotation-config></context:annotation-config>