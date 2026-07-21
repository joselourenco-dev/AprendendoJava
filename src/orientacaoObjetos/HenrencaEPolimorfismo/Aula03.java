package orientacaoObjetos.HenrencaEPolimorfismo;

import java.util.ArrayList;
import java.util.HashMap;

public class Aula03 {
    public  static void main(String[] args) {
        // EXCEPTIONS E COLLECTIONS //

        // HashMap — resolvendo busca por chave, em vez de por posição numérica
        HashMap<String, Double> precos = new HashMap<>();
        precos.put("Geladeira", 1000.0);
        precos.put("Fogão", 500.0);

        String produtoBuscado = "Micro-ondas";

        try {
            double preco = precos.get(precos);
            System.out.println("Preço: " + preco);
        } catch (NullPointerException e) {
            System.out.println("Produto não encontrado");
        }
    }
}
