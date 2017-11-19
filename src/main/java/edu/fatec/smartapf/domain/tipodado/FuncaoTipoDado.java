package edu.fatec.smartapf.domain.tipodado;

import edu.fatec.smartapf.domain.core.Funcao;

public abstract class FuncaoTipoDado extends Funcao {
	
	private Integer qtdTipoDados;
	private Integer qtdTipoRegistro;
	
	/**
	 * Construtor de objetos FuncaoTipoDado
	 */
	public FuncaoTipoDado() {

	}
	
	public FuncaoTipoDado(Integer qtdTipoDados, Integer qtdTipoRegistro) {
		super();
		this.qtdTipoDados = qtdTipoDados;
		this.qtdTipoRegistro = qtdTipoRegistro;
	}

	public Integer getQtdTipoDados() {
		return qtdTipoDados;
	}
	
	public void setQtdTipoDados(Integer qtdTipoDados) {
		this.qtdTipoDados = qtdTipoDados;
	}
	
	public Integer getQtdTipoRegistro() {
		return qtdTipoRegistro;
	}
	
	public void setQtdTipoRegistro(Integer qtdTipoRegistro) {
		this.qtdTipoRegistro = qtdTipoRegistro;
	}
	
}
