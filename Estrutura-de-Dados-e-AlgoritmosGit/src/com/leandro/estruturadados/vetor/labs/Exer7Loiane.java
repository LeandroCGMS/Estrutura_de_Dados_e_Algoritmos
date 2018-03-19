package com.leandro.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer7Loiane extends Exer6Loiane{

	public static void main(String[] args) {

		// criar das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
		// criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obterContatoPosicao(scan, lista);
				break;
			case 4:
				obterContato(scan, lista);
				break;
			case 5:
				pesqusisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesqusisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}

		System.out.println("Usuário digitou 0, programa terminado.");
	}
	
	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos do vetor foram excluídos.");
	}
	
	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.size());
	}
	
	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser removida.", scan);

		try {
			
			lista.remove(pos);
			
			System.out.println("Contato excluído.");

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser removida.", scan);

		try {
			
			Contato contato = lista.get(pos);
			
			lista.remove(contato);
			
			System.out.println("Contato excluído.");

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void pesqusisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {
			Contato contato = lista.get(pos);

			boolean existe = lista.contains(contato);
			
			if(existe) {
				System.out.println("Contato existe. Seguem dados.");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe.");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void pesqusisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe. Seguem dados.");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	private static void obterContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe. Seguem dados.");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato pesquisado:");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	private static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe. Seguem dados.");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações.");
		String nome = lerInformacao("Entre com o nome.", scan);
		String telefone = lerInformacao("Entre com o telefone.", scan);
		String email = lerInformacao("Entre com o e-mail.", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);

	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações.");
		String nome = lerInformacao("Entre com o nome.", scan);
		String telefone = lerInformacao("Entre com o telefone.", scan);
		String email = lerInformacao("Entre com o e-mail.", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

		try {
			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso.");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida. Contato não adicionado.");
		}

	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;

		for (int i = 1; i < quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);
		}
	}

}
