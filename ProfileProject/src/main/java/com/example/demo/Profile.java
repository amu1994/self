package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Profile implements CommandLineRunner {
	@Value("${app.com.name}")
	private String name;
	@Value("${app.com.add}")
	private String add;
	

	
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	

	}



	@Override
	public String toString() {
		return "Profile [name=" + name + ", add=" + add + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
