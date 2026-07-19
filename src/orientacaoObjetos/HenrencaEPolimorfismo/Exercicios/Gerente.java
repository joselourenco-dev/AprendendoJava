package orientacaoObjetos.HenrencaEPolimorfismo.Exercicios;

public class Gerente extends Funcionario {

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Metas do mês...");
    }
}
