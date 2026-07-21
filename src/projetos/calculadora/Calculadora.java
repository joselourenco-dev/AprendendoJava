package projetos.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        boolean continua = true;

        while (continua) {
            System.out.print("Qual tipo de operação deseja fazer +, -, * ou /?: ");
            String operacao = entrada.nextLine();


            if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
                System.out.println("operação inválida");
                continue;
            }

            System.out.print("Digite o primeiro numero: ");
            numero1 = entrada.nextDouble();

            System.out.print("Digite o segundo numero: ");
            numero2 = entrada.nextDouble();

            double resultado;

            switch (operacao) {
                case "+":
                    resultado = numero1 + numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    System.out.println("Resultado = " + resultado);
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }

            entrada.nextLine();

            while (true){
                System.out.print("Deseja continuar? Sim/Não: ");
                String continuar = entrada.nextLine();

                if (continuar.equalsIgnoreCase("Não") || continuar.equalsIgnoreCase("NAO") || continuar.equalsIgnoreCase("N") ) {
                    continua = false;
                } else if (!continuar.equalsIgnoreCase("Sim") && !continuar.equalsIgnoreCase("S")) {
                    System.out.println("Entrada inválida");
                    continue;
                }
                break;
            }
        }

        System.out.print("Calculadora encerrada.");

    }
}
