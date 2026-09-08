package estruturaDeDadosEAlgoritmos.exercicios;

public class Ex04 {

        public static void main(String[] args) {
            String str1 = "A"; // Hash code = 65
            String str2 = "Q"; // Hash code = 81

            int hash1 = str1.hashCode();
            int hash2 = str2.hashCode();

            int mod1 = Math.floorMod(hash1, 16);
            int mod2 = Math.floorMod(hash2, 16);

            System.out.println("String '" + str1 + "' -> Hash: " + hash1 + " -> Mod 16: " + mod1);
            System.out.println("String '" + str2 + "' -> Hash: " + hash2 + " -> Mod 16: " + mod2);
            System.out.println("Colisão detectada? " + (mod1 == mod2));
        }
    }

