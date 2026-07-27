package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.util.Entrada;

public class VerSaldo {
    public void executar(ContaBancaria conta, Entrada entrada){
        double saldo = conta.getSaldo();
        System.out.println("saldo atual: " + saldo);
    }

}
