package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.PotenciaComSoma;

public class PotenciaComSomaTest {

	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		PotenciaComSoma.Potencia(-1, 6);
	}
	
	@Test
	public void potenciaComSoma(){
		assertEquals(16, PotenciaComSoma.Potencia(2, 4));
	}
	
	

}
