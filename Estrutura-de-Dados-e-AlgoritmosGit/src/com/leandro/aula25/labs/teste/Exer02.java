package com.leandro.aula25.labs.teste;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.leandro.aula25.labs.Senha;
import com.leandro.aula25.labs.TipoSenha;

public class Exer02 {
	private static Scanner scan = new Scanner(System.in);
	private static Queue<Senha> senhas = new PriorityQueue<Senha>();
	
	public static void main(String[] args) {
		System.out.println("\t\t\tExer02: senhas a um grupo de pessoas, tomada 1");
		boolean entradaValida = false;
		int qtdSenhas = 0;
		while(!entradaValida) {
			System.out.println("Quantas pessoas receberão a senha?");
			String respQtdPessoas = scan.nextLine();
			try{
				qtdSenhas = Integer.parseInt(respQtdPessoas);
				entradaValida = true;
			} catch(Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
			}
			
		}
		int numSenha = 0;
		for(int i = 0; i < qtdSenhas; i++) {
			
			numSenha++;
			int senhaTipo = 0;
			
			TipoSenha senha = null;
			
			entradaValida = false;
			while(!entradaValida) {
				System.out.println((i+1) + "ª senha é Prioritária ou Normal? "
						+ "[1 para Prioritária / 2 para Normal]");
				String tipoSenha = scan.nextLine();
				try{
					senhaTipo = Integer.parseInt(tipoSenha);
					if(senhaTipo < 1 || senhaTipo > 2) {
						throw new Exception();
					}
					if(senhaTipo == 1) {
						senha = senha.Prioritária;
					} else if(senhaTipo == 2) {
						senha = senha.Normal;
					}
					entradaValida = true;
				} catch(Exception e) {
					System.out.println("Entrada inválida. Tente novamente.");
				}
				
			}
			Senha senhaDaVez = new Senha();
			senhaDaVez.setNumSenha(numSenha);
			senhaDaVez.setTipoSenha(senha);
			
			senhas.add(senhaDaVez);
		}
		
		System.out.println(senhas);
		
	}
}
