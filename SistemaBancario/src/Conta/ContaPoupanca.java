package Conta;

public class ContaPoupanca extends Conta {

	private int variacao;

	public ContaPoupanca(String numConta, double saldo, String cpfCliente, String numAgencia, int variacao  ) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.cpfCliente = cpfCliente;
		this.numAgencia = numAgencia;
		this.setVariacao(variacao);
	}

	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
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
		//if(this.numConta.lenght() == 7 && this.numConta.at(5) == '-')
		//TODO saldo > 0
		if(saldo < 0) {
			return false;
		}

		return true;
	}

}
