/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo;

/**
 * Implementação do cálculo da propriedade 3025.
 *
 * @author Marcos Mathias Pereira
 *
 */

public class Propriedade3025 {
	/**
     * Verifica se um número é válido para a propriedade 3025, de acordo com a fórmula: 
     * ab+cd = e
     * e^2 = abcd
     * 
     * @param n O numero a ser verificado.
     *
     * @return A resposta se o número é ou não é válido para a propriedade 3025 (true or false)

     * @throws IllegalArgumentException Se o número a ser verificado for menor do que zero ou maior do que 9999.
     */
	public static boolean propriedade3025(int n){
		if(n>=0 && n<=9999){
			int i = n/100;
			int j = n%100;
			return (i+j)*(i+j)==n;	
		}
		else
			throw new IllegalArgumentException("Entrada inválida. Digite um número 0 e 9999.");	
	}
}
