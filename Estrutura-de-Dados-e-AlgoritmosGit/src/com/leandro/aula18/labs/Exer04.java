package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

import com.leandro.estruturadados.pilha.Pilha;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<Livro> stack = new Stack<Livro>();

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

			stack.push(livroDaVez);
		}

		System.out.println("O topo da pilha de livros: " + stack.peek());
		System.out.println("Se a pilha está vazia: " + stack.isEmpty());
		System.out.println("Desempilhando pilha");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("Imprindo pilha vazia => " + stack);

	}

}
