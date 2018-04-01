package com.leandro.aula25.labs;

public class Senha extends Thread implements Comparable<Senha>{
	
	private TipoSenha tipoSenha;
	private int numSenha;
	
	public Senha(TipoSenha tipoSenha, int numSenha) {
		this.tipoSenha = tipoSenha;
		this.numSenha = numSenha;
	}
	
	public void run() {
		System.out.println("Senha " + this.getNumSenha() + ", "
				+ "tipo da senha: " + this.tipoSenha);
	}
	
	public int getNumSenha() {
		return numSenha;
	}

	public TipoSenha getTipoSenha() {
		return tipoSenha;
	}


	public void setTipoSenha(TipoSenha tipoSenha) {
		this.tipoSenha = tipoSenha;
	}


	@Override
	public int compareTo(Senha outroObjeto) {
//		if(this.getTipoSenha() == TipoSenha.Normal && outroObjeto.getTipoSenha() == TipoSenha.Prioritária) {
//			return -1;
//		} else if (this.getTipoSenha() == TipoSenha.Prioritária && outroObjeto.getTipoSenha() == TipoSenha.Normal) {
//			return 1;
//		}
//		return 0;
		return this.tipoSenha.compareTo(outroObjeto.getTipoSenha());
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipoSenha == null) ? 0 : tipoSenha.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Senha other = (Senha) obj;
		if (tipoSenha != other.tipoSenha)
			return false;
		return true;
	}


	@Override
	public String toString() {
		if(this.getTipoSenha() == TipoSenha.Normal) {
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Senha " + numSenha + ": [tipoSenha=" + tipoSenha + "]";
	}
}
