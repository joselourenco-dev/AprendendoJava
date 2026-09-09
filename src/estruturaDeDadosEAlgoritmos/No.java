package estruturaDeDadosEAlgoritmos;

public class No {
    public static void main(String[] args){
        No ana = new No("Ana");
        No bruno = new No("Bruno");
        No carla = new No("Carla");

        ana.proximo = bruno;
        bruno.proximo = carla;
        No atual = ana;

        while (atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

    }

    public static class No{
        String valor;
        No proximo;

        No(String valor){
            this.valor = valor;
            this.proximo = null;
        }
    }
}
