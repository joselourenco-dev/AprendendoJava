package projetos.sistemabancario;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarNovaConta {

    public void adicionarConta() {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        int numeroConta = 0;

        boolean novaConta = true;

        ArrayList<ContaBancaria> contas = new ArrayList<>();


        while (novaConta) {
            System.out.print("Digite nome do titular: ");
            String titular = entrada.nextLine();

            if (contas.size() == 0) {
                numeroConta = 1;
            } else {
                numeroConta += 1;
            }

            ContaBancaria conta = new ContaBancaria(titular, saldo, numeroConta);
            contas.add(conta);


            while (true) {

                System.out.println("Deseja adicionar uma nova conta? S/N");
                String desejaNovaConta = entrada.nextLine();
                if (desejaNovaConta.equalsIgnoreCase("S")) {
                    break;
                }
                if (desejaNovaConta.equalsIgnoreCase("N")) {
                    System.out.println("Finalizando adição de contas");
                    novaConta = false;
                    break;
                }

                System.out.println("Entrada inválida");

            }

        }
    }
}