package edu.fatec.smartapf.domain.core;

import java.util.Map;

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
	
	public abstract Map<Complexidade, Integer> getMatrizContribuicao();
	
	public Integer getQtdPontoFuncao() {
		Complexidade complexidade = getComplexidade();
		Map<Complexidade, Integer> matrizContribuicao = getMatrizContribuicao();
		if (complexidade == null) {
			throw new APFException("Complexida não determinada");
		}
		if (matrizContribuicao == null) {
			throw new APFException("Matriz Contribuição não determinada");
		}
		this.qtdPontoFuncao = matrizContribuicao.get(complexidade);
		return this.qtdPontoFuncao;
	}

}
