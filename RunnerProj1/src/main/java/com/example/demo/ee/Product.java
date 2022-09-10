package com.example.demo.ee;


import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data

public class Product {
	private int id;
	private String name;
	private int cost;
 
}
