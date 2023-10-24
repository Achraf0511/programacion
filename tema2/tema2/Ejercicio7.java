package tema2;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        do {
            System.out.print("Introduce un número entero positivo (o 0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }
            } else if (numero < 0) {
                System.out.println("Por favor, introduce un número entero positivo.");
            }

        } while (numero != 0);
        System.out.println(esPrimo(numero));
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









