package com.ecommerce.demo.marketplace.service.impl;

import com.ecommerce.demo.marketplace.dto.Item;
import com.ecommerce.demo.marketplace.dto.ShoppingCart;
import com.ecommerce.demo.marketplace.service.ShopItemService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopItemServiceImpl implements ShopItemService {

    Item book;
    Item toy;
    Item lamp;

    ShoppingCart shoppingCart;

    {
        book = new Item();
        book.setId(1);
        book.setCategory("Book");
        book.setItemCode("BOOK-0001");
        book.setPrice(new BigDecimal(670));
        book.setItemName("The Perception Myth");

        toy = new Item();
        toy.setId(1);
        toy.setCategory("Toys");
        toy.setItemCode("TOY-0010");
        toy.setPrice(new BigDecimal(1500));
        toy.setItemName("Remote Car");

        lamp = new Item();
        lamp.setId(1);
        lamp.setCategory("Toys");
        lamp.setItemCode("TOY-0010");
        lamp.setPrice(new BigDecimal(1500));
        lamp.setItemName("Remote Car");
    }

    @Override
    public List<Item> getItems() {

        List<Item> itemList = new ArrayList<>();
        itemList.add(book);
        itemList.add(toy);
        itemList.add(lamp);

        return itemList;
    }


}
