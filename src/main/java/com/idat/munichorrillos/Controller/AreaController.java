package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Services.IAreaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Configuration;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/area")
public class AreaController {

    @Autowired
    private IAreaService iAreaService;

    @GetMapping("")
    public List<Area> listarAreas() {
        return iAreaService.listarArea();
    }

    @PostMapping("/guardar")
    public Area guardarArea(@RequestBody Area area) {
        return iAreaService.guardarArea(area);
    }

    @GetMapping("/{id}")
    public Area obtenerArea(@PathVariable Integer id) {
        return iAreaService.findById(id);
    }

    @PutMapping("/editar/{id}")
    public Area editarArea(@PathVariable Integer id, @RequestBody Area areaDetalles) {
        Area area = iAreaService.findById(id);
        if (area != null) {
            area.setNom_Area(areaDetalles.getNom_Area()); // y otros atributos que deseas actualizar
            return iAreaService.guardarArea(area);
        }
        return null; // Maneja la lógica de error o excepciones según tu necesidad
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarArea(@PathVariable Integer id) {
        iAreaService.eliminarArea(id);
    }
}
