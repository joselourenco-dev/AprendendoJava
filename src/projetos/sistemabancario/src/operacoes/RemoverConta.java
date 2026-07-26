package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.util.Entrada;

public class RemoverConta {
    public void executar(Banco banco, Entrada entrada) {
        System.out.println("Digite o numero da conta que deseja remover");
        int numeroConta = entrada.lerInteiro();
        banco.removerConta(numeroConta);
    }
}
