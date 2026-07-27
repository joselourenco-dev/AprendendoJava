package projetos.sistemabancario.src;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.util.Entrada;
import projetos.sistemabancario.src.util.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrada entrada = new Entrada(scanner);
        Banco banco = new Banco();
        Menu menu = new Menu();
        MenuPrincipal menuPrincipal = new MenuPrincipal(banco, entrada, menu);

        menuPrincipal.iniciar();
    }
}
