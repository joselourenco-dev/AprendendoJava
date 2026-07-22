package orientacaoObjetos.exercicios.composicaoDeObjetos;

import java.util.ArrayList;

public class MainCarro {
    public static void main(String[] args){
        Motor motor = new Motor(150);
        Motor motor2 = new Motor(250);

        Carro carro = new Carro("GOl", motor);
        Carro carro2 = new Carro("Uno", motor2);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(carro);
        carros.add(carro2);

        for(Carro ca : carros){
            ca.ligarMotor();
            System.out.println("");
        }


    }
}
