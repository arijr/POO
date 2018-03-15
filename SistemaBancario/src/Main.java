import Agencia.*;
import Operacoes.*;
import Cliente.*;
import Conta.*;
import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);  // Reading from System.in
	
  public static void main(String[] args) {

	int menu = primeiroMenu();
    
    while(menu != 0) {
    	if( menu == 1) {
    		System.out.println("Digite o numero da conta (ex:12345-67): ");
    		String numConta = reader.next();
    		System.out.println("Digite o numero da agencia: (ex:1234-5): ");
    		String numAgencia = reader.next();
    		System.out.println("Digite o saldo da conta(ex:1234): ");
    		double saldo = reader.nextDouble();
    		System.out.println("Digite o limite do cheque especial: (ex:12345-6): ");
    		double chEspecial = reader.nextDouble();
    		System.out.println("Digite o cpf do cliente(ex: 1234567890): ");
    		String cpfCliente = reader.next();
    		Banco.criarConta(numConta, saldo, cpfCliente, numAgencia, chEspecial);
    	}
    	if(menu == 2) {
    		System.out.println("Digite o numero da agencia: (ex:1234-5):");
    		String numAgencia = reader.next();
    	}
    	if(menu == 3) {
    		System.out.println("Digite o numero da agencia: (ex:1234-5):");
    		String numAgencia = reader.next();
    	}
    	if(menu == 4) {
    		System.out.println("Digite o numero da agencia: (ex:1234-5):");
    		String numAgencia = reader.next();
    	}
    }
    System.out.println("Obrigado por utilizar os nossos serviços. =) \nencerrado com exito.");
  }

  // String numConta, double saldo, String cpfCliente, String numAgencia, double chEspecial 
  public static int primeiroMenu() {
    System.out.println("1 - Criar conta");
    System.out.println("2 - Criar agencia");
    System.out.println("3 - Criar cliente");
    System.out.println("4 - Transferir");
    System.out.println("0 - Sair");

    //Ler dados da conta
    
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    return n;
  }

}
