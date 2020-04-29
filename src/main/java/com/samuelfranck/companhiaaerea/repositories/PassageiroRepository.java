package com.samuelfranck.companhiaaerea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuelfranck.companhiaaerea.domain.Passageiro;


@Repository
public interface PassageiroRepository extends JpaRepository<Passageiro, Integer>{

}
