package com.truper.demo.repository.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Entity
@Table(name = "LISTA_COMPRAS")
public class ShoppingList {

    @Id
    @Column(name = "id_lista")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "fecha_registro")

    private Date registerDate;

    @Column(name = "fecha_ultima_actualizacion")
    private Date lastUpdatedDate;

    @Column(name = "activo")
    private Boolean active;

    @OneToOne()
    @JoinColumn(name = "customer_id", referencedColumnName = "id_cliente")
    private Client client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ShoppingListDetail> details;
}
