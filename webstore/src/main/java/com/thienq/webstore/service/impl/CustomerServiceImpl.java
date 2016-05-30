package com.thienq.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thienq.webstore.domain.Customer;
import com.thienq.webstore.jpa.CustomerJPARepository;
import com.thienq.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerJPARepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}
	
}
