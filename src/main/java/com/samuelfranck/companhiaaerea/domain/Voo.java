package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;
import java.util.Date;

public class Voo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String numero;
	private Date dataHora;
	
	public Voo() {
	}

	public Voo(Integer id, String numero, Date dataHora) {
		super();
		this.id = id;
		this.numero = numero;
		this.dataHora = dataHora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
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
		Voo other = (Voo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
