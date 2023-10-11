package com.truper.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ShoppingList {

    @JsonProperty("nombre")
    private String name;

    @JsonProperty("productos")
    private ArrayList<Product> products;
}
