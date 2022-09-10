package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.demo.ee.Product;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix ="com.app" )
public class MyRunner implements CommandLineRunner{
	
	private Product product;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(product);
		
	}

}
