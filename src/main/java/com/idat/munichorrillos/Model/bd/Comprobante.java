package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comprobante")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComprobante;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCabeceraC")
    private CabComprobante cabComprobante;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idDetalleC")
    private DetComprobante detComprobante;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idMulta")
    private Multa multa;
}
