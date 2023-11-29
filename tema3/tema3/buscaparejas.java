import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;
public class buscaparejas {
    public static void main(String[] args) {
        String[] animales = {"León", "León", "Mandril", "Mandril", "Suricata", "Suricata", "Facóquero", "Facóquero","Mono","Mono","Cebra", "Cebra", "Caballo","Caballo","Perro","Perro","Gato","Gato","Flamenco", "Flamenco"};

        shuffleArray(animales);

        boolean[] posicionesVisibles = new boolean[animales.length];
        Arrays.fill(posicionesVisibles, false);

        Scanner scanner = new Scanner(System.in);
        int parejasRestantes = animales.length / 2;

        while (parejasRestantes > 0) {
            mostrarTablero(animales, posicionesVisibles);

            System.out.println("Ingrese la primera posición (0-" + (animales.length - 1) + "):");
            int posicion1 = scanner.nextInt();
            System.out.println("Ingrese la segunda posición (0-" + (animales.length - 1) + "):");
            int posicion2 = scanner.nextInt();

            if (posicionValida(posicion1, animales.length) && posicionValida(posicion2, animales.length)) {
                if (posicionesVisibles[posicion1] || posicionesVisibles[posicion2]) {
                    System.out.println("¡Posición inválida o ya visible!");
                } else {
                    if (animales[posicion1].equals(animales[posicion2])) {
                        posicionesVisibles[posicion1] = true;
                        posicionesVisibles[posicion2] = true;
                        parejasRestantes--;
                        System.out.println("¡Encontraste una pareja!");
                    } else {
                        System.out.println("\nLas posiciones no coinciden. Inténtalo de nuevo.\n");
                        ocultarTablero();
                    }
                }
            } else {
                System.out.println("Posición inválida. Debes ingresar un número entre 0 y " + (animales.length - 1));
            }
        }

        System.out.println("¡Felicidades, has encontrado todas las parejas!");
        scanner.close();
    }

    public static void shuffleArray(String[] array) {
        Random random  = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void mostrarTablero(String[] animales, boolean[] posicionesVisibles) {
        System.out.println("\nTablero:");
        for (int i = 0; i < animales.length; i++) {
            if (posicionesVisibles[i]) {
                System.out.print(animales[i] + " ");
            } else {
                System.out.print("X ");
            }
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void ocultarTablero() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static boolean posicionValida(int posicion, int longitud) {
        return posicion >= 0 && posicion < longitud;
    }
}

