package orientacaoObejetos.exercicios;

public class Produto {
    String nome;
    double preco;

    void aplicarDescontoPercentual(double percentual) {
        double precoComDesconto = preco - (preco * (percentual / 100));
        System.out.println(nome + " com " + percentual + "% de desconto: " + precoComDesconto);
    }
}
