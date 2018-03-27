package com.leandro.estruturadados.fila;

import com.leandro.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	public Fila() {
		super();
	}
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public boolean enfileira(T elemento) {
		if(super.adiciona(elemento)) {
			return true;
		}
		return false;
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira() {
		for(int i = 0; i < this.tamanho() - 1; i++) { // 1 2 3  4 na passagem 0, o 1 passa a ser 2, o 2 passa a ser 3 e o 3 passa a ser 4
			this.elementos[i] = elementos[i+1];
		}
		this.tamanho--;
		return this.elementos[0];
	}
	
}
