package edu.fatec.smartapf.domain.core;

import java.util.Map;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public abstract class Funcao {

	private String descricao;
	private Complexidade complexidade;
	private Integer qtdPontoFuncao;


	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public Funcao() {

	}
	
	public Complexidade getComplexidade() {
		return complexidade;
	}

	public final void setComplexidade(Complexidade complexidade) {
		this.complexidade = complexidade;
		calcularContribuicao();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private void calcularContribuicao() {
		Complexidade complexidade = getComplexidade();
		Map<Complexidade, Integer> matrizContribuicao = getMatrizContribuicao();
		if (complexidade == null) {
			throw new APFException("Complexida não determinada");
		}
		if (matrizContribuicao == null) {
			throw new APFException("Matriz Contribuição não determinada");
		}
		this.qtdPontoFuncao = matrizContribuicao.get(complexidade);
	}
	
	public abstract Map<Complexidade, Integer> getMatrizContribuicao();
	
	public Integer getQtdPontoFuncao() {
		return this.qtdPontoFuncao;
	}

	public void setQtdPontoFuncao(Integer qtdPontoFuncao) {
		this.qtdPontoFuncao = qtdPontoFuncao;
	}
}
