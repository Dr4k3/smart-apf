package edu.fatec.smartapf.domain;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.smartapf.domain.tipodado.ArquivoInterfaceExterno;
import edu.fatec.smartapf.domain.tipodado.ArquivoLogicoInterno;
import edu.fatec.smartapf.domain.transacao.ConsultaExterna;
import edu.fatec.smartapf.domain.transacao.EntradaExterna;
import edu.fatec.smartapf.domain.transacao.SaidaExterna;

/**
 * @author Silas
 *
 */
public class APF {
	
	private String projeto;
	
	private List<ConsultaExterna> consultasExternas;
	private List<ArquivoInterfaceExterno> arquivosInterfaceExternos;
	private List<ArquivoLogicoInterno> arquivosLogicosInternos;
	private List<EntradaExterna> entradasExternas;
	private List<SaidaExterna> saidasExternas;
	
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

	public List<ArquivoInterfaceExterno> getArquivosInterfaceExternos() {
		return arquivosInterfaceExternos;
	}

	public void setArquivosInterfaceExternos(List<ArquivoInterfaceExterno> arquivosInterfaceExternos) {
		this.arquivosInterfaceExternos = arquivosInterfaceExternos;
	}

	public List<ArquivoLogicoInterno> getArquivosLogicosInternos() {
		return arquivosLogicosInternos;
	}

	public void setArquivosLogicosInternos(List<ArquivoLogicoInterno> arquivosLogicosInternos) {
		this.arquivosLogicosInternos = arquivosLogicosInternos;
	}

	public List<EntradaExterna> getEntradasExternas() {
		return entradasExternas;
	}

	public void setEntradasExternas(List<EntradaExterna> entradasExternas) {
		this.entradasExternas = entradasExternas;
	}

	public List<SaidaExterna> getSaidasExternas() {
		return saidasExternas;
	}

	public void setSaidasExternas(List<SaidaExterna> saidasExternas) {
		this.saidasExternas = saidasExternas;
	}

}
