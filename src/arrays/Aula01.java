package arrays;

public class Aula01 {
    public static void main(String[] args){
        //1
        int[] array = {4, 5, 3, 65, 96};

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("\n ============================");
        //2
        String[] arrayNomes = {"José", "Samurai", "Alex", "Arthur"};
        System.out.println(arrayNomes[1]);

        System.out.println("\n ============================");

        //3
        //System.out.println(arrayNomes[7]);

        System.out.println("\n ============================");
        //4
        int maior = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }
        System.out.println("A maior nota do array é: " + maior);

        System.out.println("\n ============================");
        //5
        int par = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                par = par +1;
            }
        }

        System.out.println("Existem " + par + " numeros pares no array.");

        System.out.println("\n ============================");

        // 6

     for (int i = array.length - 1; i > 0; i--){
         System.out.println(array[i]);
     }

    }
}
