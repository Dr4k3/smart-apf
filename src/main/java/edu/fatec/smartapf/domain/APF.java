package edu.fatec.smartapf.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silas
 *
 */
public class APF {
	
	private List<ConsultaExterna> consultasExternas;

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

}
