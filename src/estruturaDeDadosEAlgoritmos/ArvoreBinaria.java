package estruturaDeDadosEAlgoritmos;

public class ArvoreBinaria {
    NoArvore raiz;

    public void inserir(int valor) {
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

    public NoArvore buscar(int valor) {
        NoArvore atual = raiz;
        while (atual != null) {
            if (valor == atual.valor) {
                return atual; // Valor encontrado
            }
            if (valor < atual.valor) {
                atual = atual.esquerda; // Vai para a esquerda
            } else {
                atual = atual.direita; // Vai para a direita
            }
        }
        return null; // Não encontrado
    }

    public void imprimirBusca(int valor){
        NoArvore resultado = buscar(valor);
        System.out.println(resultado.valor);
    }
}
