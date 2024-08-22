package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.Deposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito,Integer> {
}
