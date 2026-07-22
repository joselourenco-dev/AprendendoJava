package projetos.sistemabancario;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean mostrarMenu = true;

        System.out.println("================================");
        System.out.println("==============MENU==============");
        System.out.println("================================ \n");

        while (mostrarMenu){


            System.out.println(" 1 - Adicionar conta");
            System.out.println(" 2 - Listar contas");
            System.out.println(" 3 - Sair");

            System.out.print("Digite a opção desejada: ");
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    AdicionarNovaConta novaConta = new AdicionarNovaConta();
                    novaConta.adicionarConta();
                    break;
                case 2:
                    System.out.println("Listando contas");
                    ListarContaBancaria contas = new ListarContaBancaria();

                    contas.listarContas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("opção inválida");

            }

        }






    }
}
