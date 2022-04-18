package com.bantc.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bantc.webstore.domain.Customer;
import com.bantc.webstore.domain.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        Map<String, Object> params = new HashMap<String, Object>();
        List<Customer> result = jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());

        return result;
    }
    
    private static final class CustomerMapper implements RowMapper<Customer> {
        @Override
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getString("ID"));
            customer.setName(rs.getString("NAME"));
            customer.setAddressStreet(rs.getString("ADDRESS"));
            customer.setAddressNumber(rs.getInt("STREET_NUMBER"));
            customer.setAddressCountry(rs.getString("COUNTRY"));
            customer.setNoOfOrdersMade(rs.getLong("NO_OF_ORDERS"));

            return customer;
        }
    }
}
