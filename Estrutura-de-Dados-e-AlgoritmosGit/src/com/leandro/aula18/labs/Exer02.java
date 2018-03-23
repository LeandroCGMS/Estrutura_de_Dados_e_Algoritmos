package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer02 {
	private static Scanner scan = new Scanner(System.in);
	private static int cont = 0;
	private static Stack<Integer> stackPar =  new Stack<Integer>();
	private static Stack<Integer> stackImpar =  new Stack<Integer>();

	public static void main(String[] args) {
		
		menu();

	}
	
	public static void menu() {
		System.out.println("Serão pedidos 10 números inteiros.");
		int num = 0;
		
		boolean opValida = false;
		
		while(!opValida) {
			cont++;
			System.out.println("Digite o " + cont + "º número.");
			String n = scan.nextLine();
			try{
				num = Integer.parseInt(n);
			} catch(Exception e) {
				cont--;
				System.out.println("Valor não é um número inteiro válido. Tente novamente.");
				menu();
			}
					
			if(num == 0 && (!stackPar.isEmpty() && !stackImpar.isEmpty()) ) {
				stackPar.pop();
				stackImpar.pop();
			} else if ( num == 0 && (stackPar.isEmpty() && !stackImpar.isEmpty()) ){
				System.out.println("Apenas a pilha de ímpares será desempilhada.");
				stackImpar.pop();
			} else if( num == 0 && (stackImpar.isEmpty() && !stackPar.isEmpty()) ) {
				System.out.println("Apenas a pilha de pares será desempilhada.");
				stackPar.pop();
			} else if(num == 0 && (stackPar.isEmpty() && stackImpar.isEmpty())) {
				System.out.println("Erro: As duas pilhas estão vazias.");
			}
			
			if(num % 2 == 0) {
				stackPar.push(num);
			} else {
				stackImpar.push(num);
			}
			
			if(cont == 10) {
				System.out.println("Pilha de pares completada: " + stackPar);
				System.out.println("Pilha de ímpares completada: " + stackImpar + "\n\n");
				opValida = true;
				if(!stackPar.isEmpty()) {
					System.out.println("Desempilhando a pilha de pares.");
					while(!stackPar.isEmpty()) {
						System.out.println(stackPar.pop());
					}
				}
				
				
				
				System.out.println("Exibindo a pilha de pares vazia => " + stackPar);
				
				if(!stackImpar.isEmpty()) {
					System.out.println("Desempilhando a pilha de ímpares.");
					while(!stackImpar.isEmpty()) {
						System.out.println(stackImpar.pop());
					}
				}
				
				
				System.out.println("Exibindo a pilha de ímpares vazia => " + stackImpar);
			}
			
			
			
		}
	}

}
