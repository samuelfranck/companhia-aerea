package com.samuelfranck.companhiaaerea.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuelfranck.companhiaaerea.domain.Passageiro;
import com.samuelfranck.companhiaaerea.repositories.PassageiroRepository;
import com.samuelfranck.companhiaaerea.services.exceptions.ObjectNotFoundException;


@Service
public class PassageiroService {
	
	@Autowired
	private PassageiroRepository repo;
	
	public Passageiro find(Integer id){
		Optional<Passageiro> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "
		+ id +" Tipo: "+ Passageiro.class.getName()));
	}
	
	

}
