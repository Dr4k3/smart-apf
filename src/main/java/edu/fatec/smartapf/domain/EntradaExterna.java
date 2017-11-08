package edu.fatec.smartapf.domain;

public class EntradaExterna extends TipoFuncao {

	private Integer quantidadeDet;
	private Integer quantidadeArquivosReferencia;

	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public EntradaExterna() {

	}
	
	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 * @param quantidadeDet
	 * @param quantidadeArquivosReferencia
	 */
	public EntradaExterna(Integer quantidadeDet, Integer quantidadeArquivosReferencia) {
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

}
