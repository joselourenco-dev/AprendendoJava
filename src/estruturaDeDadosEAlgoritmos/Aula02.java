package estruturaDeDadosEAlgoritmos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula02 {
    public static void main(String[] args){
        Deque<String> fila = new ArrayDeque<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");

        System.out.println("Próximo cliente a ser atendido: " + fila.peek());

        while (!fila.isEmpty()){
            System.out.println("Atendendo: " + fila.poll());
        }

    }



}
