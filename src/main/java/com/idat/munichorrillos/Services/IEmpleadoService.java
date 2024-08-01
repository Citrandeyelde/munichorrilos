package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Empleado;
import com.idat.munichorrillos.Model.dto.EmpleadoDto;

import java.util.List;

public interface IEmpleadoService {
    List<EmpleadoDto> listarEmpleados();
    Empleado guardarEmpleado(Empleado empleado);
    Empleado obtenerEmpleado(Integer idEmpleado);
}
