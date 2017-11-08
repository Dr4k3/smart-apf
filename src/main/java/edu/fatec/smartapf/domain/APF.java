package edu.fatec.smartapf.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silas
 *
 */
public class APF {
	
	private String projeto;
	private List<ConsultaExterna> consultasExternas;
	private Integer totalHoraProjeto;

	/**
	 * Construtor de objetos do tipo APF 
	 */
	public APF() {
		this.consultasExternas = new ArrayList<>();
	}
	
	public List<ConsultaExterna> getConsultasExternas() {
		return consultasExternas;
	}

	public void setConsultasExternas(List<ConsultaExterna> consultasExternas) {
		this.consultasExternas = consultasExternas;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public Integer getTotalHoraProjeto() {
		return totalHoraProjeto;
	}

	public void setTotalHoraProjeto(Integer totalHoraProjeto) {
		this.totalHoraProjeto = totalHoraProjeto;
	}

}
