package com.bantc.webstore.service.impl;

import java.util.List;

import com.bantc.webstore.domain.Customer;
import com.bantc.webstore.domain.repository.CustomerRepository;
import com.bantc.webstore.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
    
}
