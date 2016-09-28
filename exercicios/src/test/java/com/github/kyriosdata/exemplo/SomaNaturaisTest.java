package com.github.kyriosdata.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaNaturaisTest {

	@Test(expected = IllegalArgumentException.class)
    public void valorNaoNatural() {
        SomaNaturais.SomaNaturais(-2);
    }

    @Test
    public void somaNaturais() {
    	assertEquals(10, SomaNaturais.SomaNaturais(4));
    }
}
