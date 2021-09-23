package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora{

	@Test
	public void test_carga_frontal () {
		
		//implementar factory method
		Factory fac = new Factory();
		Lavadora lavadora = fac.CreacionDeLavadora("frontal");
		
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		
		//implementar factory method
		Factory fac = new Factory();
		Lavadora lavadora = fac.CreacionDeLavadora("superior");
		
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}