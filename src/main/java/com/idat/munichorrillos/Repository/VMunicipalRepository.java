package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.VMunicipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VMunicipalRepository extends JpaRepository<VMunicipal,Integer> {
}
