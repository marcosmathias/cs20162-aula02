/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo do Maior Divisor Comum (MDC) entre dois números, utilizando 
 * um método sem recursão, e um outro método utilizando somente subtrações.
 *
 * @author Marcos Mathias Pereira
 *
 */

public class MaiorDivisorComum {
	public static int CrivoEratostenes(int a, int b){
		int m;
		while(b != 0){
			m = a % b;
			a = b;
			b = m;
		}
		return a;
	}
	public static int CrivoEratostenesSubtracoes(int a, int b){
		while(a != b){
			if(a > b){
				a = a-b;
			}
			else{
				b = b-a;
			}
		}
		return a;
	}
		
}


