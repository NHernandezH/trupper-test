package com.truper.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ShoppingList {

    @JsonProperty("nombre")
    public String name;

    @JsonProperty("productos")
    public ArrayList<Product> products;
}
