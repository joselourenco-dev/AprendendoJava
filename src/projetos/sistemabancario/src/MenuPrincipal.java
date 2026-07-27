package projetos.sistemabancario.src;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.operacoes.*;
import projetos.sistemabancario.src.util.Entrada;
import projetos.sistemabancario.src.util.Menu;

public class MenuPrincipal {
    private Banco banco;
    private Entrada entrada;
    private Menu menu;

    public MenuPrincipal(Banco banco, Entrada entrada, Menu menu) {
        this.banco = banco;
        this.entrada = entrada;
        this.menu = menu;
    }

    public void iniciar() {
        boolean mostrarMenu = true;
        menu.menu();


        while (mostrarMenu) {
            AdicionarConta conta;
            System.out.print("Digite a opção desejada: ");
            int opcao = entrada.lerInteiro();

            switch (opcao) {
                case 1:
                    conta = new AdicionarConta();
                    conta.executar(banco, entrada);
                    menu.menu();
                    break;
                case 2:
                    ListarConta listarConta = new ListarConta();
                    listarConta.executar(banco);
                    menu.menu();
                    break;
                case 3:
                    BuscarConta buscarConta = new BuscarConta();
                    ContaBancaria contaBancaria = buscarConta.executar(banco, entrada);

                    if (contaBancaria == null) {
                        System.out.println("Conta não existe ");
                    } else {
                        acessarConta(contaBancaria);
                    }
                    menu.menu();
                    break;
                case 4:
                    RemoverConta removerConta = new RemoverConta();
                    removerConta.executar(banco, entrada);
                    menu.menu();
                    break;

                case 0:
                    System.out.println("Encerrando sistema");
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    menu.menu();
            }
        }
    }

    private void acessarConta(ContaBancaria contaBancaria) {
        boolean dentroDaConta = true;

        while (dentroDaConta) {
            menu.subMenu();
            System.out.print("Digite a opção desejada: ");
            int opcao = entrada.lerInteiro();

            switch (opcao) {
                case 1:
                    System.out.println("Depósito");
                    Depositar depositar = new Depositar();
                    depositar.executar(contaBancaria, entrada);
                    break;

                case 2:
                    System.out.println("Saque");
                    Sacar sacar = new Sacar();
                    sacar.executar(contaBancaria, entrada);
                    break;
                case 3:
                    VerSaldo verSaldo = new VerSaldo();
                    verSaldo.executar(contaBancaria);
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal");
                    menu.menu();
                    dentroDaConta = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
