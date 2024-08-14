package com.example.SpringProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringProject1Application {

	public static void main(String[] args) {
		// To activate the bean using config.xml by this class
				ClassPathXmlApplicationContext ctXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
				
				
				//get the reference of that class via id pers and cast it to Person object
				Person pr = (Person)ctXmlApplicationContext.getBean("pers");
				System.out.println(pr.id);
				System.out.println(pr.name);
				System.out.println(pr.age);
				System.out.println(pr.gender);
				pr.eat();
				pr.sleep();
	}

}
