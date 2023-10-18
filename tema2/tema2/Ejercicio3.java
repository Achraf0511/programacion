package tema2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Intruduce el radio de un círculo para calcular su perímetro y área, el valor debe ser positivo");
        Scanner in = new Scanner(System.in);
        double radius = in.nextInt();
        if (Ejercicio3.validRadius(radius)) {
            System.out.println("El perímetro del círculo es: " + Ejercicio3.calculateCirclePerimeter(radius));
            System.out.println("El área del circulo es: " + Ejercicio3.calculateCircleArea(radius));
        } else if (!Ejercicio3.validRadius(radius)) {
            System.out.println("Error, introduce un valor correcto");
        }


    }

    public static boolean validRadius(double radius) {
        return radius >= 1;


    }

    public static double calculateCirclePerimeter(double raduius) {
        double result = 0;
        result = 2 * Math.PI * raduius;
        return result;
    }

    public static double calculateCircleArea(double radius) {
        double result = 0;
        result = Math.PI * radius * radius;
        return result;


    }

}