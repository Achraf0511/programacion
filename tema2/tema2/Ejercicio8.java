package tema2;
  import java.util.Scanner;
public class Ejercicio8 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el día (1-31): ");
            int dia = scanner.nextInt();

            System.out.print("Introduce el mes (1-12): ");
            int mes = scanner.nextInt();

            System.out.print("Introduce el año: ");
            int año = scanner.nextInt();

            if (esFechaValida(dia, mes, año)) {
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha no es válida.");
            }
        }

        public static boolean esFechaValida(int dia, int mes, int año) {
            if (año < 0 || mes < 1 || mes > 12 || dia < 1) {
                return false;
            }

            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (esAñoBisiesto(año)) {
                diasPorMes[1] = 29;
            }

            return dia <= diasPorMes[mes - 1];
        }

        public static boolean esAñoBisiesto(int año) {
            return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        }
    }






