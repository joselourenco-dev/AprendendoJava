package projetos.sistemabancario.src.operacoes;

import projetos.sistemabancario.src.banco.Banco;
import projetos.sistemabancario.src.util.Entrada;

public class AdicionarConta {
    public void executar(Banco banco, Entrada entrada) {
        System.out.print("Digite o nome do titular: ");
        String titular = entrada.lerTexto();
        banco.adicionarConta(titular);
        System.out.println("Conta adicionada com sucesso");
    }
}


