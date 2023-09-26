import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce valor del dado");
        int numero = in.nextInt();
        if (numero > 6)
        {
            System.out.println("ERROR");
        }
        if (numero <1)
        {
            System.out.println("ERROR");
        }
        if (numero == 1)
        {
            System.out.println("lA CARA OPUESTA ES" + " 6");
        }
        if (numero == 2)
        {
            System.out.println("lA CARA OPUESTA ES" + " 5");
        }
        if (numero == 3)
        {
            System.out.println("lA CARA OPUESTA ES" + " 4");
        }
        if (numero == 4)
        {
            System.out.println("lA CARA OPUESTA ES" + " 3");
        }
        if (numero == 5)
        {
            System.out.println("lA CARA OPUESTA ES" + " 2");
        }

        if (numero == 6)
        {
            System.out.println("lA CARA OPUESTA ES" + " 1");

        }


    }
}