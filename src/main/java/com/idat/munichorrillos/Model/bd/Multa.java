package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "multa")
public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMulta;

    private Date fecMulta;
    private Time horaMulta;
    private String lugarMulta;
    private String distritoMulta;
    private String nroSerie;
    private String placa;
    private String marca;
    private String modelo;
    private String nMotor;
    private Integer año;
    private String color;
    private String estado;
    private String propietario;
    private String direccion;
    private String grua;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idDeposito")
    private Deposito deposito;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idInfraccion")
    private Infraccion infraccion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idPersonal")
    private Personal personal;

    private String estPago;
    private String codPago;

    @OneToMany(mappedBy = "multa")
    private List<Comprobante> comprobantes = new ArrayList<>();
}
