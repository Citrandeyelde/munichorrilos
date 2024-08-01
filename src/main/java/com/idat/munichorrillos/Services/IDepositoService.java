package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Deposito;

import java.util.List;

public interface IDepositoService {
    List<Deposito> listarDeposito();
    Deposito guardarDeposito(Deposito deposito);
    Deposito obtenerDeposito(Integer id);

}
