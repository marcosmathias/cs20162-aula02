/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

public class NumeroHarmonico {
	public static int numeroHarmonico(int n){
		int i = 2;
		int s = 1;
		while(i <= n){
			s = ((s+1) / i);
			i = i + 1;
		}
		return s;
	}

}
