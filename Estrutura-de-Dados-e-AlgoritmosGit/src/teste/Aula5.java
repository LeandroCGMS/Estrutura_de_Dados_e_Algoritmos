package teste;

import com.leandro.estruturadados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca(1));

	}

}
