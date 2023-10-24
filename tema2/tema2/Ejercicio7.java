package tema2;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero7;


        do {
            System.out.print("Introduce un número entero positivo (o 0 para salir): ");
            numero7 = scanner.nextInt();

            if (numero7 > 0) {
                if (esPrimo(numero7)) {
                    System.out.println(numero7 + " es primo.");
                } else {
                    System.out.println(numero7 + " no es primo.");
                }
            } else if (numero7 < 0) {
                System.out.println("Por favor, introduce un número entero positivo.");
            }

        } while (numero7 != 0);
        System.out.println(esPrimo(numero7));
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        if (numero == 2 || numero == 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(numero) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}









