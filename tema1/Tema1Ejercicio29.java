
import java.util.Random;
import java.util.Scanner;

public class Tema1Ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int numeroderuleta = random.nextInt(100);

        int intentos = 100;
        System.out.println("Sea bienvenido a la ruleta");
        System.out.println("Descubre si es el siguienete ganador!!");
        while (intentos > 0) {
            System.out.println("Introduce un número ente 0 y 100 hasta descubrir el acierto");
            int numeroUsuario = in.nextInt();
            if (numeroUsuario > numeroderuleta) {
                System.out.println(" Has perdido, el número de ruleta es menor, inténtalo de nuevo");
                intentos--;
            } else if (numeroUsuario < numeroderuleta) {
                System.out.println(" Has perdido, el número de ruleta es mayor, inténtalo de nuevo ");
                intentos--;
            } else if (numeroUsuario == numeroderuleta) {
                System.out.println(" Felicicdades, has ganado en la ruleta");
            }
            if (intentos == 0) {
                System.out.println(" Se te han termindo los intentos");
            }
        }

    }
}