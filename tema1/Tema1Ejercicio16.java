

        import java.util.Scanner;

public class Tema1Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 'D' para convertir de euros a dólares o 'E' para convertir de dólares a euros:");
        String opcion = scanner.nextLine();

        if (opcion.equals("D")) {
            System.out.println("Introduce la cantidad en euros:");
            double euros = scanner.nextDouble();
            double dolares = (euros);
            System.out.println(euros + " euros equivale a " + 1.05 * euros + " dólares.");
        } else if (opcion.equals("E")) {
            System.out.println("Introduce la cantidad en dólares:");
            double dolares = scanner.nextDouble();
            double euros = (dolares);
            System.out.println(dolares + " dólares equivale a " + 0.95 * dolares + " euros.");
        } else {
            System.out.println("Opción no válida. Por favor, introduce 'D' o 'E'.");
        }
    }
}