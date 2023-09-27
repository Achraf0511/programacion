
import java.util.Scanner;

public class Tema1Ejercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor de la base del triángulo");
        int a = in.nextInt();
        System.out.println ("Introduce el valor de la altura del triángulo");
        int b= in.nextInt();
        System.out.println("Calculando área");
        System.out.println((a * b)/2 + " ÁREA");
        System.out.print("Introduce el valor de un lado del triángulo");
        int c= in.nextInt();
        System.out.println("Introduce el valor del otro lado del triángulo");
        int d= in.nextInt();
        System.out.println("Calculando el perímetro");
        System.out.println(a + c + d + "Perímtero");
    }

}





