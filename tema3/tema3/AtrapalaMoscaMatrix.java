
import java.util.Random;
import java.util.Scanner;

public class AtrapalaMoscaMatrix {

    private static final int BOARD_SIZE = 4;
    private static final int MOSCA = -1;
    private static final int UNKNOWN = 0;
    private static final int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    private static final Random random = new Random();

    private static int moscaX;
    private static int moscaY;

    public static void main(String[] args) {
        iniciarTablero();

        while (true) {
            mostrarTablero();
            int[] posicionJugador = obtenerPosicionJugador();

            if (posicionJugador[0] == moscaX && posicionJugador[1] == moscaY) {
                System.out.println("¡Felicidades! ¡Has atrapado a la mosca!");
                break;
            } else if (esAdyacente(posicionJugador[0], posicionJugador[1])) {
                cambiarPosicionMosca();
            } else {
                System.out.println("No has atrapado a la mosca. Sigue intentándolo.");
            }
        }
    }

    private static void iniciarTablero() {
        moscaX = random.nextInt(BOARD_SIZE);
        moscaY = random.nextInt(BOARD_SIZE);

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = UNKNOWN;
            }
        }
    }

    private static void mostrarTablero() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == UNKNOWN) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    private static int[] obtenerPosicionJugador() {
        Scanner scanner = new Scanner(System.in);
        int[] posicion = new int[2];

        System.out.print("Ingresa la fila (1-4): ");
        posicion[0] = scanner.nextInt() - 1;

        System.out.print("Ingresa la columna (1-4): ");
        posicion[1] = scanner.nextInt() - 1;

        return posicion;
    }

    private static boolean esAdyacente(int x, int y) {
        return (Math.abs(x - moscaX) == 1 && y == moscaY) ||
                (x == moscaX && Math.abs(y - moscaY) == 1);
    }

    private static void cambiarPosicionMosca() {
        int nuevaX;
        int nuevaY;

        do {
            int direccion = random.nextInt(4);
            nuevaX = moscaX;
            nuevaY = moscaY;

            if (direccion == 0 && moscaX > 0) {
                nuevaX--;
            } else if (direccion == 1 && moscaX < BOARD_SIZE - 1) {
                nuevaX++;
            } else if (direccion == 2 && moscaY > 0) {
                nuevaY--;
            } else if (direccion == 3 && moscaY < BOARD_SIZE - 1) {
                nuevaY++;
            }
        } while (nuevaX == moscaX && nuevaY == moscaY);

        moscaX = nuevaX;
        moscaY = nuevaY;
    }
}