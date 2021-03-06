package com.bantc.webstore.service.impl;

import java.util.List;
import java.util.Map;

import com.bantc.webstore.domain.Product;
import com.bantc.webstore.domain.repository.ProductRepository;
import com.bantc.webstore.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();
        
        for(Product product : allProducts) {
            if(product.getUnitsInStock() < 500) {
                productRepository.updateStock(product.getProductId(), product.getUnitsInStock() + 1000);
            }
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductByCategory(category);
    }

    @Override
    public List<Product> getProductByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
