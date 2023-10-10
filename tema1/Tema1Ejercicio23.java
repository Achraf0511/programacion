import java.util.Scanner;

public class Tema1Ejercicio23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce valores numéricos");
        int cantidad = 0;
        int suma = 0;
        while (true) {
            int n = in.nextInt();
            if (n < 0) {
                break;
            } else {
                suma += n;
                cantidad++;
            }
        }
        if (cantidad > 0) {
            float media = suma / cantidad;
            System.out.println("La media de los valores numéricos es " + media);
        } else {
            System.out.println("ERROR: No se han introducido número positivos.");
        }
    }
}