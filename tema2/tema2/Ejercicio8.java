package tema2;

import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        boolean isValid = false;


        if ( mes > 12 || dia < 1 || dia > 31 || mes<0) {
            isValid = false;

        } else {

            if ((mes == 1 | mes == 3 | mes == 5 | mes == 8 | mes == 10 | mes == 12) & (dia <= 31)) {
                isValid = true;
            } else if ((mes == 4) | (mes == 6) | (mes == 9) | (mes == 11) & (dia <= 30)) {
                isValid = true;
            } else {

            }


            if ((mes == 2) & (dia <= 28)) {
                isValid = true;
            } else if (esAñoBisiesto(año) & mes == 2 & dia <= 29) {
                isValid = true;
            }

        }


        return isValid;


    }

    public static boolean esAñoBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}









