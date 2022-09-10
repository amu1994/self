package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Profile implements CommandLineRunner{
	@Autowired
	ExportData eData;

	
	public void run(String... args) throws Exception {
		
		
	}

}
