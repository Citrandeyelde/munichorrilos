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
    private Integer Id_Area;
    private String Nom_Area;
}
