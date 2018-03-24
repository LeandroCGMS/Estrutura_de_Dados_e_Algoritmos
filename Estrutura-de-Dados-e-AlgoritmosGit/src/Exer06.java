import java.util.Scanner;
import java.util.Stack;

public class Exer06 {
	private static Stack<char[]> expressoes = new Stack<char[]>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		voltarAoMenu();
		

	}
	
	private static void voltarAoMenu() {
		String[] args = new String[1];
		boolean opValida = false;
		int op = 0;
		while(!opValida) {
			System.out.println("1) Digitar outra expressão."
					+ "\n2) Sair.");
			String opcao = scan.nextLine();
			
			try {
				op = Integer.parseInt(opcao);
				if(op >  0 && op < 3) {
					opValida = true;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Opção inválida. Tente novamente.");
				voltarAoMenu();
			}
			
		}
		
		if(op == 1) {
			main(args);
		} else if(op == 2) {
			System.exit(0);
		}
	}

}
