package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_personal")
    private Integer idPersonal;

    @Column(name="usuarioacceso")
    private String usuarioAcceso;
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "Id_Empleado")
    private Empleado empleado;

    @OneToMany(mappedBy = "personal")
    private List<Multa> multas = new ArrayList<>();

    @OneToMany(mappedBy = "personal")
    private List<VMunicipal> vMunicipales = new ArrayList<>();
}
