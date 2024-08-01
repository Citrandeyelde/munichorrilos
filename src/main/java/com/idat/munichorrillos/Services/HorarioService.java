package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Horario;
import com.idat.munichorrillos.Repository.HorariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class HorarioService implements IHorarioService{
    @Autowired
    private HorariosRepository horariosRepository;
    @Override
    public List<Horario> listarHorario() {
        return horariosRepository.findAll();
    }

    @Override
    public Horario guardarHorario(Horario ohorario) {
        return horariosRepository.save(ohorario);
    }

    @Override
    public Horario obtenerHorario(Integer Id) {
        return horariosRepository.findById(Id).orElse(null);
    }
}
