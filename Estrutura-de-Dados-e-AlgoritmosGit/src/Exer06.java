import java.util.Scanner;
import java.util.Stack;

public class Exer06 {
	private static Stack<char[]> expressoes = new Stack<char[]>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean expressaoValida = false;
		int contAbreParenteses = 0;
		int contFechaParenteses = 0;
		while(!expressaoValida) {
			System.out.println("\t\t\tDesafio dos Simbolos Balanceados"
					+ "\n\tDigite uma expressão matemática que use parênteses.");
			String expressao = scan.nextLine();
			if(!expressao.contains("(") && !expressao.contains(")")) {
				System.out.println("Expressão não contem parênteses. Tente novamente.");
			} else {
				expressaoValida = true;
			}
			char[] expressaoDaVez = expressao.toCharArray();
			expressoes.push(expressaoDaVez);
			for(int i = 0; i < expressaoDaVez.length; i++) {
				if(expressaoDaVez[i] == '(') {
					contAbreParenteses++;
				}
				if(expressaoDaVez[i] == ')') {
					contFechaParenteses++;
				}
			}
		}

		if(contAbreParenteses == contFechaParenteses) {
			System.out.println("A expressão digitada, com relação ao uso dos parênteses, é válida.");
		} else {
			System.out.println("A expressão digitada, com relação ao uso dos parênteses, é inválida.");
		}
		
		voltarAoMenu();



	}

	private static void voltarAoMenu() {
		String[] args = new String[1];
		boolean opValida = false;
		int op = 0;
		while(!opValida) {
			System.out.println("1) Digitar outra expressão;"
					+ "\n2) Exibir toda(s) a(s) expressão(ões) digitadas;"
					+ "\n3) Sair.");
			String opcao = scan.nextLine();

			try {
				op = Integer.parseInt(opcao);
				if(op >  0 && op <= 3) {
					opValida = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Opção inválida. Tente novamente.");
				voltarAoMenu();
			}

		}

		switch(op) {
		case 1:
			main(args);
			break;
		case 2:
			for(int i = 0; i < expressoes.size(); i++) {
				for(int j = 0; j < expressoes.get(i).length; j++) {
					System.out.print(expressoes.get(i)[j]);
				}
				System.out.println("\n");
			}
			voltarAoMenu();
			break;
		case 3:
			System.exit(0);
			break;

		}
	}

}
