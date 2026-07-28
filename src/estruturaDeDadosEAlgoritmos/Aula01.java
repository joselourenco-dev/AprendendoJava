package estruturaDeDadosEAlgoritmos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula01 {
    public static void main(String[] args){
        Deque<String> pilha = new ArrayDeque<>();

        pilha.push("Prato 1");
        pilha.push("Prato 2");
        pilha.push("Prato 3");



        while (!pilha.isEmpty()){
            System.out.println("Topo agora: " + pilha.peek());
            System.out.println("Removendo: " + pilha.pop());
        }

        System.out.println("Pilha vazia.");

    }
}
