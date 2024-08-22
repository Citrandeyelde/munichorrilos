package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal,Integer> {
}
