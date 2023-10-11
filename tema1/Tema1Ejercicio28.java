
import java.util.Random;
import java.util.Scanner;

public class Tema1Ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int numerodeloteria = random.nextInt(100000);
        int intentos = 5;
        System.out.println("Sea bienvenido a la lotería de navidad");
        System.out.println("Descubre si es el siguienete ganador!!");
        while (intentos > 0) {
            System.out.println("Introduce un número ente 0 y 99.9999, tienes 5 intentos");
            int numeroUsuario = in.nextInt();
            if (numeroUsuario > numerodeloteria) {
                System.out.println(" Has perdido, inténtalo de nuevo");
                intentos--;
            } else if (numeroUsuario < numerodeloteria) {
                System.out.println(" Has perdido,inténtalo de nuevo ");
                intentos--;
            } else if (numeroUsuario == numerodeloteria) {
                System.out.println(" Felicicdades, has ganado la loteria");
            }
            if (intentos == 0) {
                System.out.println(" Se te han termindo los intentos");
            }
        }

    }
}