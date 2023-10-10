package com.truper.demo.mapper;

import com.truper.demo.dto.ClientShopping;
import com.truper.demo.repository.entity.Client;
import com.truper.demo.repository.entity.ShoppingList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingMappers {

    public static List<ShoppingList> mapclientShoppingsToShoppingList(List<ClientShopping> clientShoppings){
        List<ShoppingList> shoppingLists = new ArrayList<>();

        clientShoppings.stream()
                .map(ShoppingMappers::mapOneClientShoppingsToShoppingList)
                .forEach(shoppingLists::addAll);

        return shoppingLists;
    }

    public static List<ShoppingList> mapOneClientShoppingsToShoppingList(ClientShopping clientShopping){

        Client client = Client.builder()
                .active(Boolean.TRUE)
                .id(clientShopping.client)
                .build();

        return clientShopping.getShoppingList().stream()
                .map((shopping)->mapOneShoppingListToOneShoppingList(shopping,client))
                .collect(Collectors.toList());

    }

    public static ShoppingList mapOneShoppingListToOneShoppingList(com.truper.demo.dto.ShoppingList shoppingList, Client client){
        return ShoppingList.builder().name(shoppingList.getName())
                .active(Boolean.TRUE)
                .client(client)
                .registerDate(new Date())
                .lastUpdatedDate(new Date())
                .build();
    }
}
