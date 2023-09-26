import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");
int numero1 = in.nextInt();


        int numero2 = in.nextInt ();

        if (numero1<numero2) {
            System.out.println("el segundo numero es mayor");
        }
        if (numero1>numero2) {
            System.out.println("el primer numero es mayor");
        }


    }
}
