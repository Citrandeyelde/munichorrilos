package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Model.bd.Infraccion;
import com.idat.munichorrillos.Services.IInfraccionService;
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
@RequestMapping("/infraccion")
public class InfraccionController {
    @Autowired
    private IInfraccionService iInfraccionService;

    @GetMapping("")
    public String listarInfraccion(Model model){
        model.addAttribute("infracciones",iInfraccionService.listarInfraccion());
        return "/infraccion/index";
    }
    @GetMapping("/agregar")
    public String agregarInfraccion(Model model){
        model.addAttribute("infracciones",new Infraccion());
        return "/infraccion/agregarInfraccion";
    }
    @PostMapping("/guardarInfraccion")
    public String guardarInfraccion(@Validated Infraccion infraccion, BindingResult result,Model model){
        if(result.hasErrors()){
            return "/infraccion/agregarInfraccion";
        }
        iInfraccionService.guardarInfraccion(infraccion);
        return "/infraccion/index";
    }
    @GetMapping("/editar/{id}")
    public String editarInfraccion(@PathVariable Integer id,Model model){
        Infraccion infraccion = iInfraccionService.findById(id);
        model.addAttribute("infracciones",infraccion);
        return "redirect:/infraccion/listar";
    }



}
