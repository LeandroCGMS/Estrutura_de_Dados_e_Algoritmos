package com.leandro.aula25.labs;

import java.util.Scanner;

import com.leandro.estruturadados.fila.Fila;

public class Exer01 {
	private static Fila<Documento> fila = new Fila<Documento>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\t\t\tSimulador de Fila de Impressão\n");
		boolean entradaValida = false;
		int qtdDoc = 0;
		while (!entradaValida) {
			try {
				System.out.println("Quanto(s) documento(s) será(ão) enviado(s) para a fila de impressão?");
				String resposta = scan.nextLine();
				qtdDoc = Integer.parseInt(resposta);
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Erro, tipo de dado não é um inteiro ou não está "
						+ "dentro do limite do tipo. \n\t\t\tTente novamente.");
			}
		}
		for (int i = 0; i < qtdDoc; i++) {
			Documento doc = new Documento();
			System.out.println("\t\t\tDados do " + (i + 1) + "º documento");
			System.out.println("Nome: ");
			doc.setNome(scan.nextLine());
			int qtdFolhas = 0;
			entradaValida = false;
			while (!entradaValida) {
				try {
					System.out.println("Quantidade de folhas: ");
					String resposta = scan.nextLine();
					qtdFolhas = Integer.parseInt(resposta);
					entradaValida = true;
				} catch (Exception e) {
					System.out.println("Erro, tipo de dado não é um inteiro ou não está "
							+ "dentro do limite do tipo. \n\t\t\tTente novamente.");
				}
			}
			doc.setQtdFolhas(qtdFolhas);
			fila.enfileira(doc);
		}

		System.out.println("\t\t\tImprimindo os documentos entrados na fila de impressão.");

		while(!fila.estaVazia()) {
			System.out.println(fila.espiar() + "... concluído");
			fila.desenfileira();
		}
		
		System.out.println("\t\t\tMostrando que fila está vazia => " + fila);
				

	}

}
