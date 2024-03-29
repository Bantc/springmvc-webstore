package com.bantc.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bantc.webstore.domain.Cart;
import com.bantc.webstore.domain.repository.CartRepository;
import com.bantc.webstore.dto.CartDto;
import com.bantc.webstore.service.CartService;

@Service
public class CartServiceImpl implements CartService {
@Autowired
private CartRepository cartRepository;

    @Override
    public void create(CartDto cartDto) {
        cartRepository.create(cartDto);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }

    @Override
    public void update(String cartId, CartDto cartDto) {
        cartRepository.update(cartId, cartDto);
    }

    @Override
    public void delete(String id) {
        cartRepository.delete(id);
    }

    @Override
    public void addItem(String cartId, String productId) {
        cartRepository.addItem(cartId, productId);
    }

    @Override
    public void removeItem(String cartId, String productId) {
        cartRepository.removeItem(cartId, productId);
    }
}