/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.smartapf.calculo.ponto.funcao;

import edu.fatec.smartapf.calculo.ponto.funcao.calculos.Complexidade;

/**
 *
 * @author Silas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Complexidade ALTA descricao: " + Complexidade.ALTA.toString());
        System.out.println("Complexidade ALTA ordem: " + Complexidade.ALTA.ordinal());
    }
    
}
