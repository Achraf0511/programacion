package tema2;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {

        showPiramide();
    }
    public static void showPiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter que conforme el triángulo");
        String caracter = scanner.nextLine();
        System.out.println("Introduce un número de líneas que conforme el triángulo");
        int lineas=scanner.nextInt();
        int espacios = lineas;
        for (int i=1; i<=(2*lineas);i+=2){
            System.out.println(" ".repeat(espacios) + caracter.repeat(i));
            espacios--;



        }


    }








}
