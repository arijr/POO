package Operacoes;

import Conta.*;

public class Acoes {

  public static boolean transferir(ContaCorrente contaOrigem, Conta contaDestino, double valor)
  {
    if(valor > (contaOrigem.getSaldo() + contaOrigem.getChEspecial()))
    {
      return false;
    }

    contaOrigem.sacar(valor);
    contaDestino.depositar(valor);
    return true;
  }

  public static boolean transferir(ContaPoupanca contaOrigem, Conta contaDestino, double valor)
  {
    if(valor > contaOrigem.getSaldo())
    {
      return false;
    }

    contaOrigem.sacar(valor);
    contaDestino.depositar(valor);
    return true;
  }

  public static boolean sacar(ContaCorrente contaOrigem, double valor)
  {
    if(valor > (contaOrigem.getSaldo() + contaOrigem.getChEspecial()))
    {
      return false;
    }

    contaOrigem.sacar(valor);
    return true;
  }

}
