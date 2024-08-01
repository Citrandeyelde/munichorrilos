package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;
    @Column(name="nombreu")
    private String nombreU;
    @Column(name="apellidou")
    private String apellidoU;
    private String direccion;
    private String telefono;
    private String email;
    private String contraseña;
}
