package edu.fatec.smartapf.domain.transacao;

import java.util.HashMap;
import java.util.Map;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ConsultaExterna extends FuncaoTransacao {

	private static final Map<Complexidade, Integer> CONTRIBUICAO = new HashMap<>();
	static {
		CONTRIBUICAO.put(Complexidade.INDETERMINADA, 0);
		CONTRIBUICAO.put(Complexidade.BAIXA, 3);
		CONTRIBUICAO.put(Complexidade.MEDIA, 4);
		CONTRIBUICAO.put(Complexidade.ALTA, 6);
	}

	/**
	 * Construtor de objetos do tipo ConsultaExterna
	 */
	public ConsultaExterna() {

	}
	
	@Override
	public Map<Complexidade, Integer> getMatrizContribuicao() {
		return CONTRIBUICAO;
	}

}
