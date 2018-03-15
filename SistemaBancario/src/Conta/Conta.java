package Conta;

import Operacoes.Validacao;

public abstract class Conta implements Validacao {

	protected String numConta;

	protected double saldo;

	protected String numAgencia;

	protected String cpfCliente;

	public double getSaldo()
	{
		return saldo;
	}

	public void depositar(double valor)
	{
		saldo = saldo + valor;
	}

	public void sacar(double valor)
	{
		saldo = saldo - valor;
	}

}
