package edu.fatec.smartapf.domain;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class TipoFuncao {

	private Complexidade complexidade;

	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public TipoFuncao() {

	}
	
	public Complexidade getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(Complexidade complexidade) {
		this.complexidade = complexidade;
	}
}
