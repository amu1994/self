package com.example.demo.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("${student.id}")
	int id;
	@Value("${student.name}")
	String name;
	@Value("${student.add}")
	String address;
	@Value("${student.mobno}")
	int mobileno;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mobileno=" + mobileno
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
