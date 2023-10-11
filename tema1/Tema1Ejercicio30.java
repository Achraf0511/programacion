import java.util.Scanner;

public class Tema1Ejercicio30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int exit = 0;
        while (exit != 6) {
            System.out.println("Bienvenido a la calculadopra portátil");
            System.out.println("Introduce un número");
            double numero1 = in.nextDouble();
            System.out.println("Introduce otro número");
            double numero2 = in.nextDouble();
            System.out.println("Introduzca una operación dependiendo de la  que desea realizar indicando el número: (1.(+), 2.(-), 3.(*), 4.(/), 5.(%) )");
            int operador = in.nextInt();
            if (operador < 1 || operador > 5) {
                System.out.println("Error, introduzca un valor correcto");
            }
            in.nextLine();
            System.out.println(operador);
            double resultado = 0;
            resultado = switch (operador) {
                case 1 -> numero1 + numero2;
                case 2 -> numero1 - numero2;
                case 3 -> numero1 * numero2;
                case 4 -> numero1 / numero2;
                case 5 -> (numero1 % numero2);
                default -> resultado;

            };
            System.out.println("El resultado es " + resultado);
            System.out.println("Introduyce 6 para salir del programa");
            exit = in.nextInt();
        }
    }


}