package tema2;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        showMenu();
        Scanner in = new Scanner(System.in);
        int showMenu = in.nextInt();
        switch (showMenu) {

            case 1:
                System.out.println("Cantidad de euros a convertir a dólares: ");
                double euros = in.nextInt();
                System.out.println(euro2dollar(euros));
                break;
            case 2:
                System.out.println("Cantidad de dólares  a convertir a euros: ");
                double dolares = in.nextInt();
                System.out.println(dollar2euro(dolares));
                break;

        }


    }


    public static void showMenu() {
        System.out.println("1. Pasar de euros a dólares");
        System.out.println("2. Pasar de dólares a euros");

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


