package orientacaoObejetos.exercicios;

public class ContaBancariaMain {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria("Alex", 1500);

        System.out.println("Seu saldo atual é: " + contaBancaria.depositar(500));
    }
}


