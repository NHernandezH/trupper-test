package com.truper.demo.repository.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PRODUCTOS")
public class Product {

    @Id
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "clave")
    private String key;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "activo")
    private Boolean active;
}
