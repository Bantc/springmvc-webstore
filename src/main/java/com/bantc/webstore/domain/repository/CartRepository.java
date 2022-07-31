package com.bantc.webstore.domain.repository;

import com.bantc.webstore.domain.Cart;
import com.bantc.webstore.dto.CartDto;

public interface CartRepository {
    void create(CartDto cartDto);
    Cart read(String id);
    void update(String id, CartDto cartDto);
    void delete(String id);
    void addItem(String cartId, String productId);
    void removeItem(String cartId, String productId);
}
