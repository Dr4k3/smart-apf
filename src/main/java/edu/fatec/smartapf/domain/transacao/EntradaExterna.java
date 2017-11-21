package edu.fatec.smartapf.domain.transacao;

import java.util.HashMap;
import java.util.Map;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class EntradaExterna extends FuncaoTransacao {

	private transient static final Map<Complexidade, Integer> CONTRIBUICAO = new HashMap<>();
	static {
		CONTRIBUICAO.put(Complexidade.INDETERMINADA, 0);
		CONTRIBUICAO.put(Complexidade.BAIXA, 3);
		CONTRIBUICAO.put(Complexidade.MEDIA, 4);
		CONTRIBUICAO.put(Complexidade.ALTA, 6);
	}
	
	/**
	 * Construtor de objetos do tipo EntradaExterna
	 */
	public EntradaExterna() {

	}
	
	@Override
	public Map<Complexidade, Integer> getMatrizContribuicao() {
		return CONTRIBUICAO;
	}

}
