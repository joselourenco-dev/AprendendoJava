package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;

import java.util.Scanner;

public class RemoverConta {
    public void executar(Banco banco, Scanner entrada) {
        System.out.println("Digite o numero da conta que deseja remover");
        int numeroConta = entrada.nextInt();
        banco.removerConta(numeroConta);
    }
}
