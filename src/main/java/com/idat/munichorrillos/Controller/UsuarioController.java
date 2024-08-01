package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Horario;
import com.idat.munichorrillos.Model.bd.Usuario;
import com.idat.munichorrillos.Services.IHorarioService;
import com.idat.munichorrillos.Services.IUsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("")
    public String listarusuarios(Model model){
        model.addAttribute("usuarios",usuarioService.listarUsuario());
        return "usuario/index";
    }

    @GetMapping("/agregar")
    public String agregarusuario(Model model) {
        model.addAttribute("usuarios",new Usuario());
        return "/usuario/agregarHorario";  // nombre de la vista (archivo HTML)
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@Validated Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/usuario/agregarUsuario";
        }
        usuarioService.guardarUsuario(usuario);
        return "redirect:/usuario";  // redirigir a la lista de personas
    }

    @GetMapping("/editar/{id}")
    public String editarArea(@PathVariable Integer id, Model model) {
        Usuario usuario= usuarioService.obtenerUsuario(id);
        model.addAttribute("usuarios", usuario);
        return "/usuario/editarUsuario";  // nombre de la vista (archivo HTML)
    }
}
