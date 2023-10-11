package com.truper.demo.repository.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "LISTA_COMPRAS_DETALLE")
public class ShoppingListDetail {

    @EmbeddedId
    private ShoppingListDetailPK id;

    @OneToOne()
    @JoinColumn(name = "id_lista_compra", referencedColumnName = "id_lista")
    private ShoppingList shoppingList;

    @OneToOne()
    @JoinColumn(name = "id_codigo_producto", referencedColumnName = "id_producto")
    private Product product;

    @Column(name = "cantidad")
    private Integer quantity;
}
