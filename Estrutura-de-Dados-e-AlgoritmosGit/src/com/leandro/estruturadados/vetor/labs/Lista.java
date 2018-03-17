package com.leandro.estruturadados.vetor.labs;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos =  (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos =  (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			System.out.println("Elemento adicionado com sucesso");
			return true;
		} 
		System.out.println("Falha: não há mais espaço para adicionar novo elemento.");
		return false;
		
	}
	
	public boolean adiciona(int posicao, T elemento) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida.");
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i = tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		
		if(this.tamanho == this.elementos.length ) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
		
	}
	
	public T busca(int posicao) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida.");
		}
		
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento) ) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1; // >=0
		
	}
	
	public int ultimoIndice(T elemento) {
		int ultimoIndice = -1;
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				ultimoIndice = i;
			}
		}
		return ultimoIndice;
	}
	
	// B D E F F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
	// vetor[1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida.");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public int remove(T elemento) {
		
		int ultimoIndice = -1;
		int contOcorrenciaElemento = 0;
		
		for(int i = 0; i < this.tamanho; i++) {
			
			if( this.elementos[i].equals(elemento)){
				contOcorrenciaElemento++;
				
			}
		}
		
		if(contOcorrenciaElemento == 0) {
			return -1;
		}
		
		for(int i = 0; i < this.tamanho; i++) {
			
			if(this.elementos[i].equals(elemento)){
				ultimoIndice = i;
				
				for(int j = ultimoIndice; j < this.tamanho - 1; j++) {
					
					this.elementos[j] = this.elementos[j+1];
				}
				
			}
			this.tamanho--;
		}
		return contOcorrenciaElemento;
		
	}
	
	public T obtem(int posicao) {
		return this.elementos[posicao];
	}
	
	public void limpar() {
		if(this.tamanho == 0) {
			
		} else {
			for(int i = 0; i < this.tamanho; i++) {
				this.elementos[i] = null;
			}
			this.tamanho = 0;
		}
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
