package orientacaoObejetos.exercicios;

public class ContaBancaria {
    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    double depositar(double valor){
        saldo = saldo+valor;
        return saldo;
    }

}
