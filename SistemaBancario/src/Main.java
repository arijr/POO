import Agencia.*;
import Operacoes.*;
import Cliente.*;
import Conta.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    ArrayList<Agencia> agencias = new ArrayList<Agencia>();
    ArrayList<Conta> contas = new ArrayList<Conta>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    Banco.criarConta("1111-1", 100, "28933928-232", "1234-1", 0);

    ContaCorrente c1 = new ContaCorrente("1111-1", 100, "28933928-232", "1234-1", 0);
    ContaCorrente c2 = new ContaCorrente("1112-1", 100, "28933928-232", "1234-1", 200);

    if(c1.validar()) {
      contas.add(c1);
      System.out.println("conta adicionada");
    } else {
      System.out.println("conta nao adicionada");
    }

    if(c2.validar()) {
      contas.add(c2);
      System.out.println("conta adicionada");
    } else {
      System.out.println("conta nao adicionada");
    }

    System.out.println("c1 saldo " + c1.getSaldo());
    System.out.println("c2 saldo " + c2.getSaldo());

    if(Acoes.transferir(c1, c2, 200)) {
      System.out.println("Transferi");
    } else {
      System.out.println("Não transferi");
    }


    System.out.println("c1 saldo " + c1.getSaldo());
    System.out.println("c2 saldo " + c2.getSaldo());


    switch(primeiroMenu()) {
      case 1:
        int criarContaMenuResposta = criarContaMenu();

        break;
      case 2:
        System.out.println("Criando agencia");
        break;
      case 3:
        System.out.println("Criando cliente");
        break;
    }
    //Ler dados da conta
    //Scanner reader = new Scanner(System.in);  // Reading from System.in
    //System.out.println("Enter a number: ");
    //int n = reader.nextInt(); // Scans the next token of the input as an int.

    //System.out.println(n);
    //once finished
    //reader.close();

  }

  public static int primeiroMenu()
  {
    System.out.println("1 - Criar conta");
    System.out.println("2 - Criar agencia");
    System.out.println("3 - Criar cliente");
    System.out.println("4 - Transferir");

    //Ler dados da conta
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    reader.close();
    return n;
  }

  public static int criarContaMenu()
  {
    System.out.println("1 - Conta Corrente");
    System.out.println("2 - Conta Poupanca");

    //Ler dados da conta
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    reader.close();
    return n;
  }
}
