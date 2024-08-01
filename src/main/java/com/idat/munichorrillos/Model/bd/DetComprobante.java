package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "detcomprobante")
public class DetComprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleC;

    private Double subTotal;
    private Double total;
    private Double vuelto;

    @OneToMany(mappedBy = "detComprobante")
    private List<Comprobante> comprobantes = new ArrayList<>();
}
