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
import edu.fatec.smartapf.domain.transacao.ConsultaExterna;

/**
 *
 * @author Silas
 */
@Service
public class FuncaoTransacaoEntradaExternaService {

	private static final Range MENOR_QUE_2 = new Range(0, 1);
	private static final Range DOIS = new Range(2, 2);
	private static final Range MAIOR_QUE_2 = new Range(3, Integer.MAX_VALUE);

	private static final Range MENOR_QUE_5 = new Range(0, 4); 
	private static final Range ENTRE_5_E_15 = new Range(5, 15);
    private static final Range MAIOR_15 = new Range(16, Integer.MAX_VALUE);
    
	private static List<EntradaComplexidade> MATRIZ_COMPLEXIDADE = new ArrayList<>();

    static {
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, MENOR_QUE_2, MENOR_QUE_5));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, MENOR_QUE_2, ENTRE_5_E_15));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, DOIS, MENOR_QUE_5));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, MENOR_QUE_2, MAIOR_15));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, DOIS, ENTRE_5_E_15));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, MAIOR_QUE_2, MENOR_QUE_5));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, DOIS, MAIOR_15));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MAIOR_QUE_2, ENTRE_5_E_15));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MAIOR_QUE_2, MAIOR_15));
    }

    public Complexidade determinarComplexidade(ConsultaExterna param) {
    	
    	Integer qtdArquivosRef = param.getQtdArquivosReferenciados();
    	Integer qtdTiposDados = param.getQtdTiposDados();
        // Complexidade Padrão INDETERMINADA
        Complexidade complexidade = Complexidade.INDETERMINADA;

        // Percorre o mapa de complexidade
        for (EntradaComplexidade item : MATRIZ_COMPLEXIDADE) {

            // gera log
            System.out.println("QTD arquivos referenciados " + qtdArquivosRef
                    + "QTD tipo de dados " + qtdTiposDados
                    + ".  avaliando complexidade:" + item.getComplexidade() + " " + item.toString());

            // verifica se qtd de consulta externa está dentro do range da complexidade avaliada
            if (item.avaliar(qtdArquivosRef, qtdTiposDados)) {
                // caso consiga encontrar a complexidade atribui e para o laço de repetição
                complexidade = item.getComplexidade();
                break;
            }
        }
        // retornar a complexidade encontrada
        param.setComplexidade(complexidade);
        return complexidade;
    }

	public void calcular(APF apf) {
		for (ConsultaExterna item : apf.getConsultasExternas()) {
			determinarComplexidade(item);
		}
	}


}


