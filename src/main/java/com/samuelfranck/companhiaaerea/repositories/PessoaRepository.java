package com.samuelfranck.companhiaaerea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuelfranck.companhiaaerea.domain.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
