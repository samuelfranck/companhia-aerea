package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	private ReservaPK id = new ReservaPK();
	
	private String assento;
	
	public Reserva() {
	}
	
	public Reserva(Voo voo, Passageiro passageiro, String assento) {
		
		id.setVoo(voo);
		id.setPassageiro(passageiro);
		this.assento = assento;
	}
	
	public Voo getVoo() {
		return id.getVoo();
	}
	
	public Passageiro getPassageiro() {
		return id.getPassageiro();
	}

	public ReservaPK getId() {
		return id;
	}

	public void setId(ReservaPK id) {
		this.id = id;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
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
		Reserva other = (Reserva) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
