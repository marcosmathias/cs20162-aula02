package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PotenciaComSomaTest {

	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		PotenciaComSoma.Potencia(x, y)
	}

}
