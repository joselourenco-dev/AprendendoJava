package orientacaoObjetos.HenrencaEPolimorfismo.Exercicios;

public class Gerente extends Funcionario implements Pagavel {

    @Override
    public void exibirDados(){
        System.out.println("É um gerente");
    }

    @Override
    public void calcularPagamento() {
        System.out.println("Pagamento do gerente calculado com bônus de meta");
    }
}
