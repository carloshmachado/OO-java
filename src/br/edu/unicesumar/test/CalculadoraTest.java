package br.edu.unicesumar.test;
import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.Calculadora;


public class CalculadoraTest {

	@Test
	public void validaParTest() {
		Calculadora calculadora = new Calculadora();

		Assert.assertEquals("PAR", calculadora.validaSeValorEhPar(4));
		Assert.assertEquals("", calculadora.validaSeValorEhPar(5));
		Assert.assertFalse(calculadora.validaSeValorEhPar(4).isEmpty());
	}
	
	@Test
	public void validarImparTest(){
		Calculadora calculadora = new Calculadora();
		Assert.assertEquals("IMPAR", calculadora.validaSeValorEhImpar(3));
	}
	
	//1 - faça o metodo validaSeValorEhPar trabalhe com parametros
	//2 - faça um test case para o metodo validaSeValorEhImpar();
	//3 - faça o metodo validaSeValorEhImpar trabalhe com parametros
	
}
