package com.example.SpringProject4.SpringProject4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringProject4Application {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		Company company = (Company)ctx.getBean("c1");
		System.out.println(company);
		

	}
}
