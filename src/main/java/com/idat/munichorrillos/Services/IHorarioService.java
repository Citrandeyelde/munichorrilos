package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Horario;
import com.idat.munichorrillos.Model.bd.Personal;

import java.util.List;

public interface IHorarioService {
    List<Horario> listarHorario();
    Horario guardarHorario(Horario ohorario);
    Horario obtenerHorario(Integer Id);
}
