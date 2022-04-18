package com.bantc.webstore.service;

import java.util.List;
import java.util.Map;

import com.bantc.webstore.domain.Product;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductByFilter(Map<String, List<String>> filterParams);
    void updateAllStock();
}
