package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.ControlVehicular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlVehicularRepository extends JpaRepository<ControlVehicular,Integer> {
}
