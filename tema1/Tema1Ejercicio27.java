import java.util.Scanner;

import java.util.Scanner;

public class Tema1Ejercicio27 {
    public static void main(String[] args) {

        int cantidad = 20;
        int contador = 0;
        int numero = 2;

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
