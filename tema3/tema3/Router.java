import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class Router {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] habitaciones = new int[20];
        System.out.println("Escoge en que habitaciones quieres el router (1-20)");
        int habitacion = in.nextInt();
        System.out.println("Introduce la potenca del router (1-6)");
        int router = in.nextInt();
        System.out.println(Arrays.toString(powerRouter(habitaciones, habitacion, router)));


    }

    public static int[] powerRouter(int[] habitaciones, int habitacion, int router) {
        int habitacion2 = habitacion;
        for (int i = router; i != 0; i--) {
            habitaciones[habitacion - 1] = i;
            habitaciones[habitacion2 - 1] = i;
            habitacion--;
            habitacion2++;


        }
        return habitaciones;

    }
}
