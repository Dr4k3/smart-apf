package edu.fatec.smartapf.domain.transacao;

import edu.fatec.smartapf.domain.core.Funcao;

public abstract class FuncaoTransacao extends Funcao {

	private Integer qtdArquivosReferenciados;
	private Integer qtdTiposDados;
	
	public FuncaoTransacao() {

	}

	public Integer getQtdArquivosReferenciados() {
		return qtdArquivosReferenciados;
	}

	public void setQtdArquivosReferenciados(Integer qtdArquivosReferenciados) {
		this.qtdArquivosReferenciados = qtdArquivosReferenciados;
	}

	public Integer getQtdTiposDados() {
		return qtdTiposDados;
	}

	public void setQtdTiposDados(Integer qtdTiposDados) {
		this.qtdTiposDados = qtdTiposDados;
	}
	
}
