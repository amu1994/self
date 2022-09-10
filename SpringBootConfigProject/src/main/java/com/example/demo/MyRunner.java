package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "my.key")

public class MyRunner implements CommandLineRunner {
	private int id;
	private String name;
	private String address;
	private double salary;
	
	private List<String>list;
   
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		

	}
	

	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "MyRunner [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", list="
				+ list + "]";
	}

	

}
