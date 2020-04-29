package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

import com.samuelfranck.companhiaaerea.domain.enums.Sexo;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String nome;
	private Integer sexo;
	
	private Passageiro passageiro;
	
	
	public Pessoa() {
	}


	public Pessoa(String cpf, String nome, Sexo sexo, Passageiro passageiro) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo.getCod();
		this.passageiro = passageiro;
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
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
	

}
