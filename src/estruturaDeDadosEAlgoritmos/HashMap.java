package estruturaDeDadosEAlgoritmos;

public class Aula04 {
    public static void main(String[] args){
        String[] chaves = {"Alan", "Bruno", "Carla"};

        for (String chave: chaves){
            int hash = chave.hashCode();
            int indiceSimulado = Math.floorMod(hash, 16);

            System.out.println(chave + " -> hash: " + hash + " -> índice simulado: " + indiceSimulado);
        }
    }

}
