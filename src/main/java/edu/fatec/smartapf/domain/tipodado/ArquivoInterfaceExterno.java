package edu.fatec.smartapf.domain.tipodado;

import java.util.HashMap;
import java.util.Map;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ArquivoInterfaceExterno extends FuncaoTipoDado {

	private transient static final Map<Complexidade, Integer> CONTRIBUICAO = new HashMap<>();
	static {
		CONTRIBUICAO.put(Complexidade.INDETERMINADA, 0);
		CONTRIBUICAO.put(Complexidade.BAIXA, 5);
		CONTRIBUICAO.put(Complexidade.MEDIA, 7);
		CONTRIBUICAO.put(Complexidade.ALTA, 10);
	}
	
	/**
	 * Construtor de objetos do tipo ArquivoInterfaceExterno
	 */
	public ArquivoInterfaceExterno() {

	}

	/**
	 * Construtor de objetos do tipo ArquivoInterfaceExterno
	 * @param qtdTipoDados
	 * @param qtdTipoRegistro
	 */
	public ArquivoInterfaceExterno(Integer qtdTipoDados, Integer qtdTipoRegistro) {
		super(qtdTipoDados, qtdTipoRegistro);
	}

	@Override
	public Map<Complexidade, Integer> getMatrizContribuicao() {
		return CONTRIBUICAO;
	}

}
