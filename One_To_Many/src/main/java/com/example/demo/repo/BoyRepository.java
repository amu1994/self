package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.module.Boy;
@Repository
public interface BoyRepository extends JpaRepository<Boy, Integer> {

}
