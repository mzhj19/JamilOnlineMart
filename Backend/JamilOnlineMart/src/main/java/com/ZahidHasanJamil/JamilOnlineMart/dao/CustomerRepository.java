package com.ZahidHasanJamil.JamilOnlineMart.dao;

import com.ZahidHasanJamil.JamilOnlineMart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
