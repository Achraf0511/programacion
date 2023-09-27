import java.util.Scanner;

public class Tema0Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros reales");
        double numero1 = in.nextDouble();
        double numero2 = in.nextDouble();
        System.out.println( numero1 + numero2 + " SUMA" );
        System.out.println( numero1 * numero2 + " MULTIPLICACION");
        System.out.println( numero1 / numero2 + " DIVISION");
        System.out.println( numero1 % numero2 + " RESTO" );


    }
}