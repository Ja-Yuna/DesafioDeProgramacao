package main.java;

import java.util.Scanner;

public class Questao1 {
	
	public static void imprimirEscada(int tamanho) {
		System.out.println();
		
		for(int i = tamanho; i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				System.out.print(" ");
			}

			for(int asteriscos = i; asteriscos <(tamanho-1)+1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner escada = new Scanner(System.in);

		System.out.print("Tamanho da escada: ");
		int tamanho = escada.nextInt();
		escada.close();
		imprimirEscada(tamanho);
	}
}