package orientacaoObjetos;

public class HenrencaEPolimorfismo {
    public class Cachorro{
        String nome;
        int idade;
        void emitirSom(){
            System.out.println("Au au");
        }
    }

    public class Gato{
        String nome;
        int idade;
        void emitirSom(){
            System.out.println("Miau miau");
        }
    }

}
