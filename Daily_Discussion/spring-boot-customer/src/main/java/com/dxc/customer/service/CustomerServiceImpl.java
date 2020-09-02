package com.dxc.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.customer.dao.CustomerDao;
import com.dxc.customer.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao dao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		return dao.updateCustomer(customerId, customer);
	}

	@Override
	public List<Customer> displayAllCustomers() {
	return dao.displayAllCustomers();
	}

	@Override
	public Customer getCustomer(int customerId) {
		return dao.getCustomer(customerId);
	}

}
