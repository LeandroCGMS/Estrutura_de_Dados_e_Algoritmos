package com.leandro.estruturadados.vetor.labs;

import com.leandro.estruturadados.vetor.teste.Contato;

public class Aula6 {

	public static void main(String[] args) {
		
		Lista<Contato> lista =  new Lista<Contato>(20);
		
		Contato[] contatos = new Contato[30];
		Contato c1 = new Contato("Contato 1", "1234-5678", "Contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "Contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "Contato3@email.com");
		Contato c4 = new Contato("Contato 4", "4567-8901", "Contato4@email.com");
		Contato c5 = new Contato("Contato 5", "5678-9012", "Contato5@email.com");
		Contato c6 = new Contato("Contato 6", "6789-0123", "Contato6@email.com");
		Contato c7 = new Contato("Contato 7", "7890-1234", "Contato7@email.com");
		Contato c8 = new Contato("Contato 8", "8901-2345", "Contato8@email.com");
		Contato c9 = new Contato("Contato 9", "90123-4567", "Contato9@email.com");
		Contato c10 = new Contato("Contato 10", "0123-4567", "Contato10@email.com");
		Contato c11 = new Contato("Contato 11", "3333-8901", "Contato11@email.com");
		Contato c12 = new Contato("Contato 12", "4444-9012", "Contato12@email.com");
		Contato c13 = new Contato("Contato 13", "5555-0123", "Contato13@email.com");
		Contato c14 = new Contato("Contato 14", "6666-1234", "Contato14@email.com");
		Contato c15 = new Contato("Contato 15", "7777-5678", "Contato15@email.com");
		Contato c16 = new Contato("Contato 16", "8888-6789", "Contato16@email.com");
		Contato c17 = new Contato("Contato 17", "9999-7890", "Contato17@email.com");
		Contato c18 = new Contato("Contato 18", "4567-0000", "Contato18@email.com");
		Contato c19 = new Contato("Contato 19", "5678-1111", "Contato19@email.com");
		Contato c20 = new Contato("Contato 20", "5678-2222", "Contato20@email.com");
		Contato c21 = new Contato("Contato 21", "0011-8901", "Contato21@email.com");
		Contato c22 = new Contato("Contato 22", "1122-9012", "Contato22@email.com");
		Contato c23 = new Contato("Contato 23", "2233-0123", "Contato23@email.com");
		Contato c24 = new Contato("Contato 24", "3344-1234", "Contato24@email.com");
		Contato c25 = new Contato("Contato 25", "4455-5678", "Contato25@email.com");
		Contato c26 = new Contato("Contato 26", "5566-6789", "Contato26@email.com");
		Contato c27 = new Contato("Contato 27", "6677-7890", "Contato27@email.com");
		Contato c28 = new Contato("Contato 28", "7788-0000", "Contato28@email.com");
		Contato c29 = new Contato("Contato 29", "8899-1111", "Contato29@email.com");
		Contato c30 = new Contato("Contato 30", "1010-2222", "Contato30@email.com");
		Contato c31 = new Contato("Contato 30", "5151-2222", "Contato30@email.com");
		
		contatos[0] = c1;
		contatos[1] = c2;
		contatos[2] = c3;
		contatos[3] = c4;
		contatos[4] = c5;
		contatos[5] = c6;
		contatos[6] = c7;
		contatos[7] = c8;
		contatos[8] = c9;
		contatos[9] = c10;
		contatos[10] = c11;
		contatos[11] = c12;
		contatos[12] = c13;
		contatos[13] = c14;
		contatos[14] = c15;
		contatos[15] = c16;
		contatos[16] = c17;
		contatos[17] = c18;
		contatos[18] = c19;
		contatos[19] = c20;
		contatos[20] = c21;
		contatos[21] = c22;
		contatos[22] = c23;
		contatos[23] = c24;
		contatos[24] = c25;
		contatos[25] = c26;
		contatos[26] = c27;
		contatos[27] = c28;
		contatos[28] = c29;
		contatos[29] = c30;
		
		for(int i = 0; i < 30; i++) {
			
			lista.adiciona(contatos[i]);
			System.out.println(lista);
		}
		
		System.out.println("A posição do elemento 20, usando o método busca() com parâmetro inteiro é: " + lista.busca(contatos[20]));
		
		System.out.println("A posição do elemento 20 usando o método busca() com parâmetro objeto é: " + lista.busca(c5));
		
		System.out.println("O método contem() retorna o valor booleano -> " + lista.contem(c31) + " <- para o elemento c31.");
		
		System.out.println("O método ultimoIndice() retorna o valor inteiro -> " + lista.ultimoIndice(c31) + " <- para o elemento c31.");
		
		System.out.println("O método ultimoIndice() retorna o valor inteiro -> " + lista.ultimoIndice(c31) + " <- para o elemento c31.");
		
		lista.remove(29);
		System.out.println("Depois de remover o índice 29 que é o contato 30, essa é a nova lista de Contatos: ");
		System.out.println(lista);
		
		System.out.println("O método obtem() retornar a seguinte string para o contato c17: -> " + lista.obtem(c17) + " <-");
		
		System.out.println("Vou usar, agora, o método limpar()");
		lista.limpar();
		System.out.println("Pronto. Depois de usar o método limpar(), o último método da Classe Lista, o toString() retorna a string: ");
		System.out.println(lista);
		
	}

}
