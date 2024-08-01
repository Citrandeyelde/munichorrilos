package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.VMunicipal;

import java.util.List;

public interface IVmunicipalService {
    List<VMunicipal> listarvMunicipal();
    VMunicipal guardarvMunicipal( VMunicipal vMunicipal);
    VMunicipal obtenervMunicipal(Integer Id);
}
