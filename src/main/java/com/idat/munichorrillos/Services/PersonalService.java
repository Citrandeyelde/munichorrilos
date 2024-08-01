package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Personal;
import com.idat.munichorrillos.Repository.PersonalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonalService implements IPersonalService {

    private PersonalRepository personalRepository;

    @Override
    public List<Personal> listarPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public Personal guardarPersonal(Personal oPersonal) {
        return personalRepository.save(oPersonal);
    }

    @Override
    public Personal obtenerPersonal(Integer Id) {
        return personalRepository.findById(Id).orElse(null);
    }
}
