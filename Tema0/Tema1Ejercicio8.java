import java.util.Scanner;

public class Tema1Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros que desees convertir a dólares");
        int euros = in.nextInt();
        System.out.println(euros * 1.05 + "$ Conversión ejecutada");


    }

}