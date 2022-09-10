package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.stu.Student;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class AmitApplication {

	public static void main(String[] args) {
 	  ConfigurableApplicationContext co = SpringApplication.run(AmitApplication.class, args);
 	     Student aa = co.getBean("stud", Student.class);
 	     System.out.println(aa);
	}

}
