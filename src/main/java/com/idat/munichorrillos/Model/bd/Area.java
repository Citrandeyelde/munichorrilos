package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_area")
    private Integer Id_Area;
    @Column(name="nom_area")
    private String Nom_Area;
}
