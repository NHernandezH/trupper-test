package com.truper.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("cantidad")
    private Integer quantity;
}
