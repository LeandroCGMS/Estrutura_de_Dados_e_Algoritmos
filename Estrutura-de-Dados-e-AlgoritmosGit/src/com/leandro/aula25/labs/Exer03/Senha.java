package com.leandro.aula25.labs.Exer03;

public class Senha extends Thread {
	private int numSenha;
	private TipoSenha tipoSenha;
			
	public Senha(int numSenha, TipoSenha TipoSenha, boolean inicia) {
		this.numSenha = numSenha;
		this.tipoSenha = TipoSenha;
		if(inicia) {
			start();
		}
		
	}	
	
	public void run() {
		
		try {
			
		
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(this.tipoSenha == TipoSenha.Vermelha) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if(this.tipoSenha == TipoSenha.Amarela) {
			try {
				Thread.sleep(190);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nSenha: " + this.numSenha + ", tipo: " + this.tipoSenha);
		System.out.println("Paciente atendido.\n");
		
	}

}
