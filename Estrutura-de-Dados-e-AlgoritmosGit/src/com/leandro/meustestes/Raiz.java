package com.leandro.meustestes;

import java.util.Scanner;

public class Raiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número para calcular sua raiz quadrada.");
		String numero = scan.nextLine();
		int num = Integer.parseInt(numero);
		System.out.println("Resposta: " + raizQuadrada(num));
		

	}

	public static double raizQuadrada(double numero) {
		
		for(double i = 1; i < numero; i+=0.1) {
			if(i * i ==  numero) {
				return i;
			}
		}
		return 0;
	}
	
	public static int raizQuadrada(int numero) {
		
		for(int i = 1; i < numero; i++) {
			if(i * i ==  numero) {
				return i;
			}
		}
		return 0;
	}

}
