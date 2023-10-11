package com.truper.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ClientShopping {

    @JsonProperty("cliente")
    private Long client;
    @JsonProperty("listas")
    private ArrayList<ShoppingList> shoppingList;
}
