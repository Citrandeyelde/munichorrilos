package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.ControlVehicular;
import com.idat.munichorrillos.Services.IControlService;
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
@RequestMapping("/controlvehicular")
public class ControlVehicularController {
    @Autowired
    private IControlService controlService;

    @GetMapping("")
    private String listarControl(Model model){
        model.addAttribute("controls",controlService.listarControl());
        return "controlv/index";
    }

    @GetMapping("/agregar")
    public String agregarControl(Model model) {
        model.addAttribute("controls",new ControlVehicular());
        return "/controlv/agregarControl";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarControl")
    public String guardarControl(@Validated ControlVehicular control, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/controlv/agregarControl";
        }
        controlService.guardarControl(control);
        return "redirect:/controlvehicular";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarControl(@PathVariable Integer id, Model model) {
        ControlVehicular control = controlService.obtenerControl(id);
        model.addAttribute("controls", control);
        return "controlv/editarControl";  // nombre de la vista (archivo HTML)
    }

}
