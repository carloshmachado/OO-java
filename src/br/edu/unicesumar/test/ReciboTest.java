package br.edu.unicesumar.test;

import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.Calculadora;
import br.edu.unicesumar.recibo.Servico;


public class ReciboTest {
	
	@Test
	public void validaNumero() {
		Servico servico = new Servico();
        
		Assert.assertEquals("ZERO", servico.gerarValorDescrito(0));
		Assert.assertEquals("DEZ", servico.gerarValorDescrito(10));
		Assert.assertEquals("VINTE", servico.gerarValorDescrito(20));
	}
}
