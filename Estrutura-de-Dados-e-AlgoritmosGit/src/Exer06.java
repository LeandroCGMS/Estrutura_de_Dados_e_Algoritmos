import java.util.Scanner;
import java.util.Stack;

public class Exer06 {
	private static Stack<char[]> expressoes = new Stack<char[]>();
	private static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {

		boolean expressaoValida = false;

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
					+ "\n3) Verificar qual(is) expressão(ões) são válidos quanto ao uso dos parênteses."
					+ "\n4) Sair.");
			String opcao = scan.nextLine();

			try {
				op = Integer.parseInt(opcao);
				if(op >  0 && op <= 4) {
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
			int contAbreParenteses = 0;
			int contFechaParenteses = 0;
			int posAbreParenteses = 0;
			int posFechaParenteses = 0;
			for(int i = 0; i < expressoes.size(); i++) {
				for(int j = 0; j < expressoes.get(i).length; j++) {
					System.out.print(expressoes.get(i)[j]);
					if(expressoes.get(i)[j] == ')') {
						contFechaParenteses++;
						if(contFechaParenteses == 1) {
							// AQUI VAI ESTAR O PULO DO GATO
							posFechaParenteses = j;
						}
					} else if(expressoes.get(i)[j] == '(') {
						contAbreParenteses++;
						if(contAbreParenteses == 1) {
							// AQUI VAI ESTAR O PULO DO GATO
							posAbreParenteses = j;
							
						}
					}
					
					if(j == expressoes.get(i).length -1) {
						// ESCOPO PARA DAR RESPOSTA SE ESTÁ CERTO OU NÃO
						if(posFechaParenteses < posAbreParenteses || contFechaParenteses != contAbreParenteses) {
							System.out.println(" => com relação ao uso dos parênteses, é inválida.");
						} else {
							System.out.println(" => com relação ao uso dos parênteses, é válida.");
						}
					}
					
				}
				
				System.out.println("\n");
			}
			voltarAoMenu();
			break;
		case 4:
			System.exit(0);
			break;

		}
	}

}
