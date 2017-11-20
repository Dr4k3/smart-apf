package edu.fatec.smartapf.domain.tipodado;

import java.util.HashMap;
import java.util.Map;

import edu.fatec.smartapf.domain.core.APFException;
import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ArquivoLogicoInterno extends FuncaoTipoDado {

	private static final Map<Complexidade, Integer> CONTRIBUICAO = new HashMap<>();
	static {
		CONTRIBUICAO.put(Complexidade.INDETERMINADA, 0);
		CONTRIBUICAO.put(Complexidade.BAIXA, 5);
		CONTRIBUICAO.put(Complexidade.MEDIA, 7);
		CONTRIBUICAO.put(Complexidade.ALTA, 10);
	}
	
	/**
	 * Construtor de objetos do tipo ArquivoLogicoInterno
	 */
	public ArquivoLogicoInterno() {

	}

	/**
	 * Construtor de objetos do tipo ArquivoLogicoInterno
	 * @param qtdTipoDados
	 * @param qtdTipoRegistro
	 */
	public ArquivoLogicoInterno(Integer qtdTipoDados, Integer qtdTipoRegistro) {
		super(qtdTipoDados, qtdTipoRegistro);
	}

	@Override
	public Map<Complexidade, Integer> getMatrizContribuicao() {
		return CONTRIBUICAO;
	}

}
