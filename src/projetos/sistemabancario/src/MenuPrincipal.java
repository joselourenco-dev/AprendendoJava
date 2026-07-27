package projetos.sistemabancario.src;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.model.ContaBancaria;
import projetos.sistemabancario.src.operacoes.AdicionarConta;
import projetos.sistemabancario.src.operacoes.BuscarConta;
import projetos.sistemabancario.src.operacoes.ListarConta;
import projetos.sistemabancario.src.operacoes.RemoverConta;
import projetos.sistemabancario.src.util.Entrada;
import projetos.sistemabancario.src.util.Menu;

public class MenuPrincipal {
    private Banco banco;
    private Entrada entrada;
    private Menu menu;

    public MenuPrincipal(Banco banco, Entrada entrada, Menu menu){
        this.banco = banco;
        this.entrada = entrada;
        this.menu = menu;
    }

    public void iniciar(){
        boolean mostrarMenu = true;
        menu.menu();

        while (mostrarMenu) {

            System.out.print("Digite a opção desejada: ");
            int opcao = entrada.lerInteiro();

            switch (opcao) {
                case 1:
                    AdicionarConta conta = new AdicionarConta();
                    conta.executar(banco, entrada);
                    break;
                case 2:
                    ListarConta listarConta = new ListarConta();
                    listarConta.executar(banco);
                    break;
                case 3:
                    BuscarConta buscarConta = new BuscarConta();
                    ContaBancaria contaBancaria = buscarConta.executar(banco, entrada);

                    if (contaBancaria == null){
                        System.out.println("Conta não existe ");
                    }else {
                        System.out.println("Conta encontrada");
                        System.out.println("Titular: " + contaBancaria.getTitular());
                    }
                    break;
                case 4:
                    RemoverConta removerConta = new RemoverConta();
                    removerConta.executar(banco, entrada);
                    break;
                case 0:
                    System.out.println("Encerrando sistema");
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
