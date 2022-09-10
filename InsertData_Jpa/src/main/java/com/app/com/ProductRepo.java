package com.app.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.module.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
