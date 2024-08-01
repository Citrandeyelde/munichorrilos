package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.ControlVehicular;

import java.util.List;

public interface IControlService {
    List<ControlVehicular> listarControl();
    ControlVehicular guardarControl(ControlVehicular oControlVehicular);
    ControlVehicular obtenerControl(Integer Id);
}
