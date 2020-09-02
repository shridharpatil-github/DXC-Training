package com.dxc.customer.service;

import java.util.List;

import com.dxc.customer.model.Customer;

public interface CustomerService {
	 public Customer addCustomer(Customer customer);
	  public Customer deleteCustomer(int customerId);
	  public Customer updateCustomer(int customerId, Customer customer);
	  public List<Customer> displayAllCustomers();
	  public Customer getCustomer(int customerId);
}
