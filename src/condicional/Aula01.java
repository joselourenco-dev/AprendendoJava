package condicional;

public class Aula01 {
    public static void main(String[] args){
        int nota = 4;
        if (nota >= 7) {
            System.out.println("Aprovado");

        }else System.out.println("Reprovado");

        if(nota % 2 == 0){
            System.out.println("Numero par");
        }else System.out.println("Numero impar");

        ///

        int idade = 23;
        boolean temCarteira = false;
        if(idade >= 18 && temCarteira){
            System.out.println("Pode dirigir");
        }else System.out.println("Não pode dirigir");

        ///

        int dia = 3;


        if (dia == 6 || dia == 7){
            System.out.println("Fim de semana");
        }else System.out.println("Dia de semana");

        //

        if (idade == 18){
            System.out.println("teste");
        }

        if (idade = 18){
            System.out.println("teste");
        }

        //
        String status;
         status = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(status);
    }

}
