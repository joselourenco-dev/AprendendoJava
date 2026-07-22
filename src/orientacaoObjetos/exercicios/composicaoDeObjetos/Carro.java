package orientacaoObjetos.exercicios.composicaoDeObjetos;

public class Carro {
    String modelo;
    Motor motor;

    public Carro (String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarMotor(){
        System.out.println("Ligando motor do " + modelo );
        motor.ligar();
    }




}
