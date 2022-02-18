package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author chaoz
 * @version 17/02/2022
 */
public class Questao3 {
	/**
	 * 
	 * @param palavra método recebe palavra como parâmetro
	 * @return retorna quantidade de pares de anagramas
	 */
	public static int quantidadeAnagramas(String palavra) {
		Map<String, Integer> anagramas = new HashMap<String, Integer>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i; j < palavra.length(); j++) {
				char[] substring = palavra.substring(i, j+1).toCharArray();
				Arrays.sort(substring);
				String palavraAux = new String(substring);

				if (anagramas.containsKey(palavraAux)) {
					anagramas.put(palavraAux, anagramas.get(palavraAux) + 1);
				}
				else {
					anagramas.put(palavraAux, 1);
				}
			}
		}

		int paresDeAnagramas = 0;
		for (String palavraAux : anagramas.keySet()) {
			int quantidade = anagramas.get(palavraAux);
			paresDeAnagramas += (quantidade * (quantidade - 1)) / 2;
		}
		return paresDeAnagramas;
	}
	/**
	 * 
	 * @param palavra método recebe palavra como parâmetro
	 * @return retorna a palavra sem espaços
	 */
	public static String removeEspacos(String palavra) {		
		return palavra.replaceAll(" ", "");
	}
	/**
	 * 
	 * @param args Main method
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		

		System.out.print("Entrada: ");

		String palavra = s.nextLine();
		palavra = removeEspacos(palavra);		

		System.out.println("Saída: " + quantidadeAnagramas(palavra));

		s.close();
	}
}