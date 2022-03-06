package com.bantc.webstore.controller;

// import java.math.BigDecimal;

// import com.bantc.webstore.domain.Product;
import com.bantc.webstore.domain.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    
    @RequestMapping("/products")
    public String list(Model model) {
        // Product iphone = new Product("P0001", "iPhone 6s", new BigDecimal(500));
        // iphone.setDescription("Apple iPhone 6s, 8Mpx camera");
        // iphone.setCategory("Smartphone");
        // iphone.setManufacturer("Apple");
        // iphone.setUnitsInStock(1000);

        // model.addAttribute("product", iphone);

        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
