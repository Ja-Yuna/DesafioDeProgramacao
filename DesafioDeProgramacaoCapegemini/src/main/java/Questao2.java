package main.java;

import java.util.Scanner;
/**
 * 
 * @author chaoz
 * @version 17/02/2022
 */
public class Questao2 {
	/**
	 * 
	 * @param senha método que recebe senha como entrada 
	 * @return retorna quantidade de caracteres necessárias para senha segura
	 */
	public static int efetuarLogin(String senha) {
		if(senha.length() < 6) {
			return 6 - senha.length();
		}		
		return 0;		
	}

	/**
	 * 
	 * @param args método Main
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Senha: ");
		String senha = s.nextLine();
		s.close();

		System.out.printf("%d", efetuarLogin(senha));		
	}
}