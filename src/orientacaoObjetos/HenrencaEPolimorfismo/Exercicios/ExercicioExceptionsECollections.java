package orientacaoObjetos.HenrencaEPolimorfismo.Exercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class ExercicioExceptionsECollections {
    public static void main(String[] args) {

        //1
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Fazer compras");
        tarefas.add("Estudar");
        tarefas.add("Limpar a casa");

        tarefas.remove(1);
        System.out.println(tarefas.size());

        //2
         HashMap<String, Integer> Pessoa = new HashMap<>();
         Pessoa.put("Alana", 15);
         Pessoa.put("Ariel", 17);
         Pessoa.put("Fabula", 25);

         int idade = Pessoa.get("Fabula");

        System.out.println("Idade: " + idade);

        // 3
        HashMap<String, Double> precos = new HashMap<>();
        precos.put("Geladeira", 1000.0);
        precos.put("Fogão", 500.0);

        String produtoBuscado = "Fogão";

        try {
            double preco = precos.get(produtoBuscado);
            System.out.println("Preço: " + preco);
        } catch (NullPointerException e) {
            System.out.println("Produto não encontrado");
        }
        finally {
            System.out.println("Consulta finalizada");
        }

    }
}
