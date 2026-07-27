package projetos.sistemabancario.src.banco;

import projetos.sistemabancario.src.model.ContaBancaria;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(String titular) {
        double saldo = 0;
        int numeroConta = 0;
        if (contas.size() == 0) {
            numeroConta = 1;
        } else {
            for (int i = 0; i < contas.size(); i++) {
                if (contas.get(i).getNumeroConta() > numeroConta) {
                    numeroConta = contas.get(i).getNumeroConta();
                }
            }
            numeroConta = numeroConta + 1;
        }
        ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldo);

        contas.add(conta);
    }

    public void removerConta(int numeroConta) {
        for (ContaBancaria contaBancaria : contas) {
            if (contaBancaria.getNumeroConta() == numeroConta) {
                contas.remove(contaBancaria);
            }
        }

    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public ArrayList<ContaBancaria> listarContas() {
        return new ArrayList<>(contas);
    }
}
