package projetos.sistemabancario.src.util;

import java.util.Scanner;

public class Entrada {
    private Scanner scanner;
        public Entrada(Scanner scanner) {
            this.scanner = scanner;
        }

   public  String lerTexto (){
        String resultado = scanner.nextLine();
        return resultado;
   }

   public int lerInteiro(){
       int resultado = scanner.nextInt();
       scanner.nextLine();
       return resultado;
   }

   public double lerDouble(){
      double resultado = scanner.nextDouble();
      scanner.nextLine();
      return resultado;
   }
}
