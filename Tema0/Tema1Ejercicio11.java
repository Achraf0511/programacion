import java.util.Scanner;

public class Tema1Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca tres números");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + 1 == b && a + 2 == c) {
            System.out.println("Los números son consecutivos");
        }
        if (!(a + 1 == b && a + 2 == c)) {
            System.out.println("Los números no son consecutivos");
        }
    }

}



