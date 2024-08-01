package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Services.IAreaService;
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
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private IAreaService iAreaService;

    @GetMapping("")
    public String listarAreas(Model model){
        model.addAttribute("areas",iAreaService.listarArea());
        return "area/index";
    }

    @GetMapping("/agregar")
    public String agregarArea(Model model) {
        model.addAttribute("areas",new Area());
        return "/area/agregarArea";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarArea")
    public String guardarArea(@Validated Area area, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/area/agregarArea";
        }
        iAreaService.guardarArea(area);
        return "redirect:/area";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarArea(@PathVariable Integer id, Model model) {
        Area area = iAreaService.findById(id);
        model.addAttribute("areas", area);
        return "area/editarArea";  // nombre de la vista (archivo HTML)
    }
}
