package com.example.demo.insert;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.module.Boy;
import com.example.demo.module.Girl;
import com.example.demo.repo.BoyRepository;
import com.example.demo.repo.GirlRepo;
@Component
public class InsertData implements CommandLineRunner {

	@Autowired 
	private BoyRepository boyRepository;
	@Autowired
	private GirlRepo girlRepo;
	
	public void run(String... args) throws Exception {
		
		Girl g1 = new Girl(101, "anjali", "ashok nagar", 30);
		Girl g2 = new Girl(102, "amrita", "vasundra", 26);
		Girl g3 = new Girl(103, "rekha", "ghaziabad", 36);
		Girl g4 = new Girl(104, "diksha", "noida", 25);
		Girl g5 = new Girl(105, "mehak", "dadri", 32);
		girlRepo.save(g1);
		girlRepo.save(g2);
		girlRepo.save(g3);
		girlRepo.save(g4);
		girlRepo.save(g5);
		
		Boy b1 = new Boy(10, "amit", "noida", 27, Arrays.asList(g1,g2,g3,g4));
		Boy b2 = new Boy(11, "deepak", "phase 3", 26, Arrays.asList(g1,g2,g5));
		boyRepository.save(b1);
		boyRepository.save(b2);
		
		

	}

}
