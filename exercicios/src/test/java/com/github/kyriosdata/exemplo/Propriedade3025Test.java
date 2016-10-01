/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Propriedade3025Test {

	@Test(expected = IllegalArgumentException.class)
	public void testeEntrada() {
		Propriedade3025.propriedade3025(-1);
	}

	@Test
	public void testePropriedadeTrue(){
		assertEquals(true, Propriedade3025.propriedade3025(3025));
	}
	
	@Test
	public void testePropriedadeFalse(){
		assertEquals(false, Propriedade3025.propriedade3025(2));
	}
}