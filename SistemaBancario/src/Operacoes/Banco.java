package Operacoes;

import java.util.ArrayList;

import Agencia.Agencia;
import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;

public class Banco {

  private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
  public static ArrayList<Conta> contas = new ArrayList<Conta>();
  private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public static boolean criarConta(String numConta,  double saldo, String cpfCliente, String numAg, double chEspecial) {
	  
	  ContaCorrente contaC;
	  for (Conta atual:contas) {
		  if(numConta.equals(atual.getNumConta())) {
			  System.out.println("Já existe uma conta com esse numero.");
			  return false;
		  }
	  }
	  contaC = new ContaCorrente(numConta,saldo, cpfCliente, numAg, chEspecial);
	  contas.add(contaC);
	  for(Cliente atual:clientes) {
		  if(cpfCliente.equals(atual.getCpf())) {
			  atual.setNumConta(numConta);
		  }
		  System.out.println("Conta criada com sucesso.");
	  }
	  return true;
  }

  
public static ArrayList<Agencia> getAgencias() {
	return agencias;
}

public static void setAgencias(ArrayList<Agencia> agencias) {
	Banco.agencias = agencias;
}

public static ArrayList<Conta> getContas() {
	return contas;
}

public static void setContas(ArrayList<Conta> contas) {
	Banco.contas = contas;
}

public static ArrayList<Cliente> getClientes() {
	return clientes;
}

public static void setClientes(ArrayList<Cliente> clientes) {
	Banco.clientes = clientes;
}

}
