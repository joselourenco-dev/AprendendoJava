package estruturaDeDadosEAlgoritmos;

public class ArvoreBinaria {
    NoArvore raiz;

    void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private NoArvore inserirRecursivo(NoArvore atual, int valor){
        if(atual == null){
            return new NoArvore(valor);
        }

        if (valor < atual.valor){
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }
}
