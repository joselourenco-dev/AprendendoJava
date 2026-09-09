package estruturaDeDadosEAlgoritmos;

public class NoArvore {
    int valor;
    NoArvore esquerda;
    NoArvore direita;

    NoArvore(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
