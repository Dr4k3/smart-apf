package edu.fatec.smartapf.domain.tipodado;

import edu.fatec.smartapf.domain.core.APFException;
import edu.fatec.smartapf.domain.core.enums.Complexidade;

public class ArquivoInterfaceExterno extends FuncaoTipoDado {

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

	/* (non-Javadoc)
	 * @see edu.fatec.smartapf.domain.Funcao#getQtdPontoFuncao()
	 */
	@Override
	public Integer getQtdPontoFuncao() {
		if (Complexidade.ALTA.equals(getComplexidade())) {
			return 10;
		} else if (Complexidade.MEDIA.equals(getComplexidade())) {
			return 7;
		} else if (Complexidade.BAIXA.equals(getComplexidade())) {
			return 5;
		} else {
			throw new APFException("Complexidade indeterminada");
		}
	}

}
