
import java.util.Scanner;

public class Tema1Ejrcicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cuadrado");
        int a = in.nextInt();
        System.out.println("Calculando área y perímetro");
        System.out.println(a * 4 + " Perímetro");
        System.out.println(a * a + " Área");

    }
}
