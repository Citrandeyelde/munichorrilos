package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Repository.AreaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AreaService implements IAreaService {
    private final AreaRepository areaRepository;

    @Override
    public List<Area> listarArea() {
        return areaRepository.findAll();
    }

    @Override
    public Area guardarArea(Area oArea) {
        return areaRepository.save(oArea);
    }

    @Override
    public Area findById(Integer Id) {
        return areaRepository.findById(Id).orElse(null);
    }

    @Override
    public void eliminarArea(Integer Id) {
        areaRepository.deleteById(Id);
    }
}
