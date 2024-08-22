package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Date;
import java.sql.Time;
import java.time.Instant;

import static java.sql.Types.TIMESTAMP;

@Getter
@Setter
@Entity
@Table(name = "horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idhorario")
    private Integer IdHorario;

    private String Dia;

    @Column(name="hingreso")
    private Time HIngreso;

    @Column(name="hsalida")
    private Time HSalida;
}
