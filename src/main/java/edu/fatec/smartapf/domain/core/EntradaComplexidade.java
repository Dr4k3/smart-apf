/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.smartapf.domain.core;

import edu.fatec.smartapf.domain.core.enums.Complexidade;

/**
 *
 * @author Silas
 */
public class EntradaComplexidade {

    private Range rangeX;
    private Range rangeY;
    private Complexidade complexidade;

    public EntradaComplexidade(Complexidade complexidade, Range rangeX, Range rangeY) {
        if (rangeX == null || rangeY == null) {
            throw new IllegalArgumentException("O preenchimento dos ranges é obrigatório. Argumentos inválidos");
        }

        if (complexidade == null) {
            throw new IllegalArgumentException("O preenchimento da complexidade é obrigatório. Argumentos inválidos");
        }

        this.complexidade = complexidade;
        this.rangeX = rangeX;
        this.rangeY = rangeY;
    }

    public boolean avaliar(Integer qtdX, Integer qtdY) {
        return rangeX.avaliar(qtdX) && rangeY.avaliar(qtdY);
    }

    @Override
    public String toString() {
        return "EntradaComplexidade{" + "rangeX=" + rangeX + ", rangeY=" + rangeY + '}';
    }

    public Complexidade getComplexidade() {
        return this.complexidade;
    }

}