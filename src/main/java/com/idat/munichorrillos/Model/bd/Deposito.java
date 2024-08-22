package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deposito")
public class Deposito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_deposito")
    private Integer idDeposito;
    @Column(name="nomdeposito")
    private String nomDeposito;
    @Column(name="direccion")
    private String direccion;

    @OneToMany(mappedBy = "deposito")
    private List<Multa> multas = new ArrayList<>();
}

