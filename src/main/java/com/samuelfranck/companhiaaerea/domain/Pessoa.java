package com.samuelfranck.companhiaaerea.domain;

import com.samuelfranck.companhiaaerea.domain.enums.Sexo;

public class Pessoa {
	
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
	
	
	

}
