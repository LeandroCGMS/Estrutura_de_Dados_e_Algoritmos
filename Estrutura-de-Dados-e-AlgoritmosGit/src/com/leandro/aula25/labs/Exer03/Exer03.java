package com.leandro.aula25.labs.Exer03;

import java.util.Random;
import java.util.Scanner;

import com.leandro.estruturadados.fila.Fila;

public class Exer03 {
	private static Scanner scan = new Scanner(System.in);
	private static Fila<Senha> senhas = new Fila<Senha>();

	public static void main(String[] args) {
		
		Random randomico =  new Random();
		int numAleatorio = randomico.nextInt(3) + 1;
		int tipoSenha = 0;
		String resp = "";
		for(int i = 0; i < 6; i++) {
			Senha senhaDaVez = null;
			boolean entradaValida = false;
			while(!entradaValida) {
				System.out.println("A " + (i+1) + "ª senha é Vermelha, Amarela ou Verde? (1 - Vermelha / 2 - Amarela / 3 - Verde)");
				resp = scan.nextLine();
				try {
					tipoSenha = Integer.parseInt(resp);
					if(tipoSenha < 1 || tipoSenha > 3) {
						throw new Exception();
					}
					entradaValida = true;
				} catch(Exception e) {
					System.out.println("Entrada inválida. Tente novamente.");
				}
			}
			
			if(tipoSenha == 1) {
				senhaDaVez = new Senha((i+1),TipoSenha.Vermelha);
			} else if(tipoSenha == 2) {
				senhaDaVez = new Senha((i+1),TipoSenha.Amarela);
			} else if(tipoSenha == 3) {
				senhaDaVez = new Senha((i+1),TipoSenha.Verde);
			}
			
			senhas.enfileira(senhaDaVez);
		}
		while(!senhas.estaVazia()) {
			senhas.desenfileira();
		}
		//System.out.println(senhas);
		for(int i = 0; i < 100; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Senha senhaDaVez = null;
			numAleatorio = randomico.nextInt(3) + 1;
			tipoSenha = numAleatorio;
			if(tipoSenha == 1) {
				senhaDaVez = new Senha((i+7),TipoSenha.Vermelha);
			} else if(tipoSenha == 2) {
				senhaDaVez = new Senha((i+7),TipoSenha.Amarela);
			} else if(tipoSenha == 3) {
				senhaDaVez = new Senha((i+7),TipoSenha.Verde);
			}
			
			senhas.enfileira(senhaDaVez);
			
		}
		
		

	}

}
