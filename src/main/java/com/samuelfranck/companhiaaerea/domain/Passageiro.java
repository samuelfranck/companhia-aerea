package com.samuelfranck.companhiaaerea.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Passageiro {
	
	private Integer id;
	private Date dataNascimento;
	
	private Pessoa pessoa;
	
	private Set<String> telefones = new HashSet<>();

	public Passageiro(Integer id, Date dataNascimento, Pessoa pessoa) {
		super();
		this.id = id;
		this.dataNascimento = dataNascimento;
		this.pessoa = pessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
	
	

}
