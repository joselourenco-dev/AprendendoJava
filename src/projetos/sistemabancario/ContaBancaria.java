package projetos.sistemabancario;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        saldo = saldo + valor;

    }

    public  void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor);
        }
        saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
