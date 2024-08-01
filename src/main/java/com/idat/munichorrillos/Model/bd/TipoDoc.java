package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tipodoc")
public class TipoDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipodoc")
    private Integer IdTipoDoc;

    private String Descripcion;

    @Column(name="num_identifica")
    private Integer Num_Identifica;

    }
