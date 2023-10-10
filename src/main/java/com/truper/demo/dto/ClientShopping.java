package com.truper.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ClientShopping {

    @JsonProperty("cliente")
    public Long client;
    @JsonProperty("listas")
    public ArrayList<ShoppingList> shoppingList;
}
