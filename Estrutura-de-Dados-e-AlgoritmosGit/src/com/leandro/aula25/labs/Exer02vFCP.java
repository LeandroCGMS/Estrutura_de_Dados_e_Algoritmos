package com.leandro.aula25.labs;

import java.util.Scanner;

import com.leandro.estruturadados.fila.FilaComPrioridade;

public class Exer02vFCP {
	private static Scanner scan = new Scanner(System.in);
	private static FilaComPrioridade<Senha> senhas = new FilaComPrioridade<>();

	public static void main(String[] args) {
		System.out.println("\t\t\tExer02: senhas a um grupo de pessoas, tomada 1");
		boolean entradaValida = false;
		int qtdSenhas = 0;
		while (!entradaValida) {
			System.out.println("Quantas pessoas receberão a senha?");
			String respQtdPessoas = scan.nextLine();
			try {
				qtdSenhas = Integer.parseInt(respQtdPessoas);
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
			}

		}
		int numSenha = 0;
		for (int i = 0; i < qtdSenhas; i++) {

			numSenha++;
			int senhaTipo = 0;

			TipoSenha senha = null;

			entradaValida = false;
			while (!entradaValida) {
				System.out.println(
						(i + 1) + "ª senha é Prioritária ou Normal? " + "[1 para Prioritária / 2 para Normal]");
				String tipoSenha = scan.nextLine();
				try {
					senhaTipo = Integer.parseInt(tipoSenha);
					if (senhaTipo < 1 || senhaTipo > 2) {
						throw new Exception();
					}
					if (senhaTipo == 1) {
						senha = senha.Prioritária;
					} else if (senhaTipo == 2) {
						senha = senha.Normal;
					}
					entradaValida = true;
				} catch (Exception e) {
					System.out.println("Entrada inválida. Tente novamente.");
				}

			}
			Senha senhaDaVez = new Senha();
			senhaDaVez.setNumSenha(numSenha);
			senhaDaVez.setTipoSenha(senha);
			senhas.enfileira(senhaDaVez);
		}

		//System.out.println(senhas);
		while(!senhas.estaVazia()) {
			System.out.println(senhas.desenfileira());
		}
		

	}

}
