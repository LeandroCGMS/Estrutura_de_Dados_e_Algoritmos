package com.leandro.aula18.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer08 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<Integer> pino1 = new Stack<Integer>();
		Stack<Integer> pino2 = new Stack<Integer>();
		Stack<Integer> pino3 = new Stack<Integer>();

		final int ANILHA1 = 8;
		final int ANILHA2 = 6;
		final int ANILHA3 = 4;
		final int ANILHA4 = 2;

		pino1.push(ANILHA1);
		pino1.push(ANILHA2);
		pino1.push(ANILHA3);
		pino1.push(ANILHA4);

		for(int i = 0; i < 4; i++) {
			pino2.push(0);
			pino3.push(0);
		}

		boolean opValida = false;
		String op = "";
		int opc = 0;
		while(!opValida) {
			System.out.println("No pino 1 tem 4 anilhas com peso 8, 6, 4 e 2 quilos"
					+ ", de baixo para cima, pinos da esquerda para direita."
					+ "\nVocê quer passar essas anilhas para o pino 2 ou 3? Digite 2 ou 3.\n");
			for(int i = pino1.size() -1; i >=0; i--) {
				System.out.println("\t[" + pino1.get(i) + "]\t[ ]\t[ ]\n");
			}
			System.out.println("====================================\0");
			op = scan.nextLine();
			try {
				opc = Integer.parseInt(op);
				if(opc < 2 || opc > 3) {
					throw new Exception();
				} else {
					opValida = true;
				}

			} catch(Exception e) {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		switch(opc) {
		case 2:
			while(!pino1.isEmpty()) {
				if(pino1.peek() < pino2.peek()) {
					pino2.push(pino1.peek());
					pino1.pop();
				} else if(pino1.peek() < pino3.peek()){
					pino3.push(pino1.peek());
					pino1.pop();
				} else if(pino1.peek() > pino2.peek() && pino1.peek() > pino3.peek()) {
					if(pino2.peek() < pino3.peek()) {
						pino3.push(pino2.peek());
						pino2.pop();
						pino2.push(pino1.peek());
						pino1.pop();
					} else if(pino2.peek() > pino3.peek()) {
						pino2.push(pino3.peek());
						pino3.pop();
						pino1.push(pino3.peek());
						pino3.pop();
						
						pino3.push(pino2.peek());
						pino2.pop();
						pino3.push(pino1.peek());
						pino1.pop();
						pino3.push(pino2.peek());
						pino2.pop();
						pino3.push(pino1.peek());
						pino1.pop();
						
						pino2.push(pino3.peek());
						pino3.pop();
						pino2.push(pino3.peek());
						pino3.pop();
						pino2.push(pino3.peek());
						pino3.pop();
						pino2.push(pino3.peek());
						pino3.pop();
						
						
					}
					
					
				}
			}	
			
			for(int i = 0; i < pino2.size(); i++) {
				System.out.println(pino2.get(i));
			}

			break;
		case 3:
			break;
		}




	}

}
