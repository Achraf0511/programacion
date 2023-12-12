

import java.util.Scanner;

public class SimuladordeCobertura {

    public static void main(String[] args) {
        final int NUM_PLANTAS = 12;
        final int NUM_HABITACIONES = 5;
        int[][] hotel = new int[NUM_PLANTAS][NUM_HABITACIONES];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la planta donde instalará el router (1-12): ");
        int plantaRouter = scanner.nextInt() - 1;

        System.out.print("Ingrese la habitación donde instalará el router (1-5): ");
        int habitacionRouter = scanner.nextInt() - 1;

        System.out.print("Ingrese la potencia del router: ");
        int potenciaRouter = scanner.nextInt();

        hotel[plantaRouter][habitacionRouter] = potenciaRouter;

        for (int i = 0; i < NUM_PLANTAS; i++) {
            for (int j = 0; j < NUM_HABITACIONES; j++) {
                int distancia = Math.abs(i - plantaRouter) + Math.abs(j - habitacionRouter);
                hotel[i][j] = Math.max(potenciaRouter - distancia, 0);
            }
        }


        for (int i = 0; i < NUM_PLANTAS; i++) {
            for (int j = 0; j < NUM_HABITACIONES; j++) {
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }
    }
}