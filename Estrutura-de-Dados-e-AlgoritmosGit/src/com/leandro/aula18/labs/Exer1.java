package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer1 {
	private static Scanner scan = new Scanner(System.in);
	private static Stack<Integer> stack = new Stack<Integer>();
	private static int cont = 0;

	public static void main(String[] args) {


		System.out.println("Será solicitado que digite 10 números inteiros.");
		menu();


	}

	public static void menu() {
		boolean opValida = false;
		int numero = 0;
		while(!opValida) {
			cont++;
			System.out.println("Digite o " + cont + "º número inteiro.");
			String num = scan.nextLine();
			try {
				numero = Integer.parseInt(num);

			} catch(Exception e) {
				System.out.println("Número não é do tipo inteiro.");
				cont--;
				menu();
			}

			if(numero % 2 == 0) {
				stack.push(numero);
			} else {
				if(stack.isEmpty()) {
					System.out.println("Apesar do número digitado ser ímpar e pela regra, ter que desempilhar um número, como"
							+ "a pilha está vazia, apenas essa mensagem será exibida.");
				} else {
					stack.pop();
				}
			}			

			if(cont == 10) {
				System.out.println("Mostrando a pilha atual => " + stack);
				System.out.println("Hora de desempilhar até esvaziar a pilha.");
				
				while(!stack.isEmpty()) {
					stack.pop();
				}
				
				System.out.println("Imprimindo a pilha pra mostrar que está vazia: " + stack);
				opValida =  true;
			}

		}

	}

}
