package com.example.demo.stu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")

public class Student { 
	@Value("${my.id}")
	int id;
	@Value("${my.name}")
	String name;
	@Value("${my.address}")
	String address;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
