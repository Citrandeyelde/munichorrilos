package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Infraccion;
import com.idat.munichorrillos.Repository.InfraccionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class InfraccionService implements IInfraccionService {
    private InfraccionRepository infraccionRepository;
    @Override
    public List<Infraccion> listarInfraccion() {
        return infraccionRepository.findAll();
    }

    @Override
    public Infraccion guardarInfraccion(Infraccion oInfraccion) {
        return infraccionRepository.save(oInfraccion);
    }

    @Override
    public Infraccion findById(Integer Id) {
        return infraccionRepository.findById(Id).orElse(null);
    }
}
