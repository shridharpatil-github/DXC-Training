package com.dxc.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.customer.model.Customer;
import com.dxc.customer.service.CustomerService;

@RestController
@RequestMapping("/customer/api")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	@GetMapping("/getAllCustomers")
	public List<Customer> displayAll(){
		return service.displayAllCustomers();
	}
	@PutMapping("/updateCustDetails/{customerId}")
	public String updateCustomerDetails(@RequestBody Customer customer,@PathVariable int customerId) {
		
		if (service.updateCustomer(customerId, customer) != null) {
			return "Updated Successfully";
		}else {
			return "Details Doesn't updated";
		}
	}
	@DeleteMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		if (service.deleteCustomer(customerId) != null) {
			return "Customer Deleted!!";
		}
		return "Customer Not Deleted";
	}
	
}
