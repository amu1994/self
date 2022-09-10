package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



import com.example.demo.student.Student;



@SpringBootApplication
public class SelfProjectApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(SelfProjectApplication.class, args);
		    Student a = Context.getBean("stu", Student.class);
		    System.out.println(a);
	}

}
