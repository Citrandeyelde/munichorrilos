package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Infraccion;

import java.util.List;

public interface IInfraccionService {
    List<Infraccion> listarInfraccion();
    Infraccion guardarInfraccion(Infraccion oInfraccion);

    Infraccion findById(Integer Id);
}
