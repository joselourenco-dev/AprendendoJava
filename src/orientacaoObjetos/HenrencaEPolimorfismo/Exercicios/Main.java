package orientacaoObjetos.HenrencaEPolimorfismo.Exercicios;

public class Main {
    static void main() {
        Funcionario funcionarios[] = {new Gerente(), new Vendedor()};
        for (Funcionario funcionario: funcionarios) {
            funcionario.exibirDados();
        }


    }
}
