package Cliente;

public class Cliente extends Pessoa {

	private double senha;

	private String numAgencia;
	
	private String numConta;
	
	public Cliente(String nome, String sobrenome, String cpf, String endereco, double senha, String numAgencia, String numConta) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.setSenha(senha);
		this.setNumAgencia(numAgencia);
		this.setNumConta(numConta);
		
	}
	
	public double getSenha() {
		return senha;
	}


	public void setSenha(double senha) {
		this.senha = senha;
	}


	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}
	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	
//	
//	
//	public void deposito() {
//
//	}
//
//	public void transferencia() {
//
//	}
//
//	public void saque() {
//
//	}
//
//	public void acessarConta() {
//
//	}
//
//	



}
