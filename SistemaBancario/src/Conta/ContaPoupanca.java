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
