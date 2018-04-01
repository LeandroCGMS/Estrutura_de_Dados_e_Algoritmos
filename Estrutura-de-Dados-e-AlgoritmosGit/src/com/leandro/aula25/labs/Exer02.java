package com.leandro.aula25.labs;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;

public class Exer02 {
	private static Scanner scan = new Scanner(System.in);
	private static PriorityQueue<Senha> senhas = new PriorityQueue<>();
	private static Senha senhasDesorganizadas[];

	public static void main(String[] args) {

		
		
		//senha1.start();
		//senha2.start();
		boolean respValida = false;
		int qtdSenhas = 0;
		String resposta = "";
		while (!respValida) {
			System.out.println("Quantas senhas serão distribuídas?");
			resposta = scan.nextLine();
			try {
				qtdSenhas = Integer.parseInt(resposta);
				if(qtdSenhas < 1 || qtdSenhas > 100) {
					throw new Exception();
				}
				respValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
			}
		}
		
		
		senhasDesorganizadas = new Senha[qtdSenhas];
		for (int i = 0; i < qtdSenhas; i++) {
			respValida = false;
			int tipo = 0;
			String resp = "";			
			while (!respValida) {
				System.out.println((i + 1) + "ª senha é Prioritária ou Normal? 1 - Prioritária / 2 - Normal");
				resp = scan.nextLine();
				try {
					tipo = Integer.parseInt(resp);
					if (tipo < 1 || tipo > 2) {

						throw new Exception();
					}
					respValida = true;

				} catch (Exception e) {
					System.out.println("Entrada inválida. Tente novamente.");
				}
			}
			
			if(tipo == 1) {
				Senha senhaPrioritaria = new Senha(TipoSenha.Prioritaria, (i+1));
				//senhas.add(senhaPrioritaria);
				senhasDesorganizadas[i] = senhaPrioritaria;
			} else {
				Senha senhaNormal = new Senha(TipoSenha.Normal, (i+1));
				//senhas.add(senhaNormal);
				senhasDesorganizadas[i] = senhaNormal;
			}

		}
		
		for(int i = 0; i < senhasDesorganizadas.length; i++) {
			senhas.add(senhasDesorganizadas[i]);
		}
		
		System.out.println(senhas);
		
		

	}

}
