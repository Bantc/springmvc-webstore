package com.bantc.webstore.service;

import java.util.List;

import com.bantc.webstore.domain.Customer;

public interface CustomerService {
    List <Customer> getAllCustomers();
    void addCustomer(Customer customer);
}
