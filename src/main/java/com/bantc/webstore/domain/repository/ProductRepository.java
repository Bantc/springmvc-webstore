package com.bantc.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.bantc.webstore.domain.Product;

public interface ProductRepository {
    Product getProductById(String productId);
    List<Product> getAllProducts();
    List<Product> getProductByCategory(String category);
    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    void updateStock(String productId, long noOfUnits);
    void addProduct(Product product);
}
