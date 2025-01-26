package Ex3;

public class ContaCorrente {
    String nomeCliente;
    private  int numeroConta;
    double saldo;
    double limiteCredito;
    boolean especial;
    ContaCorrente(String nomeCliente, int numeroConta, double saldo,double limiteCredito,  boolean especial) {
        System.out.println("Conta Corrente criada com sucesso!");
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.especial = especial;
    }

    public String toString() {
        return "Nome: " + nomeCliente + ", Número da Conta: " + numeroConta + ", Saldo: " + saldo + ", Limite de Crédito: " + limiteCredito + ", Especial: " + especial;
    }
}
