package br.com.lucaslira;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
class CalculadoraTest {

	@Test
	public void somaDeDoisNumeros() {
		
		int a = 2;
		int b = 2;
		
		Calculadora calculadora = new Calculadora();
		
		int result = calculadora.somar(a, b);
		
		Assert.assertEquals(4, result);
	}

	@Test
	public void subtracaoDeDoisNumeros() {
		
		int a = 5;
		int b = 2;
		
		Calculadora calculadora = new Calculadora();
		
		int result = calculadora.subtracao(a, b);
		
		Assert.assertEquals(3, result);
		
		
	}
	
	@Test
	public void multiplicacaoDeDoisNumeros() {
		
		int a = 5;
		int b = 4;
		
		Calculadora calculadora = new Calculadora();
		
		int result = calculadora.multiplicacao(a, b);
		
		Assert.assertEquals(20, result);
	}
	
	@Test
	public void divisaoDeDoisNumeros() {
		int a = 100;
		int b = 4;
		
		Calculadora calculadora = new Calculadora();
		
		int result = calculadora.divisao(a, b);
		
		Assert.assertEquals(25, result);
		
		
	}
	

	
}
