package com.bantc.webstore.service;

import com.bantc.webstore.domain.Cart;
import com.bantc.webstore.dto.CartDto;

public interface CartService {
    void create(CartDto cartDto);
    Cart read(String cartId);
    void update(String cartId, CartDto cartDto);
    void delete(String id);
    void addItem(String cartId, String productId);
    void removeItem(String cartId, String productId); 
}
