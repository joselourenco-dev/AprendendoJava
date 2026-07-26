package projetos.sistemabancario.src.operacoes;
import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.model.ContaBancaria;
import java.util.ArrayList;

public class ListarConta {
    public void executar(Banco banco){
        System.out.println("Listando contas: ");
        ArrayList<ContaBancaria> contas = banco.listarContas();
        for(ContaBancaria contaBancaria: contas){
            System.out.println("Conta numero: " + contaBancaria.getNumeroConta());
        }
    }
}
