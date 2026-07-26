package projetos.sistemabancario.src;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.operacoes.AdicionarConta;
import projetos.sistemabancario.src.operacoes.BuscarConta;
import projetos.sistemabancario.src.operacoes.ListarConta;
import projetos.sistemabancario.src.operacoes.RemoverConta;
import projetos.sistemabancario.src.util.Entrada;
import projetos.sistemabancario.src.util.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrada entrada = new Entrada(scanner);
        Banco banco = new Banco();
        Menu menu = new Menu();
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
                    buscarConta.executar(banco, entrada);
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
