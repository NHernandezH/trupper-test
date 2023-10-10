package com.truper.demo.repository.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class ShoppingListDetailPK implements Serializable {

    private Long shoppingListId;
    private Long productId;
}
