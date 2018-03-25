package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
	private static Stack<Integer> decimais = new Stack<Integer>();
	private static Stack<char[]> binarios = new Stack<char[]>();

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		telaInicial();

		//converterDecBin();



	}

	public static void telaInicial() {


		boolean opValida = false;
		int op = 0;
		while(!opValida) {
			System.out.println("\t\t\tConversor de Inteiro Decimal em Binário\n"
					+ "\n\t1) Entrar com um número inteiro decimal para converter;"
					+ "\n\t2) Visualizar todos / o número(s) decimal(is) digitado(s);"
					+ "\n\t3) Sair.\n\n");
			String opcao = scan.nextLine();

			try {
				op = Integer.parseInt(opcao);
				if(op <= 0 || op > 3) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Opção inválida. Tente novamente.");
			}
			if(op > 0 && op < 4) {
				opValida = true;
			}
		}

		switch(op) {
		case 1:
			boolean entradaValida = false;
			int numDecimal = 0;
			while(!entradaValida) {
				System.out.println("Entre com um número inteiro decimal válido.");
				String numDec = scan.nextLine();

				try {
					numDecimal = Integer.parseInt(numDec);
					entradaValida = true;
				} catch(Exception e) {
					System.out.println("Número não é um inteiro ou não é um inteiro válido (dentro do limite do tipo).");
				}
			}

			decimais.push(numDecimal);
			converterDecBinChar(numDecimal);
			voltarAoMenu();

			break;
		case 2:
			exibirTodosDecBin();
			break;
		case 3:
			System.exit(0);
			break;
		}


	}

	public static void voltarAoMenu() {
		boolean opValida = false;
		int op = 0;
		while(!opValida) {
			System.out.println("\t1) Voltar à tela inicial;"
					+ "\n\t2) Sair.\n\n");
			String opc = scan.nextLine();

			try {
				op = Integer.parseInt(opc);
				if(op <= 0 || op > 3) {
					throw new Exception();
				}
				if(op > 0 && op < 3) {
					opValida = true;
				}
			} catch(Exception e) {
				System.out.println("Opção inválida. Tente novamente.");
			}
			if(op > 0 && op < 3) {
				opValida = true;
			}
		}

		switch(op) {
		case 1:
			telaInicial();
			break;
		case 2:
			System.exit(0);
			break;
		}


	}

	public static void converterDecBinChar(int numDec) {
		Stack<Integer> restos = new Stack<Integer>();
		int numDecimal = numDec;
		char[] binario = new char[8];
		String bin = "";
		int resto = 0;
		while(numDec != 1) {
			resto = numDec % 2; // 0 // 1 // 0
			numDec /= 2; // 5 // 2 // 1

			restos.push(resto); // empurra o 0 // empurra o 1 // empurra o 0

		}
		restos.push(numDec);

		System.out.println("\t\t\t");

		for(int k = restos.size() - 1, i = 0; k >=0 ; k--, i++) {

			bin += restos.get(k);

		}
		
		binario = bin.toCharArray();
		binarios.push(binario);
		

		System.out.println("Decimal inteiro => " + numDecimal + ", em binário => " + bin + ".\n\n");

		voltarAoMenu();
	}
	
	public static void exibirTodosDecBin() {
		if(decimais.isEmpty()) {
			System.out.println("Não foi digitado um número para conversão ainda.\n");
			telaInicial();
		}
		for(int i = 0; i < decimais.size(); i++) {
			System.out.print((i+1) + "º decimal: " + decimais.get(i) + ", em binário => ");
			for(int j = 0; j < binarios.get(i).length; j++) {
				System.out.print(binarios.get(i)[j]);
			}
			System.out.println();
		}
	}

	
}
