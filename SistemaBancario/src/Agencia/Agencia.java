package Agencia;

import Operacoes.Validacao;

public class Agencia implements Validacao{

	private String numAg;

	private String endereco;

	public Agencia(String numAg, String endereco) {
		this.setNumAg(numAg);
		this.setEndereco(endereco);
	}

	public String getNumAg() {
		return numAg;
	}

	public void setNumAg(String numAg) {
		this.numAg = numAg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean validar()
	{
		return true;
		//TODO validar this.numAg'1234-0'
	}



}
