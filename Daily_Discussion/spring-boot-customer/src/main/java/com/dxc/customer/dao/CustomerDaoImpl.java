package com.dxc.customer.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dxc.customer.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	List<Customer> customerList = new ArrayList<Customer>();
	
	@Override
	public Customer addCustomer(Customer customer) {
		this.customerList.add(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		for (Customer customer2 : customerList) {
			if (customer2.getCustomerId() == customerId) {
				customerList.remove(customer2);
				return customer2;
			}
		}
		return null;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		for (Customer customer2 : customerList) {
			if (customer2.getCustomerId() == customerId) {
				int index = this.customerList.indexOf(customer2);
				this.customerList.set(index, customer);
				return customer;
			}
		}
		return null;
		
	}

	@Override
	public List<Customer> displayAllCustomers() {
		return customerList;
	}

	@Override
	public Customer getCustomer(int customerId) {
		for (Customer customer2 : customerList) {
			if (customer2.getCustomerId() == customerId) {
				return customer2;
			}
		}
		return null;
	}

}
