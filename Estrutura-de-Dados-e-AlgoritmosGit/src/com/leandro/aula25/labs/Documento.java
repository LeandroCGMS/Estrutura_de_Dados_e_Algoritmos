package com.leandro.aula25.labs;

public class Documento {
 private String nome;
 private int qtdFolhas;
@Override
public String toString() {
	return "Documento [nome=" + nome + ", qtdFolhas=" + qtdFolhas + "]";
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getQtdFolhas() {
	return qtdFolhas;
}
public void setQtdFolhas(int qtdFolhas) {
	this.qtdFolhas = qtdFolhas;
}
}
