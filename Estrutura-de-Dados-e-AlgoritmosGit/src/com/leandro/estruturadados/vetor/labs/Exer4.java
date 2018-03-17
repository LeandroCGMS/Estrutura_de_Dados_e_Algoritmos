package com.leandro.estruturadados.vetor.labs;

import com.leandro.estruturadados.vetor.teste.Contato;

public class Exer4 {

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
			

			System.out.println("Obtendo posições de registros iguais ao c3: "
					+ lista.obtem(c3));
			

	}

}
