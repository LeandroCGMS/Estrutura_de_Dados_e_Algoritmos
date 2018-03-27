package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class TorreHanoi {
	
	private static Scanner scan = new Scanner(System.in);
	private static int cont = 0;

	public static void main(String[] args) {
		Stack<Integer> ori = new Stack<Integer>();
		Stack<Integer> aux = new Stack<Integer>();
		Stack<Integer> dest = new Stack<Integer>();

		boolean respostaValida = false;
		int qtdDiscos = 0;
		while (!respostaValida) {
			System.out.println("Quantos discos quer inserir na primeira torre?");
			String resposta = scan.nextLine();
			try {
				qtdDiscos = Integer.parseInt(resposta);
				respostaValida = true;
			} catch (Exception e) {
				System.out.println("Resposta não é um inteiro ou não é um inteiro dentro do limite do tipo.");
			}
		}
		
		for(int i = qtdDiscos; i > 0; i--) {
			ori.push(i);
		}

		torreDeHanoi(qtdDiscos, ori,dest,aux);
		
		System.out.println("Exibindo a torre 3 completa.");
		for (int i = dest.size() - 1; i >= 0; i--) {
			System.out.println("_ " + dest.get(i) + " _");
		}
		
		System.out.println("Torre destino está completa? Resp: " + torre3EstaCompleta(ori, dest, aux));

	}
	
	public static void torreDeHanoi(int qtdDiscos, Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {

		if(qtdDiscos == 1) {
			cont++;
			System.out.println(cont + "º movimento");
			dest.push(ori.peek());
			ori.pop();
		} else {
			torreDeHanoi(qtdDiscos - 1,ori,aux,dest);
			cont++;
			System.out.println(cont + "º movimento");
			dest.push(ori.peek());
			ori.pop();
			torreDeHanoi(qtdDiscos - 1,aux,dest,ori);
		}

		

		

	}

	public static boolean torre3EstaCompleta(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		int contPosicoesCompletas = 0;
		for (int i = dest.size() - 1; i > 0; i--) {

			if (dest.get(i) == null) {
				return false;
			}
			if (dest.get(i) < dest.get(i - 1)) {
				contPosicoesCompletas++;
			}
		}

		if (contPosicoesCompletas == dest.size() - 1) {
			return true;
		}

		return false;
	}

}
