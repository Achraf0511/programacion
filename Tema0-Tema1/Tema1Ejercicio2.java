
import java.util.Scanner;

public class Tema1Ejercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor de la base del rectángulo");
        int a = in.nextInt();
        System.out.println("Introduce el valor de la altura del rectángulo");
        int b = in.nextInt();
        System.out.println("Calculando área");
        System.out.println(a * b + " Área");
    }
}