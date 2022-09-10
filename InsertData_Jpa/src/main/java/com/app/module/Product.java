package com.app.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "product_table")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private Integer id;
	private String prodname;
	private double prodcost;
	@ManyToOne
	@JoinColumn(name = "vidfk")
	private Vendor vendor;
	

}
