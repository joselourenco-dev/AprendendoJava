package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.util.Entrada;

public class Depositar {
    public void executar(ContaBancaria conta, Entrada entrada){
        System.out.print("Digite o valor que deseja depositar: ");
        double valor = entrada.lerDouble();
        conta.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}
