package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehinfractor")
public class VInfractor {
    @Id
    private String placa;

    private String marca;
    private String modelo;
    private String nMotor;
    private Integer año;
    private String color;
    private String estado;
}
