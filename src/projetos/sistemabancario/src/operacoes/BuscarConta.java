package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.util.Entrada;

public class BuscarConta {
    public ContaBancaria executar(Banco banco, Entrada entrada){
        System.out.println("Digite o numero da conta que deseja buscar: ");
        int numeroConta = entrada.lerInteiro();
        return banco.buscarConta(numeroConta);
    }
}
