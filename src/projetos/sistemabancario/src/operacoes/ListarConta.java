package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;

public class ListarConta {
    public void executar(Banco banco){
        System.out.println("Listando contas: ");
        banco.listarContas();
    }
}
