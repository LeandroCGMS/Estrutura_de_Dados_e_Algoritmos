package com.leandro.aula25.labs;

public class Senha implements Comparable<Senha>{
	
	private TipoSenha tipoSenha;
	

	public TipoSenha getTipoSenha() {
		return tipoSenha;
	}


	public void setTipoSenha(TipoSenha tipoSenha) {
		this.tipoSenha = tipoSenha;
	}


	@Override
	public int compareTo(Senha o) {
		if(this.getTipoSenha() == TipoSenha.Prioritária && o.getTipoSenha() == TipoSenha.Normal) {
			return 1;
		} else if (this.getTipoSenha() == TipoSenha.Normal && o.getTipoSenha() == TipoSenha.Prioritária) {
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Senha [tipoSenha=" + tipoSenha + "]";
	}
}
