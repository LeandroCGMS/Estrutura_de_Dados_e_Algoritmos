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
		if(this.estaVazia()) {
			return null;
		}
		T elementoDesenfileirado = this.elementos[0];
		for(int i = 0; i < this.tamanho() - 1; i++) { 
			this.elementos[i] = elementos[i+1];
		}
		this.tamanho--;
		return elementoDesenfileirado;
	}
	
}
