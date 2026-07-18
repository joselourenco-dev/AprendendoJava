package orientacaoObjetos;

public class Aula01 {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Alana";
        pessoa1.idade = 15;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "João";
        pessoa2.idade = 58;

        pessoa1.apresentar();
        pessoa2.apresentar();

    }
}
