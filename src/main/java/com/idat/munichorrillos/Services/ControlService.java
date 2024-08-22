package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.ControlVehicular;
import com.idat.munichorrillos.Repository.ControlVehicularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ControlService implements IControlService {
    @Autowired
    private ControlVehicularRepository controlRepository;
    @Override
    public List<ControlVehicular> listarControl() {
        return controlRepository.findAll();
    }

    @Override
    public ControlVehicular guardarControl(ControlVehicular oControlVehicular) {
        return controlRepository.save(oControlVehicular);
    }

    @Override
    public ControlVehicular obtenerControl(Integer Id) {
        return controlRepository.findById(Id).orElse(null);
    }
}
