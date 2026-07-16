package orientacaoObjetos.exercicios;

public class ContaBancaria {
    private String titular;
    private double saldo;


    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return saldo;
        }

        saldo = saldo + valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
