package com.ecommerce.demo.marketplace.controller;

import com.ecommerce.demo.marketplace.dto.ShoppingCart;
import com.ecommerce.demo.marketplace.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping
    public ShoppingCart getShoppingCart() {
        return shoppingCartService.getShoppingCart();
    }
}
