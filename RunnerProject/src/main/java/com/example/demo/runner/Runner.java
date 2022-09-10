package com.example.demo.runner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "emp")
public class Runner implements CommandLineRunner {
	
	private int id;
	private String name;
	private String address;
//	 private List<String> list;
//	private Map<String, Integer> map;
//	
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
