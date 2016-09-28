/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo;

import java.time.LocalDate;

/**
 * Implementação do cálculo da soma vários de números naturais.
 *
 * @author Marcos Mathias Pereira
 *
 */

public class SomaNaturais {
	
	/**
     * Obtém a soma de uma quantidade de números naturais.
     * 
     * @param n A quantidade de números naturais que se deseja somar, à partir de 1. 
     * Ex: Se desejamos somar os 5 primeiros números naturais, n=5.
     *
     * @return O valor da soma.

     * @throws IllegalArgumentException Se "n" não for um número natural.
     */
	
	public static int soma(int n){
		
		if(1>=n)
		throw new IllegalArgumentException("O número deve ser natural");
		
		int i=2;
		int s=1;
		
		while (i<=n){
			s=s+i;
			i++;
		}
		
		return s;
	}
}

