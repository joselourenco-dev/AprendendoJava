package orientacaoObjetos.exercicios.composicaoDeObjetos;

public class Pessoa {
    String nome;
    Endereco endereco;

    public  Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirEndereco(){
        System.out.println("Nome: " + nome) ;
        System.out.println("Endereço: " + endereco.rua + ", " + endereco.cidade) ;
    }
}
