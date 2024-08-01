package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Model.bd.Deposito;
import com.idat.munichorrillos.Services.IDepositoService;
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
@RequestMapping("/deposito")
public class DepositoController {
    @Autowired
    private IDepositoService depositoService;
    @GetMapping("")
    public String listarDeposito(Model model){
        model.addAttribute("depositos", depositoService.listarDeposito());
        return "deposito/index";
    }

    @GetMapping("/agregar")
    public String agregarDeposito(Model model) {
        model.addAttribute("depositos",new Deposito());
        return "/deposito/agregarDeposito";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarArea")
    public String guardarDeposito(@Validated Deposito deposito, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/deposito/agregarDeposito";
        }
        depositoService.guardarDeposito(deposito);
        return "redirect:/deposito";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarDeposito(@PathVariable Integer id, Model model) {
        Deposito deposito = depositoService.obtenerDeposito(id);
        model.addAttribute("depositos", deposito);
        return "deposito/editarDeposito";  // nombre de la vista (archivo HTML)
    }
}
