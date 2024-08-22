package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.dto.EmpleadoDto;
import com.idat.munichorrillos.Services.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("")
    public String frmEmpleado(Model model){
        model.addAttribute("listempleado",
                empleadoService.listarEmpleados());
        return "/empleados/mostrarempleados";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<EmpleadoDto> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }
}
