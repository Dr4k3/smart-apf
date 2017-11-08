/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.smartapf.calculo.ponto.funcao.calculos;

/**
 * @author Silas
 */
public class Range  {
    
    private Integer max;
    private Integer min;
    
    public Range(Integer min, Integer max){
        this.min = min;
        this.max = max;
    }
    
    public boolean avaliar(Integer number) {
        return number.compareTo(min)>=0 && number.compareTo(max)<=0;
    }
    
    public static void main(String []args){
        System.out.println(new Range(1, 10).avaliar(10));
        System.out.println(new Range(1, 10).avaliar(1));
        System.out.println(new Range(1, 10).avaliar(11));
    }

    @Override
    public String toString() {
        return "Range{" + "min=" + min + ", max=" + max + '}';
    }
    
    
    
}
