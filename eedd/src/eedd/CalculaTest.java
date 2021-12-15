package eedd;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculaTest {

	@Test
	public void TestSuma() {
		int resultado = Calcula.suma(2,3);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestResta() {
		int resultado = Calcula.resta(3,2);
		int esperado = 1;
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestKhe() {
		String a=Calcula.devuelve();
		String b = "ANTIJ";
		
		assertEquals(a, b);
	}
	
	@Test
	public void Testtrue() {
		Boolean a = Calcula.de();
		assertFalse("Pos no", a);
	}
	
}
