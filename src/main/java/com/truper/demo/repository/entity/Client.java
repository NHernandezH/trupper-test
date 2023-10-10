package com.truper.demo.repository.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@Entity
@Table(name = "CLIENTES")
public class Client {

    @Id
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "activo")
    private Boolean active;
}
