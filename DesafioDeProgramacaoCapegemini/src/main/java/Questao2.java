package main.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author chaoz
 * @version 17/02/2022
 */
public class Questao2 {
	/**
	 * 
	 * @param senha método que recebe senha como entrada 
	 * @return retorna se a senha é segura ou não
	 */
	public static boolean efetuarLogin(String senha) {
		Pattern pattern = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6})");
		Matcher matcher = pattern.matcher(senha);
		return matcher.matches();
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
		
		int quantidadeSenha = senha.length() <= 6 ? 6 - senha.length() : 0;
		System.out.printf("%d", quantidadeSenha);
						
		System.out.print("\nSenha segura: " + (efetuarLogin(senha) ? "Sim" : "Não"));		
	}
}