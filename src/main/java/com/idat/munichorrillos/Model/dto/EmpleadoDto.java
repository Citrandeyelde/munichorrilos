package com.idat.munichorrillos.Model.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Time;

@Builder
@Data
public class EmpleadoDto {
    private Integer Id_Empleado;
    private String Nom_Empleado;
    private String ApellidoP;
    private Integer Id_Area;
    private String Nom_Area;
    private Time HIngreso;
    private Time HSalida;
    private Integer NroIdentidad;
    private String Descripcion;


}
