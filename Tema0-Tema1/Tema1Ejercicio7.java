import java.util.Scanner;

public class Tema1Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzac dos valores numéricos");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a - b + " Resultado de la resta");
        }
        if (b > a) {
            System.out.println(b - a + " Resultado de la resta");
        }

    }

}
