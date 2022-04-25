package com.bantc.webstore.domain.repository;

import java.util.List;

import com.bantc.webstore.domain.Customer;

public interface CustomerRepository {
    List<Customer> getAllCustomers();
    void addCustomer(Customer customer);
}
