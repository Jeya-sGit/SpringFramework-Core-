package com.SpringwithXml.Autowiring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext con=new ClassPathXmlApplicationContext("NewFile1.xml");
		College clg=con.getBean("clg",College.class);
	    clg.display();
	    
	  
		
	}
	

}
