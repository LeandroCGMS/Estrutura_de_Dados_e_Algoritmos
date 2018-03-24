package com.leandro.aula18.labs;
import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
	private static Stack<char[]> stack = new Stack<char[]>();
	private static Stack<String> palavras = new Stack<String>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t\tVerificador de Palíndromos\n\t\t\tEvite pontuação e acentos, caso seja(m) frase(s).");
		
		
		
		boolean intValido = false;
		int qtdPalavras = 0;
		while(!intValido) {
			System.out.println("Quantas palavras e/ou números e/ou frases quer "
					+ "testar se são palíndromos? (0 ou negativo para Sair).");
			String qtdPalavrasString = scan.nextLine();
			try {
				qtdPalavras = Integer.parseInt(qtdPalavrasString);
				
				intValido = true;
			} catch(Exception e) {
				System.out.println("Você não digitou um inteiro válido.");
			}
		}
				
		for(int i = 0; i < qtdPalavras; i++) {
			char[] palavra;
			if(qtdPalavras == 1) {
				System.out.println("Entre com a palavra, número ou frase para saber se "
						+ "é um Palíndromo.");
				String palavraString = scan.nextLine();
				palavraString = palavraString.toUpperCase();
				
				palavras.push(palavraString);
				
				palavraString = palavraString.replaceAll(" ", "");
				palavra = palavraString.toCharArray();
				stack.push(palavra);
			} else {
				System.out.println("Entre com a " + (i+1) + "ª palavra ou número para "
						+ "saber se é um Palíndromo.");
				String palavraString = scan.nextLine();
				palavraString = palavraString.toUpperCase();
				palavras.push(palavraString);
				palavraString = palavraString.replaceAll(" ", "");
				palavra = palavraString.toCharArray();
				stack.push(palavra); //ok---
			}
			
			
		}
		
		seEPalindromo();
		

	}
	
	public static void seEPalindromo() {
		int contDigitosIguais = 0;
		for(int i = 0; i < stack.size(); i++) {
						
			for(int j = 0, k = stack.get(i).length - 1; j < stack.get(i).length / 2; j++, k--) {
								
				if(stack.get(i)[j] == stack.get(i)[k] ) { // OSSO: se O é igual a O, se S é igual a S
					contDigitosIguais++; // igual a 2
				}
			}
			if(contDigitosIguais == stack.get(i).length / 2) {
				
				/*for(int k = 0; k < stack.get(i).length; k++) {
					
					System.out.print(stack.get(i)[k]);
				}*/
				System.out.print(palavras.get(i) + " é um Palíndromo.\n");
			} else {
				
				/*for(int k = 0; k < stack.get(i).length; k++) {
					
					System.out.print(stack.get(i)[k]);
				}*/
				
				System.out.println(palavras.get(i) + " NÃO é um Palíndromo.\n");
			}
			contDigitosIguais = 0;
		}
	}

}
