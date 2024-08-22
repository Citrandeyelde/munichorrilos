package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Infraccion;
import com.idat.munichorrillos.Model.bd.Personal;
import com.idat.munichorrillos.Services.IPersonalService;
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
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    private IPersonalService iPersonalService;

    @GetMapping("")
    public String listarPersonal(Model model){
        model.addAttribute("personals",iPersonalService.listarPersonal());
        return "/personal/index";
    }

    @GetMapping("/agregar")
    public String agregarPersonal(Model model){
        model.addAttribute("personals",new Personal());
        return "/personal/agregarPersonal";
    }

    @PostMapping("/guardarPersonal")
    public String guardarPersonal(@Validated Personal oPersonal, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/personal/agregarPersonal";
        }
        iPersonalService.guardarPersonal(oPersonal);
        return "/personal/index";
    }

    @GetMapping("/editar/{id}")
    public String editarPersonal(@PathVariable Integer id, Model model){
        Personal oPersonal = iPersonalService.obtenerPersonal(id);
        model.addAttribute("personals",oPersonal);
        return "redirect:/personal/index";
    }
}
