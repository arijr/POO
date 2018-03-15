package Operacoes;
public class Banco {

  private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
  private static ArrayList<Conta> contas = new ArrayList<Conta>();
  private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public static boolean criarConta(String numConta) {

    for(int i = 0; i < contas.lenght(); i++) {
      return false;
    }

    return true;

  }

}
