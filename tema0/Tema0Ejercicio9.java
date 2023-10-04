
import java.util.Scanner;

public class Tema0Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");
        int numero1 = in.nextInt();
        int numero2 = in.nextInt();
        System.out.println( numero1 + numero2 + " SUMA" );
        System.out.println( numero1 - numero2 + " RESTA");
        System.out.println( numero1 * numero2 + " MULTIPLICACION");
        System.out.println( numero1 / numero2 + " DIVISION");
        System.out.println( numero1 % numero2 + " RESTO" );


    }
}