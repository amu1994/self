package com.app.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.com.ProductRepo;
import com.app.com.VendorRepo;
import com.app.module.Product;
import com.app.module.Vendor;
@Component
public class InsertData implements CommandLineRunner {
	
	@Autowired
	private VendorRepo vendorRepo;
	@Autowired
	 private ProductRepo productRepo;

	
	public void run(String... args) throws Exception {
		Vendor v1 = new Vendor(101, "ashish", "gaurcity");
		Vendor v2 = new Vendor(102, "alok", "prathalachowk");
		vendorRepo.save(v1);
		vendorRepo.save(v2);
		
		Product p1 = new Product(201, "cricket bat", 4000, v1);
		Product p2 = new Product(202, "hue tshirts", 2000, v1);
		Product p3 = new Product(203, "beer stock", 1400, v2);
		Product p4 = new Product(204, "oyo rooms", 1000, v2);
		productRepo.save(p1);
		productRepo.save(p2);
		productRepo.save(p3);
		productRepo.save(p4);
	}

}
