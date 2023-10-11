package com.truper.demo.mapper;

import com.truper.demo.dto.ClientShopping;
import com.truper.demo.repository.entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingMappers {

    public static ShoppingList mapOneShoppingListToOneShoppingList(com.truper.demo.dto.ShoppingList shoppingList, Client client){
        return ShoppingList.builder()
                .name(shoppingList.getName())
                .active(Boolean.TRUE)
                .client(client)
                .registerDate(new Date())
                .lastUpdatedDate(new Date())
                .build();
    }

    public static ShoppingListDetail mapToShoppingListDetail(ShoppingList shoppingList, Product product, Integer quantity){
        return ShoppingListDetail.builder()
                .quantity(quantity)
                .shoppingList(shoppingList)
                .product(product)
                .build();
    }
}
