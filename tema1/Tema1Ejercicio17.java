

import java.util.Scanner;

public class Tema1Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la opción '0', '1' o '2'");
        String opcion = scanner.nextLine();
        if (opcion.equals("0")) {
            System.out.println("Introduce los valores del lado del cuadrado en cm");
            double lado = scanner.nextDouble();
            System.out.println("La superfice es de " + lado * lado + " cm2");
            System.out.println("El perímetro es de " + 4 * lado + "cm");
        }
        if (opcion.equals("2")) {
            System.out.println("Introduce los valores de la base y la altura del triángulo en cm");
            float base = scanner.nextFloat();
            float altura = scanner.nextFloat();
            System.out.println("La superfice es " + (base * altura) / 2 + "cm2");
        }
        if (opcion.equals("1")) {
            System.out.println("Introduce los valores de la base y la altura del rectángulo en cm");
            float base = scanner.nextFloat();
            float altura = scanner.nextFloat();
            System.out.println("La superficie es " + base * altura + " cm2");
            System.out.println("El perimetro es " + 2 * base + 2 * altura + " cm");
        }

    }
}