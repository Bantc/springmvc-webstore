package com.bantc.webstore.domain;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 13L;

    private String customerId;
    private String name;
    private String addressStreet;
    private int addressNumber;
    private String addressCountry;
    private long noOfOrdersMade;

    public Customer() {}

    public Customer(String customerId, String name, String adressStreet, int addressNumber, String addressCountry) {
        this.customerId = customerId;
        this.name = name;
        this.addressStreet = adressStreet;
        this.addressNumber = addressNumber;
        this.addressCountry = addressCountry;
        noOfOrdersMade = 0;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStreet() {
        return this.addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public int getAddressNumber() {
        return this.addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddressCountry() {
        return this.addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public long getNoOfOrdersMade() {
        return this.noOfOrdersMade;
    }

    public void setNoOfOrdersMade(long noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer otherCustomer = (Customer) obj;

        return customerId.equals(otherCustomer.customerId);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        
        return result;
    }
}
