package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.ControlVehicular;
import com.idat.munichorrillos.Model.bd.VMunicipal;
import com.idat.munichorrillos.Services.IVmunicipalService;
import com.idat.munichorrillos.Services.VmunicipalService;
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
@RequestMapping("/vmunicipal")
public class VmunicipalController {
    @Autowired
    private IVmunicipalService vmunicipalService;

    @GetMapping("")
    private String listarvmunicipal(Model model){
        model.addAttribute("vmunicipals",vmunicipalService.listarvMunicipal());
        return "vmunicipal/index";
    }

    @GetMapping("/agregar")
    public String agregarvmunicpal(Model model) {
        model.addAttribute("vmunicipals",new VMunicipal());
        return "/vmunicipal/agregarVmunicipal";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarControl")
    public String guardarControl(@Validated VMunicipal vMunicipal, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/vmunicipal/agregarVmunicipal";
        }
        vmunicipalService.guardarvMunicipal(vMunicipal);
        return "redirect:/vmunicipal";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarControl(@PathVariable Integer id, Model model) {
        VMunicipal vMunicipal = vmunicipalService.obtenervMunicipal(id);
        model.addAttribute("vmunicipals",vMunicipal);
        return "vmunicipal/editarVmunicipal";  // nombre de la vista (archivo HTML)
    }
}
