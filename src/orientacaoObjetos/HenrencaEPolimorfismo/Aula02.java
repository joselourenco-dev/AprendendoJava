package orientacaoObjetos.HenrencaEPolimorfismo;

public class Aula02 {
    public static void main() {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Luffy";
        cachorro.idade = 10;
        
        Gato gato = new Gato();
        gato.nome = "Azure";
        gato.idade = 5;

       Animal animais[] = {cachorro, gato};

       for(Animal animal: animais){
           String nome = animal.nome;
           System.out.println(nome);
           animal.emitirSIm();
       }
    }
}
