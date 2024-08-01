package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.Area;

import java.util.List;

public interface IAreaService {
    List<Area> listarArea();

    Area guardarArea(Area oArea);

    Area findById(Integer Id);
}
