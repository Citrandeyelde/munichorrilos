package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Usuario;
import com.idat.munichorrillos.Repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Integer Id) {
        return usuarioRepository.findById(Id).orElse(null);
    }
}
