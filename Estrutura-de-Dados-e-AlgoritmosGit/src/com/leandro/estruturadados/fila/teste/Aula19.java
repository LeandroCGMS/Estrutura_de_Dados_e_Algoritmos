package com.leandro.estruturadados.fila.teste;

import com.leandro.estruturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		
		System.out.println(fila);
		System.out.println(fila.tamanho());
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);

	}

}
