import java.util.Scanner;

public class Tema1Ejercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la hora, los miuntos y los segundos");
        int horas = in.nextInt();
        int minutos = in.nextInt();
        int segundos = in.nextInt();
        if (horas < 24 && minutos <= 59 && segundos <= 59) {
            System.out.println("Sumando un segundo a la hora");
            System.out.print(horas + ":" + minutos + ":" + (++segundos));
        }
        if (!(horas < 24 && minutos <= 59 && segundos <= 59)) {
            System.out.println("Error");
        }
    }
}