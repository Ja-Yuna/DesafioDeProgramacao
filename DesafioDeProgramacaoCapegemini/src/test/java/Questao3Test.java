package test.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.Questao3;

public class Questao3Test {

	@Test
	public void anagramaTest() {
		int teste = Questao3.quantidadeAnagramas("ifailuhkqq");
		Assertions.assertEquals(teste, 3);		
	}
}
