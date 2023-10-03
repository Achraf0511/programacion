import java.util.Scanner;

public class Tema1Ejrcicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzac el número del mes (1-12)");
        int mes = in.nextInt();
        System.out.println("Introduzca el año");
        int año = in.nextInt();
        if (año % 4 == 0) {
            if (mes == 1) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 3) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 5) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 7) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 8) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 10) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 12) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 2) {
                System.out.println(" Este mes tiene 29 días");
            }
            if (mes == 4) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 6) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 9) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 11) {
                System.out.println(" Este mes tiene 30 días");
            }
        } else if (año % 4 != 0) {
            if (mes == 1) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 3) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 5) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 7) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 8) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 10) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 12) {
                System.out.println(" Este mes tiene 31 días");
            }
            if (mes == 2) {
                System.out.println(" Este mes tiene 28 días");
            }
            if (mes == 4) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 6) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 9) {
                System.out.println(" Este mes tiene 30 días");
            }
            if (mes == 11) {
                System.out.println(" Este mes tiene 30 días");
            }
        }

    }

}







