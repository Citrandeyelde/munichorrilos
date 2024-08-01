package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Usuario;
import com.idat.munichorrillos.Model.bd.VInfractor;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> listarUsuario();
    Usuario guardarUsuario(Usuario usuario);
    Usuario obtenerUsuario(Integer Id);
}
