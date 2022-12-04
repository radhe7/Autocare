package com.Technosignia.Autocare.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.CustomerRepository;
import com.Technosignia.Autocare.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public Customer createCustomer(Customer cust) {
		
		return customerRepository.save(cust);
		
	}
	public Optional<Customer> findCustomerById(Long id){
		return customerRepository.findById(id);
	}
	public Customer updateCustomer(Customer customer,Long id) {
		
	
	Optional<Customer>opcustomer=customerRepository.findById(id);
	Customer customer1=opcustomer.get();
	
	customer1.setAddress(customer.getAddress());
	customer1.setContact(customer.getContact());
	
	return customerRepository.save(customer1);


}
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
	
}
