package edu.fatec.smartapf.domain.tipodado;

import edu.fatec.smartapf.domain.core.APFException;
import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ArquivoLogicoInterno extends FuncaoTipoDado {

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

	/* (non-Javadoc)
	 * @see edu.fatec.smartapf.domain.Funcao#getQtdPontoFuncao()
	 */
	@Override
	public Integer getQtdPontoFuncao() {
		if (Complexidade.ALTA.equals(getComplexidade())) {
			return 15;
		} else if (Complexidade.MEDIA.equals(getComplexidade())) {
			return 10;
		} else if (Complexidade.BAIXA.equals(getComplexidade())) {
			return 7;
		} else {
			throw new APFException("Complexidade indeterminada");
		}
	}

}
