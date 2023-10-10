package com.truper.demo.controller;

import com.truper.demo.dto.ClientShopping;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping/")
@Log4j2
public class StoreController {

    @PostMapping
    public List<ClientShopping>  saveShoppingList(@RequestBody List<ClientShopping> clientShoppings){
        System.out.println(String.format("Lista de clientes %s",clientShoppings));
        return clientShoppings;
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
