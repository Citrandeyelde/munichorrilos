package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area,Integer> {
}
