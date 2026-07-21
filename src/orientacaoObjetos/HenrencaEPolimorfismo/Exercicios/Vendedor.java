package orientacaoObjetos.HenrencaEPolimorfismo.Exercicios;

public class Vendedor extends Funcionario implements Pagavel{
    @Override
    public void exibirDados() {
        System.out.println("Metas a serem batidas");
    }

    @Override
    public void calcularPagamento(){
        System.out.println("Calculando pagamento do vendedor por metas atigindas");
    }
}
