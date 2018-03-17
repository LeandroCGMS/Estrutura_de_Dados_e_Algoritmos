package com.leandro.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.leandro.estruturadados.vetor.teste.Contato;

public class Exer7 {

	public static void main(String[] args) {
		
		ArrayList<Contato> arrayList = new ArrayList<Contato>();
		
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
		Contato c31 = new Contato("Contato 31", "5152-2121", "Contato31@email.com");
		Contato c32 = new Contato("Contato 7", "7890-1234", "Contato7@email.com");
		
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
		
		System.out.println("Método add() com parâmetro Objeto variável:");
		for(int i = 0; i < contatos.length; i++) {
					
			arrayList.add(contatos[i]);
				
		}
		System.out.println(arrayList);
		System.out.println("Método add() com parâmetros índice 29 e elemento c31:");
		arrayList.add(29, c31);
		System.out.println(arrayList);
		System.out.println("O método similar ao aumentaCapacidade() já é usado no automatico, como no exemplo acima.");
		System.out.println("\n\nUso do Método contains() com retorno boolean, retorna -> " + arrayList.contains(c31) + " <- para"
				+ " o elemento c31");
		arrayList.add(c32);
		System.out.println("\n\nDepois de adicionar o elemento c32, exatamente, igual, ao c7, o método lastIndexOf(), "
				+ "retorna o índice -> " + arrayList.lastIndexOf(c7) +
				" para o elemento c7.");
		System.out.println("\n\nUsando o método remove()...:");
		arrayList.remove(c32);
		System.out.println("\n\nPronto, depois de remover o c32, observe que ele remove o primeiro elemento igual ao c32 que é o c7, "
				+ "essa é o novo arrayList:");
		System.out.println(arrayList);
		System.out.println("\n\nUsando o método get() para o índice 13:");
		System.out.println(arrayList.get(13));
		System.out.println("\n\nUsando o método clear():");
		arrayList.clear();
		System.out.println("\n\nPronto, depois do clear(), esse é o novo arrayList vazio:" + arrayList);
		
		
		
	}
		

}
