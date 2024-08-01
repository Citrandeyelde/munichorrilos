package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.VMunicipal;
import com.idat.munichorrillos.Repository.VMunicipalRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class VmunicipalService implements IVmunicipalService{
    @Autowired
    private VMunicipalRepository vMunicipalRepository;
    @Override
    public List<VMunicipal> listarvMunicipal() {
        return vMunicipalRepository.findAll();
    }

    @Override
    public VMunicipal guardarvMunicipal(VMunicipal vMunicipal) {
        return vMunicipalRepository.save(vMunicipal);
    }

    @Override
    public VMunicipal obtenervMunicipal(Integer Id) {
        return vMunicipalRepository.findById(Id).orElse(null);
    }
}
