package projetos.sistemabancario.src.banco;

import projetos.sistemabancario.src.model.ContaBancaria;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private double saldo = 0;
    private int numeroConta = 0;

    public void adicionarConta(String titular) {

      if (contas.size() == 0){
          numeroConta = 1;
      }else {
          for (int i = 0; i < contas.size(); i++) {
              numeroConta = contas.get(i).getNumeroConta() + 1;
          }
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

    public void buscarConta(int numeroConta) {

    }

    public void listarContas() {
     for (ContaBancaria contaBancaria: contas){
         System.out.println("Conta numero: " + contaBancaria.getNumeroConta());
     }

    }

}
