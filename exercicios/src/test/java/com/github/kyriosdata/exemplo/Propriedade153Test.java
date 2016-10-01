/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Propriedade153Test {

	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		Propriedade153.propriedade153(-1);
	}
	
	@Test
	public void testePropriedadeTrue() {
		assertEquals(true, Propriedade153.propriedade153(153));
	}
	
	@Test
	public void testePropriedadeFalse() {
		assertEquals(false, Propriedade153.propriedade153(152));
	}

}