package test.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.Questao2;

public class Questao2Test {

	@Test
	public void loginOkTest() {
		int teste = Questao2.efetuarLogin("teste1");
		Assertions.assertEquals(teste, 0);		
	}
	
	@Test
	public void loginFailedTest() {
		int teste = Questao2.efetuarLogin("Ya3");
		Assertions.assertEquals(teste, 3);		
	}

}
