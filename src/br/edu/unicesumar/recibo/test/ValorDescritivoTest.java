package br.edu.unicesumar.recibo.test;

import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.recibo.Servico;

public class ValorDescritivoTest {

	@Test
	public void valorDescritivoTest(){
		Servico servico = new Servico();
		Assert.assertEquals("DEZ",servico.gerarValorDescrito(10));
		Assert.assertEquals("ZERO",servico.gerarValorDescrito(0));
		Assert.assertEquals("",servico.gerarValorDescrito(11));
		Assert.assertEquals("VINTE",servico.gerarValorDescrito(20));
		
		
	}
}
