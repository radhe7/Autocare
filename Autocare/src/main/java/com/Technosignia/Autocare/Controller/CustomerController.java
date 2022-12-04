package com.Technosignia.Autocare.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Autocare.Service.CustomerService;
import com.Technosignia.Autocare.entity.Customer;

@RestController
public class CustomerController { 
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		System.out.println("Inside Controller"); 
		return customerservice.createCustomer(customer);
	}
	
	@GetMapping("/customer/{Id}")
	public Optional<Customer> findCustomerById(@PathVariable Long Id){
		
		return customerservice.findCustomerById(Id);
	}
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer,@RequestParam Long id) {
		return customerservice.updateCustomer(customer,id);
	}
@DeleteMapping("/customer")
public void deleteCustomer(Long id) {
	customerservice.deleteCustomer(id);
	
}
}
