package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cabcomprobante")
public class CabComprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCabeceraC;

    private Date fecha;
    private Time hora;
    private Integer tComprobante;
    private String medioPago;
    private String entidad;

    @OneToMany(mappedBy = "cabComprobante")
    private List<Comprobante> comprobantes = new ArrayList<>();
}
