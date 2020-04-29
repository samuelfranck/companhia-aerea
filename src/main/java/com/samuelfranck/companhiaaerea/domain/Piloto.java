package com.samuelfranck.companhiaaerea.domain;

import java.io.Serializable;

public class Piloto implements Serializable {
	private static final long serialVersionUID = 1L;

	private PilotoPK id = new PilotoPK();
	
	private String licenca;
	
	
	public Piloto() {
	}
	
	public Piloto(Pessoa pessoa, Voo voo, String licenca) {
		
		id.setPessoa(pessoa);
		id.setVoo(voo);
		this.licenca = licenca;
	}

	public Pessoa getPessoa() {
		return id.getPessoa();
	}
	
	public Voo getVoo() {
		return id.getVoo();
	}
	
	public PilotoPK getId() {
		return id;
	}

	public void setId(PilotoPK id) {
		this.id = id;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
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
		Piloto other = (Piloto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
