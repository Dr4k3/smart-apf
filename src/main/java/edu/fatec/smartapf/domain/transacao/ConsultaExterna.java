package edu.fatec.smartapf.domain.transacao;

import edu.fatec.smartapf.domain.core.Funcao;

public class ConsultaExterna extends Funcao {

	private Integer quantidadeDet;
	private Integer quantidadeArquivosReferencia;

	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public ConsultaExterna() {

	}
	
	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 * @param quantidadeDet
	 * @param quantidadeArquivosReferencia
	 */
	public ConsultaExterna(Integer quantidadeDet, Integer quantidadeArquivosReferencia) {
		super();
		this.quantidadeDet = quantidadeDet;
		this.quantidadeArquivosReferencia = quantidadeArquivosReferencia;
	}

	public void setQuantidadeDet(Integer quantidadeDet) {
		this.quantidadeDet = quantidadeDet;
	}

	public void setQuantidadeArquivosReferencia(Integer quantidadeArquivosReferencia) {
		this.quantidadeArquivosReferencia = quantidadeArquivosReferencia;
	}

	public Integer getQuantidadeArquivosReferencia() {
		return this.quantidadeArquivosReferencia;
	}

	public Integer getQuantidadeDet() {
		return this.quantidadeDet;
	}

	@Override
	public Integer getQtdPontoFuncao() {
		// TODO Auto-generated method stub
		return null;
	}

}
