package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.VInfractor;
import com.idat.munichorrillos.Repository.VInfractorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VinfractorService implements IVinfractorService {
    @Autowired
    private VInfractorRepository vInfractorRepository;
    @Override
    public List<VInfractor> listarvinfractor() {
        return vInfractorRepository.findAll();
    }

    @Override
    public VInfractor guardarvinfractor(VInfractor vInfractor) {
        return vInfractorRepository.save(vInfractor);
    }

    @Override
    public VInfractor obtenervinfractor(Integer Id) {
        return vInfractorRepository.findById(Id).orElse(null);
    }
}
