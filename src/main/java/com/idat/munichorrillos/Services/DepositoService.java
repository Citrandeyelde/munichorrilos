package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Deposito;
import com.idat.munichorrillos.Repository.DepositoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class DepositoService implements IDepositoService{
    @Autowired
    private DepositoRepository depositoRepository;
    @Override
    public List<Deposito> listarDeposito() {
        return depositoRepository.findAll();
    }

    @Override
    public Deposito guardarDeposito(Deposito deposito) {
        return depositoRepository.save(deposito);
    }

    @Override
    public Deposito obtenerDeposito(Integer id) {
        return depositoRepository.findById(id).orElse(null);
    }
}
