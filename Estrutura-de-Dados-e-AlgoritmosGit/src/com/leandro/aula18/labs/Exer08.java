package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer08 {
	
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
			System.out.println("| " + dest.get(i) + " |");
		}

	}
	
	public static void tiraDaOriPoeNaDest(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		dest.push(ori.peek());
		ori.pop();
	}
	
	public static void tiraDaOriPoeNaAux(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		aux.push(ori.peek());
		ori.pop();
	}
	
	public static void tiraDaAuxPoeNaOri(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		ori.push(aux.peek());
		aux.pop();
	}
	
	public static void tiraDaAuxPoeNaDest(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		dest.push(aux.peek());
		aux.pop();
	}
	
	public static void tiraDaDestPoeNaOri(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		ori.push(dest.peek());
		dest.pop();
	}
	
	public static void tiraDaDestPoeNaAux(Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {
		aux.push(dest.peek());
		dest.pop();
	}

	public static void torreDeHanoi(int qtdDiscos, Stack<Integer> ori, Stack<Integer> dest, Stack<Integer> aux) {

		if(qtdDiscos == 1) {
			cont++;
			System.out.println(cont + "º movimento.");
			tiraDaOriPoeNaDest(ori,dest,aux);
		} else {
			torreDeHanoi(qtdDiscos - 1,ori,aux,dest);
			cont++;
			System.out.println(cont + "º movimento.");
			tiraDaOriPoeNaDest(ori,dest,aux);
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
