/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo;

/**
 * Implementação do cálculo da propriedade 3025.
 *
 * Fórmula da propriedade: 
 * ab+cd = e
 * e^2 = abcd
 *
 * @author Marcos Mathias Pereira
 *
 */

public class Propriedade3025 {
	public static boolean propriedade3025(int n){
		if(n>0 && 9999>n){
			int i = n/1000;
			int j = n%100;
			n = (i+j)*(i+j);
			return (i+j)*(i+j)==n;	
		}
		else
			throw new IllegalArgumentException("Entrada inválida. Digite um número 0 e 9999.");	
	}

}
