package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoInteirosComSomaTest {

	@Test(expected = IllegalArgumentException.class)
	public void primeiroInvalido() {
		ProdutoInteirosComSoma.Produto(0, 5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void segundoInvalido(){
		ProdutoInteirosComSoma.Produto(5, 0);
	}
	
	@Test
	public void produtoInteiros(){
		assertEquals(25, ProdutoInteirosComSoma.Produto(5, 5));
	}

}
