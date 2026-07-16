package orientacaoObejetos.exercicios;

public class ProdutoMain {
    public static void main(String[] args){
        Produto produto = new Produto();
        produto.nome = "Geladeira";
        produto.preco = 1800;

        produto.aplicarDescontoPercentual(15);
        produto.aplicarDescontoPercentual(50);
    }
}
