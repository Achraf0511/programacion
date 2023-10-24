package tema2;

import java.util.Scanner;

import static tema2.Ejercicio9.showPiramide;

public class Ejercicio10 {

    public static void main(String[] args) {
        showMenu();
        Scanner in = new Scanner(System.in);
        int showMenu = in.nextInt();
        switch (showMenu) {

            case 1:
                System.out.println("Intruduce un número entero: si es positivo se reporducirá por pantalla el número 1, si es negativo el número -1 y si es 0 se reproducirá 0 por pantalla. ");
                int numero = in.nextInt();
                System.out.println(Tema2Ejercicio1.numberSign(numero));

                break;
            case 2:
                System.out.println("Introduce tu edad para saber si eres mayor o menor de edad");
                int edad = in.nextInt();
                if (Tema2Ejercicio1.numberSign(edad) == 1) {
                    System.out.println(Ejercicio2.isAdult(edad));
                } else if (Tema2Ejercicio1.numberSign(edad) == -1 || Tema2Ejercicio1.numberSign(edad) == 0) {
                    System.out.println("Error, introduce una opción válida");
                }

                break;

            case 3:

                System.out.println("Intruduce el radio de un círculo para calcular su perímetro y área, el valor debe ser positivo");
                double radius = in.nextInt();
                if (Ejercicio3.validRadius(radius)) {
                    System.out.println("El perímetro del círculo es: " + Ejercicio3.calculateCirclePerimeter(radius));
                    System.out.println("El área del circulo es: " + Ejercicio3.calculateCircleArea(radius));
                } else if (!Ejercicio3.validRadius(radius)) {
                    System.out.println("Error, introduce un valor correcto");
                }


                break;


            case 4:
                System.out.println("Cantidad de euros a convertir a dólares: ");
                double euros = in.nextInt();
                System.out.println(Ejercicio4.euro2dollar(euros));


                break;


            case 5:
                System.out.println("Cantidad de dólares  a convertir a euros: ");
                double dolares = in.nextInt();
                System.out.println(Ejercicio4.dollar2euro(dolares));


                break;


            case 6:
                System.out.print("Ingresa un número entero de 1 a 10: ");
                int numero1 = in.nextInt();
                System.out.println(Ejercicio5.tablaMultiplicar(numero1));


                break;


            case 7:
                System.out.println(Ejercicio6.tablaMultiplicar2());


                break;


            case 8:
                int numero7;


                do {
                    System.out.print("Introduce un número entero positivo (o 0 para salir): ");
                    numero7 = in.nextInt();

                    if (numero7 > 0) {
                        if (Ejercicio7.esPrimo(numero7)) {
                            System.out.println(numero7 + " es primo.");
                        } else {
                            System.out.println(numero7 + " no es primo.");
                        }
                    } else if (numero7 < 0) {
                        System.out.println("Por favor, introduce un número entero positivo.");
                    }

                } while (numero7 != 0);
                System.out.println(Ejercicio7.esPrimo(numero7));

                break;


            case 9:

                System.out.print("Introduce el día (1-31): ");
                int dia = in.nextInt();

                System.out.print("Introduce el mes (1-12): ");
                int mes = in.nextInt();

                System.out.print("Introduce el año: ");
                int año = in.nextInt();

                if (Ejercicio8.esFechaValida(dia, mes, año)) {
                    System.out.println("La fecha es válida.");
                } else {
                    System.out.println("La fecha no es válida.");
                }

                break;

            case 10:
                showPiramide();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce un carácter que conforme el triángulo");
                String caracter = scanner.nextLine();
                System.out.println("Introduce un número de líneas que conforme el triángulo");
                int lineas = scanner.nextInt();
                int espacios = lineas;
                for (int i = 1; i <= (2 * lineas); i += 2) {
                    System.out.println(" ".repeat(espacios) + caracter.repeat(i));
                    espacios--;
                }
                break;
        }


    }


    public static void showMenu() {
        System.out.println("1.Muestra el signo de un número introducido por el usuario");
        System.out.println("2.Indica si el usuario es mayor de edad o no.");
        System.out.println("3.Calcula el área y perímetro de un círculo.");
        System.out.println("4.Conversor de euros a dólares ");
        System.out.println("5.Conversor de dólares a euros");
        System.out.println("6.Mostrar tabla de multiplicar de un número");
        System.out.println("7.Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("8.Comprobador de números primos.");
        System.out.println("9.Comprobador de fechas");
        System.out.println("10.Dibujar triángulos");


    }


}


