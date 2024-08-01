package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.VInfractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VInfractorRepository extends JpaRepository<VInfractor,Integer> {
}
