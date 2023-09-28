import java.util.Scanner;

public class Tema1Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce tres números");
        float numero1 = in.nextFloat();
        float numero2 = in.nextFloat();
        float numero3 = in.nextFloat();
        System.out.println("Calculando la media");
        System.out.println((numero1 + numero2 + numero3)/3 + " Media real");
        System.out.println  (((int) (numero1 + numero2 + numero3) / 3) + " Media sin decimales");

    }


    }




