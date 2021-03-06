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

    @Override
    public void addCustomer(Customer customer) {
        String SQL = "INSERT INTO CUSTOMERS (ID, NAME, ADDRESS, STREET_NUMBER, COUNTRY, NO_OF_ORDERS) VALUES" +
        "(:id, :name, :address, :strNumber, :country, :noOfOrders)";

        Map<String, Object> params = new HashMap<>();

        params.put("id", customer.getCustomerId());
        params.put("name", customer.getName());
        params.put("address", customer.getAddressStreet());
        params.put("strNumber", customer.getAddressNumber());
        params.put("country", customer.getAddressCountry());
        params.put("noOfOrders", customer.getNoOfOrdersMade());

        jdbcTemplate.update(SQL, params); 
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
