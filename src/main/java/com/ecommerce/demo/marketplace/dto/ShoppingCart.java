package com.ecommerce.demo.marketplace.dto;

import java.util.List;

public class ShoppingCart {

    private int cartId;

    private List<Item> cartItems;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
    }
}
