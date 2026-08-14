package estruturaDeDadosEAlgoritmos.exercicios;

import java.util.LinkedList;

public class Ex03 {
    public static void main(String[] args){
        //01
        No jose = new No("José");
        No antonio = new No("Antonio");
        No fabiana = new No("Fabiana");
        No carla = new No("Carla");
        No sukuna = new No("Sukuna");

        No atual = jose;
        jose.proximo = antonio;
        antonio.proximo = fabiana;
        fabiana.proximo = carla;
        carla.proximo = sukuna;
        sukuna.proximo = null;

        while (atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

//        02
        LinkedList<Integer> numero = new LinkedList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);

        numero.add(2, 7);

        for (int i = 0; i < numero.size(); i++) {
            System.out.println(numero.get(i));
        }

        //03
        System.out.println("");
        No zoro = new No("Zoro");
        zoro.proximo = fabiana;
        antonio.proximo = zoro;

        atual = jose;
        while (atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

    }



    //01 faz parte do ex 1;
    public static class No{
        String valor;
        No proximo;

        No(String valor){
            this.valor = valor;
            this.proximo = null;
        }

    }
}
