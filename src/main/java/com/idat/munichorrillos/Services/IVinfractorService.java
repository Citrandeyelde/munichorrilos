package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Horario;
import com.idat.munichorrillos.Model.bd.VInfractor;

import java.util.List;

public interface IVinfractorService {
    List<VInfractor> listarvinfractor();
    VInfractor guardarvinfractor(VInfractor vInfractor);
    VInfractor obtenervinfractor(Integer Id);
}
