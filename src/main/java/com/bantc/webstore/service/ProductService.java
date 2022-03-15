package com.bantc.webstore.service;

import java.util.List;

import com.bantc.webstore.domain.Product;

public interface ProductService {
    List <Product> getAllProducts();
    void updateAllStock();
}
