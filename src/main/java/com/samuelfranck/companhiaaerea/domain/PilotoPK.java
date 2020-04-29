package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

public class PilotoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;
	
	private Voo voo;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result + ((voo == null) ? 0 : voo.hashCode());
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
		PilotoPK other = (PilotoPK) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (voo == null) {
			if (other.voo != null)
				return false;
		} else if (!voo.equals(other.voo))
			return false;
		return true;
	}
	
	

}
