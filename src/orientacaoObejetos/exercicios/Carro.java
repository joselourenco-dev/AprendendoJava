package orientacaoObejetos.exercicios;

public class Carro {
    String modelo;
    int ano;

    Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    void exirbirInfo(){
        System.out.println("Modelo: " + modelo + "\nAno: " + ano);
    }

}
