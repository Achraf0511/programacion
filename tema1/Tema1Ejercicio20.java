import java.util.Scanner;

public class Tema1Ejercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un valor numérico entero para 'a' y otro para 'b'");
        int a = in.nextInt();
        int b = in.nextInt();

        if (b > a) {
            int i = a % 2;
            if (i == 0) {
                a++;
                while (a < b) {
                    System.out.println(a);
                    a = a + 2;
                }
            } else
                while (a <= b) {
                    System.out.println(a);
                    a = a + 2;
                }
            }else if (b < a) {
                System.out.println("El primer número es mayor");

            }

        }
    }


