package edu.fatec.smartapf.domain.core;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public abstract class Funcao {

	private Complexidade complexidade;
	private Integer qtdPontoFuncao;

	public void setQtdPontoFuncao(Integer qtdPontoFuncao) {
		this.qtdPontoFuncao = qtdPontoFuncao;
	}

	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public Funcao() {

	}
	
	public Complexidade getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(Complexidade complexidade) {
		this.complexidade = complexidade;
	}
	
	/**
	 * Calcula a quantidade de pontos de função em que a função contribui
	 * @return
	 */
	public abstract Integer getQtdPontoFuncao();

}
