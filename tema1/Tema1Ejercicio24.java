import java.util.Scanner;

public class Tema1Ejercicio24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la nota de los alumnos sobre 10, al terminar introduzca un número negativo ");
        int aprobado = 0;
        int suspendido = 0;
        while (true) {
            int nota = in.nextInt();
            if (nota < 0) {
                break;
            } else {
                if (nota >= 5) {
                    aprobado++;
                } else if (nota < 5) {
                    suspendido++;
                }

            }

        }
            System.out.println("La cantidad de aprobados es " + aprobado + " y la cantidad suspendidos es de " + suspendido );

    }
}