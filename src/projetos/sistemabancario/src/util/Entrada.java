package projetos.sistemabancario.src.util;

import java.util.Scanner;

public class Entrada {
    private Scanner scanner;

   public Entrada(Scanner scanner){
       this.scanner = scanner;
   }

   public  String lerTexto (String mensagem){

       mensagem = scanner.nextLine();
       return mensagem;
   }

   public int lerInteiro(int mensagem){
       // imprime a mensagem, lê um int (tratando o problema do buffer, se precisar de nextLine depois)
       mensagem  = scanner.nextInt();
       scanner.nextLine();
       return mensagem;
   }

   public double lerDouble(double mensagem){
       mensagem = scanner.nextDouble();
       scanner.nextLine();
       return mensagem;
   }


}
