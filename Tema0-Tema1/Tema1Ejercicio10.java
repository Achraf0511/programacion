import java.util.Scanner;

public class Tema1Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca tres valores numéricos");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < b && b < c) {
            System.out.println(" Los números están ordenados de menor a mayor");
        }
        if (!(a < b && b < c)) {
            System.out.println(" Los números no están ordenados de menor a mayor");
        }


    }

}


