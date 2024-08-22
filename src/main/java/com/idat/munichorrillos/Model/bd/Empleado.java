package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_empleado")
    private Integer Id_Empleado;

    @Column(name="nom_empleado")
    private String Nom_Empleado;

    @Column(name="apellidop")
    private String ApellidoP;

    @Column(name="apellidom")
    private String ApellidoM;

    @Column(name="email")
    private String Email;

    @Column(name="telefono")
    private String Telefono;

    @Column(name="direccion")
    private String Direccion;

    @Column(name="fechaingreso")
    private Date FechaIngreso;

    @Column(name="activo")
    private Integer Activo;

    @Column(name="estadocivil")
    private String EstadoCivil;

    @Column(name="nroidentidad")
    private Integer NroIdentidad;

    @ManyToOne
    @JoinColumn(name = "idtipodoc")
    private TipoDoc TipoDoc;

    @ManyToOne
    @JoinColumn(name = "idhorario")
    private Horario Horario;

    @ManyToOne
    @JoinColumn(name = "Id_Area")
    private Area Area;
}
