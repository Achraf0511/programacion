import java.util.Random;
import java.util.Scanner;

public class AtrapalaMosca {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];
        int posicionMosca = random.nextInt(15);
        boolean moscaAtrapada = false;

        while (!moscaAtrapada) {
            System.out.print("Ingresa una posición (entre 1 y 15): ");
            int posicionJugador = scanner.nextInt();

            if (posicionJugador < 1 || posicionJugador > 15) {
                System.out.println("Posición inválida. Ingresa un número entre 1 y 15.");
                continue;
            }

            if (posicionJugador - 1 == posicionMosca || posicionJugador + 1 == posicionMosca) {
                System.out.println("¡Has atrapado a la mosca! ¡Felicidades!");
                moscaAtrapada = true;
            } else {
                int cambio = random.nextInt(3) - 1; 
                posicionMosca = Math.max(0, Math.min(14, posicionMosca + cambio));
                System.out.println("La mosca se ha movido. Sigue intentando.");
            }
        }

        scanner.close();
    }
}



