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
public class FuncaoTransacaoService {

	private static final Range MENOR_QUE_2 = new Range(0, 1);
	private static final Range ENTRE_2_3 = new Range(2, 3);
	private static final Range MAIOR_QUE_3 = new Range(3, Integer.MAX_VALUE);

	private static final Range MENOR_QUE_6 = new Range(0, 5); 
	private static final Range ENTRE_6_19 = new Range(6, 19);
    private static final Range MAIOR_19 = new Range(19, Integer.MAX_VALUE);
    
	private static List<EntradaComplexidade> MATRIZ_COMPLEXIDADE = new ArrayList<>();

    static {
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, MENOR_QUE_2, MENOR_QUE_6));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, MENOR_QUE_2, ENTRE_6_19));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.BAIXA, ENTRE_2_3, MENOR_QUE_6));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, MENOR_QUE_2, MAIOR_19));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, ENTRE_2_3, ENTRE_6_19));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.MEDIA, MAIOR_QUE_3, MENOR_QUE_6));

        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, ENTRE_2_3, MAIOR_19));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MAIOR_QUE_3, ENTRE_6_19));
        MATRIZ_COMPLEXIDADE.add(new EntradaComplexidade(Complexidade.ALTA, MAIOR_QUE_3, MAIOR_19));
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


