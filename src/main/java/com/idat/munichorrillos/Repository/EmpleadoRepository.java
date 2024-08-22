package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
}
