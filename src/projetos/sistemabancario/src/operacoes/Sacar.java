package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.exceptions.SaldoInsuficienteException;
import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.util.Entrada;

public class Sacar {
    public void executar(ContaBancaria conta, Entrada entrada) {
        System.out.println("Digite o valor que deseja sacar: ");
        double valor = entrada.lerDouble();

        try {
            conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso");

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
