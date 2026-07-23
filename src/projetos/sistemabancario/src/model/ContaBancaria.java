package projetos.sistemabancario.src.model;

import projetos.sistemabancario.src.exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        }else {
            saldo += valor;
        }
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor);
        }else {
            saldo -= valor;
        }
    }


    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
