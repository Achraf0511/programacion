package tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Intruduce un número entero: si es positivo se reporducirá por pantalla el número 1, si es negativo el número -1 y si es 0 se reproducirá 0 por pantalla. ");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        System.out.println(numberSign(numero));

    }

    public static int numberSign(int numero) {
        int result = 0;
        if (numero > 0) result = 1;
        else if (numero < 0) result = -1;
        return result;
    }
}
