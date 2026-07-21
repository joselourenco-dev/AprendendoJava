package projetos.sistemabancario;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    ContaBancaria(String titular, double saldo, int numeroConta){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    double depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
            return saldo;
        }
        saldo = saldo + valor;
        return saldo;
    }

    double sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor);
        }
        return saldo =  saldo - valor;
    }


    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){return  titular;}

}
