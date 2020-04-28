package com.samuelfranck.companhiaaerea.domain.enums;

public enum Sexo {
	
	FEMININO(1, "Feminino"),
	MASCULINO(2, "Masculino");
	
	private Integer cod;
	private String descricao;
	
	private Sexo(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Sexo toEnum(Integer id) {
		if (id==null) {
			return null;
		}
		for(Sexo s: Sexo.values()) {
			if(id.equals(s.getCod())) {
				return s;
			}
		} throw new IllegalArgumentException("Id inválido" + id);
	}
	
}
