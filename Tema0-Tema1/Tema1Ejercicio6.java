import java.util.Scanner;

public class Tema1Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor");

        int a = in.nextInt();
        if (a < 0) {
            System.out.println("El número introduudo es negativo");
        }
        if (a > 0) {
            System.out.println("El número introducido es positivo");
        }
        if (a == 0) {
            System.out.print("El número introducido es 0");
        }


    }


}
