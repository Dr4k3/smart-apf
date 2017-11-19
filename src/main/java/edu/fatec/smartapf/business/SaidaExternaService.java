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
import edu.fatec.smartapf.domain.SaidaExterna;
import edu.fatec.smartapf.domain.core.EntradaComplexidade;
import edu.fatec.smartapf.domain.core.Range;
import edu.fatec.smartapf.domain.core.enums.Complexidade;

/**
 *
 * @author Silas
 */
@Service
public class SaidaExternaService {

    private static List<EntradaComplexidade> entradasComplexidade = new ArrayList<>();

    static {
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.BAIXA, new Range(0, 1), new Range(0, 5)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.BAIXA, new Range(0, 1), new Range(6, 19)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.BAIXA, new Range(2, 3), new Range(0, 5)));

        entradasComplexidade.add(new EntradaComplexidade(Complexidade.MEDIA, new Range(0, 1), new Range(19, Integer.MAX_VALUE)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.MEDIA, new Range(2, 3), new Range(6, 19)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.MEDIA, new Range(3, Integer.MAX_VALUE), new Range(0, 5)));

        entradasComplexidade.add(new EntradaComplexidade(Complexidade.ALTA, new Range(2, 3), new Range(19, Integer.MAX_VALUE)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.ALTA, new Range(3, Integer.MAX_VALUE), new Range(6, 19)));
        entradasComplexidade.add(new EntradaComplexidade(Complexidade.ALTA, new Range(3, Integer.MAX_VALUE), new Range(19, Integer.MAX_VALUE)));
    }

    public Complexidade determinarComplexidade(SaidaExterna param) {
    	
    	Integer qtdArqRef = param.getQuantidadeArquivosReferencia();
    	Integer qtdDET = param.getQuantidadeDet();
        // Complexidade Padrão INDETERMINADA
        Complexidade complexidade = Complexidade.INDETERMINADA;

        // Percorre o mapa de complexidade
        for (EntradaComplexidade item : entradasComplexidade) {

            // gera log
            System.out.println("QTD arquivos referenciados " + qtdArqRef
                    + "QTD tipo de dados " + qtdDET
                    + ".  avaliando complexidade:" + item.getComplexidade() + " " + item.toString());

            // verifica se qtd de consulta externa está dentro do range da complexidade avaliada
            if (item.avaliar(qtdArqRef, qtdDET)) {
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
		for (SaidaExterna item : apf.getSaidasExternas()) {
			determinarComplexidade(item);
		}
	}
}


