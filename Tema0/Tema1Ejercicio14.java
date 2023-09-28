import java.util.Scanner;

public class Tema1Ejercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número de personas que deseen hospedarse en la estancia");
        int personas = in.nextInt();
        System.out.println("Introduce el número de noches que desean quedarse en la estancia");
        int noches = in.nextInt();
        System.out.println("Calculando el costo del hospedaje");
        double precio = (personas * (noches * 15));
        System.out.println(precio + "€ total");
        if (personas > 5 && noches >= 7) {
            System.out.println(precio - (precio * 25) / 100 + " €" + " Tras aplicar el 25% de descuento");

        }

    }
}