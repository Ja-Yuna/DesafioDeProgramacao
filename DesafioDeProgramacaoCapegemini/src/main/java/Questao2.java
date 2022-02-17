package main.java;

import java.util.Scanner;

public class Questao2 {

	public static int efetuarLogin(String senha) {
		if(senha.length() < 6) {
			return 6 - senha.length();
		}		
		return 0;		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Senha: ");
		String senha = s.nextLine();
		s.close();
				
		System.out.printf("%d", efetuarLogin(senha));		
	}
}