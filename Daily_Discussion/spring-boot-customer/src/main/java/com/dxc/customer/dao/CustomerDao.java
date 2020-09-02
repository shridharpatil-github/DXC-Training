package com.dxc.customer.dao;

import java.util.List;

import com.dxc.customer.model.Customer;

public interface CustomerDao {
	  public Customer addCustomer(Customer customer);
	  public Customer deleteCustomer(int customerId);
	  public Customer updateCustomer(int customerId, Customer customer);
	  public List<Customer> displayAllCustomers();
	  public Customer getCustomer(int customerId);
}
