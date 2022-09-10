package com.example.demo.insert;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.module.Boy;
import com.example.demo.repo.BoyRepository;

import lombok.Data;
@Component
public class FetchData implements CommandLineRunner {

	@Autowired
    private BoyRepository boyRepository;
	public void run(String... args) throws Exception {
		Optional<Boy> daata = boyRepository.findById(10);
		System.out.println(daata);
		
                  

	}
}
