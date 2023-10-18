package tema2;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Intruduce la cantidad de euros que deseas convertir a dólares o la cantidad de dólares que deseas convertir a euros");
        Scanner in = new Scanner(System.in);
        double euros = in.nextInt();
        double dolares = in.nextInt();

    }


    public static double euro2dollar(double euros) {
        double result = 0;
        result = euros * 1.05;
        return result;
    }

    public static double dollar2euro(double dolares) {
        double result = 0;
        result = dolares * 0.95;
        return result;
    }
}


