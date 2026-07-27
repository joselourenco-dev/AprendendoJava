package projetos.sistemabancario.src.util;

public class Menu {
    public void menu(){
        System.out.println("=========================");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Listar contas");
        System.out.println("3 - Buscar Conta");
        System.out.println("4 - Remover Conta");
        System.out.println("0 - Sair do menu");
        System.out.println("=========================");
    }

    public void subMenu(){
        System.out.println("=========================");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Saldo");
        System.out.println("0 - Sair do menu");
        System.out.println("=========================");
    }

}
