package Conta;

public class ContaCorrente extends Conta {

	private double chEspecial;
	
	public ContaCorrente(String numConta, double saldo, String cpfCliente, String numAgencia, double chEspecial  ) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.cpfCliente = cpfCliente;
		this.numAgencia = numAgencia;
		this.setChEspecial(chEspecial);
	}

	public double getChEspecial() {
		return chEspecial;
	}

	public void setChEspecial(double chEspecial) {
		this.chEspecial = chEspecial;
	}

}
