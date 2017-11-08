package edu.fatec.smartapf.domain;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ConsultaExterna {

	private Integer quantidadeDet;
	private Integer quantidadeArquivosReferencia;
	private Complexidade complexidade;

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

	public Complexidade getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(Complexidade complexidade) {
		this.complexidade = complexidade;
	}
}
