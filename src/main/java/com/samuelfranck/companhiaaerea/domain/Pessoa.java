package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.samuelfranck.companhiaaerea.domain.enums.Sexo;
@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpf;
	private String nome;
	private Integer sexo;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, mappedBy="pessoa")
	private Passageiro passageiro;
	
	
	public Pessoa() {
	}


	public Pessoa(Integer id, String cpf, String nome, Sexo sexo) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo.getCod();
	
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Sexo getSexo() {
		return Sexo.toEnum(sexo);
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo.getCod();
	}


	public Passageiro getPassageiro() {
		return passageiro;
	}


	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


		
	
	

}
