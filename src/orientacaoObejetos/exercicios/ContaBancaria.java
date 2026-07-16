package orientacaoObejetos.exercicios;

public class ContaBancaria {
    private String titular;
    private  double saldo;



    ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    double depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        }

        saldo = saldo+valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
