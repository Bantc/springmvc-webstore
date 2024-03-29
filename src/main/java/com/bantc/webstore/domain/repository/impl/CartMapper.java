package com.bantc.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bantc.webstore.domain.Cart;
import com.bantc.webstore.domain.CartItem;
import com.bantc.webstore.service.ProductService;

public class CartMapper implements RowMapper<Cart> {
    private CartItemMapper cartItemMapper;
    private NamedParameterJdbcTemplate jdbcTemplate;

    public CartMapper(NamedParameterJdbcTemplate jdbcTemplate, ProductService productService) {
        this.jdbcTemplate = jdbcTemplate;
        cartItemMapper = new CartItemMapper(productService);
    }

    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("ID");
        Cart cart = new Cart(id);
        String SQL = String.format("SELECT * FROM CART_ITEM WHERE CART_ID = '%s'", id);
        List<CartItem> cartItems = jdbcTemplate.query(SQL, cartItemMapper);
        cart.setCartItems(cartItems);

        return cart;
        
    }
}
