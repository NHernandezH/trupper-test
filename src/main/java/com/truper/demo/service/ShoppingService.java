package com.truper.demo.service;

import com.truper.demo.dto.ClientShopping;
import com.truper.demo.repository.ShoppingRepository;
import com.truper.demo.repository.entity.ShoppingList;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingService {

    private ShoppingRepository shoppingRepository;

    @Transactional
    public void saveShopping(List<ClientShopping> clientShoppings){
        List<ShoppingList> shopingList = new ArrayList<>();
        shoppingRepository.saveAll(shopingList);
    }
}
