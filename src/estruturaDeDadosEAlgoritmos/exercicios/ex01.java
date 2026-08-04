package estruturaDeDadosEAlgoritmos.exercicios;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex01 {
    public static void main(String[] args) {

        // 1
        Deque<Integer> numero = new ArrayDeque<>();
        numero.push(1);
        numero.push(2);
        numero.push(3);
        numero.push(4);
        numero.push(5);

        while (!numero.isEmpty()) {

            System.out.println("Removendo numero " + numero.pop());

        }
        System.out.println("\n");

        // 2
        Deque<Integer> pilha = new ArrayDeque<>();
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho antes do peek: " + pilha.size());
        System.out.println("Topo (peek): " + pilha.peek());
        System.out.println("Tamanho depois do peek: " + pilha.size()); // continua igual

        System.out.println("Topo (pop): " + pilha.pop());
        System.out.println("Tamanho depois do pop: " + pilha.size()); // diminuiu

        System.out.println("=================== \n");

        // 3
        String parenteses = "())((()))";
        Deque<String> novaPilha = new ArrayDeque<>();
        boolean balanceado = true;

        for (int i = 0; i < parenteses.length(); i++) {
            char c = parenteses.charAt(i);

            if (c == '(') {
                novaPilha.push("(");
            } else {
                if (novaPilha.isEmpty()) {
                    balanceado = false;
                    break;
                }
                novaPilha.pop();
            }
        }

        if (balanceado && novaPilha.isEmpty()) {
            System.out.println("Balanceada");
        } else {
            System.out.println("Desbalanceada");
        }

    }



}
