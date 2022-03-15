package com.bantc.webstore.domain.repository;

import java.util.List;

import com.bantc.webstore.domain.Product;

public interface ProductRepository {
    List <Product> getAllProducts();
    void updateStock(String productId, long noOfUnits);
}
