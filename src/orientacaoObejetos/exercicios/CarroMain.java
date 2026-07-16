package orientacaoObejetos.exercicios;

public class CarroMain {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.modelo = "Fiat uno";
        carro1.ano = 2015;

        Carro carro2 = new Carro();
        carro2.modelo = "Celta";
        carro2.ano = 2022;

        carro1.exirbirInfo();
        carro2.exirbirInfo();
    }

}
