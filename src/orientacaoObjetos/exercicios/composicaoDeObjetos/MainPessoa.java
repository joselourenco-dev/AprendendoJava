package orientacaoObjetos.exercicios.composicaoDeObjetos;

public class MainPessoa {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "São luis");
        Pessoa pessoa = new Pessoa("João", endereco);

        pessoa.exibirEndereco();
    }
}
