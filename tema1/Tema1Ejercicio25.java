import java.util.Scanner;

public class Tema1Ejercicio25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número entero por consola");
        int numero = in.nextInt();
        int factorial = 1;
        if (numero == 0) {
            System.out.println("El factorial de 0 siempre es 0");
        } else if (numero < 0) {
            System.out.println("Error: El número introducio no es entero");
        } else {
            for (int a = 1; a <= numero; a++) {
                factorial = factorial * a;
            }
            System.out.println("El factorial de este número es " + factorial);


        }
    }
}