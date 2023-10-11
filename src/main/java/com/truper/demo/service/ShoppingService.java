package com.truper.demo.service;

import com.truper.demo.dto.ClientShopping;
import com.truper.demo.mapper.ShoppingMappers;
import com.truper.demo.repository.ShoppingRepository;
import com.truper.demo.repository.entity.Client;
import com.truper.demo.repository.entity.Product;
import com.truper.demo.repository.entity.ShoppingList;
import com.truper.demo.repository.entity.ShoppingListDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShoppingService {

    private final ShoppingRepository shoppingRepository;
    private final ClientService clientService;
    private final ProductService productService;

    @Transactional
    public Object saveShopping(ClientShopping clientShoppings){

        Client client = clientService.getClientById(clientShoppings.getClient());

        List<ShoppingList> shopingList = clientShoppings.getShoppingList().stream()
                .map((shopping)->createShoppingList(shopping,client))
                .collect(Collectors.toList());

        shoppingRepository.saveAll(shopingList);
        return shopingList;
    }

    private ShoppingList createShoppingList(com.truper.demo.dto.ShoppingList shoppingList, Client client){
        ShoppingList shoppingListEntity = ShoppingMappers.mapOneShoppingListToOneShoppingList(shoppingList,client);
        List<ShoppingListDetail> shoppingListDetails = shoppingList.getProducts().stream()
                .map(product -> createShoppingListDetail(product,shoppingListEntity))
                .collect(Collectors.toList());
        shoppingListEntity.setClient(client);
        shoppingListEntity.setDetails(shoppingListDetails);
        return shoppingListEntity;
    }

    private ShoppingListDetail createShoppingListDetail(com.truper.demo.dto.Product product, ShoppingList shoppingList){
        Product productEntity = productService.findProductById(product.getId());
        return ShoppingMappers.mapToShoppingListDetail(shoppingList,productEntity, product.getQuantity());
    }
}
