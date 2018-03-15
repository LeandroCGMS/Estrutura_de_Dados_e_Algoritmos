package com.leandro.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos =  new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*public void adiciona(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio. Não é possível adicionar mais elementos.");
		}
		
	}*/
	
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			System.out.println("Elemento adicionado com sucesso");
			return true;
		} 
		System.out.println("Falha: não há mais espaço para adicionar novo elemento.");
		return false;
		
	}
	
	public boolean adiciona(int posicao, String elemento) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida.");
		}
		//mover todos os elementos
		for(int i = tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	public String busca(int posicao) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida.");
		}
		
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
