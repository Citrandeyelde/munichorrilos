package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="infraccion")
public class Infraccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Infraccion;
    private String Nom_Infraccion;
    private String Descripcion;
    private String Resolucion;
    private String Rango;
    private Double Monto;
}
