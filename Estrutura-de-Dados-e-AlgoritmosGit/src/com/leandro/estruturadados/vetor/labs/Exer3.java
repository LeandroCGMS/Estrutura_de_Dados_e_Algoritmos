package com.leandro.estruturadados.vetor.labs;

import com.leandro.estruturadados.vetor.teste.Contato;

public class Exer3 {

	public static void main(String[] args) {
		
Lista<Contato> lista = new Lista<Contato>(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "Contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "Contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		
		Contato c4 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		Contato c5 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		Contato c6 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		Contato c7 = new Contato("Contato 3", "0000-7890", "Contato3@email.com");
		
		lista.adiciona(c1);
		lista.adiciona(c2);
		lista.adiciona(c3);
		lista.adiciona(c4);
		lista.adiciona(c5);
		lista.adiciona(c6);
		
		System.out.println(lista.tamanho());
		
		System.out.println("Tentando remover contato c7 que não coincide em, pelo menos, "
				+ " um campo.");
		
		if(lista.remove(c7) == -1 ) {
			System.out.println("Elemento não existe para ser excluído.");
		}
		
		System.out.println(lista);
		
		System.out.println("Removendo o contato c6 quem também é o c3");
		
		if(lista.remove(c6) == -1 ) {
			System.out.println("Elemento não existe para ser excluído.");
		}
		
		System.out.println(lista);

	}

}
