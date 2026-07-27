package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.model.ContaBancaria;

public class VerSaldo {
    public void executar(ContaBancaria conta){
        double saldo = conta.getSaldo();
        System.out.println("saldo atual: " + saldo);
    }

}
