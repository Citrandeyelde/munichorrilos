package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Model.bd.Horario;
import com.idat.munichorrillos.Services.IAreaService;
import com.idat.munichorrillos.Services.IHorarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/horario")
public class HorarioController {
    @Autowired
    private IHorarioService horarioService;

    @GetMapping("")
    public String listarhorarios(Model model){
        model.addAttribute("horarios",horarioService.listarHorario());
        return "horario/index";
    }

    @GetMapping("/agregar")
    public String agregarHorario(Model model) {
        model.addAttribute("horarios",new Horario());
        return "/horario/agregarHorario";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarArea")
    public String guardarHorario(@Validated Horario horario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/horario/agregarHorario";
        }
        horarioService.guardarHorario(horario);
        return "redirect:/horario";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarArea(@PathVariable Integer id, Model model) {
        Horario horario= horarioService.obtenerHorario(id);
        model.addAttribute("horarios", horario);
        return "area/editarArea";  // nombre de la vista (archivo HTML)
    }
}
