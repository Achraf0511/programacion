import java.util.Scanner;

public class Tema1Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dólares que desees convertir a dólares");
        int dolares = in.nextInt();
        System.out.println(dolares * 0.95 + "€ Conversión ejecutada");
    }

}