package projetos.sistemabancario.src.banco;

import projetos.sistemabancario.src.model.ContaBancaria;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public Banco(){

    }

    public void adicionarConta(ContaBancaria conta) {
    }

    public void removerConta(int numeroConta){
        // remove da lista, buscando pelo número — precisa percorrer e comparar

    }

    public  ContaBancaria buscarConta(int numeroConta){
        // percorre a lista procurando o número — retorna a conta ou null se não encontrar

        return numeroConta;
    }

    public ArrayList<ContaBancaria> listarContas(){
        // retorna a lista
        return listarContas();
    }

}
