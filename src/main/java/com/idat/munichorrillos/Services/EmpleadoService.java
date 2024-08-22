package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Empleado;
import com.idat.munichorrillos.Model.dto.EmpleadoDto;
import com.idat.munichorrillos.Repository.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class EmpleadoService implements IEmpleadoService {
    private EmpleadoRepository empleadoRepository;
    @Override
    public List<EmpleadoDto> listarEmpleados() {
        List<EmpleadoDto> empleadoDtoList = new ArrayList<>();
        for (Empleado empleado : empleadoRepository.findAll()){
            EmpleadoDto empleadoDto= EmpleadoDto.builder().Id_Empleado(empleado.getId_Empleado())
                    .Nom_Empleado(empleado.getNom_Empleado())
                    .ApellidoP(empleado.getApellidoP())
                    .Id_Area(empleado.getArea().getId_Area())
                    .Nom_Area(empleado.getArea().getNom_Area())
                    .HIngreso(empleado.getHorario().getHIngreso())
                    .HSalida(empleado.getHorario().getHSalida())
                    .NroIdentidad(empleado.getNroIdentidad())
                    .Descripcion(empleado.getTipoDoc().getDescripcion())
                    .build();
            empleadoDtoList.add(empleadoDto);
        }
        return empleadoDtoList;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return null;
    }

    @Override
    public Empleado obtenerEmpleado(Integer idEmpleado) {
        return null;
    }
}
