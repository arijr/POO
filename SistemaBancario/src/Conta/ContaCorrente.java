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
	
	public ContaCorrente() {
		
	}

	public double getChEspecial() {
		return chEspecial;
	}

	public void setChEspecial(double chEspecial) {
		this.chEspecial = chEspecial;
	}
	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean validar()
	{
		//TODO validar this.numConta'12345-0'
		//TODO saldo > (-1)*(chEspecial)
		if((chEspecial + saldo) < 0) {
			return false;
		}
		return true;
	}

}
