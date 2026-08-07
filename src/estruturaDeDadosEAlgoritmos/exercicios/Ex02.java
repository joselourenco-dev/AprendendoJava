package estruturaDeDadosEAlgoritmos.exercicios;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex02 {
    public static void main(String[] args) {

        // 01
        Deque<String> nome = new ArrayDeque<>();
        nome.offer("Samurai");
        nome.offer("Ronin");
        nome.offer("Ninja");
        nome.offer("Zoro");

        while (!nome.isEmpty()) {
            System.out.println("Nome: " + nome.poll());
        }


        //02

        nome.offer("Samurai");
        nome.offer("Ronin");
        nome.offer("Ninja");
        nome.offer("Zoro");

        System.out.println("Tamanho da fila " + nome.size());
        System.out.println("Primeiro nome adicionado " + nome.peek());
        System.out.println("Tamanho da fila " + nome.size());
        System.out.println("");

        //03

        Deque<String> filaDeEspera = new ArrayDeque<>();
        Deque<String> clienteAtendidos = new ArrayDeque<>();

        filaDeEspera.offer("José");
        filaDeEspera.offer("Carlos");
        filaDeEspera.offer("alana");
        filaDeEspera.offer("Gabriela");
        filaDeEspera.offer("Emanuel");

        while (!filaDeEspera.isEmpty()) {
            System.out.println("Atendendo " + filaDeEspera.peek());
            String clienteAtual = filaDeEspera.pollFirst();
            clienteAtendidos.offer(clienteAtual);
        }

        //04
        //pesquisa feita.


    }
}
