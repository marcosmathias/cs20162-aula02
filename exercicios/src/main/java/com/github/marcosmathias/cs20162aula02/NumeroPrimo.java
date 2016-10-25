/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação da verificação de número primo.
 *
 * @author Marcos Mathias Pereira
 *
 */

public class NumeroPrimo {
	public static boolean Primo(int n){
		int i = 2;
		while(i<=(n-1)){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
