package com.leandro.aula18.labs;

import java.util.Scanner;

import com.leandro.estruturadados.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		for(int i = 0; i < 6; i++) {
			Livro livroDaVez =  new Livro();
			System.out.println("Entre com os dados do " + (i+1) + "º livro.\nNome: ");
			livroDaVez.setNome(scan.nextLine());
			System.out.println("ISBN: ");
			livroDaVez.setIsbn(scan.nextLine());
			
			boolean semErro = false;
			int anoLivro = 0;
			while(!semErro) {
				try {
					System.out.println("Ano: ");
					String ano = scan.nextLine();
					livroDaVez.setAno(Integer.parseInt(ano));
					semErro = true;
				} catch(Exception e) {
					System.out.println("Você não digitou um inteiro válido.");
				}
			}
			System.out.println("Autor: ");
			livroDaVez.setAutor(scan.nextLine());
			
			pilha.empilha(livroDaVez);
		}
		
		System.out.println("O topo da pilha de livros: " + pilha.topo());
		System.out.println("Se a pilha está vazia: " + pilha.estaVazia());
		System.out.println("Desempilhando pilha");
		while(!pilha.estaVazia()) {
			System.out.println(pilha.desempilha());
		}
		System.out.println("Imprindo pilha vazia => " + pilha);
		

	}

}
