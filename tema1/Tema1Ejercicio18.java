import java.util.Scanner;

public class Tema1Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce en valor positivo");
        float raiz = scanner.nextFloat();
        System.out.println( "La raiz cuadarada es " +  Math.sqrt(raiz));
            if (raiz < 0) {
            System.out.println("Error");

        }


    }
}