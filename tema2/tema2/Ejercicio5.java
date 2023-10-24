package tema2;

import java.util.Scanner;



public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero de 1 a 10: ");
        int numero1 = scanner.nextInt();
        System.out.println(tablaMultiplicar(numero1));
    }


    public static int tablaMultiplicar(int numero1) {


        if (numero1 >= 1 && numero1 <= 10) {
            System.out.println("Tabla de multiplicar del " + numero1 + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero1 * i;
                System.out.println(numero1 + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
        }
        return numero1;


    }
}




