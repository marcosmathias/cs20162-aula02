/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;


/**
 * Implementação do cálculo do Crivo de Eratóstenes, que verifica se dado número é primo ou não.
 *
 * @author Marcos Mathias Pereira
 *
 */

public class CrivoDeEratostenes {
	public static void CrivoEratostenes(int a[], int n){
		int i = 2;
		int c;
		while(i <= (n / 2)){
			if(a[i]==0){
				c = i + i;
				while(c <= n){
					a[c] = 1;
					c = c+i;
				}
			}
			i = i+1;
		}
	}

}
