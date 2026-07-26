package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.util.Entrada;

public class Depositar {
    public void executar(Banco banco, Entrada entrada){
        System.out.println("Valor do depósito: ");
        double valor = entrada.lerDouble();
        banco.Depositar(valor);
    }
}
