package com.dxc.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.customer.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
