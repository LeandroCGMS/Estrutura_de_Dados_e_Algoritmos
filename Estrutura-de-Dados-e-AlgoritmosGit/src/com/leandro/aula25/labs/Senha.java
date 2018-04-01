package com.leandro.aula25.labs;

public class Senha implements Comparable<Senha>{
	
	private TipoSenha tipoSenha;
	private int numSenha;
	
	public int getNumSenha() {
		return numSenha;
	}


	public void setNumSenha(int numSenha) {
		this.numSenha = numSenha;
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
		return "Senha " + numSenha + ": [tipoSenha=" + tipoSenha + "]";
	}
}
