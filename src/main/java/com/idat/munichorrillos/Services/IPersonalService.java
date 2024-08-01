package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Personal;

import java.util.List;

public interface IPersonalService {
    List<Personal> listarPersonal();
    Personal guardarPersonal(Personal oPersonal);
    Personal obtenerPersonal(Integer Id);
}
