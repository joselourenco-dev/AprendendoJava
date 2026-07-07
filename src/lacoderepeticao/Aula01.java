package lacoderepeticao;

public class Aula01 {
    public static void main(String[] args) {

        //1
        int mes = 11;
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
        }

        //2

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //3
        System.out.println("\n ============ ");

        int interacao = 10;
        while (interacao >= 1) {
            System.out.println(interacao);
            interacao--;


        }

        // 4
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println(soma);

        // 5
        System.out.println("=============");
        int numero = 1;
        while (numero <= 20) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }


        //7
        System.out.println("=============");
        String string = "Minha string";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

        //8
        System.out.println("=============");

        int numero1 = 2;
        int numero2 = 3;
        char operacao = '+';

        switch (operacao) {
            case '+':
                System.out.println(numero1 + numero2);
                break;
            case '-':
                System.out.println(numero1 - numero2);
                break;
            case '*':
                System.out.println(numero1 * numero2);
                break;
            case '/':
                System.out.println(numero1 / numero2);
                break;
            default:
                System.out.println("Entrada inválida");
        }



    }
}
