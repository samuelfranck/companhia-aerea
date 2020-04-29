package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

public class ReservaPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Voo voo;
	
	private Passageiro passageiro;
	
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
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
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
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
		ReservaPK other = (ReservaPK) obj;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (voo == null) {
			if (other.voo != null)
				return false;
		} else if (!voo.equals(other.voo))
			return false;
		return true;
	}
	
	

}
