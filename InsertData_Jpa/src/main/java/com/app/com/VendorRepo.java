package com.app.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.module.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Integer> {

}
