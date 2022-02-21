package test.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.Questao2;

public class Questao2Test {

	@Test
	public void loginOkTest() {
		boolean teste = Questao2.efetuarLogin("Ya3&ab");
		Assertions.assertTrue(teste);		
	}
	
	@Test
	public void loginFailedTest() {
		boolean teste = Questao2.efetuarLogin("Ya3");
		Assertions.assertFalse(teste);		
	}

}
