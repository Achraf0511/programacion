package tema2;

import java.util.Scanner;



public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero de 1 a 10: ");
        int numero = scanner.nextInt();
        System.out.println(tablaMultiplicar(numero));
    }


    public static int tablaMultiplicar(int numero) {


        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
        }
        return numero;


    }
}




