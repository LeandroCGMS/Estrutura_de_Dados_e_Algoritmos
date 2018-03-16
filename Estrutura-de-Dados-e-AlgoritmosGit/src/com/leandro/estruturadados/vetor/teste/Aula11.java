package com.leandro.estruturadados.vetor.teste;

import com.leandro.estruturadados.vetor.Lista;
import com.leandro.estruturadados.vetor.Vetor;
import com.leandro.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "Contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "Contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		
		Contato c4 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		
		vetor.adiciona(c1);

	}

}
