/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.smartapf.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.fatec.smartapf.domain.APF;
import edu.fatec.smartapf.domain.core.EntradaComplexidade;
import edu.fatec.smartapf.domain.core.Range;
import edu.fatec.smartapf.domain.core.enums.Complexidade;
import edu.fatec.smartapf.domain.tipodado.FuncaoTipoDado;

/**
 *
 * @author Silas
 */
@Service
public class FuncaoTipoDadosService {

	private static final Range UP_TO_1 = new Range(0, 1);
	private static final Range _2_TO_5 = new Range(2, 5);
	private static final Range MORE_THAN_5 = new Range(6, Integer.MAX_VALUE);
	
	private static final Range LESS_THAN_20 = new Range(0, 19);
	private static final Range _20_TO_50 = new Range(20, 50);
	private static final Range MORE_THAN_50 = new Range(51, Integer.MAX_VALUE);
	
	private static List<EntradaComplexidade> MATRIZ_COMPLEXIDADE = new ArrayList<>();

    static {
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, UP_TO_1, LESS_THAN_20));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, UP_TO_1, _20_TO_50));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, UP_TO_1, MORE_THAN_50));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, _2_TO_5, LESS_THAN_20));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, _2_TO_5, _20_TO_50));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, MORE_THAN_5, LESS_THAN_20));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, _2_TO_5, MORE_THAN_50));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MORE_THAN_5, _20_TO_50));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MORE_THAN_5, MORE_THAN_50));
    }

    public Complexidade determinarComplexidade(FuncaoTipoDado param) {
    	
    	Integer qtdTipoRegistro = param.getQtdTipoRegistro();
    	Integer qtdTipoDados = param.getQtdTipoDados();
        // Complexidade Padrão INDETERMINADA
        Complexidade complexidade = Complexidade.INDETERMINADA;

        // Percorre o mapa de complexidade
        for (EntradaComplexidade item : MATRIZ_COMPLEXIDADE) {

            // gera log
            System.out.println(getClass().toString() + " Total tipos de registros " + qtdTipoRegistro
                    + " Total tipos de dados " + qtdTipoDados
                    + ".  avaliando complexidade:" + item.getComplexidade() + " " + item.toString());

            if (item.avaliar(qtdTipoRegistro, qtdTipoDados)) {
                complexidade = item.getComplexidade();
                break;
            }
        }
        // retornar a complexidade encontrada
        param.setComplexidade(complexidade);
        return complexidade;
    }

    public void calcular(APF apf) {
    	apf.getArquivosInterfaceExternos().forEach(item -> {
    		determinarComplexidade(item);
    	});
    	apf.getArquivosLogicosInternos().forEach(item -> {
    		determinarComplexidade(item);
    	});
	}
}


