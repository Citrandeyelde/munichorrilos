package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.Infraccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion,Integer> {
}
