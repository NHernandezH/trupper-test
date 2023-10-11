package com.truper.demo.controller;

import com.truper.demo.dto.ClientShopping;
import com.truper.demo.service.ShoppingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping/")
@Log4j2
@RequiredArgsConstructor
public class StoreController {

    private final ShoppingService shoppingService;

    @PostMapping
    public Object  saveShoppingList(@RequestBody ClientShopping clientShoppings){
        System.out.println(String.format("Lista de clientes %s",clientShoppings));
        return shoppingService.saveShopping(clientShoppings);
    }

    @GetMapping
    public void getShoppingList(){

    }

    @PutMapping
    public void updateShoppingList(){

    }

    @DeleteMapping
    public void deleteShoppingList(){

    }
}
