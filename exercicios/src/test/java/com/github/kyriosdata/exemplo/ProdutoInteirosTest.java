package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoInteirosTest {

	@Test(expected = IllegalArgumentException.class)
	public void primeiroInvalido() {
		ProdutoInteiros.soma(0, 5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void segundoInvalido(){
		ProdutoInteiros.soma(5, 0);
	}
	
	@Test
	public void produtoInteiros(){
		assertEquals(25, ProdutoInteiros.soma(5, 5));
	}

}
